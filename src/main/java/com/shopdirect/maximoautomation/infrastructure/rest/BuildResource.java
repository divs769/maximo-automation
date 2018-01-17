package com.shopdirect.maximoautomation.infrastructure.rest;

import com.shopdirect.maximoautomation.infrastructure.dao.BuildInfoDao;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildFinishedRequest;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildInfo;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildStartedRequest;
import com.shopdirect.maximoautomation.infrastructure.service.ValidationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestController
@RequestMapping(value = "/buildinfo")
public class BuildResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuildResource.class);

    private final BuildInfoDao buildInfoDao;
    private final ValidationService validationService;

    @Autowired
    public BuildResource(BuildInfoDao buildInfoDao, ValidationService validationService) {
        this.buildInfoDao = buildInfoDao;
        this.validationService = validationService;
    }

    @RequestMapping(method = POST, consumes = APPLICATION_JSON_UTF8_VALUE, produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> buildStarted(@RequestBody BuildStartedRequest request) {
        BuildInfo buildInfo = request.createBuildInfo();
        List<String> errors = validationService.validateBuildStarted(buildInfo);
        if(errors.isEmpty()) {
            return ResponseEntity.ok(buildInfoDao.save(buildInfo));
        } else {
            return ResponseEntity.status(BAD_REQUEST).body(ValidationService.generateErrorString(errors));
        }
    }

    @RequestMapping(method = PUT, consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> buildFinished(@RequestBody BuildFinishedRequest request) {
        BuildInfo buildInfo = request.createBuildInfo();
        List<String> errors = validationService.updateValidations(buildInfo);
        if(errors.isEmpty()) {
            buildInfoDao.update(buildInfo);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(BAD_REQUEST).body(ValidationService.generateErrorString(errors));
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
}
