package irita.sdk;

import com.google.protobuf.GeneratedMessageV3;
import irita.sdk.client.BaseClient;
import irita.sdk.client.IritaClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.model.Fee;
import irita.sdk.model.ResultTx;
import irita.sdk.module.nft.QueryCollectionResp;
import irita.sdk.module.nft.QueryDenomResp;
import irita.sdk.util.HashUtils;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import proto.cosmos.tx.v1beta1.TxOuterClass;
import proto.nft.Tx;

import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SignTxTest {
    private IritaClient client;
    private final BaseTx baseTx = new BaseTx(200000, new Fee("200000", "ugas"), BroadcastMode.Sync);

    @BeforeEach
    public void init() {
        //更换为自己链上地址的助记词
        String mnemonic = "opera vivid pride shallow brick crew found resist decade neck expect apple chalk belt sick author know try tank detail tree impact hand best";
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        //连接测试网（连接主网请参考README.md）
        String nodeUri = "http://47.100.192.234:26657";
        String grpcAddr = "47.100.192.234:9090";
        String chainId = "testing";

        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        //测试网为null，主网请参考README.md
        OpbConfig opbConfig = null;

        client = new IritaClient(clientConfig, opbConfig, km);
        //判断由助记词恢复的是否为预期的链上地址
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", km.getCurrentKeyInfo().getAddress());
    }

    @Test
    @Disabled
    public void signTxOfflineAndSend() throws IOException {
        //创建 denom 的参数
        String denomID = "testdenom" + new Random().nextInt(1000);
        String denomName = "test_name";
        String schema = "no shcema";

        /**
         * issue denom (build 、sign、broadcast)
         * 以 NFT 模块的 issue denom 交易为例，通过 baseClient build->sign->broadcast 发送交易
         * 其他模块交易也可以以这种方式实现
         */
        BaseClient baseClient = client.getBaseClient();
        //查询账户信息
        Account account = baseClient.queryAccount(baseTx);
        //build msg 构建msg
        Tx.MsgIssueDenom msg = Tx.MsgIssueDenom
                .newBuilder()
                .setId(denomID)
                .setName(denomName)
                .setSchema(schema)
                .setSender(account.getAddress())//这种形式下的所有交易都需要指定sender
                .build();
        List<GeneratedMessageV3> issueDenomMsgs = Collections.singletonList(msg);
        //memo 为交易备注,如不需要交易备注可以直接使用 buildTxBody()
        //TxOuterClass.TxBody txBody = client.getBaseClient().getTxEngine().buildTxBody(issueDenomMsgs);
        TxOuterClass.TxBody txBody = baseClient.getTxEngine().buildTxBodyWithMemo(issueDenomMsgs, "example memo");
        byte[] bytes = txBody.toByteArray();
        //sign 签名
        TxOuterClass.TxBody txBodyFromBytes = TxOuterClass.TxBody.parseFrom(bytes);
        TxOuterClass.Tx signTx = baseClient.getTxEngine().signTx(txBodyFromBytes, baseTx, account);
        byte[] signTxBytes = signTx.toByteArray();
        // 离线计算交易hash
        String txHash = Strings.toUpperCase(Hex.toHexString(HashUtils.sha256(signTxBytes)));
        //broadcast 广播签名后的交易 - 通过sync模式
        ResultTx resultTx = baseClient.getRpcClient().broadcastTx(signTxBytes, BroadcastMode.Sync);
        assertNotNull(resultTx);
        assertEquals(resultTx.getResult().getHash(),txHash);

        //查询denom验证
        QueryDenomResp denom = client.getNftClient().queryDenom(denomID);
        assertNotNull(denom);
        assertEquals(denomID, denom.getId());

        /**
         * mint nfts in one tx
         * 在一笔交易中可以有多个msg，下面的例子是在一笔交易中 mint 多个 nft
         */
        String nftID1 = "test1";
        String nftID2 = "test2";
        String nftName = "test_name";
        String uri = "https://www.baidu.com";
        String data = "any data";
        //nft1
        Tx.MsgMintNFT msg1 = Tx.MsgMintNFT
                .newBuilder()
                .setDenomId(denomID)
                .setId(nftID1)
                .setName(nftName)
                .setUri(uri)
                .setData(data)
                .setSender(account.getAddress())
                .setRecipient(account.getAddress())
                .build();
        //nft2
        Tx.MsgMintNFT msg2 = Tx.MsgMintNFT
                .newBuilder()
                .setDenomId(denomID)
                .setId(nftID2)
                .setName(nftName)
                .setUri(uri)
                .setData(data)
                .setSender(account.getAddress())
                .setRecipient(account.getAddress())
                .build();
        //构建的多个nft添加到 List<GeneratedMessageV3> 类型的列表中
        List<GeneratedMessageV3> mintNFTMsgs = new ArrayList<>();
        mintNFTMsgs.add(msg1);
        mintNFTMsgs.add(msg2);
        //使用 baseClient 每一笔交易前都需要查询一次account(因为每发一笔交易,该地址account的sequence会自增)
        account = baseClient.queryAccount(baseTx);
        resultTx = baseClient.buildAndSend(mintNFTMsgs, baseTx, account);
        assertNotNull(resultTx);
        //通过denomID查询collection,即该denom和其nft列表信息
        QueryCollectionResp collection = client.getNftClient().queryCollection(denomID, null);
        assertNotNull(collection);
        assertEquals(2, collection.getNfts().size());
    }
}
