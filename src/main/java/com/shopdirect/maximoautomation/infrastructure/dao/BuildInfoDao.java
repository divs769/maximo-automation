package com.shopdirect.maximoautomation.infrastructure.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.shopdirect.maximoautomation.infrastructure.DBInitializer.BUILDS_TB;

@Repository
public class BuildInfoDao {
    private final RethinkDBRunner rethinkDBRunner;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    public BuildInfoDao(RethinkDBRunner rethinkDBRunner) {
        this.rethinkDBRunner = rethinkDBRunner;
    }

    public String save(BuildInfo buildInfo) throws Exception {
        Map map = objectMapper.convertValue(buildInfo, Map.class);
        map.remove("id");
        HashMap<String,Object> result = rethinkDBRunner.create(BUILDS_TB, map);
        return getGeneratedKey(result);
    }

    public void update(BuildInfo buildInfo) throws Exception {
        String id = buildInfo.getId();
        Map map = objectMapper.convertValue(buildInfo, Map.class);
        map.remove("id");
        HashMap<String,Object> result = rethinkDBRunner.update(BUILDS_TB, id, map);
    }

    private static String getGeneratedKey(HashMap<String, Object> result) {
        if (result.containsKey("generated_keys")) {
            return ((List<String>)result.get("generated_keys")).get(0);
        }
        return null;
    }
}
