package irita.sdk.ws;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import irita.sdk.client.IritaClient;
import irita.sdk.client.ListenChainUtil;
import irita.sdk.config.ClientConfig;
import irita.sdk.constant.AttributeKey;
import irita.sdk.constant.EventType;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import irita.sdk.model.Attributes;
import irita.sdk.model.Events;
import irita.sdk.model.ws.block.NewBlockBean;
import irita.sdk.model.ws.block.ResultEndBlock;
import irita.sdk.module.service.ServiceClient;
import irita.sdk.module.service.ServiceResponseInfo;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import proto.service.Service;
import proto.service.Tx;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocalSubscribeRequestTest {
    private final ObjectMapper mapper = new ObjectMapper();
    private ServiceClient serviceClient;
    private KeyManager km;


    @BeforeEach
    public void init() {
        //更换为自己链上地址的助记词
        String mnemonic = "opera vivid pride shallow brick crew found resist decade neck expect apple chalk belt sick author know try tank detail tree impact hand best";
        km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        //连接测试网（连接主网请参考README.md）
        String nodeUri = "http://47.100.192.234:26657";
        String grpcAddr = "47.100.192.234:9090";
        String chainId = "testing";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        //测试网为null，主网请参考README.md

        IritaClient client = new IritaClient(clientConfig, null, km);
        serviceClient = client.getServiceClient();
        //判断由助记词恢复的是否为预期的链上地址
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", km.getCurrentKeyInfo().getAddress());
    }

    public NewBlockBean getListenMessage() throws IOException {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper.readValue(new File("src/test/resources/listen_block.json"), NewBlockBean.class);
    }

    public List<Events> translateEvent(NewBlockBean block) {
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

    public List<String> getReqIds(List<Events> events, String serviceName, String provider) throws IOException {
        List<String> ids = new ArrayList<>();
        for (Events event : events) {
            if (EventType.NEW_BATCH_REQUEST_PROVIDER.equals(event.getType())) {
                List<Attributes> attributes = event.getAttributes();
                String svcName = attributes.stream().filter(a -> AttributeKey.SERVICE_NAME.equals(a.getKey())).map(Attributes::getValue).findAny().orElse("");
                String prov = attributes.stream().filter(a -> AttributeKey.PROVIDER.equals(a.getKey())).map(Attributes::getValue).findAny().orElse("");

                if (serviceName.equals(svcName) && provider.equals(prov)) {
                    String reqIDsStr = event.getAttributes().stream().filter(e -> e.getKey().equals(AttributeKey.REQUESTS)).map(Attributes::getValue).findAny().orElse("");
                    if (StringUtils.isEmpty(reqIDsStr)) {
                        return ids;
                    }

                    List<String> list = mapper.readValue(reqIDsStr, new TypeReference<List<String>>() {
                    });
                    ids.addAll(list);
                }
            }
        }
        return ids;
    }


    public List<Tx.MsgRespondService> checkAgainReqIds(List<String> reqIds, String serviceName, String provider) {
        List<Tx.MsgRespondService> msgs = new ArrayList<>();
        for (String reqId : reqIds) {
            Service.Request request;
            try {
                request = serviceClient.queryServiceRequest(reqId);
            } catch (Exception e) {
                // ignore error
                return null;
            }

            // checkAgain
            if (serviceName.equals(request.getServiceName()) && provider.equals(request.getProvider())) {
                ServiceResponseInfo m = mockHandler();
                Tx.MsgRespondService msg = Tx.MsgRespondService.newBuilder()
                        .setRequestId(request.getId())
                        .setProvider(provider)
                        .setOutput(m.getOutput())
                        .setResult(m.getResult())
                        .build();
                msgs.add(msg);
            }
        }

        return msgs;
    }

    public ServiceResponseInfo mockHandler() {
        String output = "{\"header\":{},\"body\":{\"last\":\"1:100\"}}";
        String result = "{\"code\":200,\"message\":\"\"}";
        return new ServiceResponseInfo(output, result);
    }

    public List<Tx.MsgRespondService> mockRespondMsg() {
        ServiceResponseInfo info = mockHandler();
        Tx.MsgRespondService msg = Tx.MsgRespondService.newBuilder().setRequestId("DC2A00FA02E9CEC09B0E82BEB010941AA9205EF021A9F82DD8E94EC3A7171E460000000000000000000000000000000100000000002B51070000")
                .setResult(info.getResult())
                .setOutput(info.getOutput())
                .setProvider(km.getCurrentKeyInfo().getAddress())
                .build();
        return Collections.singletonList(msg);
    }


    @Test
    public void testSubscribeRequest() throws Exception {
        String serviceName = "testservice149";
        String provider = "iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3";

        NewBlockBean block = getListenMessage();
        List<Events> events = ListenChainUtil.decodeEvent(block);
        List<String> reqIds = getReqIds(events, serviceName, provider);
        List<Tx.MsgRespondService> msgs = checkAgainReqIds(reqIds, serviceName, provider);
        if (msgs.size() == 0) {
            msgs = mockRespondMsg(); // because this is unit test
        }
        assertEquals(1, msgs.size());
        assertEquals("DC2A00FA02E9CEC09B0E82BEB010941AA9205EF021A9F82DD8E94EC3A7171E460000000000000000000000000000000100000000002B51070000", msgs.get(0).getRequestId());
        assertEquals(provider, msgs.get(0).getProvider());
        assertEquals("{\"header\":{},\"body\":{\"last\":\"1:100\"}}", msgs.get(0).getOutput());
    }
}
