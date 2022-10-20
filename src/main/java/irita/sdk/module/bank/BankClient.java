package irita.sdk.module.bank;

import com.google.protobuf.GeneratedMessageV3;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import irita.sdk.client.BaseClient;
import irita.sdk.model.*;
import irita.sdk.util.AddressUtils;
import proto.cosmos.bank.v1beta1.QueryGrpc;
import proto.cosmos.bank.v1beta1.QueryOuterClass;
import proto.cosmos.bank.v1beta1.Tx;
import proto.cosmos.base.v1beta1.CoinOuterClass;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BankClient {
    private final BaseClient baseClient;

    public BankClient(BaseClient baseClient) {
        this.baseClient = baseClient;
    }

    public ResultTx send(String amount, String denom, String toAddress, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseTx);
        AddressUtils.validAddress(toAddress);

        Tx.MsgSend msg = Tx.MsgSend.newBuilder()
                .addAmount(CoinOuterClass.Coin.newBuilder()
                        .setAmount(amount)
                        .setDenom(denom)
                        .build())
                .setFromAddress(account.getAddress())
                .setToAddress(toAddress)
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    public BaseAccount queryAccount(String address) {
        AddressUtils.validAddress(address);

        Account account = baseClient.queryAccount(address);
        ManagedChannel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryAllBalancesRequest req = QueryOuterClass.QueryAllBalancesRequest
                .newBuilder()
                .setAddress(address)
                .build();
        QueryOuterClass.QueryAllBalancesResponse resp = QueryGrpc.newBlockingStub(channel).allBalances(req);
        channel.shutdown();
        List<Coin> coins = resp.getBalancesList().stream().map(c -> {
            String amount = c.getAmount();
            String denom = c.getDenom();
            return new Coin(denom, amount);
        }).collect(Collectors.toList());

        BaseAccount baseAccount = new BaseAccount();
        baseAccount.setCoins(coins);
        baseAccount.setAccount(account);
        return baseAccount;
    }
}
