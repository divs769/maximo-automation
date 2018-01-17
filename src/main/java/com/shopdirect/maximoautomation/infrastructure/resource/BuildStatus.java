package com.shopdirect.maximoautomation.infrastructure.resource;

public enum BuildStatus {

    SUCCESS("S"), FAIL("F");

    private final String code;

    BuildStatus(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
