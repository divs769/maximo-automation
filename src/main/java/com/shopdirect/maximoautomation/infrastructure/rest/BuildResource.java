package com.shopdirect.maximoautomation.infrastructure.rest;

import com.rethinkdb.net.Connection;
import com.rethinkdb.net.Cursor;
import com.shopdirect.maximoautomation.infrastructure.DBInitializer;
import com.shopdirect.maximoautomation.infrastructure.RethinkDBConnectionFactory;
import com.shopdirect.maximoautomation.infrastructure.exception.InvalidDataException;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.rethinkdb.RethinkDB.r;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping(value = "/buildinfo")
public class BuildResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuildResource.class);
    private static final String URL_PATTERN = "(https?://)?\\w+(:\\d+)?/jobs/[\\w\\-]+/\\d+";

    private RethinkDBConnectionFactory connectionFactory;

    @Autowired
    public BuildResource(RethinkDBConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    @RequestMapping(method = POST, consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<HashMap> buildStarted(@RequestBody BuildInfo buildInfo) throws Exception {
        validateInfo(buildInfo);
        Connection connection = connectionFactory.connectToMaximoDb();
        HashMap result = r.table(DBInitializer.BUILDS_TB).insert(buildInfo).run(connection);
        connection.close();
        return ResponseEntity.ok(result);
    }

    private void validateInfo(BuildInfo buildInfo) throws Exception {
        if(buildInfo.getBuildId() == null) {
            throw new InvalidDataException("Missing build ID");
        }
        if(buildInfo.getUrl() == null) {
            throw new InvalidDataException("Missing URL");
        }
        if(buildInfo.getTime() == null) {
            throw new InvalidDataException("Missing time");
        }
        ZonedDateTime time = ZonedDateTime.parse(buildInfo.getTime(), DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        if(time.isAfter(ZonedDateTime.now())) {
            throw new InvalidDataException("Invalid date");
        }
        Matcher matcher = Pattern.compile(URL_PATTERN).matcher(buildInfo.getUrl());
        if(!matcher.matches()) {
            throw new InvalidDataException("Invalid URL");
        }
    }

    @RequestMapping(path = "/{buildId}", method = PUT)
    public ResponseEntity<String> buildFinished(@PathVariable Long dbId, @RequestBody String finishTime) {
        Connection connection = connectionFactory.connectToMaximoDb();
        r.table(DBInitializer.BUILDS_TB).get(dbId).update(finishTime).run(connection);
        connection.close();
        return ResponseEntity.ok("Record updated.");
    }

    @RequestMapping(method = GET, produces = "application/json; charset=UTF-8")
    public ResponseEntity<HashMap> getAllBuilds() {
        Connection connection = connectionFactory.connectToMaximoDb();
        Cursor result = r.table(DBInitializer.BUILDS_TB).run(connection);
        connection.close();
        return null;//ResponseEntity.ok(result);
    }

    @RequestMapping(value="/{buildId}", method = GET, produces = "application/json; charset=UTF-8")
    public ResponseEntity<HashMap> getBuildInfo(@PathVariable("buildId") String buildId) {
        Connection connection = connectionFactory.connectToMaximoDb();
        HashMap result = r.table(DBInitializer.BUILDS_TB).get(buildId).run(connection);
        connection.close();
        return ResponseEntity.ok(result);
    }
}
