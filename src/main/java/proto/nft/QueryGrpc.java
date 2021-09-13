package proto.nft;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for NFT module
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: nft/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "irismod.nft.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QuerySupplyRequest,
      QueryOuterClass.QuerySupplyResponse> getSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Supply",
      requestType = QueryOuterClass.QuerySupplyRequest.class,
      responseType = QueryOuterClass.QuerySupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QuerySupplyRequest,
      QueryOuterClass.QuerySupplyResponse> getSupplyMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QuerySupplyRequest, QueryOuterClass.QuerySupplyResponse> getSupplyMethod;
    if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
          QueryGrpc.getSupplyMethod = getSupplyMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QuerySupplyRequest, QueryOuterClass.QuerySupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Supply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QuerySupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QuerySupplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Supply"))
              .build();
        }
      }
    }
    return getSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryOwnerRequest,
      QueryOuterClass.QueryOwnerResponse> getOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Owner",
      requestType = QueryOuterClass.QueryOwnerRequest.class,
      responseType = QueryOuterClass.QueryOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryOwnerRequest,
      QueryOuterClass.QueryOwnerResponse> getOwnerMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryOwnerRequest, QueryOuterClass.QueryOwnerResponse> getOwnerMethod;
    if ((getOwnerMethod = QueryGrpc.getOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOwnerMethod = QueryGrpc.getOwnerMethod) == null) {
          QueryGrpc.getOwnerMethod = getOwnerMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryOwnerRequest, QueryOuterClass.QueryOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Owner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Owner"))
              .build();
        }
      }
    }
    return getOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryCollectionRequest,
      QueryOuterClass.QueryCollectionResponse> getCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Collection",
      requestType = QueryOuterClass.QueryCollectionRequest.class,
      responseType = QueryOuterClass.QueryCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryCollectionRequest,
      QueryOuterClass.QueryCollectionResponse> getCollectionMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryCollectionRequest, QueryOuterClass.QueryCollectionResponse> getCollectionMethod;
    if ((getCollectionMethod = QueryGrpc.getCollectionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCollectionMethod = QueryGrpc.getCollectionMethod) == null) {
          QueryGrpc.getCollectionMethod = getCollectionMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryCollectionRequest, QueryOuterClass.QueryCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Collection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Collection"))
              .build();
        }
      }
    }
    return getCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryDenomRequest,
      QueryOuterClass.QueryDenomResponse> getDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Denom",
      requestType = QueryOuterClass.QueryDenomRequest.class,
      responseType = QueryOuterClass.QueryDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryDenomRequest,
      QueryOuterClass.QueryDenomResponse> getDenomMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryDenomRequest, QueryOuterClass.QueryDenomResponse> getDenomMethod;
    if ((getDenomMethod = QueryGrpc.getDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomMethod = QueryGrpc.getDenomMethod) == null) {
          QueryGrpc.getDenomMethod = getDenomMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryDenomRequest, QueryOuterClass.QueryDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Denom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Denom"))
              .build();
        }
      }
    }
    return getDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryDenomsRequest,
      QueryOuterClass.QueryDenomsResponse> getDenomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Denoms",
      requestType = QueryOuterClass.QueryDenomsRequest.class,
      responseType = QueryOuterClass.QueryDenomsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryDenomsRequest,
      QueryOuterClass.QueryDenomsResponse> getDenomsMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryDenomsRequest, QueryOuterClass.QueryDenomsResponse> getDenomsMethod;
    if ((getDenomsMethod = QueryGrpc.getDenomsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomsMethod = QueryGrpc.getDenomsMethod) == null) {
          QueryGrpc.getDenomsMethod = getDenomsMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryDenomsRequest, QueryOuterClass.QueryDenomsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Denoms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryDenomsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryDenomsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Denoms"))
              .build();
        }
      }
    }
    return getDenomsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryNFTRequest,
      QueryOuterClass.QueryNFTResponse> getNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NFT",
      requestType = QueryOuterClass.QueryNFTRequest.class,
      responseType = QueryOuterClass.QueryNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryNFTRequest,
      QueryOuterClass.QueryNFTResponse> getNFTMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryNFTRequest, QueryOuterClass.QueryNFTResponse> getNFTMethod;
    if ((getNFTMethod = QueryGrpc.getNFTMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNFTMethod = QueryGrpc.getNFTMethod) == null) {
          QueryGrpc.getNFTMethod = getNFTMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryNFTRequest, QueryOuterClass.QueryNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryNFTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NFT"))
              .build();
        }
      }
    }
    return getNFTMethod;
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
   * Query defines the gRPC querier service for NFT module
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Supply queries the total supply of a given denom or owner
     * </pre>
     */
    public void supply(QueryOuterClass.QuerySupplyRequest request,
                       io.grpc.stub.StreamObserver<QueryOuterClass.QuerySupplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSupplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Owner queries the NFTs of the specified owner
     * </pre>
     */
    public void owner(QueryOuterClass.QueryOwnerRequest request,
                      io.grpc.stub.StreamObserver<QueryOuterClass.QueryOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Collection queries the NFTs of the specified denom
     * </pre>
     */
    public void collection(QueryOuterClass.QueryCollectionRequest request,
                           io.grpc.stub.StreamObserver<QueryOuterClass.QueryCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCollectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Denom queries the definition of a given denom
     * </pre>
     */
    public void denom(QueryOuterClass.QueryDenomRequest request,
                      io.grpc.stub.StreamObserver<QueryOuterClass.QueryDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Denoms queries all the denoms
     * </pre>
     */
    public void denoms(QueryOuterClass.QueryDenomsRequest request,
                       io.grpc.stub.StreamObserver<QueryOuterClass.QueryDenomsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomsMethod(), responseObserver);
    }

    /**
     * <pre>
     * NFT queries the NFT for the given denom and token ID
     * </pre>
     */
    public void nFT(QueryOuterClass.QueryNFTRequest request,
                    io.grpc.stub.StreamObserver<QueryOuterClass.QueryNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNFTMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSupplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QuerySupplyRequest,
                QueryOuterClass.QuerySupplyResponse>(
                  this, METHODID_SUPPLY)))
          .addMethod(
            getOwnerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryOwnerRequest,
                QueryOuterClass.QueryOwnerResponse>(
                  this, METHODID_OWNER)))
          .addMethod(
            getCollectionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryCollectionRequest,
                QueryOuterClass.QueryCollectionResponse>(
                  this, METHODID_COLLECTION)))
          .addMethod(
            getDenomMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryDenomRequest,
                QueryOuterClass.QueryDenomResponse>(
                  this, METHODID_DENOM)))
          .addMethod(
            getDenomsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryDenomsRequest,
                QueryOuterClass.QueryDenomsResponse>(
                  this, METHODID_DENOMS)))
          .addMethod(
            getNFTMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryNFTRequest,
                QueryOuterClass.QueryNFTResponse>(
                  this, METHODID_NFT)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for NFT module
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
     * Supply queries the total supply of a given denom or owner
     * </pre>
     */
    public void supply(QueryOuterClass.QuerySupplyRequest request,
                       io.grpc.stub.StreamObserver<QueryOuterClass.QuerySupplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Owner queries the NFTs of the specified owner
     * </pre>
     */
    public void owner(QueryOuterClass.QueryOwnerRequest request,
                      io.grpc.stub.StreamObserver<QueryOuterClass.QueryOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Collection queries the NFTs of the specified denom
     * </pre>
     */
    public void collection(QueryOuterClass.QueryCollectionRequest request,
                           io.grpc.stub.StreamObserver<QueryOuterClass.QueryCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Denom queries the definition of a given denom
     * </pre>
     */
    public void denom(QueryOuterClass.QueryDenomRequest request,
                      io.grpc.stub.StreamObserver<QueryOuterClass.QueryDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Denoms queries all the denoms
     * </pre>
     */
    public void denoms(QueryOuterClass.QueryDenomsRequest request,
                       io.grpc.stub.StreamObserver<QueryOuterClass.QueryDenomsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NFT queries the NFT for the given denom and token ID
     * </pre>
     */
    public void nFT(QueryOuterClass.QueryNFTRequest request,
                    io.grpc.stub.StreamObserver<QueryOuterClass.QueryNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNFTMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for NFT module
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
     * Supply queries the total supply of a given denom or owner
     * </pre>
     */
    public QueryOuterClass.QuerySupplyResponse supply(QueryOuterClass.QuerySupplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSupplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Owner queries the NFTs of the specified owner
     * </pre>
     */
    public QueryOuterClass.QueryOwnerResponse owner(QueryOuterClass.QueryOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Collection queries the NFTs of the specified denom
     * </pre>
     */
    public QueryOuterClass.QueryCollectionResponse collection(QueryOuterClass.QueryCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCollectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Denom queries the definition of a given denom
     * </pre>
     */
    public QueryOuterClass.QueryDenomResponse denom(QueryOuterClass.QueryDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Denoms queries all the denoms
     * </pre>
     */
    public QueryOuterClass.QueryDenomsResponse denoms(QueryOuterClass.QueryDenomsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NFT queries the NFT for the given denom and token ID
     * </pre>
     */
    public QueryOuterClass.QueryNFTResponse nFT(QueryOuterClass.QueryNFTRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNFTMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for NFT module
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
     * Supply queries the total supply of a given denom or owner
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QuerySupplyResponse> supply(
        QueryOuterClass.QuerySupplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Owner queries the NFTs of the specified owner
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryOwnerResponse> owner(
        QueryOuterClass.QueryOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Collection queries the NFTs of the specified denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryCollectionResponse> collection(
        QueryOuterClass.QueryCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCollectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Denom queries the definition of a given denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryDenomResponse> denom(
        QueryOuterClass.QueryDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Denoms queries all the denoms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryDenomsResponse> denoms(
        QueryOuterClass.QueryDenomsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NFT queries the NFT for the given denom and token ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryNFTResponse> nFT(
        QueryOuterClass.QueryNFTRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNFTMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUPPLY = 0;
  private static final int METHODID_OWNER = 1;
  private static final int METHODID_COLLECTION = 2;
  private static final int METHODID_DENOM = 3;
  private static final int METHODID_DENOMS = 4;
  private static final int METHODID_NFT = 5;

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
        case METHODID_SUPPLY:
          serviceImpl.supply((QueryOuterClass.QuerySupplyRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QuerySupplyResponse>) responseObserver);
          break;
        case METHODID_OWNER:
          serviceImpl.owner((QueryOuterClass.QueryOwnerRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryOwnerResponse>) responseObserver);
          break;
        case METHODID_COLLECTION:
          serviceImpl.collection((QueryOuterClass.QueryCollectionRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryCollectionResponse>) responseObserver);
          break;
        case METHODID_DENOM:
          serviceImpl.denom((QueryOuterClass.QueryDenomRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryDenomResponse>) responseObserver);
          break;
        case METHODID_DENOMS:
          serviceImpl.denoms((QueryOuterClass.QueryDenomsRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryDenomsResponse>) responseObserver);
          break;
        case METHODID_NFT:
          serviceImpl.nFT((QueryOuterClass.QueryNFTRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryNFTResponse>) responseObserver);
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
              .addMethod(getSupplyMethod())
              .addMethod(getOwnerMethod())
              .addMethod(getCollectionMethod())
              .addMethod(getDenomMethod())
              .addMethod(getDenomsMethod())
              .addMethod(getNFTMethod())
              .build();
        }
      }
    }
    return result;
  }
}
