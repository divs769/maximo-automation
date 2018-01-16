package com.shopdirect.maximoautomation.infrastructure.service;

import com.shopdirect.maximoautomation.infrastructure.dao.BuildInfoDao;
import com.shopdirect.maximoautomation.infrastructure.resource.BuildInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class ValidationService {

    private static final Pattern PATTERN = Pattern.compile("(https?://)?[\\w.]+(:\\d+)?/job/[\\w-]+/\\d+/$");

    private final BuildInfoDao buildInfoDao;

    @Autowired
    public ValidationService(BuildInfoDao buildInfoDao) {
        this.buildInfoDao = buildInfoDao;
    }

    public List<String> validateBuildStarted(BuildInfo buildInfo) {
        List<String> errors = new ArrayList<>();
        if(buildInfo.getBuildId() == null) {
            errors.add("Missing build ID.");
        }
        if(buildInfo.getUrl() == null) {
            errors.add("Missing URL.");
        } else if(!PATTERN.matcher(buildInfo.getUrl()).matches()) {
            errors.add("Invalid URL.");
        }
        errors.addAll(checkInvalidTime(buildInfo.getStartTime()));
        return errors;
    }

    public List<String> checkInvalidTime(OffsetDateTime time) {
        List<String> errors = new ArrayList<>();
        if(time == null) {
            errors.add("Missing time.");
        } else if(time.isAfter(OffsetDateTime.now())) {
            errors.add("Invalid time.");
        }
        return errors;
    }

    public List<String> updateValidations(BuildInfo buildInfo) {
        List<String> errors = new ArrayList<>();
        if(buildInfo.getId() == null) {
            errors.add("Build ID is missing.");
            return errors;
        }
        BuildInfo existingRecord = buildInfoDao.getRecord(buildInfo.getId());
        if(existingRecord == null) {
            errors.add("Record doesn't exist in the database");
        } else if(buildInfo.getFinishTime() != null && buildInfo.getFinishTime().isBefore(existingRecord.getStartTime())) {
            errors.add("Finish date should be after start date");
        }
        return errors;
    }

    public static String generateErrorString(List<String> errors) {
        StringBuilder sb = new StringBuilder();
        for(String error : errors) {
            sb.append(error).append("\n");
        }
        return sb.toString();
    }
}
