package com.shopdirect.maximoautomation.infrastructure.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.shopdirect.maximoautomation.infrastructure.model.BuildStatus;

import java.io.IOException;

public class BuildStatusDeserializer extends JsonDeserializer{

    @Override
    public BuildStatus deserialize(JsonParser jp, DeserializationContext dc) throws IOException {
        BuildStatus type = BuildStatus.fromCode(jp.getValueAsString());
        if (type != null) {
            return type;
        }
        throw new JsonMappingException(jp,
                String.format("Enum type for this code does not exist: %s", jp.getValueAsString()));
    }
}
