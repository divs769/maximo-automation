package com.shopdirect.acceptancetest.buildinfo;

import com.shopdirect.acceptancetest.CucumberStepsDefinition;
import com.shopdirect.acceptancetest.LatestResponse;
import com.shopdirect.dao.TestBuildInfoDao;
import com.shopdirect.maximoautomation.infrastructure.DBInitializer;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CommonBuildStepDef extends CucumberStepsDefinition {

    private LatestResponse latestResponse;
    private TestBuildInfoDao testBuildInfoDao;

    @Autowired
    public CommonBuildStepDef(TestBuildInfoDao testBuildInfoDao, LatestResponse latestResponse) {
        this.testBuildInfoDao = testBuildInfoDao;
        this.latestResponse = latestResponse;
    }

    @Given("^the database has been initialised and is running$")
    public void theDatabaseHasBeenInitialised() throws Throwable {
        testBuildInfoDao.createConnection();
        List<String> dbList = testBuildInfoDao.getDatabases();
        assertThat(dbList.contains(DBInitializer.MAXIMO_DB), is(true));
        List<String> tableList = testBuildInfoDao.getTables();
        assertThat(tableList.contains(DBInitializer.BUILDS_TB), is(true));
    }

    @Then("^the response is success$")
    public void theResponseIsSuccess() throws Throwable {
        assertThat(latestResponse.getResponse().getStatusCode().is2xxSuccessful(), is(true));
    }

    @Then("^the response is failure$")
    public void theResponseIsFailure() throws Throwable {
        assertThat(latestResponse.getResponse().getStatusCode().is4xxClientError(), is(true));
    }

    @And("^the database is clean$")
    public void theDatabaseIsClean() throws Throwable {
        testBuildInfoDao.deleteAllRows();
        assertThat(testBuildInfoDao.countRows(), is(0L));
    }

    @After
    public void closeConnection() {
        testBuildInfoDao.closeConnection();
    }
}
