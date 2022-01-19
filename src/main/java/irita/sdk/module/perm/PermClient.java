package irita.sdk.module.perm;

import com.google.protobuf.GeneratedMessageV3;
import io.grpc.Channel;
import irita.sdk.client.BaseClient;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.model.ResultTx;
import irita.sdk.util.AddressUtils;
import proto.perm.*;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class PermClient {
    private final BaseClient baseClient;

    public PermClient(BaseClient baseClient) {
        this.baseClient = baseClient;
    }

    public ResultTx assignRoles(String address, List<Perm.Role> roles, BaseTx baseTx) throws IOException {
        AddressUtils.validAddress(address);
        Account sender = baseClient.queryAccount(baseTx);

        Tx.MsgAssignRoles msg = Tx.MsgAssignRoles
                .newBuilder()
                .setAddress(address)
                .addAllRoles(roles)
                .setOperator(sender.getAddress())
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, sender);
    }

    public ResultTx unAssignRoles(String address, List<Perm.Role> roles, BaseTx baseTx) throws IOException {
        AddressUtils.validAddress(address);
        Account sender = baseClient.queryAccount(baseTx);

        Tx.MsgUnassignRoles msg = Tx.MsgUnassignRoles
                .newBuilder()
                .setAddress(address)
                .addAllRoles(roles)
                .setOperator(sender.getAddress())
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, sender);
    }

    public ResultTx blockAccount(String address, BaseTx baseTx) throws IOException {
        AddressUtils.validAddress(address);
        Account sender = baseClient.queryAccount(baseTx);

        Tx.MsgBlockAccount msg = Tx.MsgBlockAccount
                .newBuilder()
                .setAddress(address)
                .setOperator(sender.getAddress())
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, sender);
    }

    public ResultTx unblockAccount(String address, BaseTx baseTx) throws IOException {
        AddressUtils.validAddress(address);
        Account sender = baseClient.queryAccount(baseTx);

        Tx.MsgUnblockAccount msg = Tx.MsgUnblockAccount
                .newBuilder()
                .setAddress(address)
                .setOperator(sender.getAddress())
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, sender);
    }

    public ResultTx blockContract(String contractAddress, BaseTx baseTx) throws IOException {
        Account sender = baseClient.queryAccount(baseTx);

        Tx.MsgBlockContract msg = Tx.MsgBlockContract
                .newBuilder()
                .setContractAddress(contractAddress)
                .setOperator(sender.getAddress())
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, sender);
    }

    public ResultTx unblockContract(String contractAddress, BaseTx baseTx) throws IOException {
        Account sender = baseClient.queryAccount(baseTx);

        Tx.MsgUnblockContract msg = Tx.MsgUnblockContract
                .newBuilder()
                .setContractAddress(contractAddress)
                .setOperator(sender.getAddress())
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, sender);
    }

    public List<Perm.Role> queryRoles(String address) {
        AddressUtils.validAddress(address);

        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryRolesRequest req = QueryOuterClass.QueryRolesRequest
                .newBuilder()
                .setAddress(address)
                .build();
        QueryOuterClass.QueryRolesResponse resp = QueryGrpc.newBlockingStub(channel).roles(req);
        return resp.getRolesList();
    }

    public List<String> queryBlockListAccount() {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryBlockListRequest req = QueryOuterClass.QueryBlockListRequest
                .newBuilder()
                .build();
        QueryOuterClass.QueryBlockListResponse resp = QueryGrpc.newBlockingStub(channel).accountBlockList(req);
        return resp.getAddressesList();
    }

    public List<String> queryBlockListContract() {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryContractDenyList req = QueryOuterClass.QueryContractDenyList
                .newBuilder()
                .build();
        QueryOuterClass.QueryContractDenyListResponse resp = QueryGrpc.newBlockingStub(channel).contractDenyList(req);
        return resp.getAddressesList();
    }
}
