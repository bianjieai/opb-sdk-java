package irita.sdk;

import com.google.protobuf.GeneratedMessageV3;
import irita.sdk.client.BaseClient;
import irita.sdk.client.IritaClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import irita.sdk.model.*;
import irita.sdk.module.bank.BankClient;
import irita.sdk.module.nft.NftClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import proto.nft.Tx;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeeGrantTest {
    private BaseClient baseClient;
    private IritaClient iritaClient;
    private final BaseTx baseTx = new BaseTx(200000, new Fee("300000", "ugas"), BroadcastMode.Commit);
    private String accountAmout;

    @BeforeEach
    public void init() {
        //本地环境账户助记词
        String mnemonic = "plate cable circle skill pigeon lecture lizard sick sail amazing salute other sibling neutral device artefact point pond certain ice discover gift primary worry";
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        // 本地环境链信息
        String nodeUri = "http://127.0.0.1:26657";
        String grpcAddr = "127.0.0.1:9090";
        String chainId = "irita-tesnet";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        OpbConfig opbConfig = null;

        iritaClient = new IritaClient(clientConfig, opbConfig, km);
        NftClient nftClient = iritaClient.getNftClient();
        baseClient = iritaClient.getBaseClient();
        //设置FeeGrant 该FeeGrant账户须是已对本次交易发送方账户进行过feegrant操作
        baseTx.setFeeGranter("iaa17y3qs2zuanr93nk844x0t7e6ktchwygnc8fr0g");
        //如果需要设置FeePayer 则该FeePayer必须对本交易签名
        //baseTx.setFeePayer("iaa1j782zma8xj78wsmyfqvt8muvza8aazj05vpx9p");
        accountAmout = testQueryAccount("iaa1cfqjw7h5h5xdaz6d05vs5xtpsn5w3vthartxvk",iritaClient);
        System.out.println("FeeGrant Account Balances:"+testQueryAccount("iaa17y3qs2zuanr93nk844x0t7e6ktchwygnc8fr0g",iritaClient));
        System.out.println("From Account Balances:"+accountAmout);
        assertEquals("iaa1cfqjw7h5h5xdaz6d05vs5xtpsn5w3vthartxvk", km.getCurrentKeyInfo().getAddress());
    }

    @Test
    @Disabled
    public void testFeeGrant() throws IOException {
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");

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
        ResultTx resultTx = baseClient.buildAndSend(msgs, baseTx, account);
        System.out.println(resultTx.getResult().getHash());
        System.out.println("FeeGrant Account Balances:"+testQueryAccount("iaa17y3qs2zuanr93nk844x0t7e6ktchwygnc8fr0g",iritaClient));
        String amount =  testQueryAccount("iaa1cfqjw7h5h5xdaz6d05vs5xtpsn5w3vthartxvk",iritaClient);
        System.out.println("From Account Balances:"+amount);
        assertEquals(amount, accountAmout);
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

