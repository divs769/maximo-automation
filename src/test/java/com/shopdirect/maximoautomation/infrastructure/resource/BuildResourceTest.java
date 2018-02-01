package com.shopdirect.maximoautomation.infrastructure.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shopdirect.maximoautomation.infrastructure.maximo.client.MaximoClient;
import com.shopdirect.maximoautomation.infrastructure.model.BuildInfo;
import com.shopdirect.maximoautomation.infrastructure.model.dto.BuildFinishedRequest;
import com.shopdirect.maximoautomation.infrastructure.model.dto.BuildStartedRequest;
import com.shopdirect.maximoautomation.infrastructure.repository.DynamoDBRepository;
import com.shopdirect.maximoautomation.infrastructure.service.ValidationService;
import gherkin.deps.com.google.gson.Gson;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.shopdirect.maximoautomation.infrastructure.model.BuildStatus.SUCCESS;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.*;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@WebMvcTest(BuildResource.class)
public class BuildResourceTest {

    private static final String URI_PATH = "/buildinfo";

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DynamoDBRepository dao;

    @MockBean
    private ValidationService validationService;

    @MockBean
    private MaximoClient client;

    private ObjectMapper objectMapper;

    @Before
    public void setUp() throws Exception {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void buildStartedShouldInsertBuildInfoObjectInTheDatabaseAndReturnSuccess() throws Exception {
        // Given
        when(validationService.validateBuildStarted(isA(BuildInfo.class))).thenReturn(Lists.emptyList());
        BuildInfo buildInfo = Mockito.mock(BuildInfo.class);
        UUID id = UUID.randomUUID();
        when(buildInfo.getId()).thenReturn(id);
        when(dao.save(isA(BuildInfo.class))).thenReturn(buildInfo);
        BuildStartedRequest payload = createStartedBuildInfo();

        // When
        MvcResult result = mockMvc.perform(post(URI_PATH)
                .contentType(APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(payload)))
                .andExpect(status().is2xxSuccessful())
                .andReturn();

        // Then
        verify(dao).save(any(BuildInfo.class));
        assertThat(result.getResponse().getContentAsString(), equalTo(id.toString()));
    }

    @Test
    public void buildStartedShouldReturnFailureWithInvalidPayload() throws Exception {
        // Given
        when(validationService.validateBuildStarted(isA(BuildInfo.class))).thenReturn(Lists.newArrayList("An error"));
        BuildStartedRequest payload = createStartedBuildInfo();

        // When
        mockMvc.perform(post(URI_PATH)
                .contentType(APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(payload)))
                .andExpect(status().is4xxClientError())
                .andReturn();

        // Then
        verify(dao, never()).save(any(BuildInfo.class));
    }

    @Test
    public void buildFinishedShouldUpdateBuildInfoObjectInTheDatabaseAndReturnSuccess() throws Exception {
        // Given
        when(validationService.checkInvalidTime(isA(OffsetDateTime.class))).thenReturn(Lists.emptyList());
        when(validationService.updateValidations(isA(BuildInfo.class))).thenReturn(Lists.emptyList());
        when(dao.findOne(isA(UUID.class))).thenReturn(Mockito.mock(BuildInfo.class));
        BuildFinishedRequest payload = createFinishedBuildInfo();

        // When
        mockMvc.perform(put(URI_PATH)
                .contentType(APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(payload)))
                .andExpect(status().is2xxSuccessful());

        // Then
        verify(dao).save(any(BuildInfo.class));
    }

    @Test
    public void buildFinishedShouldReturnFailureWithInvalidPayload() throws Exception {
        // Given
        when(validationService.checkInvalidTime(isA(OffsetDateTime.class))).thenReturn(Lists.newArrayList());
        when(validationService.updateValidations(isA(BuildInfo.class)))
                .thenReturn(Lists.newArrayList("An error"));
        BuildFinishedRequest payload = createFinishedBuildInfo();

        // When
        mockMvc.perform(put(URI_PATH)
                .contentType(APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(payload)))
                .andExpect(status().is4xxClientError());

        // Then
        verify(dao, never()).save(any(BuildInfo.class));
    }

    @Test
    public void getAllBuildsShouldReturnListOfBuildInfoObjectsAndReturnSuccess() throws Exception {
        // Given
        when(dao.findAll(any(PageRequest.class))).thenReturn(new PageImpl<>(createListOfBuilds()));

        // When
        MvcResult result = mockMvc.perform(get(URI_PATH)
                .param("startIndex", "0")
                .param("limit", "10"))
                .andExpect(status().is2xxSuccessful())
                .andReturn();

        // Then
        verify(dao).findAll(any(Pageable.class));
        BuildInfo[] builds = new Gson().fromJson(result.getResponse().getContentAsString(), BuildInfo[].class);
        assertThat(builds.length, equalTo(10));
    }

    @Test
    public void getAllBuildsShouldReturnEmptyListOfBuildInfoObjectsAndReturnSuccessWhenNoBuildsExist() throws Exception {
        // Given
        when(dao.findAll(any(PageRequest.class))).thenReturn(new PageImpl<>(new ArrayList<>()));
        when(dao.count()).thenReturn(1L);

        // When
        MvcResult result = mockMvc.perform(get(URI_PATH))
                .andExpect(status().is2xxSuccessful())
                .andReturn();

        // Then
        verify(dao).findAll(any(Pageable.class));
        BuildInfo[] builds = new Gson().fromJson(result.getResponse().getContentAsString(), BuildInfo[].class);
        assertThat(builds.length, equalTo(0));
    }

    @Test
    public void getBuildShouldReturnCorrectBuild() throws Exception {
        // Given
        String buildId = "build123";
        BuildInfo expectedBuildInfo = BuildInfo.builder()
                .setId(UUID.randomUUID().toString()).createBuildInfo();
        when(dao.findByBuildId(any(String.class))).thenReturn(expectedBuildInfo);
        // When
        MvcResult result = mockMvc.perform(get(URI_PATH + "/{buildId}", buildId ))
                .andExpect(status().is2xxSuccessful())
                .andReturn();

        // Then
        verify(dao).findByBuildId(eq(buildId));
        BuildInfo actualBuildInfo = new Gson().fromJson(result.getResponse().getContentAsString(), BuildInfo.class);
        assertThat(expectedBuildInfo, equalTo(actualBuildInfo));
    }

    @Test
    public void getBuildShouldReturnFailureWhenBuildNotFound() throws Exception {
        // When
        mockMvc.perform(get(URI_PATH + "/build1"))
                .andExpect(status().is4xxClientError());
    }


    private static BuildStartedRequest createStartedBuildInfo() {
        return new BuildStartedRequest("build1","http://jenkins/job/project/123/",
                "2012-04-23T18:25:43.511Z", "665169b62d95c73d0de89337fa7ea6622c1a08c2",
                "1.2", "branch", "A description");
    }

    private static BuildFinishedRequest createFinishedBuildInfo() {
        return new BuildFinishedRequest(UUID.randomUUID().toString(), "2012-04-23T18:25:44.511Z", SUCCESS);
    }


    private static List<BuildInfo> createListOfBuilds() {
        List<BuildInfo> builds = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            builds.add(BuildInfo.builder().createBuildInfo());
        }
        return builds;
    }

}