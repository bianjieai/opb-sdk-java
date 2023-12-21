package irita.sdk.client;

import irita.sdk.constant.TmTypes;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.function.EventHandler;
import irita.sdk.model.ws.block.NewBlockBean;
import irita.sdk.model.ws.tx.TxBean;
import irita.sdk.util.LogUtils;
import irita.sdk.util.WsPool;
import org.apache.commons.lang3.StringUtils;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.io.IOException;
import java.net.URI;

public class WsClient extends WebSocketClient {
    private final String sendMessage;
    private boolean status;

    private EventHandler txHandler;

    public WsClient(URI serverUri, String sendMessage) {
        super(serverUri);
        this.sendMessage = sendMessage;
    }

    public WsClient(URI serverUri, String sendMessage,EventHandler txHandler) {
        super(serverUri);
        this.sendMessage = sendMessage;
        this.txHandler = txHandler;
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        LogUtils.info("websocket opened connection");
        if (StringUtils.isNotEmpty(sendMessage)) {
            this.send(sendMessage);
        }
    }

    @Override
    public void onMessage(String s) {
        if (s.length() > 100) {
            try {
                if (WsPool.getKeyByWs(this).equals(TmTypes.EVENT_TX)){
                    TxBean tx = ListenChainUtil.convertTxBean(s);
                    txHandler.accept(tx);
                }else {
                    NewBlockBean block = ListenChainUtil.convertNewBlockBean(s);
                    txHandler.accept(block);
                }
            } catch (IOException e) {
                throw new IritaSDKException("websocket io failed:" + e.getMessage());
            }
        }

    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        LogUtils.info("Connection closed by " + (remote ? "remote peer" : "us") + " Code: " + code + " Reason: " + reason);
        this.status = true;
        WsPool.removeConnection(this);
    }

    @Override
    public void onError(Exception e) {
        // if the error is fatal then onClose will be called additionally
        e.printStackTrace();
    }

    public EventHandler getTxHandler() {
        return txHandler;
    }

    public void setTxHandler(EventHandler txHandler) {
        this.txHandler = txHandler;
    }

    public boolean getStatus() {
        return status;
    }
}
