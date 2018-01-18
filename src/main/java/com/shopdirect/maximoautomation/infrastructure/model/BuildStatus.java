package com.shopdirect.maximoautomation.infrastructure.model;

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
