package com.shopdirect.maximoautomation.infrastructure.dao;

import com.shopdirect.maximoautomation.infrastructure.RethinkDBConnectionFactory;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildInfo;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.HashMap;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class BuildInfoDaoTest {
    private BuildInfoDao instance;
    @MockBean
    private RethinkDBConnectionFactory rethinkDBConnectionFactory;
    @MockBean
    private RethinkDBRunner rethinkDBRunner;
    private HashMap<String, Object> resultMap;

    @Before
    public void setUp() throws Exception {
        instance = new BuildInfoDao(rethinkDBRunner);
        this.resultMap = createResultMap();
    }

    @Test
    public void shouldSaveABuildInfoObject() throws Exception {
        // Given
        resultMap.put("generated_keys", Collections.singletonList("123"));
        when(rethinkDBRunner.create(any(), any())).thenReturn(resultMap);

        // When
        String actualId = instance.save(BuildInfo.builder().setId(null).setBuildId("id").setUrl("url").setTime(ZonedDateTime.now()).createBuildInfo());

        // Then
        verify(rethinkDBRunner).create(any(), any());
        Assertions.assertThat(actualId).isEqualTo("123");
    }

    @Test
    public void shouldUpdateAnExistingBuildInfoObject() throws Exception {
        // Given
        when(rethinkDBRunner.update(any(), any(), any())).thenReturn(resultMap);

        // When
        instance.update(BuildInfo.builder().setId(null).setBuildId("id").setUrl("url").setTime(ZonedDateTime.now()).createBuildInfo());

        // Then
        verify(rethinkDBRunner).update(any(), any(), any());
    }

    private static HashMap<String,Object> createResultMap() {
        HashMap<String,Object>  resultMap = new HashMap<>();
        resultMap.put("deleted", 0);
        resultMap.put("errors", 0);
        resultMap.put("inserted", 0);
        resultMap.put("replaced", 0);
        resultMap.put("skipped", 0);
        resultMap.put("unchanged", 0);
        return resultMap;
    }
}