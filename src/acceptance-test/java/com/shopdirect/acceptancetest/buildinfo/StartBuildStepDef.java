package com.shopdirect.acceptancetest.buildinfo;

import com.rethinkdb.net.Connection;
import com.shopdirect.acceptancetest.CucumberStepsDefinition;
import com.shopdirect.acceptancetest.LatestResponse;
import com.shopdirect.maximoautomation.infrastructure.DBInitializer;
import com.shopdirect.maximoautomation.infrastructure.RethinkDBConnectionFactory;
import com.shopdirect.model.BuildRequest;
import com.shopdirect.model.TestResponseErrorHandler;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import static com.rethinkdb.RethinkDB.r;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class StartBuildStepDef extends CucumberStepsDefinition {

    private static final String BUILD_ID = "123";
    private static final String URL = "http://jenkins:8080/jobs/test/123";

    private RestTemplate restTemplate;
    private LatestResponse latestResponse;
    private RethinkDBConnectionFactory connectionFactory;
    private BuildRequest request;

    @Autowired
    public StartBuildStepDef(RestTemplate restTemplate, LatestResponse latestResponse,
                             RethinkDBConnectionFactory connectionFactory) {
        this.restTemplate = restTemplate;
        this.latestResponse = latestResponse;
        this.connectionFactory = connectionFactory;
        this.restTemplate.setErrorHandler(new TestResponseErrorHandler());
    }

    @Given("^a valid payload, containing the build info$")
    public void aValidPayload() throws Throwable {
        request = new BuildRequest(BUILD_ID, URL,  DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(ZonedDateTime.now()));
    }

    @Given("^a payload missing the build ID$")
    public void aPayloadMissingTheBuildID() throws Throwable {
        request = new BuildRequest(null, URL, DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(ZonedDateTime.now()));
    }

    @Given("^a payload missing the build URL$")
    public void aPayloadMissingTheBuildURL() throws Throwable {
        request = new BuildRequest(BUILD_ID, null, DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(ZonedDateTime.now()));
    }

    @Given("^a payload missing the time$")
    public void aPayloadMissingTheTime() throws Throwable {
        request = new BuildRequest(BUILD_ID, URL, null);
    }

    @Given("^a payload with with an invalid date or time$")
    public void aPayloadWithWithAnInvalidDateOrTime() throws Throwable {
        request = new BuildRequest(BUILD_ID, URL, DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(ZonedDateTime.now().plusMinutes(5)));
    }

    @Given("^a payload with with an invalid URL \"([^\"]*)\"$")
    public void aPayloadWithWithAnInvalidURL(String url) throws Throwable {
        request = new BuildRequest(BUILD_ID, url, DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(ZonedDateTime.now()));
    }

    @When("^the post endpoint is called$")
    public void thePostEndpointIsCalled() throws Throwable {
        latestResponse.setResponse(restTemplate.postForEntity("http://localhost:8080/buildinfo", request, String.class));
    }

    @And("^the response body contains a valid id$")
    public void theResponseBodyContainsAValidId() throws Throwable {
        assertThat(latestResponse.getResponse().getBody(), notNullValue());
        assertThat(latestResponse.getResponse().getBody().toString(), not(isEmptyOrNullString()));
    }

    @And("^the build info record is created in the database$")
    public void theBuildInfoRecordIsCreatedInTheDatabase() throws Throwable {
        String dbResponse = (String) latestResponse.getResponse().getBody();
        Connection connection = connectionFactory.connectToMaximoDb();
        HashMap result = r.table(DBInitializer.BUILDS_TB).get(dbResponse).run(connection);
        connection.close();
        assertThat(result, notNullValue());
    }
}
