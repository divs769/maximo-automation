package com.shopdirect.maximoautomation.infrastructure.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.shopdirect.maximoautomation.infrastructure.DBInitializer;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import static com.shopdirect.maximoautomation.infrastructure.DBInitializer.BUILDS_TB;

@Repository
public class BuildInfoDao {

    private final RethinkDBRunner rethinkDBRunner;
    private final ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule())
            .setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));

    @Autowired
    public BuildInfoDao(RethinkDBRunner rethinkDBRunner) {
        this.rethinkDBRunner = rethinkDBRunner;
    }

    public String save(BuildInfo buildInfo) throws Exception {
        Map map = objectMapper.convertValue(buildInfo, Map.class);
        map.remove("id");
        Map<String,Object> result = rethinkDBRunner.create(BUILDS_TB, map);
        return getGeneratedKey(result);
    }

    public void update(BuildInfo buildInfo) throws Exception {
        String id = buildInfo.getId();
        Map<String, Object> record = getRecordAsMap(id);
        record.remove("id");
        record.put("finishTime", buildInfo.getFinishTime());
        rethinkDBRunner.update(BUILDS_TB, id, record);
    }

    public BuildInfo getRecord(String id) {
        return objectMapper.convertValue(getRecordAsMap(id), BuildInfo.class);
    }

    private Map<String, Object> getRecordAsMap(String id) {
        return rethinkDBRunner.get(DBInitializer.BUILDS_TB, id);
    }

    private static String getGeneratedKey(Map<String, Object> result) {
        if (result.containsKey("generated_keys")) {
            return ((List<String>)result.get("generated_keys")).get(0);
        }
        return null;
    }
}
