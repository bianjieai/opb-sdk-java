package irita.sdk.util;

import irita.sdk.exception.IritaSDKException;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;
import java.security.cert.X509Certificate;

public class HttpClientGetServerCertificate {

    public static X509Certificate[] getGateWayTlsCertPool(String gateWayUrl) {
        if (!gateWayUrl.toLowerCase().contains("https://")) {
            throw new IritaSDKException("tls is enabled, but the address is http");
        }

        HttpsURLConnection conn = null;
        try {
            URL url = new URL(gateWayUrl);
            conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("content-type", "application/x-www-form-urlencoded");
            conn.connect();
            return (X509Certificate[]) conn.getServerCertificates();
        } catch (IOException e) {
            throw new IritaSDKException(String.format("connect to url:%s failed, %s", gateWayUrl, e.getMessage()));
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }
}
