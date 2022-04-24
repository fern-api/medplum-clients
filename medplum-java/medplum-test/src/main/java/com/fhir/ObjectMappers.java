package com.fhir;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;

public final class ObjectMappers {

    public static final ObjectMapper CLIENT_OBJECT_MAPPER = JsonMapper.builder()
            .addModule(new Jdk8Module())
            .build();

    private ObjectMappers() {
    }
}
