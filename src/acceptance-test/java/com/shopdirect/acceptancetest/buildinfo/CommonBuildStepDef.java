package com.shopdirect.acceptancetest.buildinfo;

import com.shopdirect.acceptancetest.LatestResponse;
import com.shopdirect.dao.TestBuildInfoDao;
import com.shopdirect.maximoautomation.infrastructure.config.DBInitializer;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CommonBuildStepDef extends BaseBuildStepDef {

    @Autowired
    public CommonBuildStepDef(RestTemplate restTemplate, LatestResponse latestResponse, TestBuildInfoDao testBuildInfoDao) {
        super(restTemplate, latestResponse, testBuildInfoDao);
    }

    @After
    public void closeConnection() {
        testBuildInfoDao.closeConnection();
    }

    @Given("^the database has been initialised and is running$")
    public void theDatabaseHasBeenInitialised() throws Throwable {
        testBuildInfoDao.createConnection();
        List<String> dbList = testBuildInfoDao.getDatabases();
        assertThat(dbList.contains(DBInitializer.MAXIMO_DB), is(true));
        List<String> tableList = testBuildInfoDao.getTables();
        assertThat(tableList.contains(DBInitializer.BUILDS_TB), is(true));
    }

    @And("^the database is clean$")
    public void theDatabaseIsClean() throws Throwable {
        testBuildInfoDao.deleteAllRows();
        assertThat(testBuildInfoDao.countRows(), is(0L));
    }

    @Then("^the response is success$")
    public void theResponseIsSuccess() throws Throwable {
        assertThat(latestResponse.getResponse().getStatusCode().is2xxSuccessful(), is(true));
    }

    @Then("^the response is failure$")
    public void theResponseIsFailure() throws Throwable {
        assertThat(latestResponse.getResponse().getStatusCode().is4xxClientError(), is(true));
    }
}
