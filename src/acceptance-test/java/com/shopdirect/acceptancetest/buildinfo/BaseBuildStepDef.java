package com.shopdirect.acceptancetest.buildinfo;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.shopdirect.acceptancetest.CucumberStepsDefinition;
import com.shopdirect.acceptancetest.LatestResponse;
import com.shopdirect.acceptancetest.configuration.TestResponseErrorHandler;
import com.shopdirect.maximoautomation.infrastructure.model.BuildInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.client.RestTemplate;

import java.time.OffsetDateTime;
import java.util.UUID;

import static com.shopdirect.acceptancetest.configuration.TestConfiguration.BUILDS_TB;
import static com.shopdirect.maximoautomation.infrastructure.model.BuildStatus.SUCCESS;

public abstract class BaseBuildStepDef extends CucumberStepsDefinition {

    protected static final String ENDPOINT = "http://localhost:8080/buildinfo";

    protected static final String BUILD_ID = "build";
    protected static final String URL = "http://jenkins:8080/job/test/123/";
    protected static final String ID = "1";
    protected static final String HASH = "665169b62d95c73d0de89337fa7ea6622c1a08c2";
    protected static final String TAG = "1.1";
    protected static final String BRANCH = "test";
    protected static final String DESC = "description";
    protected static final String STATUS = "SUCCESS";

    protected RestTemplate restTemplate;
    protected LatestResponse latestResponse;
    protected DynamoDB db;

    @Autowired
    public BaseBuildStepDef(RestTemplate restTemplate, LatestResponse latestResponse, @Qualifier("testClient") AmazonDynamoDB db) {
        this.restTemplate = restTemplate;
        this.latestResponse = latestResponse;
        this.db = new DynamoDB(db);
        this.restTemplate.setErrorHandler(new TestResponseErrorHandler());
    }

    protected BuildInfo createBuild(int count) {
        return BuildInfo.builder().setId(UUID.randomUUID()).setBuildId(BUILD_ID + String.valueOf(count)).setUrl(URL)
                .setStartTime(OffsetDateTime.now().plusMinutes(count)).setFinishTime(OffsetDateTime.now().plusMinutes(count+1))
                .setVcHash(HASH).setVcTag(TAG).setVcBranch(BRANCH).setVcDescription(DESC).setStatus(SUCCESS).createBuildInfo();
    }

    protected Item getItem(String id) {
        Table table = db.getTable(BUILDS_TB);
        return table.getItem("id", id);
    }

    protected Item getItem(UUID id) {
        return getItem(id.toString());
    }

    protected Item createStartItem(BuildInfo buildInfo) {
        return new Item()
                .withString("id", buildInfo.getId().toString())
                .withString("buildId", buildInfo.getBuildId())
                .withString("url", buildInfo.getUrl())
                .with("startTime", buildInfo.getStartTime().toString())
                .withString("vcHash", buildInfo.getVcHash())
                .withString("vcTag", buildInfo.getVcTag())
                .withString("vcBranch", buildInfo.getVcBranch())
                .withString("vcDescription", buildInfo.getVcDescription());
    }

    protected Item createUpdateItem(BuildInfo buildInfo) {
        Item item = createStartItem(buildInfo);
        item.with("finishTime", buildInfo.getFinishTime().toString());
        item.withString("status", buildInfo.getStatus().toString());
        return item;
    }

    protected void addStartItem(BuildInfo buildInfo) {
        Table table = db.getTable(BUILDS_TB);
        table.putItem(createStartItem(buildInfo));
    }

    protected void addUpdateItem(BuildInfo buildInfo) {
        Table table = db.getTable(BUILDS_TB);
        table.putItem(createUpdateItem(buildInfo));
    }

    protected long countItems() {
        Table table = db.getTable(BUILDS_TB);
        return table.describe().getItemCount();
    }
}
