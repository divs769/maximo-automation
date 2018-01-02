package com.shopdirect.acceptancetest.buildinfo;

import com.rethinkdb.net.Connection;
import com.shopdirect.acceptancetest.CucumberStepsDefinition;
import com.shopdirect.acceptancetest.LatestResponse;
import com.shopdirect.maximoautomation.infrastructure.DBInitializer;
import com.shopdirect.maximoautomation.infrastructure.RethinkDBConnectionFactory;
import com.shopdirect.model.DBResponse;
import com.shopdirect.model.BuildRequest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.deps.com.google.gson.Gson;
import gherkin.deps.com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;

import static com.rethinkdb.RethinkDB.r;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class StartBuildStepDef extends CucumberStepsDefinition {

    private RestTemplate restTemplate;
    private LatestResponse latestResponse;
    private RethinkDBConnectionFactory connectionFactory;
    private BuildRequest request;

    @Autowired
    public StartBuildStepDef(RestTemplate restTemplate, LatestResponse latestResponse,
                             RethinkDBConnectionFactory connectionFactory) {
        this.restTemplate = restTemplate;
        this.latestResponse = latestResponse;
        this.connectionFactory = connectionFactory;
    }

    @Given("^the database has been initialised and is running$")
    public void theDatabaseHasBeenInitialised() throws Throwable {
        Connection connection = connectionFactory.createConnection();
        List<String> dbList = r.dbList().run(connection);
        assertThat(dbList.contains(DBInitializer.MAXIMO_DB), is(true));
        List<String> tableList = r.db(DBInitializer.MAXIMO_DB).tableList().run(connection);
        assertThat(tableList.contains(DBInitializer.BUILDS_TB), is(true));
    }

    @Given("^a valid payload$")
    public void aValidPayload() throws Throwable {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        request = new BuildRequest("123",
                "http://jenkins:8080/jobs/123", formatter.format(LocalDateTime.now()));
    }

    @When("^the post endpoint is called$")
    public void thePostEndpointIsCalled() throws Throwable {
        latestResponse.setResponse(restTemplate.postForEntity("http://localhost:8080/buildinfo", request, String.class));
    }

    @Then("^the response is success$")
    public void theResponseIsSuccess() throws Throwable {
        assertThat(latestResponse.getResponse().getStatusCode().is2xxSuccessful(), is(true));
    }

    @And("^the response body contains a valid id$")
    public void theResponseBodyContainsAValidId() throws Throwable {
        assertThat(latestResponse.getResponse().getBody(), notNullValue());
        assertThat(latestResponse.getResponse().getBody().toString(), not(isEmptyOrNullString()));
    }

    @And("^the build info record is created in the database$")
    public void theBuildInfoRecordIsCreatedInTheDatabase() throws Throwable {
        String dbResponse = (String) latestResponse.getResponse().getBody();
        Gson gson = new GsonBuilder()./*setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).*/create();
        DBResponse dbData = gson.fromJson(dbResponse, DBResponse.class);
        Connection connection = connectionFactory.connectToMaximoDb();
        HashMap result = r.table(DBInitializer.BUILDS_TB).get(dbData.getGeneratedKeys()[0]).run(connection);
        connection.close();
        assertThat(result, notNullValue());
    }
}
