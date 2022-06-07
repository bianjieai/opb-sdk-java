package irita.sdk;

import com.google.protobuf.GeneratedMessageV3;
import irita.sdk.client.BaseClient;
import irita.sdk.client.IritaClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.key.AlgoEnum;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.model.Fee;
import irita.sdk.model.ResultTx;
import irita.sdk.module.nft.QueryCollectionResp;
import irita.sdk.module.nft.QueryDenomResp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import proto.cosmos.tx.v1beta1.TxOuterClass;
import proto.nft.Tx;

import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ETHSecp256k1Test {
    private IritaClient client;
    private final BaseTx baseTx = new BaseTx(200000, new Fee("200000", "ugas"), BroadcastMode.Commit);

    @BeforeEach
    public void init() {
        //更换为自己链上地址的助记词
        String mnemonic = "debris minute night puzzle angry gorilla radio negative beef throw invest three badge setup used earth base bottom drill security shell ugly decorate leaf";
        KeyManager km = KeyManagerFactory.createKeyManger(AlgoEnum.ETH_SECP256K1);
        km.recover(mnemonic);


        //连接测试网（连接主网请参考README.md）
        Properties properties = ConfigTest.getTestConfig();
        String nodeUri = properties.getProperty("node_uri");
        String grpcAddr = properties.getProperty("grpc_addr");
        String chainId = properties.getProperty("chain_id");
        /*System.getProperty("java.library.path");
        System.loadLibrary("libsecp256k1");*/

        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId);
        //测试网为null，主网请参考README.md
        OpbConfig opbConfig = null;

        client = new IritaClient(clientConfig, opbConfig, km);
        //判断由助记词恢复的是否为预期的链上地址
        assertEquals("iaa1g938d6d97jz2r6hxwv78v2g7w0jwf3xxu8cw0s", km.getCurrentKeyInfo().getAddress());
    }

    @Test
    @Disabled
    public void sendMsgs() throws IOException {
        //创建 denom 的参数
        String denomID = "denomid" + new Random().nextInt(1000);
        String denomName = "denomname" + new Random().nextInt(1000);
        String schema = "no shcema";

        /**
         * issue denom (build 、sign、broadcast)
         * 以 NFT 模块的 issue denom 交易为例，通过 baseClient build->sign->broadcast 发送交易
         * 其他模块交易也可以以这种方式实现
         */
        BaseClient baseClient = client.getBaseClient();
        /*baseTx.setFeeGranter("iaa17y3qs2zuanr93nk844x0t7e6ktchwygnc8fr0g");
        baseTx.setFeePayer("iaa1xdah5h7elxc8ezhye29jxyv365gpsp0vluk6y3");*/
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
        ResultTx resultTx = baseClient.getRpcClient().broadcastTx(signTxBytes, baseTx.getMode());
        //broadcast 广播签名后的交易
        assertNotNull(resultTx);

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
