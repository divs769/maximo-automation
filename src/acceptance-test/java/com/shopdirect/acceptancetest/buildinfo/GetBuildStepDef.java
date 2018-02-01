package com.shopdirect.acceptancetest.buildinfo;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.shopdirect.acceptancetest.LatestResponse;
import com.shopdirect.maximoautomation.infrastructure.model.BuildInfo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GetBuildStepDef extends BaseBuildStepDef {

    private URI request;
    private List<BuildInfo> testData;

    public GetBuildStepDef(RestTemplate restTemplate, LatestResponse latestResponse, @Qualifier("testClient") AmazonDynamoDB db) {
        super(restTemplate, latestResponse, db);
    }

    @And("^some build data has been inserted$")
    public void someBuildDataHasBeenInserted() throws Throwable {
        testData = new ArrayList<>();
        for(Integer count = 1; count <= 3; count++) {
            BuildInfo build = createBuild(count);
            testData.add(build);
            addItem(build);
        }
        assertThat(countItems(), equalTo(3L));
    }

    @And("^a payload with a buildId$")
    public void aPayloadWithABuildId() throws Throwable {
        request = UriComponentsBuilder.fromUriString(ENDPOINT).path("/build2").build().toUri();
    }

    @Given("^a payload with a build ID that doesn't exist$")
    public void aPayloadWithABuildIDThatDoesnTExist() throws Throwable {
        request = UriComponentsBuilder.fromUriString(ENDPOINT).path("/build4").build().toUri();
    }

    @When("^the get endpoint is called$")
    public void theGetEndpointIsCalled() throws Throwable {
        latestResponse.setResponse(restTemplate.getForEntity(request, BuildInfo.class));
    }

    @And("^the build data is returned$")
    public void theBuildDataIsReturned() throws Throwable {
        BuildInfo buildInfo = (BuildInfo) latestResponse.getResponse().getBody();
        assertThat(buildInfo.getId(), equalTo(testData.get(1).getId()));
        assertThat(buildInfo.getBuildId(), equalTo(testData.get(1).getBuildId()));
    }
}
