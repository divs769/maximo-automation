package com.shopdirect.acceptancetest.buildinfo;

import com.shopdirect.acceptancetest.LatestResponse;
import com.shopdirect.dao.TestBuildInfoDao;
import com.shopdirect.maximoautomation.infrastructure.model.BuildInfo;
import com.shopdirect.model.BuildRequest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.time.OffsetDateTime;
import java.util.Map;

import static com.shopdirect.maximoautomation.infrastructure.model.BuildStatus.SUCCESS;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.springframework.http.HttpMethod.PUT;

public class UpdateBuildStepDef extends BaseBuildStepDef {

    private BuildInfo data;
    private BuildRequest request;

    @Autowired
    public UpdateBuildStepDef(RestTemplate restTemplate, LatestResponse latestResponse, TestBuildInfoDao testBuildInfoDao) {
        super(restTemplate, latestResponse, testBuildInfoDao);
    }

    @And("^build data has been inserted$")
    public void buildDataHasBeenInserted() throws Throwable {
        data = new BuildInfo(ID, BUILD_ID, URL, OffsetDateTime.now().minusMinutes(30), null, HASH, TAG, BRANCH, DESC, null);
        testBuildInfoDao.insertRow(data);
        assertRecordsSame(testBuildInfoDao.getRow(ID));
    }

    @Given("^a valid update payload$")
    public void aValidPayload() throws Throwable {
        request = new BuildRequest(ID, OffsetDateTime.now().toString(), STATUS);
    }

    @Given("^a valid update payload with different ID$")
    public void aValidUpdatePayloadWithDifferentID() throws Throwable {
        request = new BuildRequest("2", OffsetDateTime.now().toString(), STATUS);
    }

    @Given("^a payload with a missing ID$")
    public void aPayloadWithAMissingID() throws Throwable {
        request = new BuildRequest(null, OffsetDateTime.now().toString(), STATUS);
    }

    @Given("^a payload with the time missing$")
    public void aPayloadWithTheTimeMissing() throws Throwable {
        request = new BuildRequest(ID, null, STATUS);
    }

    @Given("^a payload with with an invalid time$")
    public void aPayloadWithWithAnInvalidTime() throws Throwable {
        request = new BuildRequest(ID, OffsetDateTime.now().plusMinutes(1).toString(), STATUS);
    }

    @Given("^a payload with a time before the start time$")
    public void aPayloadWithATimeBeforeTheStartTime() throws Throwable {
        request = new BuildRequest(ID, data.getStartTime().minusSeconds(1).toString(), STATUS);
    }

    @Given("^a payload with the state missing$")
    public void aPayloadWithTheStateMissing() throws Throwable {
        request = new BuildRequest(ID, data.getStartTime().toString(), null);
    }

    @And("^a record in the database exists with the ID contained in the payload$")
    public void aRecordInTheDatabaseExistsWithTheIDContainedInThePayload() throws Throwable {
        assertThat(testBuildInfoDao.getRow(ID), notNullValue());

    }

    @When("^the put endpoint is called$")
    public void thePutEndpointIsCalled() throws Throwable {
        latestResponse.setResponse(restTemplate.exchange(ENDPOINT, PUT, new HttpEntity<>(request), String.class));
    }

    @And("^the build info record is updated in the database$")
    public void theBuildInfoRecordIsUpdatedInTheDatabase() throws Throwable {
        Map result = testBuildInfoDao.getRow(request.getId());
        assertRecordsSame(result);
        assertThat(result.get("finishTime").toString(), equalTo(request.getTime()));
        assertThat(result.get("status"), equalTo(SUCCESS.getCode()));
    }

    @And("^the record is not updated in the database$")
    public void theRecordIsNotUpdatedInTheDatabase() throws Throwable {
        assertRecordsSame(testBuildInfoDao.getRow(request.getId()));
    }

    @And("^a record in the database doesn't exist with the ID contained in the payload$")
    public void aRecordInTheDatabaseDoesnTExistWithTheIDContainedInThePayload() throws Throwable {
        assertThat(testBuildInfoDao.getRow("2"), nullValue());
    }

    private void assertRecordsSame(Map result) {
        assertThat(result.get("buildId"), equalTo(data.getBuildId()));
        assertThat(result.get("url"), equalTo(data.getUrl()));
        assertThat(result.get("startTime"), equalTo(data.getStartTime()));
    }
}
