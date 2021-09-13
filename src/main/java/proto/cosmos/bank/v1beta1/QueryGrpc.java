package proto.cosmos.bank.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: cosmos/bank/v1beta1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "cosmos.bank.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryBalanceRequest,
      QueryOuterClass.QueryBalanceResponse> getBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Balance",
      requestType = QueryOuterClass.QueryBalanceRequest.class,
      responseType = QueryOuterClass.QueryBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryBalanceRequest,
      QueryOuterClass.QueryBalanceResponse> getBalanceMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryBalanceRequest, QueryOuterClass.QueryBalanceResponse> getBalanceMethod;
    if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
          QueryGrpc.getBalanceMethod = getBalanceMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryBalanceRequest, QueryOuterClass.QueryBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Balance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Balance"))
              .build();
        }
      }
    }
    return getBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryAllBalancesRequest,
      QueryOuterClass.QueryAllBalancesResponse> getAllBalancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllBalances",
      requestType = QueryOuterClass.QueryAllBalancesRequest.class,
      responseType = QueryOuterClass.QueryAllBalancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryAllBalancesRequest,
      QueryOuterClass.QueryAllBalancesResponse> getAllBalancesMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryAllBalancesRequest, QueryOuterClass.QueryAllBalancesResponse> getAllBalancesMethod;
    if ((getAllBalancesMethod = QueryGrpc.getAllBalancesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllBalancesMethod = QueryGrpc.getAllBalancesMethod) == null) {
          QueryGrpc.getAllBalancesMethod = getAllBalancesMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryAllBalancesRequest, QueryOuterClass.QueryAllBalancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllBalances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryAllBalancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryAllBalancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllBalances"))
              .build();
        }
      }
    }
    return getAllBalancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryTotalSupplyRequest,
      QueryOuterClass.QueryTotalSupplyResponse> getTotalSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalSupply",
      requestType = QueryOuterClass.QueryTotalSupplyRequest.class,
      responseType = QueryOuterClass.QueryTotalSupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryTotalSupplyRequest,
      QueryOuterClass.QueryTotalSupplyResponse> getTotalSupplyMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryTotalSupplyRequest, QueryOuterClass.QueryTotalSupplyResponse> getTotalSupplyMethod;
    if ((getTotalSupplyMethod = QueryGrpc.getTotalSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalSupplyMethod = QueryGrpc.getTotalSupplyMethod) == null) {
          QueryGrpc.getTotalSupplyMethod = getTotalSupplyMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryTotalSupplyRequest, QueryOuterClass.QueryTotalSupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalSupply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryTotalSupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryTotalSupplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalSupply"))
              .build();
        }
      }
    }
    return getTotalSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QuerySupplyOfRequest,
      QueryOuterClass.QuerySupplyOfResponse> getSupplyOfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SupplyOf",
      requestType = QueryOuterClass.QuerySupplyOfRequest.class,
      responseType = QueryOuterClass.QuerySupplyOfResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QuerySupplyOfRequest,
      QueryOuterClass.QuerySupplyOfResponse> getSupplyOfMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QuerySupplyOfRequest, QueryOuterClass.QuerySupplyOfResponse> getSupplyOfMethod;
    if ((getSupplyOfMethod = QueryGrpc.getSupplyOfMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSupplyOfMethod = QueryGrpc.getSupplyOfMethod) == null) {
          QueryGrpc.getSupplyOfMethod = getSupplyOfMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QuerySupplyOfRequest, QueryOuterClass.QuerySupplyOfResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SupplyOf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QuerySupplyOfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QuerySupplyOfResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SupplyOf"))
              .build();
        }
      }
    }
    return getSupplyOfMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryParamsRequest,
      QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = QueryOuterClass.QueryParamsRequest.class,
      responseType = QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryParamsRequest,
      QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
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
    public void balance(QueryOuterClass.QueryBalanceRequest request,
                        io.grpc.stub.StreamObserver<QueryOuterClass.QueryBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllBalances queries the balance of all coins for a single account.
     * </pre>
     */
    public void allBalances(QueryOuterClass.QueryAllBalancesRequest request,
                            io.grpc.stub.StreamObserver<QueryOuterClass.QueryAllBalancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllBalancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * TotalSupply queries the total supply of all coins.
     * </pre>
     */
    public void totalSupply(QueryOuterClass.QueryTotalSupplyRequest request,
                            io.grpc.stub.StreamObserver<QueryOuterClass.QueryTotalSupplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalSupplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * SupplyOf queries the supply of a single coin.
     * </pre>
     */
    public void supplyOf(QueryOuterClass.QuerySupplyOfRequest request,
                         io.grpc.stub.StreamObserver<QueryOuterClass.QuerySupplyOfResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSupplyOfMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries the parameters of x/bank module.
     * </pre>
     */
    public void params(QueryOuterClass.QueryParamsRequest request,
                       io.grpc.stub.StreamObserver<QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryBalanceRequest,
                QueryOuterClass.QueryBalanceResponse>(
                  this, METHODID_BALANCE)))
          .addMethod(
            getAllBalancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryAllBalancesRequest,
                QueryOuterClass.QueryAllBalancesResponse>(
                  this, METHODID_ALL_BALANCES)))
          .addMethod(
            getTotalSupplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryTotalSupplyRequest,
                QueryOuterClass.QueryTotalSupplyResponse>(
                  this, METHODID_TOTAL_SUPPLY)))
          .addMethod(
            getSupplyOfMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QuerySupplyOfRequest,
                QueryOuterClass.QuerySupplyOfResponse>(
                  this, METHODID_SUPPLY_OF)))
          .addMethod(
            getParamsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryParamsRequest,
                QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryStub extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Balance queries the balance of a single coin for a single account.
     * </pre>
     */
    public void balance(QueryOuterClass.QueryBalanceRequest request,
                        io.grpc.stub.StreamObserver<QueryOuterClass.QueryBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllBalances queries the balance of all coins for a single account.
     * </pre>
     */
    public void allBalances(QueryOuterClass.QueryAllBalancesRequest request,
                            io.grpc.stub.StreamObserver<QueryOuterClass.QueryAllBalancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllBalancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TotalSupply queries the total supply of all coins.
     * </pre>
     */
    public void totalSupply(QueryOuterClass.QueryTotalSupplyRequest request,
                            io.grpc.stub.StreamObserver<QueryOuterClass.QueryTotalSupplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SupplyOf queries the supply of a single coin.
     * </pre>
     */
    public void supplyOf(QueryOuterClass.QuerySupplyOfRequest request,
                         io.grpc.stub.StreamObserver<QueryOuterClass.QuerySupplyOfResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSupplyOfMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries the parameters of x/bank module.
     * </pre>
     */
    public void params(QueryOuterClass.QueryParamsRequest request,
                       io.grpc.stub.StreamObserver<QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryBlockingStub extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Balance queries the balance of a single coin for a single account.
     * </pre>
     */
    public QueryOuterClass.QueryBalanceResponse balance(QueryOuterClass.QueryBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllBalances queries the balance of all coins for a single account.
     * </pre>
     */
    public QueryOuterClass.QueryAllBalancesResponse allBalances(QueryOuterClass.QueryAllBalancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllBalancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TotalSupply queries the total supply of all coins.
     * </pre>
     */
    public QueryOuterClass.QueryTotalSupplyResponse totalSupply(QueryOuterClass.QueryTotalSupplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalSupplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SupplyOf queries the supply of a single coin.
     * </pre>
     */
    public QueryOuterClass.QuerySupplyOfResponse supplyOf(QueryOuterClass.QuerySupplyOfRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSupplyOfMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries the parameters of x/bank module.
     * </pre>
     */
    public QueryOuterClass.QueryParamsResponse params(QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryFutureStub extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Balance queries the balance of a single coin for a single account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryBalanceResponse> balance(
        QueryOuterClass.QueryBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllBalances queries the balance of all coins for a single account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryAllBalancesResponse> allBalances(
        QueryOuterClass.QueryAllBalancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllBalancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TotalSupply queries the total supply of all coins.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryTotalSupplyResponse> totalSupply(
        QueryOuterClass.QueryTotalSupplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalSupplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SupplyOf queries the supply of a single coin.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QuerySupplyOfResponse> supplyOf(
        QueryOuterClass.QuerySupplyOfRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSupplyOfMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries the parameters of x/bank module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryParamsResponse> params(
        QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BALANCE:
          serviceImpl.balance((QueryOuterClass.QueryBalanceRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryBalanceResponse>) responseObserver);
          break;
        case METHODID_ALL_BALANCES:
          serviceImpl.allBalances((QueryOuterClass.QueryAllBalancesRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryAllBalancesResponse>) responseObserver);
          break;
        case METHODID_TOTAL_SUPPLY:
          serviceImpl.totalSupply((QueryOuterClass.QueryTotalSupplyRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryTotalSupplyResponse>) responseObserver);
          break;
        case METHODID_SUPPLY_OF:
          serviceImpl.supplyOf((QueryOuterClass.QuerySupplyOfRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QuerySupplyOfResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
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

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return QueryOuterClass.getDescriptor();
    }

    @Override
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

    @Override
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
