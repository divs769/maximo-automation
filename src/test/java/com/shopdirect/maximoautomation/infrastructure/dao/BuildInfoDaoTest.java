package com.shopdirect.maximoautomation.infrastructure.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rethinkdb.net.Cursor;
import com.shopdirect.maximoautomation.infrastructure.model.BuildInfo;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.OffsetDateTime;
import java.util.*;

import static com.shopdirect.maximoautomation.infrastructure.config.DBInitializer.BUILDS_TB;
import static com.shopdirect.maximoautomation.infrastructure.model.BuildStatus.SUCCESS;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
public class BuildInfoDaoTest {

    private BuildInfoDao instance;

    @MockBean
    private RethinkDBRunner rethinkDBRunner;

    @Before
    public void setUp() throws Exception {
        instance = new BuildInfoDao(rethinkDBRunner, new ObjectMapper());
    }

    @Test
    public void shouldSaveABuildInfoObject() throws Exception {
        // Given
        HashMap<String, Object> resultMap = createResultMap();
        resultMap.put("generated_keys", Collections.singletonList("123"));
        when(rethinkDBRunner.create(anyString(), any())).thenReturn(resultMap);

        // When
        String actualId = instance.save(BuildInfo.builder().createBuildInfo());

        // Then
        verify(rethinkDBRunner).create(anyString(), any());
        Assertions.assertThat(actualId).isEqualTo("123");
    }

    @Test
    public void shouldUpdateAnExistingBuildInfoObject() throws Exception {
        // Given
        ArgumentCaptor<Map> captor = ArgumentCaptor.forClass(Map.class);
        OffsetDateTime time = OffsetDateTime.now();
        when(rethinkDBRunner.get(anyString(), eq("1"))).thenReturn(new HashMap<>());

        // When
        instance.update(BuildInfo.builder().setId("1").setFinishTime(time).setStatus(SUCCESS).createBuildInfo());

        // Then
        verify(rethinkDBRunner).update(any(), any(), captor.capture());
        assertThat(captor.getValue().get("finishTime"), equalTo(time));
        assertThat(captor.getValue().get("status"), equalTo(SUCCESS.getCode()));
    }

    @Test
    public void shouldGetAllRecordsWithNoParameters() throws Exception {
        List<Map<String, Object>> builds = createBuildList();
        when(rethinkDBRunner.countRecords()).thenReturn(Long.valueOf(builds.size()));
        when(rethinkDBRunner.getAll(anyString(), anyLong(), anyLong())).thenReturn(builds);

        List<BuildInfo> result = instance.getAllRecords(Optional.empty(), Optional.empty());

        assertThat(result.get(0).getId(), equalTo(builds.get(0).get("id")));
        assertThat(result.get(1).getId(), equalTo(builds.get(1).get("id")));
        assertThat(result.get(2).getId(), equalTo(builds.get(2).get("id")));
        assertThat(result.get(3).getId(), equalTo(builds.get(3).get("id")));
        assertThat(result.get(4).getId(), equalTo(builds.get(4).get("id")));
    }

    @Test
    public void shouldGetRecordFromBuildId() throws Exception {
        Cursor cursor = mock(Cursor.class);
        when(cursor.hasNext()).thenReturn(true);
        when(cursor.next()).thenReturn(createBuild(1));
        when(rethinkDBRunner.getFromBuildId(BUILDS_TB, "build1")).thenReturn(cursor);

        BuildInfo result = instance.getRecordFromBuildId("build1");

        assertThat(result.getId(), equalTo("1"));
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

    private static List<Map<String, Object>> createBuildList() {
        List<Map<String, Object>> builds = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            builds.add(createBuild(i));
        }
        return builds;
    }

    private static Map<String, Object> createBuild(int id) {
        Map<String, Object> buildInfo = new HashMap<>();
        buildInfo.put("id", String.valueOf(id));
        return buildInfo;
    }
}