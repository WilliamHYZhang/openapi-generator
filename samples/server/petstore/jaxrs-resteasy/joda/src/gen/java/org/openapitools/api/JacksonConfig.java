package org.openapitools.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.ws.rs.ext.ContextResolver;
import java.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class JacksonConfig implements ContextResolver<ObjectMapper> {
    private final ObjectMapper objectMapper;

    public JacksonConfig() throws Exception {

        objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .setDateFormat(new RFC3339DateFormat());
    }

    public ObjectMapper getContext(Class<?> arg0) {
        return objectMapper;
    }
}
