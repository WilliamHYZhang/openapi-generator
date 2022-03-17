package org.openapitools.api;

import org.joda.time.LocalDate;
import java.ws.rs.ext.ParamConverter;
import java.ws.rs.ext.ParamConverterProvider;
import java.ws.rs.ext.Provider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.ws.rs.WebApplicationException;
import java.ws.rs.core.Response;


@Provider
public class JodaLocalDateProvider implements ParamConverterProvider {

    public static class JodaLocalDateConverter implements ParamConverter<LocalDate> {

        public LocalDate fromString(String string) {
            try {
                LocalDate localDate = LocalDate.parse(string);
                return localDate;
            } catch (Exception e) {
                throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).
                entity(string + " must be valid LocalDate").build());
            }
    }

        public String toString(LocalDate t) {
            return t.toString();
        }
    }

    public <T> ParamConverter<T> getConverter(Class<T> type, Type type1, Annotation[] antns) {
        if (LocalDate.class.equals(type)) {
            return (ParamConverter<T>) new JodaLocalDateConverter();
        }
        return null;
    }
}