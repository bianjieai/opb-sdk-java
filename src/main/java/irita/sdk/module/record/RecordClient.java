package irita.sdk.module.record;

import com.google.protobuf.GeneratedMessageV3;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import irita.sdk.client.BaseClient;
import irita.sdk.constant.enums.EventEnum;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.model.Result;
import irita.sdk.model.ResultTx;
import proto.record.QueryGrpc;
import proto.record.QueryOuterClass;
import proto.record.RecordOuterClass;
import proto.record.Tx;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class RecordClient {
    private final BaseClient baseClient;

    public RecordClient(BaseClient baseClient) {
        this.baseClient = baseClient;
    }

    public CreateRecordResult createRecord(List<RecordOuterClass.Content> contents, BaseTx baseTx) throws IOException {
        if (contents == null || contents.size() == 0) {
            throw new IritaSDKException("contents can not be empty");
        }
        Account account = baseClient.queryAccount(baseTx);
        Tx.MsgCreateRecord.Builder builder = Tx.MsgCreateRecord.newBuilder();
        for (RecordOuterClass.Content content : contents) {
            builder.addContents(content);
        }
        Tx.MsgCreateRecord msg = builder
                .setCreator(account.getAddress())
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        ResultTx resultTx = baseClient.buildAndSend(msgs, baseTx, account);
        String recordId = resultTx.getEventValue(EventEnum.CREATE_RECORD_RECORD_ID);
        return new CreateRecordResult(recordId, Optional.of(resultTx)
                .map(ResultTx::getResult)
                .map(Result::getHash)
                .orElse(""));
    }

    public QueryOuterClass.QueryRecordResponse queryRecord(String recordId) {
        QueryOuterClass.QueryRecordRequest recordRequest = QueryOuterClass.QueryRecordRequest.newBuilder()
                .setRecordId(recordId)
                .build();
        ManagedChannel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryRecordResponse queryRecordResponse = QueryGrpc.newBlockingStub(channel).record(recordRequest);
        channel.shutdown();
        return queryRecordResponse;
    }
}
