package com.shopdirect.acceptancetest.buildinfo;

import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.shopdirect.acceptancetest.LatestResponse;
import com.shopdirect.dao.TestBuildInfoDao;
import com.shopdirect.maximoautomation.infrastructure.config.DBInitializer;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CommonBuildStepDef extends BaseBuildStepDef {

    @Value("${ibm.maximo.url}")
    private String maximoUrl;

    @Autowired
    public CommonBuildStepDef(RestTemplate restTemplate,
                              LatestResponse latestResponse,
                              TestBuildInfoDao testBuildInfoDao) {
        super(restTemplate, latestResponse, testBuildInfoDao);
    }

    @After
    public void closeConnection() {
        testBuildInfoDao.closeConnection();
    }

    @Given("^the database has been initialised and is running$")
    public void theDatabaseHasBeenInitialised() throws Throwable {
        testBuildInfoDao.createConnection();
        List<String> dbList = testBuildInfoDao.getDatabases();
        assertThat(dbList.contains(DBInitializer.MAXIMO_DB), is(true));
        List<String> tableList = testBuildInfoDao.getTables();
        assertThat(tableList.contains(DBInitializer.BUILDS_TB), is(true));
    }

    @And("^the database is clean$")
    public void theDatabaseIsClean() throws Throwable {
        testBuildInfoDao.deleteAllRows();
        assertThat(testBuildInfoDao.countRows(), is(0L));
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

        primeMaximoMockServer(put(urlEqualTo("/soap")), responseBuilder);
    }

    private void primeMaximoMockServer(
            MappingBuilder mappingBuilder,
            ResponseDefinitionBuilder responseDefinitionBuilder) {
        stubFor(
                withDefaultHeaders(mappingBuilder)
                        .withRequestBody(matching(".*"))
                        .willReturn(responseDefinitionBuilder)
        );
    }

    private MappingBuilder withDefaultHeaders(MappingBuilder mappingBuilder) {
        return mappingBuilder
                .withHeader("SOAPAction", matching(".*"))
                .withHeader("Accept", matching(".*"))
                .withHeader("User-Agent", matching(".*"))
                .withHeader("Connection", matching(".*"))
                .withHeader("Host", matching(".*"))
                .withHeader("Content-Length", matching(".*"))
                .withHeader("Content-Type", matching(".*"));
    }
}
