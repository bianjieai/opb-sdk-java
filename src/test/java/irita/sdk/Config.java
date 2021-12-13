package irita.sdk;

import irita.sdk.exception.IritaSDKException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class Config {
    public static Properties getTestConfig() {
        Properties properties = new Properties();
        BufferedReader buf = null;
        try {
            buf = new BufferedReader(new FileReader("src/test/resources/config.properties"));
            properties.load(buf);
            return properties;
        } catch (Exception e) {
            throw new IritaSDKException("read test config failed");
        }
    }
}
