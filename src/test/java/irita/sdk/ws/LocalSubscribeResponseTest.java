package irita.sdk.ws;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import irita.sdk.client.ListenChainUtil;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.model.ws.tx.TxBean;
import org.bouncycastle.util.encoders.Hex;
import org.junit.jupiter.api.Test;
import proto.service.Tx;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class LocalSubscribeResponseTest {
    private String reqCtxID = "7d217413ca8dbac44e28fbf1985d488bfdabc26800b738d087830dfe7b52edb40000000000000000";


    public TxBean getTxMessage() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper.readValue(new File("src/test/resources/listen_tx.json"), TxBean.class);
    }

    public void handler(String reqCtxID, String requestID, String output) {
        System.out.println("用户开始处理得到的响应");
        System.out.println("处理中reqCtxID:" + reqCtxID + ",requestID:" + requestID + ",output" + output);
        System.out.println("处理得到的响应结束");
    }

    @Test
    public void testSubscribeRespond() throws Exception {
        TxBean tx = getTxMessage();
        List<Tx.MsgRespondService> responds = ListenChainUtil.getResponseMsgsFromTx(tx);
        for (Tx.MsgRespondService msg : responds) {
            String reqCtxID2 = splitRequestID(msg.getRequestId());
            if (reqCtxID2.equals(reqCtxID)) {
                handler(reqCtxID, msg.getRequestId(), msg.getOutput());
            } else {
                throw new RuntimeException("panic");
            }
        }
    }

    private String splitRequestID(String requestId) {
        byte[] hexBytes = Hex.decode(requestId);

        final int requestIDLen = 58;
        if (hexBytes.length != requestIDLen) {
            throw new IritaSDKException("invalid request id");
        }

        byte[] dest = new byte[40];
        System.arraycopy(hexBytes, 0, dest, 0, dest.length);
        return Hex.toHexString(dest);
    }
}

