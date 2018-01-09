package com.shopdirect.maximoautomation.infrastructure.rest;

import com.shopdirect.maximoautomation.infrastructure.dao.BuildInfoDao;
import com.shopdirect.maximoautomation.infrastructure.exception.InvalidDataException;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildFinishedRequest;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildInfo;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildStartedRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import java.time.ZonedDateTime;
import java.util.regex.Pattern;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@RequestMapping(value = "/buildinfo")
public class BuildResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuildResource.class);
    private static final Pattern PATTERN = Pattern.compile("(https?://)?[\\w.]+(:\\d+)?/job/[\\w\\-]+/\\d+/$");

    private final BuildInfoDao buildInfoDao;

    @Autowired
    public BuildResource(BuildInfoDao buildInfoDao) {
        this.buildInfoDao = buildInfoDao;
    }

    @RequestMapping(method = POST, consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> buildStarted(@RequestBody BuildStartedRequest request) throws Exception {
        BuildInfo buildInfo = request.createBuildInfo();
        validateBuildStarted(buildInfo);
        return ResponseEntity.ok(buildInfoDao.save(buildInfo));
    }

    private void validateBuildStarted(BuildInfo buildInfo) throws Exception {
        if(buildInfo.getBuildId() == null) {
            throw new InvalidDataException("Missing build ID");
        }
        if(buildInfo.getUrl() == null) {
            throw new InvalidDataException("Missing URL");
        }
        checkInvalidTime(buildInfo.getStartTime());
        if(!PATTERN.matcher(buildInfo.getUrl()).matches()) {
            throw new InvalidDataException("Invalid URL");
        }
    }

    @RequestMapping(method = PUT, consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Void> buildFinished(@RequestBody BuildFinishedRequest request) throws Exception {
        BuildInfo buildInfo = request.createBuildInfo();
        checkInvalidTime(buildInfo.getFinishTime());
        updateValidations(buildInfo);
        buildInfoDao.update(buildInfo);
        return ResponseEntity.ok().build();
    }

    private void checkInvalidTime(ZonedDateTime time) throws InvalidDataException {
        if(time == null) {
            throw new InvalidDataException("Missing time");
        }
        if(time.isAfter(ZonedDateTime.now())) {
            throw new InvalidDataException("Invalid date");
        }
    }

    private void updateValidations(BuildInfo buildInfo) throws InvalidDataException {
        BuildInfo existingRecord = buildInfoDao.getRecord(buildInfo.getId());
        if(existingRecord == null) {
            throw new InvalidDataException("Record doesn't exist in the database");
        }
        if(buildInfo.getFinishTime().isBefore(existingRecord.getStartTime())) {
            throw new InvalidDataException("Finish date should be after start date");
        }
    }

//    @RequestMapping(method = GET, produces = "application/json; charset=UTF-8")
//    public ResponseEntity<HashMap> getAllBuilds() {
//        Connection connection = connectionFactory.connectToMaximoDb();
//        Cursor result = r.table(DBInitializer.BUILDS_TB).run(connection);
//        connection.close();
//        return null;//ResponseEntity.ok(result);
//    }
//
//    @RequestMapping(value="/{buildId}", method = GET, produces = "application/json; charset=UTF-8")
//    public ResponseEntity<HashMap> getBuildInfo(@PathVariable("buildId") String buildId) {
//        Connection connection = connectionFactory.connectToMaximoDb();
//        HashMap result = r.table(DBInitializer.BUILDS_TB).get(buildId).run(connection);
//        connection.close();
//        return ResponseEntity.ok(result);
//    }
}
