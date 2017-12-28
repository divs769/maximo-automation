package com.shopdirect.model;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Component
public class StartBuildRequest {
    private String buildId;
    private String url;
    private LocalDateTime startTime;

    public StartBuildRequest() {
    }

    public StartBuildRequest(String buildId, String url, LocalDateTime startTime) {
        this.buildId = buildId;
        this.url = url;
        this.startTime = startTime;
    }

    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
}
