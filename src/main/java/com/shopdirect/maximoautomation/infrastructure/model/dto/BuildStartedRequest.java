package com.shopdirect.maximoautomation.infrastructure.model.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.shopdirect.maximoautomation.infrastructure.model.BuildInfo;

import java.time.OffsetDateTime;

import static java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;

public class BuildStartedRequest {

    private final String buildId;
    private final String url;
    private final String time;
    private final String vcHash;
    private final String vcTag;
    private final String vcBranch;
    private final String vcDescription;

    @JsonCreator
    public BuildStartedRequest(@JsonProperty("buildId") String buildId,
                               @JsonProperty("url") String url,
                               @JsonProperty("time") String time,
                               @JsonProperty("vcHash") String vcHash,
                               @JsonProperty("vcTag") String vcTag,
                               @JsonProperty("vcBranch") String vcBranch,
                               @JsonProperty("vcDescription") String vcDescription) {
        this.buildId = buildId;
        this.url = url;
        this.time = time;
        this.vcHash = vcHash;
        this.vcTag = vcTag;
        this.vcBranch = vcBranch;
        this.vcDescription = vcDescription;
    }

    public BuildInfo createBuildInfo() {
        return BuildInfo.builder()
                .setBuildId(buildId)
                .setUrl(url)
                .setStartTime(time == null ? null : OffsetDateTime.parse(time, ISO_OFFSET_DATE_TIME))
                .setVcHash(vcHash)
                .setVcTag(vcTag)
                .setVcBranch(vcBranch)
                .setVcDescription(vcDescription)
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
}
