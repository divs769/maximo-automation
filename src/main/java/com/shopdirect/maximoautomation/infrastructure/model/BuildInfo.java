package com.shopdirect.maximoautomation.infrastructure.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.shopdirect.maximoautomation.infrastructure.config.BuildStatusConverter;
import com.shopdirect.maximoautomation.infrastructure.model.converter.OffsetDateTimeConverter;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

import static com.shopdirect.maximoautomation.infrastructure.config.DynamoDBConfig.BUILDS_TB;

@DynamoDBTable(tableName = BUILDS_TB)
public class BuildInfo {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private UUID id;
    @DynamoDBAttribute
    private String buildId;
    @DynamoDBAttribute
    private String url;
    @DynamoDBAttribute
    @DynamoDBTypeConverted(converter = OffsetDateTimeConverter.class)
    private OffsetDateTime startTime;
    @DynamoDBAttribute
    @DynamoDBTypeConverted(converter = OffsetDateTimeConverter.class)
    private OffsetDateTime finishTime;
    @DynamoDBAttribute
    private String vcHash;
    @DynamoDBAttribute
    private String vcTag;
    @DynamoDBAttribute
    private String vcBranch;
    @DynamoDBAttribute
    private String vcDescription;
    @DynamoDBAttribute
    @DynamoDBTypeConverted(converter = BuildStatusConverter.class)
    private BuildStatus status;

    public BuildInfo() {
    }

    @JsonCreator
    public BuildInfo(@JsonProperty("id") UUID id,
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public void setFinishTime(OffsetDateTime finishTime) {
        this.finishTime = finishTime;
    }

    public void setVcHash(String vcHash) {
        this.vcHash = vcHash;
    }

    public void setVcTag(String vcTag) {
        this.vcTag = vcTag;
    }

    public void setVcBranch(String vcBranch) {
        this.vcBranch = vcBranch;
    }

    public void setVcDescription(String vcDescription) {
        this.vcDescription = vcDescription;
    }

    public void setStatus(BuildStatus status) {
        this.status = status;
    }

    public static BuildInfoBuilder builder() {
        return new BuildInfoBuilder();
    }

    public static class BuildInfoBuilder {
        private UUID id;
        private String buildId;
        private String url;
        private OffsetDateTime startTime;
        private OffsetDateTime finishTime;
        private String vcHash;
        private String vcTag;
        private String vcBranch;
        private String vcDescription;
        private BuildStatus status;

        public BuildInfoBuilder setId(UUID id) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildInfo buildInfo = (BuildInfo) o;
        return Objects.equals(id, buildInfo.id) &&
                Objects.equals(buildId, buildInfo.buildId) &&
                Objects.equals(url, buildInfo.url) &&
                Objects.equals(startTime, buildInfo.startTime) &&
                Objects.equals(finishTime, buildInfo.finishTime) &&
                Objects.equals(vcHash, buildInfo.vcHash) &&
                Objects.equals(vcTag, buildInfo.vcTag) &&
                Objects.equals(vcBranch, buildInfo.vcBranch) &&
                Objects.equals(vcDescription, buildInfo.vcDescription) &&
                status == buildInfo.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, buildId, url, startTime, finishTime, vcHash, vcTag, vcBranch, vcDescription, status);
    }
}
