package proto.cosmos.bank.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: cosmos/bank/v1beta1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "cosmos.bank.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest,
      proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse> getBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Balance",
      requestType = proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest.class,
      responseType = proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest,
      proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse> getBalanceMethod() {
    io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest, proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse> getBalanceMethod;
    if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
          QueryGrpc.getBalanceMethod = getBalanceMethod = 
              io.grpc.MethodDescriptor.<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest, proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.bank.v1beta1.Query", "Balance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Balance"))
                  .build();
          }
        }
     }
     return getBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest,
      proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse> getAllBalancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllBalances",
      requestType = proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest.class,
      responseType = proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest,
      proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse> getAllBalancesMethod() {
    io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest, proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse> getAllBalancesMethod;
    if ((getAllBalancesMethod = QueryGrpc.getAllBalancesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllBalancesMethod = QueryGrpc.getAllBalancesMethod) == null) {
          QueryGrpc.getAllBalancesMethod = getAllBalancesMethod = 
              io.grpc.MethodDescriptor.<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest, proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.bank.v1beta1.Query", "AllBalances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllBalances"))
                  .build();
          }
        }
     }
     return getAllBalancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest,
      proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse> getTotalSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalSupply",
      requestType = proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest.class,
      responseType = proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest,
      proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse> getTotalSupplyMethod() {
    io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest, proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse> getTotalSupplyMethod;
    if ((getTotalSupplyMethod = QueryGrpc.getTotalSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalSupplyMethod = QueryGrpc.getTotalSupplyMethod) == null) {
          QueryGrpc.getTotalSupplyMethod = getTotalSupplyMethod = 
              io.grpc.MethodDescriptor.<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest, proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.bank.v1beta1.Query", "TotalSupply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalSupply"))
                  .build();
          }
        }
     }
     return getTotalSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest,
      proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse> getSupplyOfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SupplyOf",
      requestType = proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest.class,
      responseType = proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest,
      proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse> getSupplyOfMethod() {
    io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest, proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse> getSupplyOfMethod;
    if ((getSupplyOfMethod = QueryGrpc.getSupplyOfMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSupplyOfMethod = QueryGrpc.getSupplyOfMethod) == null) {
          QueryGrpc.getSupplyOfMethod = getSupplyOfMethod = 
              io.grpc.MethodDescriptor.<proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest, proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.bank.v1beta1.Query", "SupplyOf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SupplyOf"))
                  .build();
          }
        }
     }
     return getSupplyOfMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest,
      proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest.class,
      responseType = proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest,
      proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest, proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod = 
              io.grpc.MethodDescriptor.<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest, proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.bank.v1beta1.Query", "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
                  .build();
          }
        }
     }
     return getParamsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    return new QueryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QueryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QueryFutureStub(channel);
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Balance queries the balance of a single coin for a single account.
     * </pre>
     */
    public void balance(proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest request,
        io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllBalances queries the balance of all coins for a single account.
     * </pre>
     */
    public void allBalances(proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest request,
        io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllBalancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * TotalSupply queries the total supply of all coins.
     * </pre>
     */
    public void totalSupply(proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest request,
        io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTotalSupplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * SupplyOf queries the supply of a single coin.
     * </pre>
     */
    public void supplyOf(proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest request,
        io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSupplyOfMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries the parameters of x/bank module.
     * </pre>
     */
    public void params(proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest,
                proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse>(
                  this, METHODID_BALANCE)))
          .addMethod(
            getAllBalancesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest,
                proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse>(
                  this, METHODID_ALL_BALANCES)))
          .addMethod(
            getTotalSupplyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest,
                proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse>(
                  this, METHODID_TOTAL_SUPPLY)))
          .addMethod(
            getSupplyOfMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest,
                proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse>(
                  this, METHODID_SUPPLY_OF)))
          .addMethod(
            getParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest,
                proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryStub extends io.grpc.stub.AbstractStub<QueryStub> {
    private QueryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Balance queries the balance of a single coin for a single account.
     * </pre>
     */
    public void balance(proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest request,
        io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllBalances queries the balance of all coins for a single account.
     * </pre>
     */
    public void allBalances(proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest request,
        io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllBalancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TotalSupply queries the total supply of all coins.
     * </pre>
     */
    public void totalSupply(proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest request,
        io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTotalSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SupplyOf queries the supply of a single coin.
     * </pre>
     */
    public void supplyOf(proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest request,
        io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSupplyOfMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries the parameters of x/bank module.
     * </pre>
     */
    public void params(proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryBlockingStub extends io.grpc.stub.AbstractStub<QueryBlockingStub> {
    private QueryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Balance queries the balance of a single coin for a single account.
     * </pre>
     */
    public proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse balance(proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllBalances queries the balance of all coins for a single account.
     * </pre>
     */
    public proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse allBalances(proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllBalancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TotalSupply queries the total supply of all coins.
     * </pre>
     */
    public proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse totalSupply(proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest request) {
      return blockingUnaryCall(
          getChannel(), getTotalSupplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SupplyOf queries the supply of a single coin.
     * </pre>
     */
    public proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse supplyOf(proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest request) {
      return blockingUnaryCall(
          getChannel(), getSupplyOfMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries the parameters of x/bank module.
     * </pre>
     */
    public proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse params(proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryFutureStub extends io.grpc.stub.AbstractStub<QueryFutureStub> {
    private QueryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Balance queries the balance of a single coin for a single account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse> balance(
        proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllBalances queries the balance of all coins for a single account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse> allBalances(
        proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllBalancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TotalSupply queries the total supply of all coins.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse> totalSupply(
        proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTotalSupplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SupplyOf queries the supply of a single coin.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse> supplyOf(
        proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSupplyOfMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries the parameters of x/bank module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse> params(
        proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BALANCE = 0;
  private static final int METHODID_ALL_BALANCES = 1;
  private static final int METHODID_TOTAL_SUPPLY = 2;
  private static final int METHODID_SUPPLY_OF = 3;
  private static final int METHODID_PARAMS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BALANCE:
          serviceImpl.balance((proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest) request,
              (io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse>) responseObserver);
          break;
        case METHODID_ALL_BALANCES:
          serviceImpl.allBalances((proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest) request,
              (io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse>) responseObserver);
          break;
        case METHODID_TOTAL_SUPPLY:
          serviceImpl.totalSupply((proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest) request,
              (io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse>) responseObserver);
          break;
        case METHODID_SUPPLY_OF:
          serviceImpl.supplyOf((proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest) request,
              (io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.cosmos.bank.v1beta1.QueryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getBalanceMethod())
              .addMethod(getAllBalancesMethod())
              .addMethod(getTotalSupplyMethod())
              .addMethod(getSupplyOfMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
