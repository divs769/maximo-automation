package com.shopdirect.acceptancetest.buildinfo;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.shopdirect.acceptancetest.LatestResponse;
import com.shopdirect.maximoautomation.infrastructure.model.BuildInfo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllBuildStepDef extends BaseBuildStepDef {

    private URI request;
    private Map<UUID, BuildInfo> testData;

    public GetAllBuildStepDef(RestTemplate restTemplate, LatestResponse latestResponse, @Qualifier("testClient") AmazonDynamoDB db) {
        super(restTemplate, latestResponse, db);
    }

    @And("^multiple build data records have been inserted$")
    public void multipleBuildDataRecordsHaveBeenInserted() throws Throwable {
        testData = new HashMap<>();
        for(int i = 0; i < 10; i++) {
            BuildInfo build = createBuild(i);
            testData.put(build.getId(), build);
            addUpdateItem(build);
        }
        assertThat(countItems(), equalTo(10L));
    }

    @And("^a payload with no parameters$")
    public void aPayloadWithNoParameters() throws Throwable {
        request = UriComponentsBuilder.fromUriString(ENDPOINT).build().toUri();
    }

    @Given("^a payload with a pageIndex parameter$")
    public void aPayloadWithAStartIndexParameter() throws Throwable {
        request = UriComponentsBuilder.fromUriString(ENDPOINT).queryParam("pageIndex", 1).build().toUri();
    }

    @Given("^a payload with a startIndex greater than the number of stored records$")
    public void aPayloadWithAStartIndexGreaterThanTheNumberOfStoredRecords() throws Throwable {
        request = UriComponentsBuilder.fromUriString(ENDPOINT).queryParam("pageIndex", 12).build().toUri();
    }

    @Given("^a payload with a pageSize parameter$")
    public void aPayloadWithALimitParameter() throws Throwable {
        request = UriComponentsBuilder.fromUriString(ENDPOINT).queryParam("pageSize", 5).build().toUri();
    }

    @Given("a payload with a pageSize parameter greater than the number of records")
    public void aPayloadWithALimitParameterGreaterThanTheNumberOfRecords() throws Throwable {
        request = UriComponentsBuilder.fromUriString(ENDPOINT).queryParam("pageSize", 12).build().toUri();
    }

    @Given("a payload with a pageIndex and pageSize parameters")
    public void aPayloadWithAStartIndexAndLimitParameters() throws Throwable {
        request = UriComponentsBuilder.fromUriString(ENDPOINT).queryParam("pageIndex", 2).queryParam("pageSize", 3).build().toUri();
    }

    @Given("^a payload with a pageIndex and pageSize that is higher than the number of records available$")
    public void aPayloadWithAStartIndexAndLimitThatIsHigherThanTheNumberOfRecords() throws Throwable {
        request = UriComponentsBuilder.fromUriString(ENDPOINT).queryParam("pageIndex", 3).queryParam("pageSize", 3).build().toUri();
    }

    @When("^the get all endpoint is called$")
    public void theGetEndpointIsCalled() throws Throwable {
        latestResponse.setResponse(restTemplate.getForEntity(request, BuildInfo[].class));
    }

    @And("^an empty list is returned$")
    public void anEmptyListIsReturned() throws Throwable {
        BuildInfo[] response = (BuildInfo[]) latestResponse.getResponse().getBody();
        assertThat(response.length, equalTo(0));
    }

    @And("^all of the builds are returned$")
    public void allOfTheBuildsAreReturned() throws Throwable {
        BuildInfo[] response = (BuildInfo[]) latestResponse.getResponse().getBody();
        assertThat(response.length, equalTo(10));
        for(BuildInfo build : response) {
            checkBuildsEqual(build, testData.get(build.getId()));
        }
    }

    @And("^all of the builds, starting from pageIndex, are returned$")
    public void allOfTheBuildsStartingFromStartIndexAreReturned() throws Throwable {
        BuildInfo[] response = (BuildInfo[]) latestResponse.getResponse().getBody();
        assertThat(response.length, equalTo(2));
        for(BuildInfo build : response) {
            checkBuildsEqual(build, testData.get(build.getId()));
        }
    }

    @And("^the first page of builds with pageSize amount of entries is returned$")
    public void allOfTheBuildsUpTheLimitIsReturned() throws Throwable {
        BuildInfo[] response = (BuildInfo[]) latestResponse.getResponse().getBody();
        assertThat(response.length, equalTo(5));
        for(BuildInfo build : response) {
            checkBuildsEqual(build, testData.get(build.getId()));
        }
    }

    @And("^the specified page of builds is returned with the requested size$")
    public void aListIsReturnedWithRecordsStartingFromStartIndexAndEndingAtLimit() throws Throwable {
        BuildInfo[] response = (BuildInfo[]) latestResponse.getResponse().getBody();
        assertThat(response.length, equalTo(3));
        for(BuildInfo build : response) {
            checkBuildsEqual(build, testData.get(build.getId()));
        }
    }

    @And("^a page of builds is returned, starting from pageIndex and ending at the last record$")
    public void aListIsReturnedWithRecordsStartingFromStartIndexAndEndingAtTheLastRecord() throws Throwable {
        BuildInfo[] response = (BuildInfo[]) latestResponse.getResponse().getBody();
        assertThat(response.length, equalTo(1));
        for(BuildInfo build : response) {
            checkBuildsEqual(build, testData.get(build.getId()));
        }
    }

    private void checkBuildsEqual(BuildInfo response, BuildInfo testData) {
        assertThat(response.getId(), equalTo(testData.getId()));
        assertThat(response.getBuildId(), equalTo(testData.getBuildId()));
        assertThat(response.getUrl(), equalTo(testData.getUrl()));
        assertThat(response.getStartTime(), equalTo(testData.getStartTime()));
        assertThat(response.getFinishTime(), equalTo(testData.getFinishTime()));
        assertThat(response.getVcHash(), equalTo(testData.getVcHash()));
        assertThat(response.getVcTag(), equalTo(testData.getVcTag()));
        assertThat(response.getVcBranch(), equalTo(testData.getVcBranch()));
        assertThat(response.getVcDescription(), equalTo(testData.getVcDescription()));
        assertThat(response.getStatus(), equalTo(testData.getStatus()));
        assertThat(response.getMaximoChangeId(), equalTo(testData.getMaximoChangeId()));
    }
}
