package com.shopdirect.maximoautomation.infrastructure.infrastructure.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@RequestMapping(path = "/build")
public class BuildResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(BuildResource.class);

    @RequestMapping(method = POST)
    public ResponseEntity<Long> buildStarted() {
        return ResponseEntity.ok(BuildData.createBuildInfo());
    }

    //env.BUILD_ID
    @RequestMapping(value = "/{buildId}", method = PUT)
    public ResponseEntity<String> buildFinished(@PathVariable("buildId") Long buildId) {
        BuildInfo buildInfo = BuildData.getBuildInfo(buildId);
        buildInfo.finished = new Date();
        return ResponseEntity.ok("Maximo change request closed");
    }

    @RequestMapping(method = GET, produces = "application/json; charset=UTF-8")
    public ResponseEntity<Collection<BuildInfo>> getAllBuilds() {
        return ResponseEntity.ok(BuildData.getAll());
    }

    @RequestMapping(value="/{buildId}", method = GET, produces = "application/json; charset=UTF-8")
    public ResponseEntity<BuildInfo> getBuildInfo(@PathVariable("buildId") Long buildId) {
        return ResponseEntity.ok(BuildData.getBuildInfo(buildId));
    }

    private static class BuildData {
        static Map<Long, BuildInfo> map = new HashMap<>();
        static Long lastId = 0L;

        static Long createBuildInfo() {
            BuildInfo info = new BuildInfo();
            info.id = ++lastId;
            info.started = new Date();

            map.put(info.id, info);

            return lastId;
        }

        static BuildInfo getBuildInfo(Long id) {
            return map.get(id);
        }

        static Collection<BuildInfo> getAll() {
            return map.values();
        }
    }

    private static class BuildInfo {
        Long id;
        Date started;
        Date finished;

        @Override
        public String toString() {
            return "BuildInfo{" +
                    "id=" + id +
                    ", started=" + started +
                    ", finished=" + finished +
                    '}';
        }
    }
}
