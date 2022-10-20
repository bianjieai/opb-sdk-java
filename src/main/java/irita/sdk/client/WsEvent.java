package irita.sdk.client;

import irita.sdk.function.EventHandler;
import irita.sdk.model.tx.EventQueryBuilder;
import irita.sdk.model.ws.block.NewBlockBean;
import irita.sdk.model.ws.tx.TxBean;

import java.io.IOException;

public interface WsEvent {
    void subscribeNewBlock(EventQueryBuilder builder, EventHandler<NewBlockBean> handler) throws IOException;

    void subscribeTx(EventQueryBuilder builder, EventHandler<TxBean> txHandler);
}
