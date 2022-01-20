package irita.sdk.module.service;

import com.google.protobuf.GeneratedMessageV3;
import io.grpc.Channel;
import irita.sdk.client.BaseClient;
import irita.sdk.constant.enums.EventEnum;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.model.Coin;
import irita.sdk.model.ResultTx;
import irita.sdk.model.tx.Condition;
import irita.sdk.model.tx.EventQueryBuilder;
import irita.sdk.util.AddressUtils;
import proto.cosmos.base.query.v1beta1.Pagination;
import proto.cosmos.base.v1beta1.CoinOuterClass;
import proto.service.QueryGrpc;
import proto.service.QueryOuterClass;
import proto.service.Service;
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
        Account account = baseClient.queryAccount(baseTx);

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
        Account account = baseClient.queryAccount(baseTx);
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
        Account account = baseClient.queryAccount(baseTx);
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
        Account account = baseClient.queryAccount(baseTx);
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
        Account account = baseClient.queryAccount(baseTx);
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
        Account consumer = baseClient.queryAccount(baseTx);
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
        Account provider = baseClient.queryAccount(baseTx);

        Tx.MsgRespondService msg = Tx.MsgRespondService.newBuilder()
                .setRequestId(req.getRequestId())
                .setProvider(provider.getAddress())
                .setOutput(req.getOutput())
                .setResult(req.getResult())
                .build();

        List<GeneratedMessageV3> msgs = Collections.singletonList(msg);
        return baseClient.buildAndSend(msgs, baseTx, provider);
    }

    public Service.ServiceDefinition queryServiceDefinition(String serviceName) {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryDefinitionRequest req = QueryOuterClass.QueryDefinitionRequest
                .newBuilder()
                .setServiceName(serviceName)
                .build();
        QueryOuterClass.QueryDefinitionResponse resp = QueryGrpc.newBlockingStub(channel).definition(req);
        return resp == null ? null : resp.getServiceDefinition();
    }


    public Service.ServiceBinding queryServiceBinding(String serviceName, String provider) {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryBindingRequest req = QueryOuterClass.QueryBindingRequest
                .newBuilder()
                .setServiceName(serviceName)
                .setProvider(provider)
                .build();
        QueryOuterClass.QueryBindingResponse resp = QueryGrpc.newBlockingStub(channel).binding(req);
        return resp == null ? null : resp.getServiceBinding();
    }

    public List<Service.ServiceBinding> queryServiceBindings(String serviceName, Pagination.PageRequest page) {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryBindingsRequest req = QueryOuterClass.QueryBindingsRequest
                .newBuilder()
                .setServiceName(serviceName)
                .setPagination(page)
                .build();
        QueryOuterClass.QueryBindingsResponse resp = QueryGrpc.newBlockingStub(channel).bindings(req);
        return resp == null ? null : resp.getServiceBindingsList();
    }

    public void queryServiceBindings(String serviceName, Integer offset, Integer limit) {
    }

    public Service.Request queryServiceRequest(String requestID) {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryRequestRequest req = QueryOuterClass.QueryRequestRequest
                .newBuilder()
                .setRequestId(requestID)
                .build();
        QueryOuterClass.QueryRequestResponse resp = QueryGrpc.newBlockingStub(channel).request(req);
        return resp == null ? null : resp.getRequest();
    }

    public List<Service.Request> queryServiceRequests(String serviceName, String provider) {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryRequestsRequest req = QueryOuterClass.QueryRequestsRequest
                .newBuilder()
                .setServiceName(serviceName)
                .setProvider(provider)
                .build();
        QueryOuterClass.QueryRequestsResponse resp = QueryGrpc.newBlockingStub(channel).requests(req);
        return resp == null ? null : resp.getRequestsList();
    }

    public void queryServiceRequests(String serviceName, String provider, Integer offset, Integer limit) {
    }

    public List<Service.Request> queryRequestsByReqCtx(String reqCtxID, long batchCounter, Pagination.PageRequest page) {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryRequestsByReqCtxRequest req = QueryOuterClass.QueryRequestsByReqCtxRequest
                .newBuilder()
                .setRequestContextId(reqCtxID)
                .setBatchCounter(batchCounter)
                .setPagination(page)
                .build();
        QueryOuterClass.QueryRequestsByReqCtxResponse resp = QueryGrpc.newBlockingStub(channel).requestsByReqCtx(req);
        return resp == null ? null : resp.getRequestsList();
    }

    public Service.Response queryServiceResponse(String requestID) {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryResponseRequest req = QueryOuterClass.QueryResponseRequest
                .newBuilder()
                .setRequestId(requestID)
                .build();
        QueryOuterClass.QueryResponseResponse resp = QueryGrpc.newBlockingStub(channel).response(req);
        return resp == null ? null : resp.getResponse();
    }

    public List<Service.Response> queryServiceResponses(String reqCtxID, long batchCounter, Pagination.PageRequest page) {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryResponsesRequest req = QueryOuterClass.QueryResponsesRequest
                .newBuilder()
                .setRequestContextId(reqCtxID)
                .setBatchCounter(batchCounter)
                .setPagination(page)
                .build();
        QueryOuterClass.QueryResponsesResponse resp = QueryGrpc.newBlockingStub(channel).responses(req);
        return resp == null ? null : resp.getResponsesList();
    }

    public void queryServiceResponses(String reqCtxID, int batchCounter, Integer offset, Integer limit) {
    }

    public Service.RequestContext queryRequestContext(String reqCtxID) {
        Channel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryRequestContextRequest req = QueryOuterClass.QueryRequestContextRequest
                .newBuilder()
                .setRequestContextId(reqCtxID)
                .build();
        QueryOuterClass.QueryRequestContextResponse resp = QueryGrpc.newBlockingStub(channel).requestContext(req);
        return resp == null ? null : resp.getRequestContext();
    }

    // TODO use websocket
    public void subscribeRequest(String serviceName, BaseTx baseTx) {
        Account account = baseClient.queryAccount(baseTx);

        EventQueryBuilder builder = new EventQueryBuilder()
                .AddCondition(Condition.newCond("new_batch_request_provider", "service_name").eq(serviceName))
                .AddCondition(Condition.newCond("new_batch_request_provider", "provider").eq(account.getAddress()))
                .AddCondition(Condition.newCond("tm", "event").eq("NewBlock"));

    }

    public void subscribeResponse() {
    }
}
