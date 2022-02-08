package irita.sdk.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtils {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    static { objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); }

    public static ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public static ObjectMapper config(DeserializationFeature f, boolean state) {
        return objectMapper.configure(f, state);
    }

    public static  <T> T readValue(String content, Class<T> valueType) throws IOException {
        return objectMapper.readValue(content, valueType);
    }

    public static  <T> T readValue(String content, TypeReference valueTypeRef) throws IOException {
        return objectMapper.readValue(content, valueTypeRef);
    }

    public static String writeValueAsString(Object value) throws JsonProcessingException {
        return objectMapper.writeValueAsString(value);
    }

    public static byte[] writeValueAsBytes(Object value) throws JsonProcessingException {
        return objectMapper.writeValueAsBytes(value);
    }

}
