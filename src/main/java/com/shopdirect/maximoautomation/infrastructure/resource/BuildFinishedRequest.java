package com.shopdirect.maximoautomation.infrastructure.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

import static java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;

public class BuildFinishedRequest {

    private final String id;
    private final String time;
    private final BuildStatus status;

    @JsonCreator
    public BuildFinishedRequest(@JsonProperty("id") String id,
                                @JsonProperty("time") String time,
                                @JsonProperty("status") BuildStatus status) {
        this.id = id;
        this.time = time;
        this.status = status;
    }

    public BuildInfo createBuildInfo() {
        return BuildInfo.builder()
                .setId(id)
                .setFinishTime(time == null ? null : OffsetDateTime.parse(time, ISO_OFFSET_DATE_TIME))
                .setStatus(status)
                .createBuildInfo();
    }

    public String getId() {
        return id;
    }

    public String getTime() {
        return time;
    }

    public BuildStatus getStatus() {
        return status;
    }
}
