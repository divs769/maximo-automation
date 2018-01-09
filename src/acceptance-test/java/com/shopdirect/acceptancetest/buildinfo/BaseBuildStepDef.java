package com.shopdirect.acceptancetest.buildinfo;

import com.shopdirect.acceptancetest.CucumberStepsDefinition;
import com.shopdirect.acceptancetest.LatestResponse;
import com.shopdirect.dao.TestBuildInfoDao;
import com.shopdirect.model.BuildRequest;
import com.shopdirect.model.TestResponseErrorHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public abstract class BaseBuildStepDef extends CucumberStepsDefinition {

    protected static final String BUILD_ID = "123";
    protected static final String URL = "http://jenkins:8080/jobs/test/123";
    protected static final String ID = "1";

    protected RestTemplate restTemplate;
    protected LatestResponse latestResponse;
    protected TestBuildInfoDao testBuildInfoDao;
    protected BuildRequest request;

    @Autowired
    public BaseBuildStepDef(RestTemplate restTemplate, LatestResponse latestResponse,
                              TestBuildInfoDao testBuildInfoDao) {
        this.restTemplate = restTemplate;
        this.latestResponse = latestResponse;
        this.testBuildInfoDao = testBuildInfoDao;
        this.restTemplate.setErrorHandler(new TestResponseErrorHandler());
    }
}
