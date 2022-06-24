package irita.sdk.module.random;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.google.protobuf.GeneratedMessageV3;
import io.grpc.Channel;
import irita.sdk.client.BaseClient;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.model.ResultTx;
import irita.sdk.module.nft.NftClient;
import irita.sdk.module.nft.QueryDenomResp;
import proto.cosmos.base.v1beta1.CoinOuterClass;
import proto.nft.Nft;
import proto.random.QueryGrpc;
import proto.random.QueryOuterClass;
import proto.random.RandomOuterClass;
import proto.random.Tx;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class RandomClient {
    private final BaseClient baseClient;

    public RandomClient(BaseClient baseClient) {
        this.baseClient = baseClient;
    }

    public ResultTx randomRequest(MsgRequestRandom msgRequestRandom, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseTx);

        CoinOuterClass.Coin coin = CoinOuterClass.Coin.newBuilder()
                .setAmount(msgRequestRandom.getServiceFeeCap().getAmount())
                .setDenom(msgRequestRandom.getServiceFeeCap().getDenom())
                .build();

        Tx.MsgRequestRandom msg = Tx.MsgRequestRandom
                .newBuilder()
                .setBlockInterval(msgRequestRandom.getBlockInterval())
                .setConsumer(msgRequestRandom.getConsumer())
                .setOracle(msgRequestRandom.getOracle())
                .addServiceFeeCap(coin)
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    public QueryRandomResponse queryRandom(String reqID) {
        Channel channel = baseClient.getGrpcClient();
        proto.random.QueryOuterClass.QueryRandomRequest req = proto.random.QueryOuterClass.QueryRandomRequest
                .newBuilder()
                .setReqId(reqID)
                .build();
        QueryOuterClass.QueryRandomResponse resp = QueryGrpc.newBlockingStub(channel).random(req);
        return Convert.toQueryRandomResponse(resp.getRandom());
    }

    private static class Convert {
        public static QueryRandomResponse toQueryRandomResponse(RandomOuterClass.Random random) {
            QueryRandomResponse res = new QueryRandomResponse();
            res.setRequestTxHash(random.getRequestTxHash());
            res.setHeight(random.getHeight());
            res.setValue(random.getValue());
            return res;
        }
    }
}
