package irita.sdk.client;

import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import io.grpc.Channel;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.key.KeyInfo;
import irita.sdk.key.KeyManager;
import irita.sdk.model.*;
import irita.sdk.model.block.BlockDetail;
import irita.sdk.model.block.BlockResult;
import irita.sdk.model.block.ResultBlock;
import irita.sdk.model.tx.EventQueryBuilder;
import irita.sdk.tx.TxEngine;
import irita.sdk.tx.TxEngineFactory;
import irita.sdk.util.HashUtils;
import irita.sdk.util.HttpClientGetServerCertificate;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;
import proto.cosmos.auth.v1beta1.Auth;
import proto.cosmos.auth.v1beta1.QueryGrpc;
import proto.cosmos.auth.v1beta1.QueryOuterClass;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.X509Certificate;
import java.util.List;

public class BaseClient {
    private ClientConfig clientConfig;
    private OpbConfig opbConfig;
    private KeyManager km;

    private TxEngine txEngine;
    private Channel grpcClient;
    private RpcClient rpcClient;

    public BaseClient() {
    }

    public BaseClient(ClientConfig clientConfig, OpbConfig opbConfig, KeyManager keyManager) {
        this.clientConfig = clientConfig;
        this.opbConfig = opbConfig;
        this.km = keyManager;

        this.txEngine = TxEngineFactory.createTxEngine(km, clientConfig.getChainID());
        if (opbConfig != null && opbConfig.isEnableTLS()) {
            X509Certificate[] certificates;
            certificates = HttpClientGetServerCertificate.getGateWayTlsCertPool(clientConfig.getRpcUri());
            try {
                this.grpcClient = GrpcFactory.createGrpcClient(clientConfig, opbConfig, certificates);
            } catch (IOException e) {
                throw new IritaSDKException(e.getMessage());
            }
        } else {
            this.grpcClient = GrpcFactory.createGrpcClient(clientConfig, opbConfig);
        }
        this.rpcClient = new RpcClient(clientConfig, opbConfig);
    }

    public RpcClient getRpcClient() {
        return rpcClient;
    }

    public Channel getGrpcClient() {
        return grpcClient;
    }

    public ResultTx buildAndSend(List<GeneratedMessageV3> msgs, BaseTx baseTx, Account account) throws IOException {
        TxEngine txEngine = getTxEngine();
        byte[] txBytes = txEngine.buildAndSign(msgs, baseTx, account);
        return rpcClient.broadcastTx(txBytes, baseTx.getMode());
    }

    public String buildTxHash(List<GeneratedMessageV3> msgs, BaseTx baseTx, Account account) {
        if (account == null) {
            account = queryAccount(baseTx);
        }
        TxEngine txEngine = getTxEngine();
        byte[] txBytes = txEngine.buildAndSign(msgs, baseTx, account);
        byte[] sum = HashUtils.sha256(txBytes);
        return Strings.toUpperCase(Hex.toHexString(sum));
    }


    public Account queryAccount(BaseTx baseTx) {
        if (!km.getKeyDAO().has(baseTx.getFrom())) {
            throw new IritaSDKException(String.format("name %s hasn't existed in keyDao", baseTx.getFrom()));
        }
        KeyInfo keyInfo = km.getKeyDAO().read(baseTx.getFrom(), baseTx.getPassword());
        return queryAccount(keyInfo.getAddress());
    }

    public Account queryAccount(String address) {
        QueryOuterClass.QueryAccountRequest req = QueryOuterClass.QueryAccountRequest
                .newBuilder()
                .setAddress(address)
                .build();
        QueryOuterClass.QueryAccountResponse resp = QueryGrpc.newBlockingStub(grpcClient).account(req);

        Auth.BaseAccount baseAccount = null;
        try {
            baseAccount = resp.getAccount().unpack(Auth.BaseAccount.class);
        } catch (InvalidProtocolBufferException e) {
            throw new IritaSDKException("account:\t" + address + "is not exist", e);
        }

        Account account = new Account();
        account.setAddress(baseAccount.getAddress());
        account.setAccountNumber(baseAccount.getAccountNumber());
        account.setSequence(baseAccount.getSequence());
        return account;
    }

    public synchronized GasInfo simulateTx(List<GeneratedMessageV3> msgs, BaseTx baseTx, Account account) throws IOException {
        if (account == null) {
            account = queryAccount(baseTx);
        }
        TxEngine txEngine = getTxEngine();
        byte[] txBytes = txEngine.buildAndSign(msgs, baseTx, account);
        return rpcClient.simulateTx(txBytes);
    }

    public ResultQueryTx queryTx(String hash) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return rpcClient.queryTx(hash);
    }

    public ResultSearchTxs queryTxs(EventQueryBuilder builder, int page, int size) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (builder == null) {
            throw new IritaSDKException("EventQueryBuilder can not be null");
        }
        return rpcClient.queryTxs(builder, page, size);
    }

    public BlockDetail queryBlock(String height) throws IOException {
        ResultBlock resultBlock = rpcClient.queryBlock(height);
        BlockResult blockResult = rpcClient.queryBlockResult(height);

        BlockDetail blockDetail = new BlockDetail();
        blockDetail.setBlockId(resultBlock.getBlockID());
        blockDetail.setBlock(resultBlock.getBlock());
        blockDetail.setBlockResult(blockResult);
        return blockDetail;
    }

    public ClientConfig getClientConfig() {
        return clientConfig;
    }

    public void setClientConfig(ClientConfig clientConfig) {
        this.clientConfig = clientConfig;
    }

    public OpbConfig getOpbConfig() {
        return opbConfig;
    }

    public void setOpbConfig(OpbConfig opbConfig) {
        this.opbConfig = opbConfig;
    }

    public TxEngine getTxEngine() {
        return txEngine;
    }

    public void setTxEngine(TxEngine txEngine) {
        this.txEngine = txEngine;
    }

    public KeyManager getKm() {
        return km;
    }
}
