package irita.sdk.evm;

import irita.sdk.client.IritaClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.key.AlgoEnum;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.model.Fee;
import irita.sdk.model.ResultTx;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.web3j.crypto.*;
import org.web3j.utils.Numeric;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvmTest {
    private KeyManager km;
    private IritaClient client;
    private final BaseTx baseTx = new BaseTx(2000000, new Fee("2000000", "ugas"), BroadcastMode.Sync);

    @BeforeEach
    public void init() {
        //更换为自己链上地址的助记词
        String mnemonic = "fish speak reunion throw prison mango climb trend off bean extend sentence risk monster defense uncle hurdle wish gentle pulse gadget voice castle actor";
        km = KeyManagerFactory.createKeyManager(AlgoEnum.ETH_SECP256K1);
        km.recover(mnemonic);

        //连接测试网（连接主网请参考README.md）
        String nodeUri = "http://127.0.0.1:26657";
        String grpcAddr = "127.0.0.1:9090";
        String chainId = "2023";
        String wsAddr = "ws://127.0.0.1:26657/websocket";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId,wsAddr);
        client = new IritaClient(clientConfig, null, km);
        assertEquals("iaa1tcv95r022zplp4kthtn4dg6hvza7sfnggqwmnn", km.getCurrentKeyInfo().getAddress());
    }


    @Test
    public void testEvm() throws Exception {
        String nodeUri = "http://192.168.0.160:26657";
        String grpcAddr = "192.168.0.160:9090";
        String chainId = "wenchangchain-qa";
        String wsAddr = "ws://127.0.0.1:26657/websocket";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId,wsAddr);
        IritaClient iritaClient = new IritaClient(clientConfig, null, km);
        String encode = "0xf901270201831e84809491ae776b264a76d85bf0c346ab058908d4865aeb80b8c4990711900000000000000000000000005e185a0dea5083f0d6cbbae756a35760bbe82668000000000000000000000000000000000000000000000000000000000000006000000000000000000000000000000000000000000000000000000000000000800000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000974657374686173683200000000000000000000000000000000000000000000008209b2a097060335ed698590ea42c6e58abfd3bdecda37d52efe3feeb9277964d41cfed2a07fef2bc8bcdb6a1ed0c87380b9db78630cdc6f630be7e21de6e563d7d7b68083";
        ResultTx resultTx = iritaClient.getEvmClient().EthereumTx(encode,"0x4579DB44FD3A6F645194058914E0A8D5E8F20DB8","ugas");
        System.out.println(resultTx.getResult().getHash());
    }


    /** NOTE
     * * 合约生成java代码
     * * npm install -g solc
     * * npx solc
     * * npm install -g solc    -g
     * * npx solc Counter.sol -abi -bin -o ./
     * * web3j generate solidity --abiFile=Counter_sol_Counter.abi --outputDir=.\bin\ --package=evm
     */
    //根据智能合约编译为java版本代码，调用合约
    @Test
    public void testEvmWithContract() throws Exception {
        String nodeUri = "http://127.0.0.1:26657";
        String grpcAddr = "127.0.0.1:9090";
        String chainId = "2023";
        String wsAddr = "ws://127.0.0.1:26657/websocket";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId,wsAddr);
        IritaClient iritaClient = new IritaClient(clientConfig, null, km);
        Account account = client.getBaseClient().queryAccount("iaa1tcv95r022zplp4kthtn4dg6hvza7sfnggqwmnn");
        BigInteger pubKey = Sign.publicKeyFromPrivate(km.getCurrentKeyInfo().getPrivKey());
        //密钥对
        ECKeyPair keyPair = new ECKeyPair(km.getCurrentKeyInfo().getPrivKey(), pubKey);
        Credentials credentials = Credentials.create(keyPair);
        //合约
        Counter_sol_Counter contract = Counter_sol_Counter.load("0xB1c62B942bD026881d85BeE6bEEC27541c964b08",null,credentials,null);
         //生成合约调用方法
        Numeric.toHexString(contract.add().encodeFunctionCall().getBytes());
        //构造交易
        RawTransaction rawTransaction = RawTransaction.createTransaction(BigInteger.valueOf(account.getSequence()), BigInteger.valueOf(8), BigInteger.valueOf(baseTx.getGas()), contract.getContractAddress(), Numeric.toHexString( contract.add().encodeFunctionCall().getBytes()));
        //签名
        byte[] signMessage = TransactionEncoder.signMessage(rawTransaction,credentials);
        String signMsg =  Numeric.toHexString(signMessage);
        //发送交易
        ResultTx resultTx = iritaClient.getEvmClient().EthereumTx(signMsg,"0xEA694FEE0B8344CA647487E0F84948F5CCD03D3D","ugas");
        System.out.println(resultTx.getResult().getHash());
    }
}

