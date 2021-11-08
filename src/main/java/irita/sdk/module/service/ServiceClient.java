package irita.sdk.module.service;

import com.google.protobuf.GeneratedMessageV3;
import irita.sdk.client.BaseClient;
import irita.sdk.constant.enums.EventEnum;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.model.Coin;
import irita.sdk.model.ResultTx;
import irita.sdk.util.AddressUtils;
import proto.cosmos.base.v1beta1.CoinOuterClass;
import proto.service.Tx;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ServiceClient {
    private final BaseClient baseClient;

    public ServiceClient(BaseClient baseClient) {
        this.baseClient = baseClient;
    }

    // DefineService is responsible for creating a new service definition
    public ResultTx defineService(DefineServiceRequest req, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseClient.getCurrentAddr(baseTx.getFrom()));

        Tx.MsgDefineService.Builder builder = Tx.MsgDefineService.newBuilder()
                .setName(req.getServiceName())
                .setDescription(Optional.ofNullable(req.getDescription()).orElse(""))
                .setAuthor(account.getAddress())
                .setAuthorDescription(Optional.ofNullable(req.getAuthorDescription()).orElse(""))
                .setSchemas(req.getSchemas());

        if (req.getTags() != null) {
            builder.addAllTags(req.getTags());
        }
        Tx.MsgDefineService msg = builder.build();

        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    // BindService is responsible for binding a new service definition
    public ResultTx bindService(BindServiceRequest req, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseClient.getCurrentAddr(baseTx.getFrom()));
        CoinOuterClass.Coin coin = CoinOuterClass.Coin.newBuilder()
                .setAmount(req.getDeposit().getAmount())
                .setDenom(req.getDeposit().getDenom())
                .build();

        Tx.MsgBindService msg = Tx.MsgBindService.newBuilder()
                .setServiceName(req.getServiceName())
                .setProvider(account.getAddress())
                .addDeposit(coin)
                .setPricing(req.getPricing())
                .setOptions(req.getOptions())
                .setOwner(account.getAddress())
                .setQos(req.getQoS())
                .build();

        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    // BindService is responsible for binding a new service definition
    public ResultTx updateServiceBinding(UpdateServiceBindingRequest req, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseClient.getCurrentAddr(baseTx.getFrom()));
        AddressUtils.validAddress(req.getProvider());

        CoinOuterClass.Coin coin = CoinOuterClass.Coin.newBuilder()
                .setAmount(req.getDeposit().getAmount())
                .setDenom(req.getDeposit().getDenom())
                .build();

        Tx.MsgUpdateServiceBinding msg = Tx.MsgUpdateServiceBinding.newBuilder()
                .setServiceName(req.getServiceName())
                .setProvider(req.getProvider())
                .addDeposit(coin)
                .setQos(req.getQoS())
                .setOwner(account.getAddress())
                .build();

        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    // BindService is responsible for binding a new service definition
    public ResultTx disableServiceBinding(String serviceName, String provider, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseClient.getCurrentAddr(baseTx.getFrom()));
        AddressUtils.validAddress(provider);

        Tx.MsgDisableServiceBinding msg = Tx.MsgDisableServiceBinding.newBuilder()
                .setServiceName(serviceName)
                .setProvider(provider)
                .setOwner(account.getAddress())
                .build();

        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    // BindService is responsible for binding a new service definition
    public ResultTx enableServiceBinding(String serviceName, String provider, Coin deposit, BaseTx baseTx) throws IOException {
        Account account = baseClient.queryAccount(baseClient.getCurrentAddr(baseTx.getFrom()));
        AddressUtils.validAddress(provider);

        CoinOuterClass.Coin coin = CoinOuterClass.Coin.newBuilder()
                .setAmount(deposit.getAmount())
                .setDenom(deposit.getDenom())
                .build();

        Tx.MsgEnableServiceBinding msg = Tx.MsgEnableServiceBinding.newBuilder()
                .setServiceName(serviceName)
                .setProvider(provider)
                .setOwner(account.getAddress())
                .addDeposit(coin)
                .build();

        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, account);
    }

    // InvokeService is responsible for invoke a new service
    // return reqCtxId, resultTx
    public CallServiceResp callService(CallServiceRequest req, BaseTx baseTx) throws IOException {
        Account consumer = baseClient.queryAccount(baseClient.getCurrentAddr(baseTx.getFrom()));
        req.getProviders().forEach(AddressUtils::validAddress);

        CoinOuterClass.Coin coin = CoinOuterClass.Coin.newBuilder()
                .setAmount(req.getServiceFeeCap().getAmount())
                .setDenom(req.getServiceFeeCap().getDenom())
                .build();

        Tx.MsgCallService msg = Tx.MsgCallService.newBuilder()
                .setServiceName(req.getServiceName())
                .addAllProviders(req.getProviders())
                .setConsumer(consumer.getAddress())
                .setInput(req.getInput())
                .addServiceFeeCap(coin)
                .setTimeout(req.getTimeout())
                .setRepeated(req.isRepeated())
                .setRepeatedFrequency(req.getRepeatedFrequency())
                .setRepeatedTotal(req.getRepeatedTotal())
                .build();


        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        ResultTx resultTx = baseClient.buildAndSend(msgs, baseTx, consumer);
        String reqCtxId = resultTx.getEventValue(EventEnum.CREATE_CONTEXT_REQUEST_CONTEXT_ID);
        return new CallServiceResp(reqCtxId, resultTx);
    }


    public ResultTx responseService(ResponseServiceRequest req, BaseTx baseTx) throws IOException {
        Account provider = baseClient.queryAccount(baseClient.getCurrentAddr(baseTx.getFrom()));
        queryServiceRequest(req.getRequestId());

        Tx.MsgRespondService msg = Tx.MsgRespondService.newBuilder()
                .setRequestId(req.getRequestId())
                .setProvider(provider.getAddress())
                .setOutput(req.getOutput())
                .setResult(req.getResult())
                .build();

        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, provider);
    }

    // TODO query use grpc
    public void queryServiceDefinition(String serviceName) {
    }


    public void queryServiceBinding(String serviceName, String provider) {
    }

    public void queryServiceBindings(String serviceName) {
    }

    public void queryServiceBindings(String serviceName, Integer offset, Integer limit) {
    }

    public void queryServiceRequest(String requestID) {
    }

    public void queryServiceRequests(String serviceName, String provider) {
    }

    public void queryServiceRequests(String serviceName, String provider, Integer offset, Integer limit) {
    }

    public void queryRequestsByReqCtx(String reqCtxID, int batchCounter, Integer offset, Integer limit) {
    }

    public void queryServiceResponse(String requestID) {
    }

    public void queryServiceResponses(String reqCtxID, int batchCounter) {
    }

    public void queryServiceResponses(String reqCtxID, int batchCounter, Integer offset, Integer limit) {
    }

    public void queryRequestContext(String reqCtxID) {
    }

    // TODO use websocket
    public void subscribeRequest() {
    }

    public void subscribeResponse() {
    }
}
