package irita.sdk.module.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import irita.sdk.model.ws.Attributes;
import irita.sdk.model.ws.Events;
import irita.sdk.model.ws.NewBlockBean;
import irita.sdk.model.ws.ResultEndBlock;
import org.java_websocket.handshake.ServerHandshake;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Base64;
import java.util.List;

public class WebSocketClient extends org.java_websocket.client.WebSocketClient {

    private int cnt = 0;


    public WebSocketClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        System.out.println("open...");
        this.send("{\n" +
                "\t\"jsonrpc\": \"2.0\",\n" +
                "\t\"method\": \"subscribe\",\n" +
                "\t\"params\": [\n" +
                "\t\t\"new_batch_request_provider.service_name = 'test0119' AND new_batch_request_provider.provider = 'iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3' AND tm.event = 'NewBlock'\"\n" +
                "\t],\n" +
                "\t\"id\": 1\n" +
                "}\n");
    }

    @Override
    public void onMessage(String s) {
        cnt++;
        System.out.println("message: " + s);
        System.out.println("cnt:" + cnt);
        if (cnt != 1) {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            try {
                NewBlockBean newBlockBean = mapper.readValue(s, NewBlockBean.class);
                ResultEndBlock resultEndBlock = newBlockBean.getResult().getData().getValue().getResultEndBlock();
                List<Events> events = resultEndBlock.getEvents();
                for (int i = 0; i < events.size(); i++) {
                    for (int j = 0; j < events.get(i).getAttributes().size(); j++) {
                        events.get(i).getAttributes().get(j).setKey(
                                new String(Base64.getDecoder().decode(events.get(i).getAttributes().get(j).getKey())));
                        events.get(i).getAttributes().get(j).setValue(
                                new String(Base64.getDecoder().decode(events.get(i).getAttributes().get(j).getValue())));
                    }
                }
                for (Events event : events) {
                    if ("new_batch_request_provider".equals(event.getType())) {
                        for (Attributes attribute : event.getAttributes()) {
                            System.out.println(attribute.getKey());
                            System.out.println(attribute.getValue());
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onClose(int i, String s, boolean b) {
        System.out.println("close...");
    }

    @Override
    public void onError(Exception e) {
        System.out.println("err: " + e.getMessage());
    }

    public static void main(String[] args) throws URISyntaxException, InterruptedException {
        URI uri = new URI("ws://47.100.192.234:26657/websocket");
        WebSocketClient myClient = new WebSocketClient(uri);
        myClient.connect();
        System.out.println(myClient.isOpen());
        Thread.sleep(1000000000);
    }
}