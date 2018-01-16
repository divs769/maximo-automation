package com.shopdirect.maximoautomation.infrastructure.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

import static java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;

public class BuildStartedRequest {

    private final String buildId;
    private final String url;
    private final String time;

    @JsonCreator
    public BuildStartedRequest(@JsonProperty("buildId") String buildId,
                               @JsonProperty("url") String url,
                               @JsonProperty("time") String time) {
        this.buildId = buildId;
        this.url = url;
        this.time = time;
    }

    public BuildInfo createBuildInfo() {
        return BuildInfo.builder().setBuildId(buildId)
                .setUrl(url)
                .setStartTime(time == null ? null : OffsetDateTime.parse(time, ISO_OFFSET_DATE_TIME))
                .createBuildInfo();
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
