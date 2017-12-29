package com.shopdirect.model;

import gherkin.deps.com.google.gson.annotations.SerializedName;

public class DBResponse {

    private Long deleted;
    private Long inserted;
    private Long unchanged;
    private Long replaced;
    @SerializedName("generated_keys")
    private String[] generatedKeys;
    private Long errors;
    private Long skipped;

    public DBResponse(Long deleted, Long inserted, Long unchanged, Long replaced,
                      String[] generatedKeys, Long errors, Long skipped) {
        this.deleted = deleted;
        this.inserted = inserted;
        this.unchanged = unchanged;
        this.replaced = replaced;
        this.generatedKeys = generatedKeys;
        this.errors = errors;
        this.skipped = skipped;
    }

    public Long getDeleted() {
        return deleted;
    }

    public Long getInserted() {
        return inserted;
    }

    public Long getUnchanged() {
        return unchanged;
    }

    public Long getReplaced() {
        return replaced;
    }

    public String[] getGeneratedKeys() {
        return generatedKeys;
    }

    public Long getErrors() {
        return errors;
    }

    public Long getSkipped() {
        return skipped;
    }

}
