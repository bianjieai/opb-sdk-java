package irita.sdk.util;


import com.alibaba.fastjson.JSON;
import irita.sdk.model.WrappedRequest;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HttpUtils {
    // common get
    public static String get(String uri) {
        HttpURLConnection connection = null;
        InputStream is = null;
        BufferedReader br = null;
        String result = null;

        URL url = null;
        try {
            url = new URL(uri);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(15000);
            connection.setReadTimeout(60000);
            // send req to server
            connection.connect();
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                is = connection.getInputStream();
                // return charset
                br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
                // 存放数据
                StringBuilder builder = new StringBuilder();
                String temp = null;
                while ((temp = br.readLine()) != null) {
                    builder.append(temp);
                    builder.append("\r\n");
                }
                result = builder.toString();
            } else {
                // TODO this, 抛出一个可检测异常，供外部 try catch
                throw new RuntimeException("connect error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    /**
     * common post, content-type: application/json
     *
     * @param uri
     * @param body json
     * @return res
     */
    public static String post(String uri, String body) throws IOException {
        HttpURLConnection connection = null;
        InputStream is = null;
        OutputStream os = null;
        BufferedReader br = null;
        String result = null;
        URL url = null;

        url = new URL(uri);
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoInput(true);
        connection.setDoOutput(true);
        connection.setConnectTimeout(15000);
        connection.setReadTimeout(60000);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Accept", "application/json");
        connection.connect(); // 获取连接

        os = connection.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        osw.write(body);
        osw.flush();
        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            is = connection.getInputStream();
            // return charset
            br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            // 存放数据
            StringBuilder builder = new StringBuilder();
            String temp = null;
            while ((temp = br.readLine()) != null) {
                builder.append(temp);
                builder.append("\r\n");
            }
            result = builder.toString();
        } else {
            throw new IOException("connect error, httpCode:" + connection.getResponseCode());
        }
        br.close();
        return result;
    }

    // use this to send tx
    @Deprecated
    public synchronized static <S extends com.google.protobuf.GeneratedMessageV3> String post(String uri, WrappedRequest<S> object) throws IOException {
        return post(uri, JSON.toJSONString(object));
    }
}
