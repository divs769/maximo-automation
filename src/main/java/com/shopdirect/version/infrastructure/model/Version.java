package com.shopdirect.version.infrastructure.model;

import java.util.Map;

public class Version {

    private final Map<String, String> version;

    public Version(Map version) {
        this.version = version;
    }

    public Map getVersion() {
        return version;
    }

}