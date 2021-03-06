package com.shopdirect.acceptancetest.buildinfo;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
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
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.time.OffsetDateTime;
import java.util.UUID;

import static com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;
import static com.shopdirect.acceptancetest.configuration.TestConfiguration.BUILDS_TB;
import static com.shopdirect.maximoautomation.infrastructure.model.BuildStatus.SUCCESS;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.springframework.http.HttpMethod.PUT;

public class UpdateBuildStepDef extends BaseBuildStepDef {

    private BuildInfo data;
    private BuildRequest request;
    private UUID id;

    @Autowired
    public UpdateBuildStepDef(RestTemplate restTemplate, LatestResponse latestResponse, @Qualifier("testClient") AmazonDynamoDB db) {
        super(restTemplate, latestResponse, db);
    }

    @And("^build data has been inserted$")
    public void buildDataHasBeenInserted() throws Throwable {
        id = UUID.randomUUID();
        data = new BuildInfo(id, BUILD_ID, URL, OffsetDateTime.now().minusMinutes(30), null, HASH, TAG, BRANCH, DESC, null, CHANGE_ID);
        Table table = db.getTable(BUILDS_TB);
        table.putItem(createStartItem(data));
        assertRecordsSame(getItem(id.toString()));
    }

    @Given("^a valid update payload$")
    public void aValidPayload() throws Throwable {
        request = new BuildRequest(id, OffsetDateTime.now().toString(), STATUS, CHANGE_ID);
    }

    @Given("^a valid update payload with different ID$")
    public void aValidUpdatePayloadWithDifferentID() throws Throwable {
        request = new BuildRequest(UUID.randomUUID(), OffsetDateTime.now().toString(), STATUS, CHANGE_ID);
    }

    @Given("^a payload with a missing ID$")
    public void aPayloadWithAMissingID() throws Throwable {
        request = new BuildRequest(null, OffsetDateTime.now().toString(), STATUS, CHANGE_ID);
    }

    @Given("^a payload with the time missing$")
    public void aPayloadWithTheTimeMissing() throws Throwable {
        request = new BuildRequest(id, null, STATUS, CHANGE_ID);
    }

    @Given("^a payload with with an invalid time$")
    public void aPayloadWithWithAnInvalidTime() throws Throwable {
        request = new BuildRequest(id, OffsetDateTime.now().plusMinutes(1).toString(), STATUS, CHANGE_ID);
    }

    @Given("^a payload with a time before the start time$")
    public void aPayloadWithATimeBeforeTheStartTime() throws Throwable {
        request = new BuildRequest(id, data.getStartTime().minusSeconds(1).toString(), STATUS, CHANGE_ID);
    }

    @Given("^a payload with the state missing$")
    public void aPayloadWithTheStateMissing() throws Throwable {
        request = new BuildRequest(id, data.getStartTime().toString(), null, CHANGE_ID);
    }

    @And("^a record in the database exists with the ID contained in the payload$")
    public void aRecordInTheDatabaseExistsWithTheIDContainedInThePayload() throws Throwable {
        assertThat(getItem(id), notNullValue());
    }

    @When("^the put endpoint is called$")
    public void thePutEndpointIsCalled() throws Throwable {
        latestResponse.setResponse(restTemplate.exchange(ENDPOINT, PUT, new HttpEntity<>(request), String.class));
    }

    @And("^the build info record is updated in the database$")
    public void theBuildInfoRecordIsUpdatedInTheDatabase() throws Throwable {
        Item result = getItem(request.getId());
        assertRecordsSame(result);
        assertThat(result.get("finishTime").toString(), equalTo(request.getTime()));
        assertThat(result.get("status"), equalTo(SUCCESS.getCode()));
    }

    @And("^the record is not updated in the database$")
    public void theRecordIsNotUpdatedInTheDatabase() throws Throwable {
        assertRecordsSame(getItem(request.getId()));
    }

    @And("^a record in the database doesn't exist with the ID contained in the payload$")
    public void aRecordInTheDatabaseDoesnTExistWithTheIDContainedInThePayload() throws Throwable {
        assertThat(getItem("2"), nullValue());
    }

    private void assertRecordsSame(Item result) {
        assertThat(result.get("buildId"), equalTo(data.getBuildId()));
        assertThat(result.get("url"), equalTo(data.getUrl()));
        assertThat(result.get("startTime"), equalTo(data.getStartTime().toString()));
        assertThat(result.get("vcHash"), equalTo(data.getVcHash()));
        assertThat(result.get("vcTag"), equalTo(data.getVcTag()));
        assertThat(result.get("vcBranch"), equalTo(data.getVcBranch()));
        assertThat(result.get("vcDescription"), equalTo(data.getVcDescription()));
        assertThat(result.get("maximoChangeId"), equalTo(data.getMaximoChangeId()));
    }

    @And("^the maximo closes the change$")
    public void theMaximoClosesTheChange() throws Throwable {
        verify(postRequestedFor(urlEqualTo("/soap")));
    }
}
