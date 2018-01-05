package com.shopdirect.maximoautomation.infrastructure.resource;

import java.time.ZonedDateTime;

public class BuildInfo {

    private String id;
    private String buildId;
    private String url;
    private ZonedDateTime time;

    public BuildInfo(String id, String buildId, String url, ZonedDateTime time) {
        this.id = id;
        this.buildId = buildId;
        this.url = url;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBuildId() {
        return buildId;
    }

    public String getUrl() {
        return url;
    }

    public ZonedDateTime getTime() {
        return time;
    }

    public static BuildInfoBuilder builder() {
        return new BuildInfoBuilder();
    }

    public static class BuildInfoBuilder {
        private String id;
        private String buildId;
        private String url;
        private ZonedDateTime time;

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

        public BuildInfoBuilder setTime(ZonedDateTime time) {
            this.time = time;
            return this;
        }

        public BuildInfo createBuildInfo() {
            return new BuildInfo(id, buildId, url, time);
        }
    }
}
