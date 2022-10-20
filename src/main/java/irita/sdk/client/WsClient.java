package irita.sdk.client;

import irita.sdk.util.LogUtils;
import org.apache.commons.lang3.StringUtils;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;

public abstract class WsClient extends WebSocketClient {
    private final String sendMessage;

    public WsClient(URI serverUri, String sendMessage) {
        super(serverUri);
        this.sendMessage = sendMessage;
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        LogUtils.info("websocket opened connection");
        if (StringUtils.isNotEmpty(sendMessage)) {
            this.send(sendMessage);
        }
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        LogUtils.info("Connection closed by " + (remote ? "remote peer" : "us") + " Code: " + code + " Reason: " + reason);
    }

    @Override
    public void onError(Exception e) {
        // if the error is fatal then onClose will be called additionally
        e.printStackTrace();
    }
}
