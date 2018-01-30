package com.shopdirect.maximoautomation.infrastructure.model;

import java.util.stream.Stream;

public enum BuildStatus {

    SUCCESS("S"),
    FAIL("F");

    private final String code;

    BuildStatus(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static BuildStatus fromCode(final String code) {
        return Stream.of(values())
                .filter(buildStatus -> buildStatus.code.equals(code))
                .findFirst()
                .orElse(null);
    }
}
