package irita.sdk.util;

import irita.sdk.exception.IritaSDKException;
import okhttp3.Handshake;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.security.cert.X509Certificate;

public class HttpClientGetServerCertificate {

    public static X509Certificate[] getGateWayTlsCertPool(String gateWayUrl) {
        if (!gateWayUrl.toLowerCase().contains("https://")) {
            throw new IritaSDKException("tls is enabled, but the address is http");
        }

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(gateWayUrl).build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            throw new IritaSDKException(String.format("connect to url:%s failed, %s", gateWayUrl, e.getMessage()));
        }
        Handshake handshake = response.handshake();
        if (handshake == null) {
            throw new IritaSDKException(String.format("connect to url:%s failed", gateWayUrl));
        }
        return handshake.peerCertificates().toArray(new X509Certificate[0]);
    }
}
