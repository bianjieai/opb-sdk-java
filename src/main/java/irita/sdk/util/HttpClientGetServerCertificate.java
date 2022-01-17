package irita.sdk.util;

import irita.sdk.exception.IritaSDKException;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpCoreContext;

import javax.net.ssl.SSLSession;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

public class HttpClientGetServerCertificate {
    public static final String PEER_CERTIFICATES = "PEER_CERTIFICATES";

    public static X509Certificate[] getGateWayTlsCertPool(String gateWayUrl) throws IOException {
        if (!gateWayUrl.toLowerCase().contains("https://")) {
            throw new IritaSDKException("tls is enabled, but the address is http");
        }
        // create http response certificate interceptor
        HttpResponseInterceptor certificateInterceptor = (httpResponse, context) -> {
            ManagedHttpClientConnection routedConnection = (ManagedHttpClientConnection) context.getAttribute(HttpCoreContext.HTTP_CONNECTION);
            SSLSession sslSession = routedConnection.getSSLSession();
            if (sslSession != null) {

                // get the server certificates from the {@Link SSLSession}
                Certificate[] certificates = sslSession.getPeerCertificates();

                // add the certificates to the context, where we can later grab it from
                context.setAttribute(PEER_CERTIFICATES, certificates);
            }
        };

        // create closable http client and assign the certificate interceptor
        CloseableHttpClient httpClient = HttpClients.custom().addInterceptorLast(certificateInterceptor).build();

        X509Certificate[] peerCertificates;
        try {
            // make HTTP GET request to resource server
            HttpGet httpget = new HttpGet(gateWayUrl);

            // create http context where the certificate will be added
            HttpContext context = new BasicHttpContext();
            httpClient.execute(httpget, context);

            // obtain the server certificates from the context
            peerCertificates = (X509Certificate[]) context.getAttribute(PEER_CERTIFICATES);
        } finally {
            // close httpclient
            httpClient.close();
        }
        return peerCertificates;
    }
}
