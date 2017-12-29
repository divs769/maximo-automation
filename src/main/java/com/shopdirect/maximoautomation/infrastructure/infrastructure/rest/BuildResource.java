package com.shopdirect.maximoautomation.infrastructure.infrastructure.rest;

import com.rethinkdb.net.Connection;
import com.rethinkdb.net.Cursor;
import com.shopdirect.maximoautomation.infrastructure.DBInitializer;
import com.shopdirect.maximoautomation.infrastructure.RethinkDBConnectionFactory;
import com.shopdirect.maximoautomation.infrastructure.infrastructure.resource.BuildInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static com.rethinkdb.RethinkDB.r;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping(value = "/build")
public class BuildResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuildResource.class);

    private RethinkDBConnectionFactory connectionFactory;

    @Autowired
    public BuildResource(RethinkDBConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    @RequestMapping(method = POST, consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<HashMap> buildStarted(@RequestBody BuildInfo buildInfo) {
        Connection connection = connectionFactory.connectToMaximoDb();
        HashMap result = r.table(DBInitializer.BUILDS_TB).insert(buildInfo).run(connection);
        connection.close();
        return ResponseEntity.ok(result);
    }

    @RequestMapping(path = "/{buildId}", method = PUT)
    public ResponseEntity<HashMap> buildFinished(@PathVariable Long buildId, @RequestBody BuildInfo buildInfo) {
        Connection connection = connectionFactory.connectToMaximoDb();
        HashMap result = r.table(DBInitializer.BUILDS_TB).get(buildId).update(buildInfo).run(connection);
        connection.close();
        return ResponseEntity.ok(result);
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
