package com.shopdirect.maximoautomation.infrastructure.resource;

import com.shopdirect.maximoautomation.infrastructure.maximo.client.MaximoClient;
import com.shopdirect.maximoautomation.infrastructure.model.BuildInfo;
import com.shopdirect.maximoautomation.infrastructure.model.dto.BuildFinishedRequest;
import com.shopdirect.maximoautomation.infrastructure.model.dto.BuildStartedRequest;
import com.shopdirect.maximoautomation.infrastructure.repository.DynamoDBRepository;
import com.shopdirect.maximoautomation.infrastructure.service.ValidationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping(value = "/buildinfo")
public class BuildResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(BuildResource.class);
    @Autowired
    private MaximoClient maximoClient;
    private final DynamoDBRepository dao;
    private final ValidationService validationService;

    @Autowired
    public BuildResource(DynamoDBRepository dao,
                         ValidationService validationService) {
        this.dao = dao;
        this.validationService = validationService;
    }

    @RequestMapping(method = POST, consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> buildStarted(@RequestBody BuildStartedRequest request) {
        BuildInfo buildInfo = request.createBuildInfo();
        List<String> errors = validationService.validateBuildStarted(buildInfo);
        if(errors.isEmpty()) {
            BuildInfo result = dao.save(buildInfo);
            UUID buildInfoId = result.getId();
//            maximoClient.createChange(buildInfo);
            return ResponseEntity.ok(buildInfoId.toString());
        } else {
            LOGGER.error("Validation error: {}", ValidationService.generateErrorString(errors));
            return ResponseEntity.status(BAD_REQUEST).body(ValidationService.generateErrorString(errors));
        }
    }

    @RequestMapping(method = PUT, consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> buildFinished(@RequestBody BuildFinishedRequest request) {
        BuildInfo buildInfo = request.createBuildInfo();
        List<String> errors = validationService.updateValidations(buildInfo);
        if(errors.isEmpty()) {
            BuildInfo existingBuild = dao.findOne(UUID.fromString(request.getId()));
            existingBuild.setId(UUID.fromString(request.getId()));
            existingBuild.setFinishTime(OffsetDateTime.parse(request.getTime()));
            existingBuild.setStatus(request.getStatus());
            dao.save(existingBuild);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(BAD_REQUEST).body(ValidationService.generateErrorString(errors));
        }
    }

    @RequestMapping(method = GET, produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<BuildInfo>> getAllBuilds(@RequestParam(value = "startIndex") Optional<Integer> startIndex,
                                                        @RequestParam(value = "limit") Optional<Integer> limit) {
        return ResponseEntity.ok(dao.findAll(new PageRequest(startIndex.orElse(0), limit.orElse((int)dao.count()))).getContent());
    }

    @RequestMapping(value="/{buildId}", method = GET, produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<BuildInfo> getBuildInfo(@PathVariable(name = "buildId") String buildId) {
        BuildInfo buildInfo = dao.findByBuildId(buildId);
        if(buildInfo == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(buildInfo);
        }
    }
}
