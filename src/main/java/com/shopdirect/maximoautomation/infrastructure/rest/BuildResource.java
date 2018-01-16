package com.shopdirect.maximoautomation.infrastructure.rest;

import com.shopdirect.maximoautomation.infrastructure.dao.BuildInfoDao;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildFinishedRequest;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildInfo;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildStartedRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestController
@RequestMapping(value = "/buildinfo")
public class BuildResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuildResource.class);
    private static final Pattern PATTERN = Pattern.compile("(https?://)?[\\w.]+(:\\d+)?/job/[\\w-]+/\\d+/$");

    private final BuildInfoDao buildInfoDao;

    @Autowired
    public BuildResource(BuildInfoDao buildInfoDao) {
        this.buildInfoDao = buildInfoDao;
    }

    @RequestMapping(method = POST, consumes = APPLICATION_JSON_UTF8_VALUE, produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> buildStarted(@RequestBody BuildStartedRequest request) {
        BuildInfo buildInfo = request.createBuildInfo();
        List<String> errors = validateBuildStarted(buildInfo);
        if(errors.isEmpty()) {
            return ResponseEntity.ok(buildInfoDao.save(buildInfo));
        } else {
            StringBuilder sb = new StringBuilder();
            for(String error : errors) {
                sb.append(error).append("\n");
            }
            return ResponseEntity.status(BAD_REQUEST).body(sb.toString());
        }
    }

    @RequestMapping(method = PUT, consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> buildFinished(@RequestBody BuildFinishedRequest request) {
        BuildInfo buildInfo = request.createBuildInfo();
        List<String> errors = checkInvalidTime(buildInfo.getFinishTime());
        errors.addAll(updateValidations(buildInfo));
        if(errors.isEmpty()) {
            buildInfoDao.update(buildInfo);
            return ResponseEntity.ok().build();
        } else {
            StringBuilder sb = new StringBuilder();
            for(String error : errors) {
                sb.append(error).append("\n");
            }
            return ResponseEntity.status(BAD_REQUEST).body(sb.toString());
        }
    }

    @RequestMapping(method = GET, produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<BuildInfo>> getAllBuilds(@RequestParam(value = "startIndex") Optional<Long> startIndex,
                                                        @RequestParam(value = "limit") Optional<Long> limit) {
        return ResponseEntity.ok(buildInfoDao.getAllRecords(startIndex, limit));
    }

    @RequestMapping(value="/{buildId}", method = GET, produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BuildInfo> getBuildInfo(@PathVariable(name = "buildId") String buildId) {
        BuildInfo buildInfo = buildInfoDao.getRecordFromBuildId(buildId);
        if(buildInfo == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(buildInfo);
        }
    }

    private List<String> validateBuildStarted(BuildInfo buildInfo) {
        List<String> errors = new ArrayList<>();
        if(buildInfo.getBuildId() == null) {
            errors.add("Missing build ID.");
        }
        if(buildInfo.getUrl() == null) {
            errors.add("Missing URL.");
        } else if(!PATTERN.matcher(buildInfo.getUrl()).matches()) {
            errors.add("Invalid URL.");
        }
        errors.addAll(checkInvalidTime(buildInfo.getStartTime()));
        return errors;
    }

    private List<String> checkInvalidTime(OffsetDateTime time) {
        List<String> errors = new ArrayList<>();
        if(time == null) {
            errors.add("Missing time.");
        } else if(time.isAfter(OffsetDateTime.now())) {
            errors.add("Invalid time.");
        }
        return errors;
    }

    private List<String> updateValidations(BuildInfo buildInfo) {
        List<String> errors = new ArrayList<>();
        if(buildInfo.getId() == null) {
            errors.add("Build ID is missing.");
            return errors;
        }
        BuildInfo existingRecord = buildInfoDao.getRecord(buildInfo.getId());
        if(existingRecord == null) {
            errors.add("Record doesn't exist in the database");
        } else if(buildInfo.getFinishTime() != null && buildInfo.getFinishTime().isBefore(existingRecord.getStartTime())) {
            errors.add("Finish date should be after start date");
        }
        return errors;
    }
}
