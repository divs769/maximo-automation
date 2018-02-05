package com.shopdirect.model;

import java.util.UUID;

public class BuildRequest {

    private UUID id;
    private String buildId;
    private String url;
    private String time;
    private String vcHash;
    private String vcTag;
    private String vcBranch;
    private String vcDescription;
    private String status;
    private String maximoChangeId;

    public BuildRequest(UUID id, String time, String status, String maximoChangeId) {
        this.id = id;
        this.time = time;
        this.status = status;
        this.maximoChangeId = maximoChangeId;
    }

    public BuildRequest(String buildId, String url, String time,
                        String vcHash, String vcTag, String vcBranch, String vcDescription) {
        this.buildId = buildId;
        this.url = url;
        this.time = time;
        this.vcHash = vcHash;
        this.vcTag = vcTag;
        this.vcBranch = vcBranch;
        this.vcDescription = vcDescription;
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

    public UUID getId() {
        return id;
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

    public String getStatus() {
        return status;
    }

    public String getMaximoChangeId() {
        return maximoChangeId;
    }
}
