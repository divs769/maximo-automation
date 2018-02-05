package com.shopdirect.acceptancetest.buildinfo;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.model.*;
import com.github.tomakehurst.wiremock.client.RemoteMappingBuilder;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.shopdirect.acceptancetest.LatestResponse;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.shopdirect.acceptancetest.configuration.TestConfiguration.BUILDS_TB;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CommonBuildStepDef extends BaseBuildStepDef {

    @Value("${ibm.maximo.url}")
    private String maximoUrl;

    @Autowired
    public CommonBuildStepDef(RestTemplate restTemplate, LatestResponse latestResponse, @Qualifier("testClient") AmazonDynamoDB db) {
        super(restTemplate, latestResponse, db);
    }

    @Given("^the database has been initialised and is running$")
    public void theDatabaseHasBeenInitialised() throws Throwable {
        TableDescription tableDescription = createTable(db).getDescription();
        assertThat(tableDescription.getTableStatus(), is(TableStatus.ACTIVE.toString()));
    }

    @And("^the database is clean$")
    public void theDatabaseIsClean() throws Throwable {
        cleanupTable();
        TableDescription tableDescription = createTable(db).getDescription();
        assertThat(tableDescription.getTableStatus(), is(TableStatus.ACTIVE.toString()));
        assertThat(tableDescription.getItemCount(), is(0L));
    }

    @Then("^the response is success$")
    public void theResponseIsSuccess() throws Throwable {
        assertThat(latestResponse.getResponse().getStatusCode().is2xxSuccessful(), is(true));
    }

    @Then("^the response is failure$")
    public void theResponseIsFailure() throws Throwable {
        assertThat(latestResponse.getResponse().getStatusCode().is4xxClientError(), is(true));
    }

    @Given("^Maximo is up and running")
    public void givenMaximoIsUpAndRunning() throws Throwable {
        primeMaximoMockServerForCreateChange();
        primeMaximoMockServerForUpdateChange();
    }

    private void primeMaximoMockServerForCreateChange() {
        StringBuffer responseBodyForCreate = new StringBuffer();
        responseBodyForCreate
                .append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">")
                .append("<soapenv:Body>")
                .append("<CreateMXISWOCHANGEResponseType creationDateTime=\"2018-01-24T14:35:57+00:00\" transLanguage=\"EN\" baseLanguage=\"EN\" xmlns=\"http://www.ibm.com/maximo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" )
                .append("<WOCHANGEMboKeySet>")
                .append("<WOCHANGE>")
                .append("<SITEID>ITD-ESLS</SITEID>")
                .append("<WONUM>CH1659</WONUM>")
                .append("</WOCHANGE>")
                .append("</WOCHANGEMboKeySet>")
                .append("</CreateMXISWOCHANGEResponseType>")
                .append("</soapenv:Body>")
                .append("</soapenv:Envelope>");

        ResponseDefinitionBuilder responseBuilder = aResponse()
                .withHeader("Content-Type", "text/xml; charset=UTF-8")
                .withBody(responseBodyForCreate.toString());

        primeMaximoMockServer(post(urlEqualTo("/soap")), responseBuilder);
    }

    private void primeMaximoMockServerForUpdateChange() {
        StringBuffer responseBodyForUpdate = new StringBuffer();
        responseBodyForUpdate
                .append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">")
                .append("<soapenv:Body>")
                .append("<UpdateMXISWOCHANGEResponseType messageID=\"4123413\" creationDateTime=\"2018-01-24T14:35:57+00:00\" transLanguage=\"EN\" baseLanguage=\"EN\" xmlns=\"http://www.ibm.com/maximo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" )
                .append("</UpdateMXISWOCHANGEResponseType>")
                .append("</soapenv:Body>")
                .append("</soapenv:Envelope>");

        ResponseDefinitionBuilder responseBuilder = aResponse()
                .withHeader("Content-Type", "text/xml; charset=UTF-8")
                .withBody(responseBodyForUpdate.toString());

        primeMaximoMockServer(post(urlEqualTo("/soap")), responseBuilder);
    }

    private void primeMaximoMockServer(
            RemoteMappingBuilder mappingBuilder,
            ResponseDefinitionBuilder responseDefinitionBuilder) {
        stubFor(
                withDefaultHeaders(mappingBuilder)
                        .withRequestBody(matching(".*"))
                        .willReturn(responseDefinitionBuilder)
        );
    }

    private RemoteMappingBuilder withDefaultHeaders(RemoteMappingBuilder mappingBuilder) {
        return mappingBuilder
                .withHeader("SOAPAction", matching(".*"))
                .withHeader("Accept", matching(".*"))
                .withHeader("User-Agent", matching(".*"))
                .withHeader("Connection", matching(".*"))
                .withHeader("Host", matching(".*"))
                .withHeader("Content-Length", matching(".*"))
                .withHeader("Content-Type", matching(".*"));
    }

    private static Table createTable(DynamoDB db) throws Exception {
        Table table = db.createTable(createTableRequest());
        table.waitForActive();
        return table;
    }

    private static CreateTableRequest createTableRequest() {
        return new CreateTableRequest()
                .withTableName(BUILDS_TB)
                .withKeySchema(
                        new KeySchemaElement()
                                .withAttributeName("id")
                                .withKeyType(KeyType.HASH))
                .withAttributeDefinitions(Arrays.asList(
                        new AttributeDefinition()
                                .withAttributeName("id")
                                .withAttributeType(ScalarAttributeType.S),
                        new AttributeDefinition()
                                .withAttributeName("buildId")
                                .withAttributeType(ScalarAttributeType.S)))
                .withProvisionedThroughput(new ProvisionedThroughput()
                        .withReadCapacityUnits(1L)
                        .withWriteCapacityUnits(1L))
                .withGlobalSecondaryIndexes(new GlobalSecondaryIndex()
                        .withIndexName("buildIdIndex")
                        .withKeySchema(new KeySchemaElement()
                                .withAttributeName("buildId")
                                .withKeyType(KeyType.HASH))
                        .withProjection(new Projection()
                                .withProjectionType(ProjectionType.ALL))
                        .withProvisionedThroughput(new ProvisionedThroughput()
                                .withReadCapacityUnits(1L)
                                .withWriteCapacityUnits(1L)));
    }

    @After
    public void cleanupTable() throws Exception {
        db.listTables().iterator().forEachRemaining(table -> {
            table.delete();
            try {
                table.waitForDelete();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
