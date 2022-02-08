package irita.sdk.module.wasm;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;
import io.grpc.Channel;
import irita.sdk.client.BaseClient;
import irita.sdk.constant.enums.EventEnum;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.model.Coin;
import irita.sdk.model.ResultTx;
import irita.sdk.util.IOUtils;
import irita.sdk.util.JsonUtils;
import proto.cosmos.base.v1beta1.CoinOuterClass;
import proto.cosmwasm.wasm.v1.QueryGrpc;
import proto.cosmwasm.wasm.v1.QueryOuterClass;
import proto.cosmwasm.wasm.v1.Tx;
import proto.cosmwasm.wasm.v1.Types;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class WasmClient {
    private final BaseClient baseClient;

    public WasmClient(BaseClient baseClient) {
        this.baseClient = baseClient;
    }

    // upload the contract to block-chain and return the codeId for user
    public String store(StoreRequest req, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseTx);

        byte[] byteCode;
        if (req.getWasmByteCode() != null) {
            byteCode = req.getWasmByteCode();
        } else {
            byteCode = IOUtils.readAll(req.getWasmFile());
            if (byteCode == null) {
                throw new IritaSDKException("file not read");
            }
        }

        Tx.MsgStoreCode.Builder builder = Tx.MsgStoreCode.newBuilder()
                .setSender(account.getAddress())
                .setWasmByteCode(ByteString.copyFrom(byteCode));
        if (req.getPermission() != null) {
            builder.setInstantiatePermission(req.getPermission());
        }
        Tx.MsgStoreCode msg = builder.build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        ResultTx resultTx = baseClient.buildAndSend(msgs, baseTx, account);
        return resultTx.getEventValue(EventEnum.STORE_CODE_CODE_ID);
    }

    // instantiate the contract state
    public String instantiate(InstantiateRequest req, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseTx);
        Tx.MsgInstantiateContract.Builder builder = Tx.MsgInstantiateContract.newBuilder()
                .setSender(account.getAddress())
                .setAdmin(Optional.of(req).map(InstantiateRequest::getAdmin).orElse(""))
                .setCodeId(req.getCodeId())
                .setMsg(ByteString.copyFrom(JsonUtils.writeValueAsString(req.getInitMsg()).getBytes(StandardCharsets.UTF_8)))
                .setLabel(req.getLabel());

        if (req.getInitFunds() != null) {
            builder.addFunds(
                    CoinOuterClass.Coin.newBuilder()
                            .setDenom(req.getInitFunds().getDenom())
                            .setAmount(req.getInitFunds().getAmount()));
        }

        Tx.MsgInstantiateContract msg = builder.build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        ResultTx resultTx = baseClient.buildAndSend(msgs, baseTx, account);
        return resultTx.getEventValue(EventEnum.INSTANTIATE_CONTRACT_ADDRESS);
    }

    // execute the contract method
    public ResultTx execute(String contractAddress, ContractABI abi, Coin funds, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseTx);
        byte[] msgBytes = abi.build();

        Tx.MsgExecuteContract.Builder builder = Tx.MsgExecuteContract.newBuilder()
                .setSender(account.getAddress())
                .setContract(contractAddress)
                .setMsg(ByteString.copyFrom(msgBytes));

        if (funds != null) {
            builder.addFunds(
                    CoinOuterClass.Coin.newBuilder()
                            .setAmount(funds.getAmount())
                            .setDenom(funds.getDenom()));
        }

        Tx.MsgExecuteContract msg = builder.build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    public ResultTx migrate(String contractAddress, long newCodeID, byte[] msgByte, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseTx);
        Tx.MsgMigrateContract msg = Tx.MsgMigrateContract.newBuilder()
                .setSender(account.getAddress())
                .setContract(contractAddress)
                .setCodeId(newCodeID)
                .setMsg(ByteString.copyFrom(msgByte))
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    // return the contract information
    public ContractInfo queryContractInfo(String contractAddress) {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryContractInfoRequest req = QueryOuterClass.QueryContractInfoRequest
                .newBuilder()
                .setAddress(contractAddress)
                .build();

        QueryOuterClass.QueryContractInfoResponse resp = QueryGrpc.newBlockingStub(channel).contractInfo(req);
        return Convert.toContractInfo(resp);
    }

    // execute contract's query method and return the result
    public byte[] queryContract(String address, ContractABI abi) {
        Channel channel = baseClient.getGrpcClient();
        byte[] msgBytes = abi.build();
        QueryOuterClass.QuerySmartContractStateRequest req = QueryOuterClass.QuerySmartContractStateRequest
                .newBuilder()
                .setAddress(address)
                .setQueryData(ByteString.copyFrom(msgBytes))
                .build();

        QueryOuterClass.QuerySmartContractStateResponse resp = QueryGrpc.newBlockingStub(channel).smartContractState(req);
        return resp.toByteArray();
    }

    // export all state data of the contract
    public Map<String, String> exportContractState(String address) {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryAllContractStateRequest req = QueryOuterClass.QueryAllContractStateRequest
                .newBuilder()
                .setAddress(address)
                .build();

        QueryOuterClass.QueryAllContractStateResponse resp = QueryGrpc.newBlockingStub(channel).allContractState(req);

        Map<String, String> map = new HashMap<>();
        List<Types.Model> models = resp.getModelsList();
        for (Types.Model model : models) {
            byte[] bytes = model.getKey().toByteArray();
            int PREFIX = new String(bytes).startsWith("\00") ? 2 : 0;
            byte[] dest = new byte[bytes.length - PREFIX];
            System.arraycopy(bytes, PREFIX, dest, 0, dest.length);

            String key = new String(dest);
            String value = new String(model.getValue().toByteArray());
            map.put(key, value);
        }
        return map;
    }
}
