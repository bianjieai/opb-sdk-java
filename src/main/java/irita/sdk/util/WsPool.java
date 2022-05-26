package irita.sdk.util;

import irita.sdk.client.WsClient;
import org.java_websocket.WebSocket;
import java.util.*;

public class WsPool {
    private static final Map<WsClient, String> wsUserMap = new HashMap<WsClient, String>();
    public static String getKeyByWs(WebSocket conn) {
        return wsUserMap.get(conn);
    }
    public static WsClient getConnection(String key){
        Set<WsClient> keySet = wsUserMap.keySet();
        synchronized (keySet) {
            for (WsClient conn : keySet) {
                String connectionKey = wsUserMap.get(conn);
                if (connectionKey.equals(key)) {
                    if (conn.isClosed()||conn.isClosing()){
                        conn.reconnect();
                    }
                    return conn;
                }
            }
        }
        return null;
    }
    public static void addConnection(WsClient wsClient, String key){
        wsUserMap.put(wsClient, key); // 添加连接
    }

    public static void removeConnection(WebSocket conn) {
        if (wsUserMap.containsKey(conn)) {
            wsUserMap.remove(conn);
        }
    }
}
