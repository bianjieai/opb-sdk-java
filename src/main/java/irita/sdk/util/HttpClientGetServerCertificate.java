package irita.sdk.util;

import irita.sdk.exception.IritaSDKException;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.ConnectException;
import java.net.URL;
import java.security.cert.X509Certificate;

public class HttpClientGetServerCertificate {

    public static X509Certificate[] getGateWayTlsCertPool(String gateWayUrl) throws IOException {
        if (!gateWayUrl.toLowerCase().contains("https://")) {
            throw new IritaSDKException("tls is enabled, but the address is http");
        }

        X509Certificate[] peerCertificates;
        HttpsURLConnection conn = null;
        try {
            URL url = new URL(gateWayUrl);
            conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("content-type", "application/x-www-form-urlencoded");
            conn.connect();
            peerCertificates = (X509Certificate[]) conn.getServerCertificates();
            return peerCertificates;
        } catch (ConnectException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
        return null;
    }

}
