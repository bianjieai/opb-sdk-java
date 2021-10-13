package irita.sdk.module.perm;

import com.google.protobuf.GeneratedMessageV3;
import io.grpc.Channel;
import irita.sdk.client.BaseClient;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.model.ResultTx;
import irita.sdk.util.AddressUtils;
import proto.perm.Perm;
import proto.perm.QueryGrpc;
import proto.perm.QueryOuterClass;
import proto.perm.Tx;

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
        Account sender = baseClient.queryAccount();

        Tx.MsgAssignRoles msg = Tx.MsgAssignRoles
                .newBuilder()
                .setAddress(address)
                .addAllRoles(roles)
                .setOperator(sender.getAddress())
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx);
    }

    public ResultTx unAssignRoles(String address, List<Perm.Role> roles, BaseTx baseTx) throws IOException {
        AddressUtils.validAddress(address);
        Account sender = baseClient.queryAccount();

        Tx.MsgUnassignRoles msg = Tx.MsgUnassignRoles
                .newBuilder()
                .setAddress(address)
                .addAllRoles(roles)
                .setOperator(sender.getAddress())
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx);
    }

    public ResultTx blockAccount(String address, BaseTx baseTx) throws IOException {
        AddressUtils.validAddress(address);
        Account sender = baseClient.queryAccount();

        Tx.MsgBlockAccount msg = Tx.MsgBlockAccount
                .newBuilder()
                .setAddress(address)
                .setOperator(sender.getAddress())
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx);
    }

    public ResultTx unblockAccount(String address, BaseTx baseTx) throws IOException {
        AddressUtils.validAddress(address);
        Account sender = baseClient.queryAccount();

        Tx.MsgUnblockAccount msg = Tx.MsgUnblockAccount
                .newBuilder()
                .setAddress(address)
                .setOperator(sender.getAddress())
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx);
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

    public List<String> queryBlacklist() {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryBlacklistRequest req = QueryOuterClass.QueryBlacklistRequest
                .newBuilder()
                .build();
        QueryOuterClass.QueryBlacklistResponse resp = QueryGrpc.newBlockingStub(channel).blacklist(req);
        return resp.getAddressesList();
    }
}
