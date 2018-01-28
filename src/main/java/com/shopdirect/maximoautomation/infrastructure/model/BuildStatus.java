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

    public static BuildStatus getFromCode(String code) {
        for (BuildStatus buildStatus: values()) {
            if (buildStatus.code.equals(code)) {
                return buildStatus;
            }
        }
        return null;
    }
}
