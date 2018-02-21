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
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping(value = "/buildinfo")
public class BuildResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(BuildResource.class);

    private final MaximoClient maximoClient;
    private final DynamoDBRepository dao;
    private final ValidationService validationService;

    @Autowired
    public BuildResource(MaximoClient maximoClient,
                         DynamoDBRepository dao,
                         ValidationService validationService) {
        this.maximoClient = maximoClient;
        this.dao = dao;
        this.validationService = validationService;
    }

    @RequestMapping(method = POST, consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> buildStarted(@RequestBody BuildStartedRequest request) {
        BuildInfo buildInfo = request.createBuildInfo();
        List<String> errors = validationService.validateBuildStarted(buildInfo);
        if(errors.isEmpty()) {
            // Saving the build request in the database before calling maximo
            buildInfo = dao.save(buildInfo);
            // Calling maximo
            String maximoChangeId = maximoClient.createChange(buildInfo);
            // Updating the build info with the maximo change id
            buildInfo.setMaximoChangeId(maximoChangeId);
            buildInfo = dao.save(buildInfo);

            return ResponseEntity.ok(buildInfo.getId().toString());
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
            BuildInfo existingBuild = dao.findOne(request.getId());
            existingBuild.setId(request.getId());
            existingBuild.setFinishTime(OffsetDateTime.parse(request.getTime()));
            existingBuild.setStatus(request.getStatus());
            dao.save(existingBuild);
            maximoClient.closeChange(existingBuild.getMaximoChangeId());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(BAD_REQUEST).body(ValidationService.generateErrorString(errors));
        }
    }

    @RequestMapping(method = GET, produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<BuildInfo>> getAllBuilds(@RequestParam(value = "pageIndex") Optional<Integer> pageIndex,
                                                        @RequestParam(value = "pageSize") Optional<Integer> pageSize) {
        if(pageIndex.isPresent() && !pageSize.isPresent()) {
            return ResponseEntity.badRequest().body(Collections.emptyList());
        }
        long numOfEntries = dao.count();
        if(numOfEntries == 0) {
            return ResponseEntity.ok(Collections.emptyList());
        }
        return ResponseEntity.ok(dao.findAll(new PageRequest(pageIndex.orElse(0), pageSize.orElse((int)numOfEntries))).getContent());
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
