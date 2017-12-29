package com.shopdirect.model;

import org.springframework.stereotype.Component;

//@Component
public class BuildRequest {

    private String buildId;
    private String url;
    private String time;

    public BuildRequest() {
    }

    public BuildRequest(String buildId, String url, String time) {
        this.buildId = buildId;
        this.url = url;
        this.time = time;
    }

    public String getBuildId() {
        return buildId;
    }

    public String getUrl() {
        return url;
    }

    public String getTime() {
        return time;
    }
}
