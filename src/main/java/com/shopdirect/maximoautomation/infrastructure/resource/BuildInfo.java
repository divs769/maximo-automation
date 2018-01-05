package com.shopdirect.maximoautomation.infrastructure.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class BuildInfo {

    private String id;
    private String buildId;
    private String url;
    private String time;

    public BuildInfo(String id, String time) {
        this.id = id;
        this.time = time;
    }

    public BuildInfo(String buildId, String url, String time) {
        this.buildId = buildId;
        this.url = url;
        this.time = time;
    }

    @JsonCreator
    public BuildInfo(@JsonProperty("id") String id, @JsonProperty("buildId") String buildId, @JsonProperty("url") String url,
                     @JsonProperty("time") String time) {
        this.id = id;
        this.buildId = buildId;
        this.url = url;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
