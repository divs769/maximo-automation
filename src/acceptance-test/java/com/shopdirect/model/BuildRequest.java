package com.shopdirect.model;

public class BuildRequest {

    private String id;
    private String buildId;
    private String url;
    private String time;

    public BuildRequest(String id, String time) {
        this.id = id;
        this.time = time;
    }

    public BuildRequest(String buildId, String url, String time) {
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

    public String getId() {
        return id;
    }
}
