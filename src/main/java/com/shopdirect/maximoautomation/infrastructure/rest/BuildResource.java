package com.shopdirect.maximoautomation.infrastructure.rest;

import com.shopdirect.maximoautomation.infrastructure.dao.BuildInfoDao;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@RequestMapping(value = "/buildinfo")
public class BuildResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuildResource.class);

    private final BuildInfoDao buildInfoDao;

    @Autowired
    public BuildResource(BuildInfoDao buildInfoDao) {
        this.buildInfoDao = buildInfoDao;
    }

    @RequestMapping(method = POST, consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> buildStarted(@RequestBody BuildInfo buildInfo) throws Exception {
        return ResponseEntity.ok(buildInfoDao.save(buildInfo));
    }

    @RequestMapping(path = "/{buildId}", method = PUT)
    public ResponseEntity<Void> buildFinished(
            @PathVariable String buildId,
            @RequestBody BuildInfo buildInfo) throws Exception {
        buildInfo.setId(buildId);
        buildInfoDao.update(buildInfo);
        return ResponseEntity.ok().build();
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
