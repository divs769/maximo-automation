package com.shopdirect.maximoautomation.infrastructure.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shopdirect.maximoautomation.infrastructure.dao.BuildInfoDao;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.HashMap;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@WebMvcTest(BuildResource.class)
public class BuildResourceTest {
    private static final String URI_PATH = "/buildinfo";
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private BuildInfoDao buildInfoDao;
    private ObjectMapper objectMapper;

    @Before
    public void setUp() throws Exception {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void buildStartedShouldInsertBuildInfoObjectInTheDatabaseAndReturnSuccess() throws Exception {
        // Given
        when(buildInfoDao.save(any())).thenReturn("id");
        BuildInfo payload = createStartedBuildInfo();

        // When
        mockMvc.perform(post(URI_PATH)
                .contentType(APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(payload)))
                .andExpect(status().is2xxSuccessful());

        // Then
        verify(buildInfoDao).save(any());
    }

    @Test
    public void buildFinishedShouldUpdateBuildInfoObjectInTheDatabaseAndReturnSuccess() throws Exception {
        // Given
        BuildInfo payload = createFinishedBuildInfo();
        when(buildInfoDao.getRecord(any())).thenReturn(objectMapper.convertValue(payload, HashMap.class));

        // When
        mockMvc.perform(put(URI_PATH)
                .contentType(APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(payload)))
                .andExpect(status().is2xxSuccessful());

        // Then
        verify(buildInfoDao).update(any());
    }

    private BuildInfo createStartedBuildInfo() {
        return new BuildInfo(null, "123", "http://jenkins/jobs/project/123", "2012-04-23T18:25:43.511Z");
    }

    private BuildInfo createFinishedBuildInfo() {
        return new BuildInfo("1", "2012-04-23T19:25:43.511Z");
    }
}