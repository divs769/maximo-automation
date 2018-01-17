package com.shopdirect.maximoautomation.infrastructure.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rethinkdb.net.Cursor;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

import static com.shopdirect.maximoautomation.infrastructure.DBInitializer.BUILDS_TB;

@Component
public class BuildInfoDao {

    private final RethinkDBRunner rethinkDBRunner;
    private final ObjectMapper objectMapper;

    @Autowired
    public BuildInfoDao(RethinkDBRunner rethinkDBRunner, ObjectMapper objectMapper) {
        this.rethinkDBRunner = rethinkDBRunner;
        this.objectMapper = objectMapper;
    }

    public String save(BuildInfo buildInfo) {
        Map map = objectMapper.convertValue(buildInfo, Map.class);
        map.remove("id");
        /*TODO: objectmapper removes trailing 0s in the milliseconds, startTime is replaced to preserve them.*/
        map.put("startTime", buildInfo.getStartTime());
        Map<String,Object> result = rethinkDBRunner.create(BUILDS_TB, map);
        return getGeneratedKey(result);
    }

    public void update(BuildInfo buildInfo) {
        String id = buildInfo.getId();
        Map<String, Object> record = getRecordAsMap(id);
        record.remove("id");
        record.put("finishTime", buildInfo.getFinishTime());
        record.put("status", buildInfo.getStatus().getCode());
        rethinkDBRunner.update(BUILDS_TB, id, record);
    }

    public BuildInfo getRecord(String id) {
        return objectMapper.convertValue(getRecordAsMap(id), BuildInfo.class);
    }

    private Map<String, Object> getRecordAsMap(String id) {
        return rethinkDBRunner.get(BUILDS_TB, id);
    }

    public BuildInfo getRecordFromBuildId(String buildId) {
        Cursor cursor = rethinkDBRunner.getFromBuildId(BUILDS_TB, buildId);
        if(cursor.hasNext()) {
            return objectMapper.convertValue(cursor.next(), BuildInfo.class);
        }
        return null;
    }

    public List<BuildInfo> getAllRecords(Optional<Long> startIndex, Optional<Long> limit) {
        Long numRecords = rethinkDBRunner.countRecords();
        Long startIndexInt = startIndex.orElse(0L);
        Long limitInt = limit.orElse(numRecords);
        return convertRecords(rethinkDBRunner.getAll(BUILDS_TB, startIndexInt, limitInt));
    }

    private List<BuildInfo> convertRecords(List<Map<String, Object>> records) {
        List<BuildInfo> convertedRecords = new ArrayList<>();
        for(Map<String, Object> record : records) {
            convertedRecords.add(objectMapper.convertValue(record, BuildInfo.class));
        }
        return convertedRecords;
    }

    private static String getGeneratedKey(Map<String, Object> result) {
        if (result.containsKey("generated_keys")) {
            return ((List<String>)result.get("generated_keys")).get(0);
        }
        return null;
    }
}
