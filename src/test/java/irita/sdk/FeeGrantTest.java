package irita.sdk;

import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Timestamp;
import irita.sdk.client.BaseClient;
import irita.sdk.client.IritaClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.key.AlgoEnum;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import irita.sdk.model.*;
import irita.sdk.module.bank.BankClient;
import irita.sdk.module.feegrant.FeeGrantClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import proto.cosmos.base.v1beta1.CoinOuterClass;
import proto.cosmos.feegrant.v1beta1.Feegrant;
import proto.nft.Tx;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FeeGrantTest {
    private BaseClient baseClient;
    private IritaClient iritaClient;
    private String accountAmount;
    private String grantAmount;

    @BeforeEach
    public void init() {
        //本地环境账户助记词
        String mnemonic = "west farm disease weasel age cram cross second battle brief slim steel network arrive series lab gorilla gun fiction robust skin torch planet burden";
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);
        // 本地环境链信息
        String nodeUri = "http://127.0.0.1:26657";
        String grpcAddr = "127.0.0.1:9090";
        String chainId = "2022";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        OpbConfig opbConfig = null;
        iritaClient = new IritaClient(clientConfig, opbConfig, km);
        baseClient = iritaClient.getBaseClient();
        accountAmount = testQueryAccount("iaa193eqcr7zwtfjx7us0wm33ddtdtct38adr942f3",iritaClient);
        grantAmount = testQueryAccount("iaa12v374npj9r6kf7vtzav4pxn33tj6m44wdx0uxd",iritaClient);
        System.out.println("FeeGrant Account Balances:"+grantAmount);
        System.out.println("From Account Balances:"+ accountAmount);
        assertEquals("iaa193eqcr7zwtfjx7us0wm33ddtdtct38adr942f3", km.getCurrentKeyInfo().getAddress());
    }

    @Test
    @Disabled
    public void testFeeGrant() throws IOException {
        BaseTx baseTx = new BaseTx(200000, new Fee("300000", "ugas"), BroadcastMode.Commit);
        String denomID = "denomid" + new Random().nextInt(1000);
        String denomName = "denomname" + new Random().nextInt(1000);
        String schema = "no shcema";
        Account account = baseClient.queryAccount(baseTx);
        Tx.MsgIssueDenom msg1 = Tx.MsgIssueDenom
                .newBuilder()
                .setId(denomID + "1")
                .setName(denomName + "1")
                .setSchema(schema + "1")
                .setSender(account.getAddress())
                .build();
        Tx.MsgIssueDenom msg2 = Tx.MsgIssueDenom
                .newBuilder()
                .setId(denomID + "2")
                .setName(denomName + "2")
                .setSchema(schema + "2")
                .setSender(account.getAddress())
                .build();

        List<GeneratedMessageV3> msgs = new ArrayList<>();
        msgs.add(msg1);
        msgs.add(msg2);
        //设置FeeGrant 该FeeGrant账户须是已对本次交易发送方账户进行过feegrant操作
        //如果需要设置FeePayer 则该FeePayer必须对本交易签名
        //baseTx.setFeePayer("iaa1j782zma8xj78wsmyfqvt8muvza8aazj05vpx9p");
        baseTx.setFeeGranter("iaa12v374npj9r6kf7vtzav4pxn33tj6m44wdx0uxd");
        ResultTx resultTx = baseClient.buildAndSend(msgs, baseTx, account);
        System.out.println(resultTx.getResult().getHash());
        String feeGrantResult = testQueryAccount("iaa12v374npj9r6kf7vtzav4pxn33tj6m44wdx0uxd",iritaClient);
        String amount =  testQueryAccount("iaa193eqcr7zwtfjx7us0wm33ddtdtct38adr942f3",iritaClient);
        System.out.println("FeeGrant Account Balances:"+feeGrantResult);
        System.out.println("From Account Balances:"+amount);
        BigInteger grantAmountBigInteger = new BigInteger(grantAmount);
        BigInteger grantResult = new BigInteger(feeGrantResult);
        assertEquals(amount, accountAmount);
        assertEquals(grantAmountBigInteger.subtract(new BigInteger("300000")),grantResult);
    }

    @Test
    @Disabled
    public void testGrantAllowance() throws IOException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        String mnemonic = "style boost aisle prevent uphold fuel mask demand topple file supreme brass metal glue bronze chicken security intact kid spike time term blame embody";
        KeyManager km = KeyManagerFactory.createKeyManger(AlgoEnum.ETH_SECP256K1);
        km.recover(mnemonic);
        // 本地环境链信息
        String nodeUri = "http://127.0.0.1:26657";
        String grpcAddr = "127.0.0.1:9090";
        String chainId = "2022";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        OpbConfig opbConfig = null;
        IritaClient iritaClient2 = new IritaClient(clientConfig, opbConfig, km);
        BaseClient baseClien2t = iritaClient2.getBaseClient();
        BaseTx baseTx = new BaseTx(200000, new Fee("300000", "ugas"), BroadcastMode.Commit);
        String garenter = "iaa12v374npj9r6kf7vtzav4pxn33tj6m44wdx0uxd";
        String garentee = "iaa193eqcr7zwtfjx7us0wm33ddtdtct38adr942f3";
        FeeGrantClient feeGrantClient = new FeeGrantClient(baseClien2t);
        ResultTx resultTx = feeGrantClient.GrantAllowance(garenter,garentee,baseTx);
        System.out.println(resultTx.getResult().getHash());
        assertNotNull(resultTx);
    }


    @Test
    @Disabled
    public void testRevokeAllowance() throws IOException {
        String mnemonic = "style boost aisle prevent uphold fuel mask demand topple file supreme brass metal glue bronze chicken security intact kid spike time term blame embody";
        KeyManager km = KeyManagerFactory.createKeyManger(AlgoEnum.ETH_SECP256K1);
        km.recover(mnemonic);
        // 本地环境链信息
        String nodeUri = "http://127.0.0.1:26657";
        String grpcAddr = "127.0.0.1:9090";
        String chainId = "2022";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        OpbConfig opbConfig = null;
        IritaClient iritaClient2 = new IritaClient(clientConfig, opbConfig, km);
        BaseClient baseClien2t = iritaClient2.getBaseClient();
        BaseTx baseTx = new BaseTx(200000, new Fee("300000", "ugas"), BroadcastMode.Commit);
        String garenter = "iaa12v374npj9r6kf7vtzav4pxn33tj6m44wdx0uxd";
        String garentee = "iaa193eqcr7zwtfjx7us0wm33ddtdtct38adr942f3";
        accountAmount = testQueryAccount(garenter,iritaClient);
        grantAmount = testQueryAccount(garentee,iritaClient);
        System.out.println("FeeGrant Account Balances:"+grantAmount);
        System.out.println("From Account Balances:"+ accountAmount);
        FeeGrantClient feeGrantClient = new FeeGrantClient(baseClien2t);
        ResultTx resultTx = feeGrantClient.RevokeAllowance(garenter,garentee,baseTx);
        System.out.println(resultTx.getResult().getHash());
    }


    private String testQueryAccount(String address,IritaClient iritaClien) {
        BankClient bankClient = iritaClien.getBankClient();
        BaseAccount account = bankClient.queryAccount(address);
        List<Coin> coins = account.getCoins();
        Optional<Coin> iritaCoin = coins.stream().filter(x -> x.getDenom().equals("ugas")).findFirst();
        if (!iritaCoin.isPresent()) {
            return "0";
        }
        return iritaCoin.get().getAmount();
    }
}

/*tx:
  '@type': /cosmos.tx.v1beta1.Tx
  auth_info:
    fee:
      amount:
      - amount: "300000"
        denom: ugas
      gas_limit: "200000"
      granter: iaa17y3qs2zuanr93nk844x0t7e6ktchwygnc8fr0g
      payer: ""
    signer_infos:
    - mode_info:
        single:
          mode: SIGN_MODE_DIRECT
      public_key:
        '@type': /cosmos.crypto.sm2.PubKey
        key: AxOeWQYtALvVweF7hvXDsFKbfZK2BARgD1YdgBNLZ3Yw
      sequence: "7"
*/

