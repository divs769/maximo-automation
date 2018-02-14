package com.shopdirect.maximoautomation.infrastructure.service;

import com.shopdirect.maximoautomation.infrastructure.model.BuildInfo;
import com.shopdirect.maximoautomation.infrastructure.repository.DynamoDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Component
public class ValidationService {
    private static final Pattern URL_PATTERN = Pattern.compile("(https?://)?[\\w.]+(:\\d+)?/job/[\\w-]+/\\d+/$");
    private final DynamoDBRepository dao;

    @Autowired
    public ValidationService(DynamoDBRepository dao) {
        this.dao = dao;
    }

    public List<String> validateBuildStarted(BuildInfo buildInfo) {
        List<String> errors = new ArrayList<>(checkInvalidTime(buildInfo.getStartTime()));
        if(buildInfo.getBuildId() == null) {
            errors.add("Missing build ID");
        }
        if(buildInfo.getUrl() == null) {
            errors.add("Missing URL");
        } else if(!URL_PATTERN.matcher(buildInfo.getUrl()).matches()) {
            errors.add("Invalid URL");
        }
        if(buildInfo.getVcTag() == null) {
            errors.add("Missing tag");
        }
        if(buildInfo.getVcDescription() == null) {
            errors.add("Missing description");
        }
        return errors;
    }

    public List<String> updateValidations(BuildInfo buildInfo) {
        List<String> errors = new ArrayList<>(checkInvalidTime(buildInfo.getFinishTime()));
        if(buildInfo.getId() == null) {
            errors.add("Build ID is missing");
            return errors;
        }
        if(buildInfo.getStatus() == null) {
            errors.add("Status is missing");
        }
        BuildInfo existingRecord = dao.findOne(buildInfo.getId());
        if(existingRecord == null) {
            errors.add("Record doesn't exist in the database");
        } else if(buildInfo.getFinishTime() != null && buildInfo.getFinishTime().isBefore(existingRecord.getStartTime())) {
            errors.add("Finish date should be after start date");
        }
        return errors;
    }

    public List<String> checkInvalidTime(OffsetDateTime time) {
        List<String> errors = new ArrayList<>();
        if(time == null) {
            errors.add("Missing time");
        } else if(time.isAfter(OffsetDateTime.now())) {
            errors.add("Invalid time");
        }
        return errors;
    }

    public static String generateErrorString(List<String> errors) {
        return errors.stream().collect(Collectors.joining(","));
    }
}
