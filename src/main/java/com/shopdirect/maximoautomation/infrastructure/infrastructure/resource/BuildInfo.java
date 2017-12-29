package com.shopdirect.maximoautomation.infrastructure.infrastructure.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildInfo {

    private String buildId;
    private String url;
    private String time;

    @JsonCreator
    public BuildInfo(@JsonProperty("buildId") String buildId, @JsonProperty("url") String url,
                     @JsonProperty("time") String time) {
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
