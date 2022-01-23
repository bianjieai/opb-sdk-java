package irita.sdk.util;

import java.util.logging.Logger;

public class LogUtils {
    private static final Logger logger = Logger.getLogger("opb-sdk");

    public static void info(String s) {
        logger.info(s);
    }
}
