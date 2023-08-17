package irita.sdk;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import irita.sdk.client.IritaClient;
import irita.sdk.config.ClientConfig;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.crypto.eth.KeyPair;
import irita.sdk.crypto.eth.LegacyTransaction;
import irita.sdk.crypto.eth.SECPPrivateKey;
import irita.sdk.crypto.eth.SECPSignature;
import irita.sdk.key.AlgoEnum;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.model.Fee;
import irita.sdk.model.ResultTx;
import irita.sdk.module.evm.EvmClient;
import irita.sdk.module.evm.MsgEthereumTxRequest;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.web3j.abi.datatypes.AbiTypes;
import org.web3j.crypto.*;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.AbiDefinition;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.ContractGasProvider;
import org.web3j.tx.gas.DefaultGasProvider;
import org.web3j.utils.Numeric;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Base64;

import static irita.sdk.constant.Constant.IRITA_EVM_CHAIN_ID;
import static irita.sdk.crypto.eth.SignatureAlgorithm.ALGORITHM;
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
    public void testAccount(){
        Account account = client.getBaseClient().queryAccount("iaa1tcv95r022zplp4kthtn4dg6hvza7sfnggqwmnn");
        System.out.println(account.getSequence());
        System.out.println(account.getAddress());
    }

    @Test
    @Disabled
    public void testIssueDenom() throws IOException {
        String name = "test_issus_denom_3";
        String data = "issue_denom_data_3";
        ResultTx resultTx = client.getMtClient().issueDenom(name, data.getBytes(), baseTx);
        System.out.println(resultTx.getResult().getHash());
        System.out.println(resultTx.getResult().getDeliver_tx().getLog());
    }

    @Test
    public void testEvm() throws Exception {
        String nodeUri = "http://192.168.0.160:26657";
        String grpcAddr = "192.168.0.160:9090";
        String chainId = "wenchangchain-qa";
        String wsAddr = "ws://127.0.0.1:26657/websocket";
        ClientConfig clientConfig = new ClientConfig(nodeUri, grpcAddr, chainId,wsAddr);
        IritaClient iritaClient = new IritaClient(clientConfig, null, km);
        String encode = "f901278001831e84809491ae776b264a76d85bf0c346ab058908d4865aeb80b8c4990711900000000000000000000000005e185a0dea5083f0d6cbbae756a35760bbe82668000000000000000000000000000000000000000000000000000000000000006000000000000000000000000000000000000000000000000000000000000000800000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000974657374686173683100000000000000000000000000000000000000000000008209b1a0bea909e8b139162f29e43127eebe7204b37527c787306f42dcea019ead4ffbf0a070a04771afde76c4a64871b567a26afd5415fabd7f2f8f706f54da0054b971c7";
       /* LegacyTransaction legacyTransaction = LegacyTransaction.decodeLegacyTransaction(encode);
        System.out.println(legacyTransaction.getSender());*/
        ResultTx resultTx = iritaClient.getEvmClient().EthereumTx(encode,"0x4579DB44FD3A6F645194058914E0A8D5E8F20DB8","ugas");
        System.out.println(resultTx.getResult().getHash());
    }

    @Test
    public void testGetCounter() throws IOException {
        /*EvmClient evmClient = client.getEvmClient();
        Account account = client.getBaseClient().queryAccount("iaa1tcv95r022zplp4kthtn4dg6hvza7sfnggqwmnn");
        Web3j web3j = Web3j.build(new HttpService("http://127.0.0.1:8545"));
        BigInteger pubKey = Sign.publicKeyFromPrivate(km.getCurrentKeyInfo().getPrivKey());
        ECKeyPair keyPair = new ECKeyPair(km.getCurrentKeyInfo().getPrivKey(), pubKey);
        Credentials credentials = Credentials.create(keyPair);
        ContractGasProvider contractGasProvider = new DefaultGasProvider();
        MsgEthereumTxRequest request = new MsgEthereumTxRequest();
        Counter_sol_Counter contract = Counter_sol_Counter.load("0xB1c62B942bD026881d85BeE6bEEC27541c964b08",null,credentials,contractGasProvider);
        String func = contract.getCounter().encodeFunctionCall();


        Sign.SignatureData signature = Sign.signMessage(org.web3j.crypto.Hash.sha3(func.getBytes()), keyPair);
        proto.ethermint.evm.v1.Tx.LegacyTx legacyTx = proto.ethermint.evm.v1.Tx.LegacyTx.newBuilder()
                .setData(ByteString.copyFromUtf8(func))
                .setGas(baseTx.getGas())
                .setNonce(account.getSequence())
                .setGasPrice(1+"")
                .setR(ByteString.copyFrom(signature.getR()))
                .setS(ByteString.copyFrom(signature.getS()))
                .setV(ByteString.copyFrom(signature.getV()))
                .build();
        request.setValue(Any.pack(legacyTx,""));
        request.setFrom("0x5e185A0dEa5083f0d6cbBae756A35760Bbe82668");
        request.setHash(Hash.sha3(legacyTx.toByteArray()).toString());
        request.setPayer("iaa1af55lmstsdzv5er5sls0sj2g7hxdq0fatjur0d");
        //baseTx.setFeeGranter("iaa1af55lmstsdzv5er5sls0sj2g7hxdq0fatjur0d");
        ResultTx resultTx = evmClient.EthereumTx2(request,baseTx);
        System.out.println(resultTx.getResult().getHash());*/
        Account account = client.getBaseClient().queryAccount("iaa1tcv95r022zplp4kthtn4dg6hvza7sfnggqwmnn");
        Web3j web3j = Web3j.build(new HttpService("http://127.0.0.1:8545"));
        BigInteger pubKey = Sign.publicKeyFromPrivate(km.getCurrentKeyInfo().getPrivKey());
        ECKeyPair keyPair = new ECKeyPair(km.getCurrentKeyInfo().getPrivKey(), pubKey);
        Credentials credentials = Credentials.create(keyPair);
        ContractGasProvider contractGasProvider = new DefaultGasProvider();
        Counter_sol_Counter contract = Counter_sol_Counter.load("0xB1c62B942bD026881d85BeE6bEEC27541c964b08",null,credentials,contractGasProvider);
        String func = contract.getCounter().encodeFunctionCall();
        RawTransaction rawTransaction = RawTransaction.createTransaction(BigInteger.valueOf(account.getSequence()), BigInteger.valueOf(1), BigInteger.valueOf(baseTx.getGas()), contract.getContractAddress(), func);

    }



    @Test
    public void testEvmAdd2() throws Exception {
        EvmClient evmClient = client.getEvmClient();
        Account account = client.getBaseClient().queryAccount("iaa1tcv95r022zplp4kthtn4dg6hvza7sfnggqwmnn");
        Web3j web3j = Web3j.build(new HttpService("http://127.0.0.1:8545"));
        BigInteger pubKey = Sign.publicKeyFromPrivate(km.getCurrentKeyInfo().getPrivKey());
        ECKeyPair keyPair = new ECKeyPair(km.getCurrentKeyInfo().getPrivKey(), pubKey);
        Credentials credentials = Credentials.create(keyPair);
        System.out.println("credentials.getAddress:"+credentials.getAddress());
        ContractGasProvider contractGasProvider = new DefaultGasProvider();
        Counter_sol_Counter contract = Counter_sol_Counter.load("0xB1c62B942bD026881d85BeE6bEEC27541c964b08",null,credentials,null);
        String func = contract.add().encodeFunctionCall();

        X9ECParameters params = SECNamedCurves.getByName("secp256k1");
        ECDomainParameters curve =new ECDomainParameters(params.getCurve(), params.getG(), params.getN(), params.getH());
        SECPPrivateKey secpPrivateKey = SECPPrivateKey.create(keyPair.getPrivateKey(),ALGORITHM);
       /* KeyPair keyPair1 = KeyPair.create(secpPrivateKey, curve, ALGORITHM);
        LegacyTransaction legacyTransaction = new LegacyTransaction(
                account.getSequence(),
                        "1",
                        Long.valueOf(baseTx.getGas()),
                        contract.getContractAddress(),
                        "0",
                        func,
                        new BigInteger(IRITA_EVM_CHAIN_ID));*/
        //SECPSignature signature = legacyTransaction.sign(keyPair1);
       /* ECDSASignature ecdsaSignature = new ECDSASignature(signature.getR(),signature.getS());
        Sign.SignatureData signatureData =Sign.createSignatureData(ecdsaSignature,keyPair.getPublicKey(),legacyTransaction.decodeTransaction().toArrayUnsafe());*/
        /*byte[] bytes = LegacyTransaction.encode(signature,account.getSequence(),
                "1",
                Long.valueOf(baseTx.getGas()),
                contract.getContractAddress(),
                "0",
                func);
        //byte[] bytes = signature.encodedBytes().toArray();
        System.out.println(Numeric.toHexString(bytes));
        System.out.println(legacyTransaction.getSender());*/
        //Sign.SignatureData signature = Sign.signMessage(func.getBytes(), keyPair);
        //Credentials credentials = Credentials.create(keyStore.get(signEvent.getSender()));
       /* byte[] signMessage = TransactionEncoder.signMessage(rawTransaction,1223,credentials);
        String signMsg =  Numeric.toHexString(signMessage);
        ResultTx resultTx = evmClient.EthereumTx2(signMsg,"0xEA694FEE0B8344CA647487E0F84948F5CCD03D3D","ugas");
        System.out.println(resultTx.getResult().getHash());*/
    }

    @Test
    public void testEvmAdd3() throws Exception {
        EvmClient evmClient = client.getEvmClient();
        Account account = client.getBaseClient().queryAccount("iaa1tcv95r022zplp4kthtn4dg6hvza7sfnggqwmnn");
        Web3j web3j = Web3j.build(new HttpService("http://127.0.0.1:8545"));
        BigInteger pubKey = Sign.publicKeyFromPrivate(km.getCurrentKeyInfo().getPrivKey());
        ECKeyPair keyPair = new ECKeyPair(km.getCurrentKeyInfo().getPrivKey(), pubKey);
        Credentials credentials = Credentials.create(keyPair);
        System.out.println("credentials.getAddress:"+credentials.getAddress());
        ContractGasProvider contractGasProvider = new DefaultGasProvider();
        Counter_sol_Counter contract = Counter_sol_Counter.load("0xB1c62B942bD026881d85BeE6bEEC27541c964b08",null,credentials,null);
        String func = contract.add().encodeFunctionCall();
        RawTransaction rawTransaction = RawTransaction.createTransaction(BigInteger.valueOf(account.getSequence()), BigInteger.valueOf(8), BigInteger.valueOf(baseTx.getGas()), contract.getContractAddress(), func);

        //Sign.SignatureData signature = Sign.signMessage(func.getBytes(), keyPair);
        byte[] signMessage = TransactionEncoder.signMessage(rawTransaction,1223,credentials);
        String signMsg =  Numeric.toHexString(signMessage);
        System.out.println(signMsg);
    }

    @Test
    public void testDecode(){
        String encode = "f901470801831e8480941a6640c32b7e6413e839e9dfdb53970ee809b7fb80b8e4990711900000000000000000000000005892e7eeaea5ba624f5ba2900dbab8d2ea36d62b000000000000000000000000000000000000000000000000000000000000006000000000000000000000000000000000000000000000000000000000000000a0000000000000000000000000000000000000000000000000000000000000001a687474703a2f2f6578616d706c652e636f6d2f746f6b656e2f35000000000000000000000000000000000000000000000000000000000000000000000000000974657374686173683600000000000000000000000000000000000000000000008209b2a050e1d159818efbae1c536b2c866920ac3c8c3720b9194b02c5ecea7717f85d2da05eabeb96aad81f432e1d7d3f84e6d38ce939e7a2d1f0bee3af2f20f507c91b96";
        String encodeLocal = "0xf8661808831e848094b1c62b942bd026881d85bee6beec27541c964b0880844f2be91f8209b2a016bf73f2e6f36a4bae09e487a00a7c1a2ef14b37a53e160163766c3fe3d73124a03abfbb611c76738d34b0844db5f222d0ae0f36a4e1b3f2a2afc864697366bc17";
        String encode2 = "0xf901278001831e84809491ae776b264a76d85bf0c346ab058908d4865aeb80b8c4990711900000000000000000000000005e185a0dea5083f0d6cbbae756a35760bbe82668000000000000000000000000000000000000000000000000000000000000006000000000000000000000000000000000000000000000000000000000000000800000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000974657374686173683100000000000000000000000000000000000000000000008209b1a0bea909e8b139162f29e43127eebe7204b37527c787306f42dcea019ead4ffbf0a070a04771afde76c4a64871b567a26afd5415fabd7f2f8f706f54da0054b971c7";
        LegacyTransaction legacyTransaction = LegacyTransaction.decodeLegacyTransaction(encode2);
        System.out.println(legacyTransaction.getSender());
        /*RawTransaction transaction = TransactionDecoder.decode(encode2);
        SignedRawTransaction signedRawTransaction = (SignedRawTransaction) transaction;
        signedRawTransaction.getSignatureData().getR();
        System.out.println(signedRawTransaction.getSignatureData().getV().toString());*/
        /*byte[] bytes = legacyTransaction.getSignature().encodedBytes().toArrayUnsafe();
        System.out.println(Numeric.toHexString(bytes));*/

    }

    // sign addr iaa1tcv95r022zplp4kthtn4dg6hvza7sfnggqwmnn
}
