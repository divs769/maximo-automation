package com.shopdirect.maximoautomation.infrastructure.model.converter;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;

import java.time.OffsetDateTime;

public class OffsetDateTimeConverter implements DynamoDBTypeConverter<String, OffsetDateTime> {

    @Override
    public String convert(OffsetDateTime object) {
        return object.toString();
    }

    @Override
    public OffsetDateTime unconvert(String object) {
        return OffsetDateTime.parse(object);
    }
}
