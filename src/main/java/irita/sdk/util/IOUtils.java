package irita.sdk.util;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOUtils {
    public static byte[] readAll(String fileName) {
        InputStream is = null;
        byte[] dest = null;
        ByteArrayOutputStream baos = null;
        try {
            is = new FileInputStream(fileName);
            baos = new ByteArrayOutputStream();
            byte[] flush = new byte[1024 * 10];

            int len = -1;
            while ((len = is.read(flush)) != -1) {
                baos.write(flush, 0, len);
            }
            dest = baos.toByteArray();
            return dest;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}