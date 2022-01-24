package irita.sdk.ws;

import com.fasterxml.jackson.databind.ObjectMapper;
import irita.sdk.exception.IritaSDKException;

import java.io.IOException;

public class JsonUtils {
    public static <T> T readValue(String str, Class<T> valueType) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(str, valueType);
        } catch (IOException e) {
            throw new IritaSDKException(e.getMessage());
        }
    }
}
