package irita.sdk;

import irita.sdk.util.IOUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IOUtilTest {
    @Test
    public void readAll() {
        byte[] bytes = IOUtils.readAll("src/test/resources/test.wasm");
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);
    }
}
