package com.shopdirect.maximoautomation.infrastructure.config;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;
import com.shopdirect.maximoautomation.infrastructure.model.BuildStatus;

public class BuildStatusConverter implements DynamoDBTypeConverter<String, BuildStatus> {

    @Override
    public String convert(BuildStatus object) {
        return object.getCode();
    }

    @Override
    public BuildStatus unconvert(String object) {
        return BuildStatus.getFromCode(object);
    }
}
