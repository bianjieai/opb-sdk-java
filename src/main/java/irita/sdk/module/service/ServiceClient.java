package irita.sdk.module.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.protobuf.GeneratedMessageV3;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import irita.sdk.client.BaseClient;
import irita.sdk.client.ListenChainUtil;
import irita.sdk.constant.AttributeKey;
import irita.sdk.constant.EventType;
import irita.sdk.constant.enums.EventEnum;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.function.InvokeCallback;
import irita.sdk.function.RespondCallback;
import irita.sdk.model.*;
import irita.sdk.model.tx.Condition;
import irita.sdk.model.tx.EventQueryBuilder;
import irita.sdk.util.AddressUtils;
import irita.sdk.util.JsonUtils;
import irita.sdk.util.LogUtils;
import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.util.encoders.Hex;
import proto.cosmos.base.query.v1beta1.Pagination;
import proto.cosmos.base.v1beta1.CoinOuterClass;
import proto.service.QueryGrpc;
import proto.service.QueryOuterClass;
import proto.service.Service;
import proto.service.Tx;

import java.io.IOException;
import java.util.*;

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

    // when callback != null, will subscribeServiceResponse
    public CallServiceResp callService(CallServiceRequest req, BaseTx baseTx, InvokeCallback callback) throws IOException {
        CallServiceResp resp = callService(req, baseTx);
        if (callback != null) {
            subscribeServiceResponse(resp.getReqCtxId(), callback);
        }
        return resp;
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
        ManagedChannel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryDefinitionRequest req = QueryOuterClass.QueryDefinitionRequest
                .newBuilder()
                .setServiceName(serviceName)
                .build();
        QueryOuterClass.QueryDefinitionResponse resp = QueryGrpc.newBlockingStub(channel).definition(req);
        channel.shutdown();
        return resp == null ? null : resp.getServiceDefinition();
    }


    public Service.ServiceBinding queryServiceBinding(String serviceName, String provider) {
        ManagedChannel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryBindingRequest req = QueryOuterClass.QueryBindingRequest
                .newBuilder()
                .setServiceName(serviceName)
                .setProvider(provider)
                .build();
        QueryOuterClass.QueryBindingResponse resp = QueryGrpc.newBlockingStub(channel).binding(req);
        channel.shutdown();
        return resp == null ? null : resp.getServiceBinding();
    }

    public List<Service.ServiceBinding> queryServiceBindings(String serviceName, Pagination.PageRequest page) {
        ManagedChannel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryBindingsRequest req = QueryOuterClass.QueryBindingsRequest
                .newBuilder()
                .setServiceName(serviceName)
                .setPagination(page)
                .build();
        QueryOuterClass.QueryBindingsResponse resp = QueryGrpc.newBlockingStub(channel).bindings(req);
        channel.shutdown();
        return resp == null ? null : resp.getServiceBindingsList();
    }

    public Service.Request queryServiceRequest(String requestID) {
        ManagedChannel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryRequestRequest req = QueryOuterClass.QueryRequestRequest
                .newBuilder()
                .setRequestId(requestID)
                .build();
        QueryOuterClass.QueryRequestResponse resp = QueryGrpc.newBlockingStub(channel).request(req);
        channel.shutdown();
        return resp == null ? null : resp.getRequest();
    }

    public List<Service.Request> queryServiceRequests(String serviceName, String provider) {
        ManagedChannel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryRequestsRequest req = QueryOuterClass.QueryRequestsRequest
                .newBuilder()
                .setServiceName(serviceName)
                .setProvider(provider)
                .build();
        QueryOuterClass.QueryRequestsResponse resp = QueryGrpc.newBlockingStub(channel).requests(req);
        channel.shutdown();
        return resp == null ? null : resp.getRequestsList();
    }

    public List<Service.Request> queryRequestsByReqCtx(String reqCtxID, long batchCounter, Pagination.PageRequest page) {
        ManagedChannel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryRequestsByReqCtxRequest req = QueryOuterClass.QueryRequestsByReqCtxRequest
                .newBuilder()
                .setRequestContextId(reqCtxID)
                .setBatchCounter(batchCounter)
                .setPagination(page)
                .build();
        QueryOuterClass.QueryRequestsByReqCtxResponse resp = QueryGrpc.newBlockingStub(channel).requestsByReqCtx(req);
        channel.shutdown();
        return resp == null ? null : resp.getRequestsList();
    }

    public Service.Response queryServiceResponse(String requestID) {
        ManagedChannel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryResponseRequest req = QueryOuterClass.QueryResponseRequest
                .newBuilder()
                .setRequestId(requestID)
                .build();
        QueryOuterClass.QueryResponseResponse resp = QueryGrpc.newBlockingStub(channel).response(req);
        channel.shutdown();
        return resp == null ? null : resp.getResponse();
    }

    public List<Service.Response> queryServiceResponses(String reqCtxID, long batchCounter, Pagination.PageRequest page) {
        ManagedChannel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryResponsesRequest req = QueryOuterClass.QueryResponsesRequest
                .newBuilder()
                .setRequestContextId(reqCtxID)
                .setBatchCounter(batchCounter)
                .setPagination(page)
                .build();
        QueryOuterClass.QueryResponsesResponse resp = QueryGrpc.newBlockingStub(channel).responses(req);
        channel.shutdown();
        return resp == null ? null : resp.getResponsesList();
    }

    public Service.RequestContext queryRequestContext(String reqCtxID) {
        ManagedChannel channel = baseClient.getGrpcClient();
        QueryOuterClass.QueryRequestContextRequest req = QueryOuterClass.QueryRequestContextRequest
                .newBuilder()
                .setRequestContextId(reqCtxID)
                .build();
        QueryOuterClass.QueryRequestContextResponse resp = QueryGrpc.newBlockingStub(channel).requestContext(req);
        channel.shutdown();
        return resp == null ? null : resp.getRequestContext();
    }

    public void subscribeServiceRequest(String serviceName, RespondCallback callback, BaseTx baseTx) {
        Account account = baseClient.queryAccount(baseTx);
        EventQueryBuilder builder = new EventQueryBuilder()
                .AddCondition(Condition.newCond(EventType.NEW_BATCH_REQUEST_PROVIDER, AttributeKey.SERVICE_NAME).eq(serviceName))
                .AddCondition(Condition.newCond(EventType.NEW_BATCH_REQUEST_PROVIDER, AttributeKey.PROVIDER).eq(account.getAddress()));

        baseClient.getRpcClient().subscribeNewBlock(builder, block -> {
            List<Events> events = ListenChainUtil.decodeEvent(block);
            List<GeneratedMessageV3> msgs = genServiceRespondMsgs(events, serviceName, account.getAddress(), callback);
            if (msgs == null || msgs.size() == 0) {
                return;
            }

            Account accountRefresh = baseClient.queryAccount(baseTx);
            ResultTx resultTx = baseClient.buildAndSend(msgs, baseTx, accountRefresh);
            LogUtils.info("provider respond, tx_hash:" + resultTx.getResult().getHash());
        });
    }

    private List<GeneratedMessageV3> genServiceRespondMsgs(List<Events> events, String serviceName, String provider, RespondCallback callback) {
        List<String> reqIds = new ArrayList<>();
        for (Events event : events) {
            if (EventType.NEW_BATCH_REQUEST_PROVIDER.equals(event.getType())) {
                List<Attributes> attributes = event.getAttributes();
                String svcName = attributes.stream().filter(a -> AttributeKey.SERVICE_NAME.equals(a.getKey())).map(Attributes::getValue).findAny().orElse("");
                String prov = attributes.stream().filter(a -> AttributeKey.PROVIDER.equals(a.getKey())).map(Attributes::getValue).findAny().orElse("");

                if (serviceName.equals(svcName) && provider.equals(prov)) {
                    String reqIDsStr = event.getAttributes().stream().filter(e -> e.getKey().equals(AttributeKey.REQUESTS)).map(Attributes::getValue).findAny().orElse("");
                    if (StringUtils.isEmpty(reqIDsStr)) {
                        return null;
                    }

                    try {
                        reqIds.addAll(JsonUtils.readValue(reqIDsStr, new TypeReference<List<String>>() {
                        }));
                    } catch (IOException e) {
                        throw new IritaSDKException(e.getMessage());
                    }
                }
            }
        }

        List<GeneratedMessageV3> msgs = new ArrayList<>();
        for (String reqId : reqIds) {
            Service.Request request = queryServiceRequest(reqId);
            // checkAgain
            if (serviceName.equals(request.getServiceName()) && provider.equals(request.getProvider())) {
                ServiceResponseInfo m = callback.apply(request.getRequestContextId(), request.getId(), request.getInput());
                Tx.MsgRespondService msg = Tx.MsgRespondService.newBuilder()
                        .setRequestId(request.getId())
                        .setProvider(provider)
                        .setOutput(m.getOutput())
                        .setResult(m.getResult())
                        .build();

                msgs.add(msg);
            }
        }
        return msgs;
    }

    public void subscribeServiceResponse(String reqCtxID, InvokeCallback callback) {
        if (StringUtils.isEmpty(reqCtxID)) {
            throw new IritaSDKException("reqCtxID should not be empty");
        }

        EventQueryBuilder builder = new EventQueryBuilder()
                .AddCondition(Condition.newCond(EventType.RESPONSE_SERVICE, AttributeKey.REQUEST_CONTEXT_ID).eq(reqCtxID));

        baseClient.getRpcClient().subscribeTx(builder, tx -> {
            irita.sdk.model.ws.tx.Events events = tx.getResult().getEvents();
            LogUtils.info(String.format("consumer received response transaction sent by provider, tx_hash:%s, height: %s, reqCtxId: %s"
                    , events.getTxHash(), events.getTxHeight(), reqCtxID));

            List<Tx.MsgRespondService> msgs = ListenChainUtil.getResponseMsgsFromTx(tx);
            for (Tx.MsgRespondService msg : msgs) {
                String reqCtxID2 = splitRequestID(msg.getRequestId());
                if (reqCtxID2.equals(reqCtxID)) {
                    callback.accept(reqCtxID, msg.getRequestId(), msg.getOutput());
                }
            }
        });
    }

    private String splitRequestID(String requestId) {
        byte[] hexBytes = Hex.decode(requestId);
        final int requestIDLen = 58;
        if (hexBytes.length != requestIDLen) {
            throw new IritaSDKException("invalid request id");
        }

        byte[] dest = new byte[40];
        System.arraycopy(hexBytes, 0, dest, 0, dest.length);
        return Hex.toHexString(dest).toUpperCase(Locale.ROOT);
    }
}
