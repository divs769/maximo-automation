package com.shopdirect.acceptancetest.buildinfo;

import com.shopdirect.acceptancetest.LatestResponse;
import com.shopdirect.dao.TestBuildInfoDao;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildInfo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GetAllBuildStepDef extends BaseBuildStepDef {

    private URI request;
    private List<BuildInfo> testData;

    public GetAllBuildStepDef(RestTemplate restTemplate, LatestResponse latestResponse, TestBuildInfoDao testBuildInfoDao) {
        super(restTemplate, latestResponse, testBuildInfoDao);
    }

    @And("^multiple build data records have been inserted$")
    public void multipleBuildDataRecordsHaveBeenInserted() throws Throwable {
        testData = new ArrayList<>();
        for(Integer count = 0; count < 10; count++) {
            BuildInfo build = createBuild(count);
            testData.add(build);
            testBuildInfoDao.insertRow(build);
        }
        assertThat(testBuildInfoDao.countRows(), equalTo(10L));
    }

    private BuildInfo createBuild(Integer count) {
        return BuildInfo.builder().setId(count.toString()).setBuildId(BUILD_ID).setUrl(URL)
                .setStartTime(OffsetDateTime.now().plusMinutes(count)).setFinishTime(OffsetDateTime.now().plusMinutes(count+1))
                .createBuildInfo();
    }

    @And("^a payload with no parameters$")
    public void aPayloadWithNoParameters() throws Throwable {
        request = UriComponentsBuilder.fromUriString(ENDPOINT).build().toUri();
    }

    @Given("^a payload with a startIndex parameter$")
    public void aPayloadWithAStartIndexParameter() throws Throwable {
        request = UriComponentsBuilder.fromUriString(ENDPOINT).queryParam("startIndex", 8).build().toUri();
    }

    @Given("^a payload with a startIndex greater than the number of stored records$")
    public void aPayloadWithAStartIndexGreaterThanTheNumberOfStoredRecords() throws Throwable {
        request = UriComponentsBuilder.fromUriString(ENDPOINT).queryParam("startIndex", 12).build().toUri();
    }

    @Given("^a payload with a limit parameter$")
    public void aPayloadWithALimitParameter() throws Throwable {
        request = UriComponentsBuilder.fromUriString(ENDPOINT).queryParam("limit", 5).build().toUri();
    }

    @Given("^a payload with a limit parameter greater than the number of records$")
    public void aPayloadWithALimitParameterGreaterThanTheNumberOfRecords() throws Throwable {
        request = UriComponentsBuilder.fromUriString(ENDPOINT).queryParam("limit", 12).build().toUri();
    }

    @Given("^a payload with a startIndex and limit parameters$")
    public void aPayloadWithAStartIndexAndLimitParameters() throws Throwable {
        request = UriComponentsBuilder.fromUriString(ENDPOINT).queryParam("startIndex", 3).queryParam("limit", 3).build().toUri();
    }

    @Given("^a payload with a startIndex and limit that is higher than the number of records$")
    public void aPayloadWithAStartIndexAndLimitThatIsHigherThanTheNumberOfRecords() throws Throwable {
        request = UriComponentsBuilder.fromUriString(ENDPOINT).queryParam("startIndex", 6).queryParam("limit", 10).build().toUri();
    }

    @When("^the get endpoint is called$")
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
            checkBuildsEqual(build, testData.get(Integer.valueOf(build.getId())));
        }
    }

    @And("^all of the builds, starting from startIndex, are returned$")
    public void allOfTheBuildsStartingFromStartIndexAreReturned() throws Throwable {
        BuildInfo[] response = (BuildInfo[]) latestResponse.getResponse().getBody();
        assertThat(response.length, equalTo(2));
        for(BuildInfo build : response) {
            checkBuildsEqual(build, testData.get(Integer.valueOf(build.getId())));
        }
    }

    @And("^all of the builds, up the limit, is returned$")
    public void allOfTheBuildsUpTheLimitIsReturned() throws Throwable {
        BuildInfo[] response = (BuildInfo[]) latestResponse.getResponse().getBody();
        assertThat(response.length, equalTo(5));
        for(BuildInfo build : response) {
            checkBuildsEqual(build, testData.get(Integer.valueOf(build.getId())));
        }
    }

    @And("^a list is returned, with records starting from startIndex and ending at limit$")
    public void aListIsReturnedWithRecordsStartingFromStartIndexAndEndingAtLimit() throws Throwable {
        BuildInfo[] response = (BuildInfo[]) latestResponse.getResponse().getBody();
        assertThat(response.length, equalTo(3));
        for(BuildInfo build : response) {
            checkBuildsEqual(build, testData.get(Integer.valueOf(build.getId())));
        }
    }

    @And("^a list is returned, with records starting from startIndex and ending at the last record$")
    public void aListIsReturnedWithRecordsStartingFromStartIndexAndEndingAtTheLastRecord() throws Throwable {
        BuildInfo[] response = (BuildInfo[]) latestResponse.getResponse().getBody();
        assertThat(response.length, equalTo(4));
        for(BuildInfo build : response) {
            checkBuildsEqual(build, testData.get(Integer.valueOf(build.getId())));
        }
    }

    private void checkBuildsEqual(BuildInfo response, BuildInfo testData) {
        assertThat(response.getId(), equalTo(testData.getId()));
        assertThat(response.getBuildId(), equalTo(testData.getBuildId()));
        assertThat(response.getUrl(), equalTo(testData.getUrl()));
        assertThat(response.getStartTime(), equalTo(testData.getStartTime()));
        assertThat(response.getFinishTime(), equalTo(testData.getFinishTime()));
    }
}
