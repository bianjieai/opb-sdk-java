package irita.sdk.module.tibc;

import com.google.protobuf.GeneratedMessageV3;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import irita.sdk.client.BaseClient;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.model.ResultTx;
import proto.tibc.core.packet.v1.QueryGrpc;
import proto.tibc.apps.nft_transfer.v1.Tx;
import proto.tibc.core.packet.v1.QueryOuterClass;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class TibcClient {
    private final BaseClient baseClient;

    public TibcClient(BaseClient baseClient) {
        this.baseClient = baseClient;
    }

    public ResultTx nftTransfer(String class_, String id, String receiver, String destChainName, String realayChainName, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseTx);
        Tx.MsgNftTransfer msg = Tx.MsgNftTransfer
                .newBuilder()
                .setClass_(class_)
                .setId(id)
                .setSender(account.getAddress())
                .setReceiver(receiver)
                .setDestChain(destChainName)
                .setRealayChain(realayChainName)
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    public QueryOuterClass.QueryPacketCommitmentResponse packetCommitment(String destChain, String sourceChain, long sequence) throws IOException {
        QueryOuterClass.QueryPacketCommitmentRequest req = QueryOuterClass.QueryPacketCommitmentRequest
                .newBuilder()
                .setDestChain(destChain)
                .setSourceChain(sourceChain)
                .setSequence(sequence)
                .build();
        ManagedChannel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryPacketCommitmentResponse resp = QueryGrpc.newBlockingStub(channel).packetCommitment(req);
        channel.shutdown();
        return resp;
    }
}

