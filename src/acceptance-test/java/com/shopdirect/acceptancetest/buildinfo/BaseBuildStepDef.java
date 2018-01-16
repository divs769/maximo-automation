package com.shopdirect.acceptancetest.buildinfo;

import com.shopdirect.acceptancetest.CucumberStepsDefinition;
import com.shopdirect.acceptancetest.LatestResponse;
import com.shopdirect.acceptancetest.configuration.TestResponseErrorHandler;
import com.shopdirect.dao.TestBuildInfoDao;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.time.OffsetDateTime;

public abstract class BaseBuildStepDef extends CucumberStepsDefinition {

    protected static final String ENDPOINT = "http://localhost:8080/buildinfo";

    protected static final String BUILD_ID = "build";
    protected static final String URL = "http://jenkins:8080/job/test/123/";
    protected static final String ID = "1";

    protected RestTemplate restTemplate;
    protected LatestResponse latestResponse;
    protected TestBuildInfoDao testBuildInfoDao;

    @Autowired
    public BaseBuildStepDef(RestTemplate restTemplate, LatestResponse latestResponse,
                              TestBuildInfoDao testBuildInfoDao) {
        this.restTemplate = restTemplate;
        this.latestResponse = latestResponse;
        this.testBuildInfoDao = testBuildInfoDao;
        this.restTemplate.setErrorHandler(new TestResponseErrorHandler());
    }

    protected BuildInfo createBuild(Integer count) {
        return BuildInfo.builder().setId(count.toString()).setBuildId(BUILD_ID + String.valueOf(count)).setUrl(URL)
                .setStartTime(OffsetDateTime.now().plusMinutes(count)).setFinishTime(OffsetDateTime.now().plusMinutes(count+1))
                .createBuildInfo();
    }
}
