package irita.sdk;

import irita.sdk.util.HttpUtils;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class HttpUtilsTest {
    private final HttpUtils httpUtils = new HttpUtils();

    @Test
    public void get() {
        String res = httpUtils.get("http://localhost:26657");
        System.out.println(res);
    }

    @Test
    public void post() throws Exception {
        String res = httpUtils.post("http://localhost:8085/test-post", "");
        System.out.println(res);
    }
}
