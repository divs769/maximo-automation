package com.shopdirect.maximoautomation.infrastructure.model.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.shopdirect.maximoautomation.infrastructure.model.BuildInfo;
import com.shopdirect.maximoautomation.infrastructure.model.BuildStatus;

import java.time.OffsetDateTime;
import java.util.UUID;

import static java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;

public class BuildFinishedRequest {

    private final UUID id;
    private final String time;
    private final BuildStatus status;
    private final String maximoChangeId;

    @JsonCreator
    public BuildFinishedRequest(@JsonProperty("id") UUID id,
                                @JsonProperty("time") String time,
                                @JsonProperty("status") BuildStatus status,
                                @JsonProperty("maximoChangeId") String maximoChangeId) {
        this.id = id;
        this.time = time;
        this.status = status;
        this.maximoChangeId = maximoChangeId;
    }

    public BuildInfo createBuildInfo() {
        return BuildInfo.builder()
                .setId(id)
                .setFinishTime(time == null ? null : OffsetDateTime.parse(time, ISO_OFFSET_DATE_TIME))
                .setStatus(status)
                .setMaximoChangeId(maximoChangeId)
                .createBuildInfo();
    }

    public UUID getId() {
        return id;
    }

    public String getTime() {
        return time;
    }

    public BuildStatus getStatus() {
        return status;
    }
}
