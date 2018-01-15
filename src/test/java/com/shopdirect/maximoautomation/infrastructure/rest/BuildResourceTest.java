package com.shopdirect.maximoautomation.infrastructure.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shopdirect.maximoautomation.infrastructure.dao.BuildInfoDao;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildFinishedRequest;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildInfo;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildStartedRequest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.time.OffsetDateTime;
import java.util.Optional;

import static java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
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
        BuildStartedRequest payload = createStartedBuildInfo();

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
        BuildInfo mockResult = new BuildInfo(null, null, null, OffsetDateTime.parse("2012-04-23T18:25:43.511Z", ISO_OFFSET_DATE_TIME), null);
        when(buildInfoDao.getRecord("1")).thenReturn(mockResult);
        // Given
        BuildFinishedRequest payload = createFinishedBuildInfo();

        // When
        mockMvc.perform(put(URI_PATH)
                .contentType(APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(payload)))
                .andExpect(status().is2xxSuccessful());

        // Then
        verify(buildInfoDao).update(any());
    }

    @Test
    public void getAllBuildsShouldReturnListOfBuildInfoObjectsAndReturnSuccess() throws Exception {

        // When
        mockMvc.perform(get(URI_PATH)
                .param("startIndex", "0")
                .param("limit", "10"))
                .andExpect(status().is2xxSuccessful());

        // Then
        verify(buildInfoDao).getAllRecords(Optional.of(0L), Optional.of(10L));
    }

    private BuildStartedRequest createStartedBuildInfo() {
        return new BuildStartedRequest("123","http://jenkins/job/project/123/",  "2012-04-23T18:25:43.511Z");
    }

    private BuildFinishedRequest createFinishedBuildInfo() {
        return new BuildFinishedRequest("1", "2012-04-23T18:25:44.511Z");
    }
}