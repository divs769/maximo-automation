package com.shopdirect.maximoautomation.infrastructure.infrastructure.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildInfo {

    private String url;
    private String status;
    private String time;

    @JsonCreator
    public BuildInfo(@JsonProperty("url") String url,
                     @JsonProperty("status") String status, @JsonProperty("time") String time) {
        this.url = url;
        this.status = status;
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public String getStatus() {
        return status;
    }

    public String getTime() {
        return time;
    }
}
