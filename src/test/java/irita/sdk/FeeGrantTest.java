package irita.sdk;

import irita.sdk.client.BaseClient;
import irita.sdk.client.IritaClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.key.AlgoEnum;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import irita.sdk.model.*;
import irita.sdk.module.bank.BankClient;
import irita.sdk.module.feegrant.FeeGrantClient;
import irita.sdk.module.nft.MintNFTRequest;
import irita.sdk.module.nft.NftClient;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FeeGrantTest extends ConfigTest {
    private IritaClient iritaClient;
    private KeyManager km;
    private final String tokenDenom = "ugas";
    private final BaseTx baseTx = new BaseTx(200000, new Fee("200000", tokenDenom), BroadcastMode.Commit);


    @BeforeEach
    public void init() {
        iritaClient = getTestClient();
        km = iritaClient.getBaseClient().getKm();
    }

    @Test
    @Disabled
    @Tag("首先调用该方法给某一地址开通代付token的功能")
    @Order(1)
    public void testGrantAllowance() throws IOException {
        // 注意这里需要使用有余额的地址(iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3)初始化 client
        BaseClient baseClient = iritaClient.getBaseClient();
        String garenter = km.getCurrentKeyInfo().getAddress(); // 有余额的地址
        String garentee = "iaa106lcg5m8h3cdawun7c2rrwpj7q3ncfr9k3wxwx"; // 给没有余额的地址授予代付功能

        FeeGrantClient feeGrantClient = new FeeGrantClient(baseClient);
        ResultTx resultTx = feeGrantClient.GrantAllowance(garenter, garentee, baseTx);
        System.out.println(resultTx.getResult().getHash());
        assertNotNull(resultTx);
    }

    @Test
    @Disabled
    @Tag("使用被赋予代付功能的地址发送交易")
    @Order(2)
    public void testFeeGrant() throws IOException {
        // 注意这个需要使用被赋予代付的地址(iaa106lcg5m8h3cdawun7c2rrwpj7q3ncfr9k3wxwx)的助记词初始化 client
        String mnemonic = "require trip wage figure garage reunion neutral cave because scorpion inject hover blouse dress skin oven garlic virus exist purpose boy convince become inform";
        km = KeyManagerFactory.createKeyManger(AlgoEnum.SM2);
        km.recover(mnemonic);

        // 新的一个客户端
        String nodeUri = "http://47.100.192.234:26657";
        String grpcAddr = "47.100.192.234:9090";
        String chainId = "testing";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        IritaClient iritaClient2 = new IritaClient(clientConfig, null, km);
        assertEquals("iaa106lcg5m8h3cdawun7c2rrwpj7q3ncfr9k3wxwx", km.getCurrentKeyInfo().getAddress());

        NftClient nftClient = iritaClient2.getNftClient();
        MintNFTRequest req = new MintNFTRequest();
        req.setDenom("denomid669");
        req.setId("hahhahaid" + new Random().nextInt(1000));
        req.setData("");
        req.setName("my_name");
        req.setRecipient(km.getCurrentKeyInfo().getAddress());

        // 设置FeeGrant 该FeeGrant账户须是已对本次交易发送方账户进行过feegrant操作
        baseTx.setFeeGranter("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3");
        String originalToken = testQueryAccount("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", tokenDenom);
        ResultTx resultTx = nftClient.mintNft(req, baseTx);
        System.out.println(resultTx.getResult().getHash());

        // 最后验证是否代付人的token变少
        String afterTxToken = testQueryAccount("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", tokenDenom);
        assertEquals(new BigInteger(originalToken).subtract(new BigInteger("200000")), new BigInteger(afterTxToken));
    }


    @Test
    @Disabled
    @Tag("撤销默一地址的代付功能")
    @Order(3)
    public void testRevokeAllowance() throws IOException {
        FeeGrantClient feeGrantClient = iritaClient.getFeeGrantClient();
        String garenter = km.getCurrentKeyInfo().getAddress();
        String garentee = "iaa106lcg5m8h3cdawun7c2rrwpj7q3ncfr9k3wxwx"; // 要撤销的地址

        ResultTx resultTx = feeGrantClient.RevokeAllowance(garenter, garentee, baseTx);
        System.out.println(resultTx.getResult().getHash());
    }


    private String testQueryAccount(String address, String tokenDenom) {
        BankClient bankClient = iritaClient.getBankClient();
        BaseAccount account = bankClient.queryAccount(address);
        List<Coin> coins = account.getCoins();
        Optional<Coin> iritaCoin = coins.stream().filter(x -> x.getDenom().equals(tokenDenom)).findFirst();
        return iritaCoin.isPresent() ? iritaCoin.get().getAmount() : "0";
    }
}

