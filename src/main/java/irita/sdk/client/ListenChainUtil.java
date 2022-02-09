package irita.sdk.client;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.model.Events;
import irita.sdk.model.ws.block.NewBlockBean;
import irita.sdk.model.ws.block.ResultEndBlock;
import irita.sdk.model.ws.tx.TxBean;
import irita.sdk.util.JsonUtils;
import irita.sdk.util.MsgParser;
import proto.cosmos.tx.v1beta1.TxOuterClass;
import proto.service.Tx;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class ListenChainUtil {
    public static NewBlockBean convertNewBlockBean(String message) {
        try {
            return JsonUtils.readValue(message, NewBlockBean.class);
        } catch (IOException e) {
            throw new IritaSDKException("convertNewBlockBean failed: " + e.getMessage());
        }
    }

    public static List<Events> decodeEvent(NewBlockBean block) {
        ResultEndBlock resultEndBlock = block.getResult().getData().getValue().getResultEndBlock();
        List<Events> events = resultEndBlock.getEvents();
        for (Events event : events) {
            for (int j = 0; j < event.getAttributes().size(); j++) {
                event.getAttributes().get(j).setKey(
                        new String(Base64.getDecoder().decode(event.getAttributes().get(j).getKey())));
                event.getAttributes().get(j).setValue(
                        new String(Base64.getDecoder().decode(event.getAttributes().get(j).getValue())));
            }
        }
        return events;
    }

    public static TxBean convertTxBean(String message) {
        try {
            return JsonUtils.readValue(message, TxBean.class);
        } catch (IOException e) {
            throw new IritaSDKException("convertTxBean failed: " + e.getMessage());
        }
    }

    public static List<Tx.MsgRespondService> getResponseMsgsFromTx(TxBean txBean) {
        String txBytes = txBean.getResult().getData().getValue().getTxResult().getTx();
        TxOuterClass.Tx tx = null;
        try {
            tx = TxOuterClass.Tx.parseFrom(Base64.getDecoder().decode(txBytes));
        } catch (InvalidProtocolBufferException e) {
            throw new IritaSDKException(e.getMessage());
        }
        List<GeneratedMessageV3> msgs = new ArrayList<>();
        for (Any any : tx.getBody().getMessagesList()) {
            msgs.add(MsgParser.unpackMsg(any.getTypeUrl(), any.getValue()));
        }

        List<Tx.MsgRespondService> responds = new ArrayList<>();
        for (GeneratedMessageV3 msg : msgs) {
            if (msg instanceof Tx.MsgRespondService) {
                responds.add((Tx.MsgRespondService) msg);
            }
        }
        return responds;
    }
}
