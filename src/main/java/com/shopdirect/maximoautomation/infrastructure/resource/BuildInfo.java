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
    private final String vcHash;
    private final String vcTag;
    private final String vcBranch;
    private final String vcDescription;
    private final BuildStatus status;

    @JsonCreator
    public BuildInfo(@JsonProperty("id") String id,
                     @JsonProperty("buildId") String buildId,
                     @JsonProperty("url") String url,
                     @JsonProperty("startTime") OffsetDateTime startTime,
                     @JsonProperty("finishTime") OffsetDateTime finishTime,
                     @JsonProperty("vcHash") String vcHash,
                     @JsonProperty("vcTag") String vcTag,
                     @JsonProperty("vcBranch") String vcBranch,
                     @JsonProperty("vcDescription") String vcDescription,
                     @JsonProperty("status") BuildStatus status) {
        this.id = id;
        this.buildId = buildId;
        this.url = url;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.vcHash = vcHash;
        this.vcTag = vcTag;
        this.vcBranch = vcBranch;
        this.vcDescription = vcDescription;
        this.status = status;
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

    public String getVcHash() {
        return vcHash;
    }

    public String getVcTag() {
        return vcTag;
    }

    public String getVcBranch() {
        return vcBranch;
    }

    public String getVcDescription() {
        return vcDescription;
    }

    public BuildStatus getStatus() {
        return status;
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
        private String vcHash;
        private String vcTag;
        private String vcBranch;
        private String vcDescription;
        private BuildStatus status;

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

        public BuildInfoBuilder setVcHash(String vcHash) {
            this.vcHash = vcHash;
            return this;
        }

        public BuildInfoBuilder setVcTag(String vcTag) {
            this.vcTag = vcTag;
            return this;
        }

        public BuildInfoBuilder setVcBranch(String vcBranch) {
            this.vcBranch = vcBranch;
            return this;
        }

        public BuildInfoBuilder setVcDescription(String vcDescription) {
            this.vcDescription = vcDescription;
            return this;
        }

        public BuildInfoBuilder setStatus(BuildStatus status) {
            this.status = status;
            return this;
        }


        public BuildInfo createBuildInfo() {
            return new BuildInfo(id, buildId, url, startTime, finishTime,
                    vcHash, vcTag, vcBranch, vcDescription, status);
        }
    }
}
