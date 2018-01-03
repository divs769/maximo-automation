package com.shopdirect.acceptancetest.buildinfo;

import com.rethinkdb.net.Connection;
import com.shopdirect.acceptancetest.CucumberStepsDefinition;
import com.shopdirect.acceptancetest.LatestResponse;
import com.shopdirect.maximoautomation.infrastructure.DBInitializer;
import com.shopdirect.maximoautomation.infrastructure.RethinkDBConnectionFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static com.rethinkdb.RethinkDB.r;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CommonBuildStepDef extends CucumberStepsDefinition {

    private RethinkDBConnectionFactory connectionFactory;
    private LatestResponse latestResponse;

    @Autowired
    public CommonBuildStepDef(RethinkDBConnectionFactory connectionFactory, LatestResponse latestResponse) {
        this.connectionFactory = connectionFactory;
        this.latestResponse = latestResponse;
    }

    @Given("^the database has been initialised and is running$")
    public void theDatabaseHasBeenInitialised() throws Throwable {
        Connection connection = connectionFactory.createConnection();
        List<String> dbList = r.dbList().run(connection);
        assertThat(dbList.contains(DBInitializer.MAXIMO_DB), is(true));
        List<String> tableList = r.db(DBInitializer.MAXIMO_DB).tableList().run(connection);
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
}
