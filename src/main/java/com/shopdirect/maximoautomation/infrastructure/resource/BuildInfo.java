package com.shopdirect.maximoautomation.infrastructure.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public class BuildInfo {

    private String id;
    private String buildId;
    private String url;
    private OffsetDateTime startTime;
    private OffsetDateTime finishTime;

    @JsonCreator
    public BuildInfo(@JsonProperty("id") String id,
                     @JsonProperty("buildId") String buildId,
                     @JsonProperty("url") String url,
                     @JsonProperty("startTime") OffsetDateTime startTime,
                     @JsonProperty("finishTime") OffsetDateTime finishTime) {
        this.id = id;
        this.buildId = buildId;
        this.url = url;
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    public String getId() {
        return id;
    }

    public String getBuildId() {
        return buildId;
    }

    public String getUrl() {
        return url;
    }

    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public OffsetDateTime getFinishTime() {
        return finishTime;
    }

    public static BuildInfoBuilder builder() {
        return new BuildInfoBuilder();
    }

    public static class BuildInfoBuilder {
        private String id;
        private String buildId;
        private String url;
        private OffsetDateTime startTime;
        private OffsetDateTime finishTime;

        public BuildInfoBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public BuildInfoBuilder setBuildId(String buildId) {
            this.buildId = buildId;
            return this;
        }

        public BuildInfoBuilder setUrl(String url) {
            this.url = url;
            return this;
        }

        public BuildInfoBuilder setStartTime(OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public BuildInfoBuilder setFinishTime(OffsetDateTime finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        public BuildInfo createBuildInfo() {
            return new BuildInfo(id, buildId, url, startTime, finishTime);
        }
    }
}
