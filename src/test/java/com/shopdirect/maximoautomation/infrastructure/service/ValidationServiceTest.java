package com.shopdirect.maximoautomation.infrastructure.service;

import com.shopdirect.maximoautomation.infrastructure.model.BuildInfo;
import com.shopdirect.maximoautomation.infrastructure.repository.DynamoDBRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import static com.shopdirect.maximoautomation.infrastructure.model.BuildStatus.SUCCESS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class ValidationServiceTest {
    @MockBean
    private DynamoDBRepository dao;
    private ValidationService instance;

    @Before
    public void setUp() throws Exception {
        instance = new ValidationService(dao);
    }

    @Test
    public void shouldValidBuildStartedInfoAndReturnAnEmptyListWithouErrors() {
        // Given
        BuildInfo buildInfo = createValidBuildInfo();

        // When
        List<String> errors = instance.validateBuildStarted(buildInfo);

        // Then
        assertThat(errors).isEmpty();
    }

    @Test
    public void shouldReturnErrorsWhenBuildStartedInfoDoesNotContainAnyData() {
        // Given
        BuildInfo buildInfo = mock(BuildInfo.class);

        // When
        List<String> errors = instance.validateBuildStarted(buildInfo);

        // Then
        assertThat(errors).isNotEmpty();
        assertThat(errors).containsExactly(
                "Missing time",
                "Missing build ID",
                "Missing URL",
                "Missing tag",
                "Missing description");
    }

    @Test
    public void shouldReturnErrorsForInvalidUrlAndInvalidTimeForBuildStartedValidation() {
        // Given
        BuildInfo buildInfo = mock(BuildInfo.class);
        OffsetDateTime invalidDateTime = OffsetDateTime.now().plusHours(2);
        when(buildInfo.getStartTime()).thenReturn(invalidDateTime);
        when(buildInfo.getUrl()).thenReturn("http://invalid");
        when(buildInfo.getBuildId()).thenReturn("123");
        when(buildInfo.getVcTag()).thenReturn("tag");
        when(buildInfo.getVcDescription()).thenReturn("description");

        // When
        List<String> errors = instance.validateBuildStarted(buildInfo);

        // Then
        assertThat(errors).isNotEmpty();
        assertThat(errors).containsExactly(
                "Invalid time",
                "Invalid URL");
    }

    @Test
    public void shouldValidateAndReturnNoErrorsForAValidUpdateValidations() {
        // Given
        BuildInfo buildInfo = mock(BuildInfo.class);
        when(buildInfo.getId()).thenReturn(UUID.fromString("id"));
        when(buildInfo.getStatus()).thenReturn(SUCCESS);
        OffsetDateTime startDateTime = OffsetDateTime.now().minusHours(2);
        when(buildInfo.getStartTime()).thenReturn(startDateTime);
        when(buildInfo.getFinishTime()).thenReturn(startDateTime.plusHours(1));

        when(dao.findOne(any(UUID.class))).thenReturn(buildInfo);

        // When
        List<String> errors = instance.updateValidations(buildInfo);

        // Then
        assertThat(errors).isEmpty();
    }

    @Test
    public void shouldReturnErrorWhenRecordDoesNotExistInDatabaseForUpdateValidation() {
        // Given
        BuildInfo buildInfo = mock(BuildInfo.class);
        when(buildInfo.getId()).thenReturn(UUID.fromString("id"));
        when(buildInfo.getStatus()).thenReturn(SUCCESS);
        when(buildInfo.getFinishTime()).thenReturn(OffsetDateTime.now().minusHours(1));

        // When
        List<String> errors = instance.updateValidations(buildInfo);

        // Then
        assertThat(errors).containsExactly("Record doesn't exist in the database");
    }

    @Test
    public void shouldReturnErrorWhenFinishDateIsBeforeStartDateWhenUpdatingValidation() {
        // Given
        BuildInfo buildInfo = mock(BuildInfo.class);
        when(buildInfo.getId()).thenReturn(UUID.fromString("id"));
        when(buildInfo.getStatus()).thenReturn(SUCCESS);
        OffsetDateTime startDateTime = OffsetDateTime.now().minusHours(2);
        when(buildInfo.getStartTime()).thenReturn(startDateTime);
        when(buildInfo.getFinishTime()).thenReturn(startDateTime.minusHours(1));

        when(dao.findOne(any(UUID.class))).thenReturn(buildInfo);

        // When
        List<String> errors = instance.updateValidations(buildInfo);

        // Then
        assertThat(errors).containsExactly("Finish date should be after start date");
    }

    private BuildInfo createValidBuildInfo() {
        return new BuildInfo(
                UUID.fromString("11111"),
                    "123",
                    "https://host:8080/job/project/123/",
                    OffsetDateTime.now(),
                    OffsetDateTime.now().plusMinutes(2),
                    "hash",
                    "tag",
                    "branch",
                    "description",
                    SUCCESS
            );
    }
}