package com.shopdirect.acceptancetest.buildinfo;

import com.shopdirect.acceptancetest.LatestResponse;
import com.shopdirect.dao.TestBuildInfoDao;
import com.shopdirect.model.BuildRequest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.time.ZonedDateTime;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;

public class StartBuildStepDef extends BaseBuildStepDef {

    @Autowired
    public StartBuildStepDef(RestTemplate restTemplate, LatestResponse latestResponse,
                             TestBuildInfoDao testBuildInfoDao) {
        super(restTemplate, latestResponse, testBuildInfoDao);
    }

    @Given("^a valid payload, containing the build info$")
    public void aValidPayload() throws Throwable {
        request = new BuildRequest(BUILD_ID, URL, ISO_OFFSET_DATE_TIME.format(ZonedDateTime.now()));
    }

    @Given("^a payload missing the build ID$")
    public void aPayloadMissingTheBuildID() throws Throwable {
        request = new BuildRequest(null, URL, ISO_OFFSET_DATE_TIME.format(ZonedDateTime.now()));
    }

    @Given("^a payload missing the build URL$")
    public void aPayloadMissingTheBuildURL() throws Throwable {
        request = new BuildRequest(BUILD_ID, null, ISO_OFFSET_DATE_TIME.format(ZonedDateTime.now()));
    }

    @Given("^a payload missing the time$")
    public void aPayloadMissingTheTime() throws Throwable {
        request = new BuildRequest(BUILD_ID, URL, null);
    }

    @Given("^a payload with with an invalid date or time$")
    public void aPayloadWithWithAnInvalidDateOrTime() throws Throwable {
        request = new BuildRequest(BUILD_ID, URL, ISO_OFFSET_DATE_TIME.format(ZonedDateTime.now().plusSeconds(1)));
    }

    @Given("^a payload with with an invalid URL \"([^\"]*)\"$")
    public void aPayloadWithWithAnInvalidURL(String url) throws Throwable {
        request = new BuildRequest(BUILD_ID, url, ISO_OFFSET_DATE_TIME.format(ZonedDateTime.now()));
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
        Map result = testBuildInfoDao.getRow(dbResponse);
        assertThat(result, notNullValue());
        assertThat(result.get("buildId"), equalTo(BUILD_ID));
        assertThat(result.get("url"), equalTo(URL));
        assertThat(result.get("startTime").toString(), equalTo(request.getTime()));
        assertThat(result.get("finishTime"), nullValue());
    }
}
