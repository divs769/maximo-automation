package com.shopdirect.acceptancetest.buildinfo;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.shopdirect.acceptancetest.LatestResponse;
import com.shopdirect.maximoautomation.infrastructure.model.BuildInfo;
import com.shopdirect.model.BuildRequest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.client.RestTemplate;

import java.time.OffsetDateTime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static com.shopdirect.acceptancetest.configuration.TestConfiguration.BUILDS_TB;

public class StartBuildStepDef extends BaseBuildStepDef {

    private BuildRequest request;

    @Autowired
    public StartBuildStepDef(RestTemplate restTemplate, LatestResponse latestResponse, @Qualifier("testClient") AmazonDynamoDB db) {
        super(restTemplate, latestResponse, db);
    }

    @Given("^a valid payload containing the build info$")
    public void aValidPayload() throws Throwable {
        request = new BuildRequest(BUILD_ID, URL, OffsetDateTime.now().toString(), HASH, TAG, BRANCH, DESC);
    }

    @Given("^a payload missing the build ID$")
    public void aPayloadMissingTheBuildID() throws Throwable {
        request = new BuildRequest(null, URL, OffsetDateTime.now().toString(), HASH, TAG, BRANCH, DESC);
    }

    @Given("^a payload missing the build URL$")
    public void aPayloadMissingTheBuildURL() throws Throwable {
        request = new BuildRequest(BUILD_ID, null, OffsetDateTime.now().toString(), HASH, TAG, BRANCH, DESC);
    }

    @Given("^a payload missing the time$")
    public void aPayloadMissingTheTime() throws Throwable {
        request = new BuildRequest(BUILD_ID, URL, null, HASH, TAG, BRANCH, DESC);
    }

    @Given("^a payload with with an invalid date or time$")
    public void aPayloadWithWithAnInvalidDateOrTime() throws Throwable {
        request = new BuildRequest(BUILD_ID, URL, OffsetDateTime.now().plusSeconds(1).toString(), HASH, TAG, BRANCH, DESC);
    }

    @Given("^a payload with an invalid URL \"([^\"]*)\"$")
    public void aPayloadWithWithAnInvalidURL(String url) throws Throwable {
        request = new BuildRequest(BUILD_ID, url, OffsetDateTime.now().toString(), HASH, TAG, BRANCH, DESC);
    }

    @Given("^a payload missing the tag$")
    public void aPayloadMissingTheTag() throws Throwable {
        request = new BuildRequest(BUILD_ID, URL, OffsetDateTime.now().toString(), HASH, null, BRANCH, DESC);
    }

    @Given("^a payload missing the description$")
    public void aPayloadMissingTheDescription() throws Throwable {
        request = new BuildRequest(BUILD_ID, URL, OffsetDateTime.now().toString(), HASH, TAG, BRANCH, null);
    }

    @When("^the post endpoint is called$")
    public void thePostEndpointIsCalled() throws Throwable {
        latestResponse.setResponse(restTemplate.postForEntity(ENDPOINT, request, String.class));
    }

    @And("^the response body contains a valid ID$")
    public void theResponseBodyContainsAValidId() throws Throwable {
        assertThat(latestResponse.getResponse().getBody(), notNullValue());
        assertThat(latestResponse.getResponse().getBody().toString(), not(isEmptyOrNullString()));
    }

    @And("^the build info record is created in the database$")
    public void theBuildInfoRecordIsCreatedInTheDatabase() throws Throwable {
        String dbResponse = (String) latestResponse.getResponse().getBody();
        Item record = getItem(dbResponse);
        assertThat(record, notNullValue());
        assertThat(record.get("buildId"), equalTo(request.getBuildId()));
        assertThat(record.get("url"), equalTo(request.getUrl()));
        assertThat(record.get("startTime").toString(), equalTo(request.getTime()));
        assertThat(record.get("finishTime"), nullValue());
        assertThat(record.get("vcHash"), equalTo(request.getVcHash()));
        assertThat(record.get("vcTag"), equalTo(request.getVcTag()));
        assertThat(record.get("vcBranch"), equalTo(request.getVcBranch()));
        assertThat(record.get("vcDescription"), equalTo(request.getVcDescription()));
    }
}
