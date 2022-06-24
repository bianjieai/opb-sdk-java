package proto.nft;

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
 * Query defines the gRPC querier service for NFT module
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: nft/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "irismod.nft.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QuerySupplyRequest,
      proto.nft.QueryOuterClass.QuerySupplyResponse> getSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Supply",
      requestType = proto.nft.QueryOuterClass.QuerySupplyRequest.class,
      responseType = proto.nft.QueryOuterClass.QuerySupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QuerySupplyRequest,
      proto.nft.QueryOuterClass.QuerySupplyResponse> getSupplyMethod() {
    io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QuerySupplyRequest, proto.nft.QueryOuterClass.QuerySupplyResponse> getSupplyMethod;
    if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
          QueryGrpc.getSupplyMethod = getSupplyMethod = 
              io.grpc.MethodDescriptor.<proto.nft.QueryOuterClass.QuerySupplyRequest, proto.nft.QueryOuterClass.QuerySupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.nft.Query", "Supply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.nft.QueryOuterClass.QuerySupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.nft.QueryOuterClass.QuerySupplyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Supply"))
                  .build();
          }
        }
     }
     return getSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QueryOwnerRequest,
      proto.nft.QueryOuterClass.QueryOwnerResponse> getOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Owner",
      requestType = proto.nft.QueryOuterClass.QueryOwnerRequest.class,
      responseType = proto.nft.QueryOuterClass.QueryOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QueryOwnerRequest,
      proto.nft.QueryOuterClass.QueryOwnerResponse> getOwnerMethod() {
    io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QueryOwnerRequest, proto.nft.QueryOuterClass.QueryOwnerResponse> getOwnerMethod;
    if ((getOwnerMethod = QueryGrpc.getOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOwnerMethod = QueryGrpc.getOwnerMethod) == null) {
          QueryGrpc.getOwnerMethod = getOwnerMethod = 
              io.grpc.MethodDescriptor.<proto.nft.QueryOuterClass.QueryOwnerRequest, proto.nft.QueryOuterClass.QueryOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.nft.Query", "Owner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.nft.QueryOuterClass.QueryOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.nft.QueryOuterClass.QueryOwnerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Owner"))
                  .build();
          }
        }
     }
     return getOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QueryCollectionRequest,
      proto.nft.QueryOuterClass.QueryCollectionResponse> getCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Collection",
      requestType = proto.nft.QueryOuterClass.QueryCollectionRequest.class,
      responseType = proto.nft.QueryOuterClass.QueryCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QueryCollectionRequest,
      proto.nft.QueryOuterClass.QueryCollectionResponse> getCollectionMethod() {
    io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QueryCollectionRequest, proto.nft.QueryOuterClass.QueryCollectionResponse> getCollectionMethod;
    if ((getCollectionMethod = QueryGrpc.getCollectionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCollectionMethod = QueryGrpc.getCollectionMethod) == null) {
          QueryGrpc.getCollectionMethod = getCollectionMethod = 
              io.grpc.MethodDescriptor.<proto.nft.QueryOuterClass.QueryCollectionRequest, proto.nft.QueryOuterClass.QueryCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.nft.Query", "Collection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.nft.QueryOuterClass.QueryCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.nft.QueryOuterClass.QueryCollectionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Collection"))
                  .build();
          }
        }
     }
     return getCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QueryDenomRequest,
      proto.nft.QueryOuterClass.QueryDenomResponse> getDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Denom",
      requestType = proto.nft.QueryOuterClass.QueryDenomRequest.class,
      responseType = proto.nft.QueryOuterClass.QueryDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QueryDenomRequest,
      proto.nft.QueryOuterClass.QueryDenomResponse> getDenomMethod() {
    io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QueryDenomRequest, proto.nft.QueryOuterClass.QueryDenomResponse> getDenomMethod;
    if ((getDenomMethod = QueryGrpc.getDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomMethod = QueryGrpc.getDenomMethod) == null) {
          QueryGrpc.getDenomMethod = getDenomMethod = 
              io.grpc.MethodDescriptor.<proto.nft.QueryOuterClass.QueryDenomRequest, proto.nft.QueryOuterClass.QueryDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.nft.Query", "Denom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.nft.QueryOuterClass.QueryDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.nft.QueryOuterClass.QueryDenomResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Denom"))
                  .build();
          }
        }
     }
     return getDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QueryDenomsRequest,
      proto.nft.QueryOuterClass.QueryDenomsResponse> getDenomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Denoms",
      requestType = proto.nft.QueryOuterClass.QueryDenomsRequest.class,
      responseType = proto.nft.QueryOuterClass.QueryDenomsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QueryDenomsRequest,
      proto.nft.QueryOuterClass.QueryDenomsResponse> getDenomsMethod() {
    io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QueryDenomsRequest, proto.nft.QueryOuterClass.QueryDenomsResponse> getDenomsMethod;
    if ((getDenomsMethod = QueryGrpc.getDenomsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomsMethod = QueryGrpc.getDenomsMethod) == null) {
          QueryGrpc.getDenomsMethod = getDenomsMethod = 
              io.grpc.MethodDescriptor.<proto.nft.QueryOuterClass.QueryDenomsRequest, proto.nft.QueryOuterClass.QueryDenomsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.nft.Query", "Denoms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.nft.QueryOuterClass.QueryDenomsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.nft.QueryOuterClass.QueryDenomsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Denoms"))
                  .build();
          }
        }
     }
     return getDenomsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QueryNFTRequest,
      proto.nft.QueryOuterClass.QueryNFTResponse> getNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NFT",
      requestType = proto.nft.QueryOuterClass.QueryNFTRequest.class,
      responseType = proto.nft.QueryOuterClass.QueryNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QueryNFTRequest,
      proto.nft.QueryOuterClass.QueryNFTResponse> getNFTMethod() {
    io.grpc.MethodDescriptor<proto.nft.QueryOuterClass.QueryNFTRequest, proto.nft.QueryOuterClass.QueryNFTResponse> getNFTMethod;
    if ((getNFTMethod = QueryGrpc.getNFTMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNFTMethod = QueryGrpc.getNFTMethod) == null) {
          QueryGrpc.getNFTMethod = getNFTMethod = 
              io.grpc.MethodDescriptor.<proto.nft.QueryOuterClass.QueryNFTRequest, proto.nft.QueryOuterClass.QueryNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.nft.Query", "NFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.nft.QueryOuterClass.QueryNFTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.nft.QueryOuterClass.QueryNFTResponse.getDefaultInstance()))
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
   * Query defines the gRPC querier service for NFT module
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Supply queries the total supply of a given denom or owner
     * </pre>
     */
    public void supply(proto.nft.QueryOuterClass.QuerySupplyRequest request,
        io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QuerySupplyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSupplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Owner queries the NFTs of the specified owner
     * </pre>
     */
    public void owner(proto.nft.QueryOuterClass.QueryOwnerRequest request,
        io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QueryOwnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Collection queries the NFTs of the specified denom
     * </pre>
     */
    public void collection(proto.nft.QueryOuterClass.QueryCollectionRequest request,
        io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QueryCollectionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCollectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Denom queries the definition of a given denom
     * </pre>
     */
    public void denom(proto.nft.QueryOuterClass.QueryDenomRequest request,
        io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QueryDenomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Denoms queries all the denoms
     * </pre>
     */
    public void denoms(proto.nft.QueryOuterClass.QueryDenomsRequest request,
        io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QueryDenomsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDenomsMethod(), responseObserver);
    }

    /**
     * <pre>
     * NFT queries the NFT for the given denom and token ID
     * </pre>
     */
    public void nFT(proto.nft.QueryOuterClass.QueryNFTRequest request,
        io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QueryNFTResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNFTMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSupplyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.nft.QueryOuterClass.QuerySupplyRequest,
                proto.nft.QueryOuterClass.QuerySupplyResponse>(
                  this, METHODID_SUPPLY)))
          .addMethod(
            getOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.nft.QueryOuterClass.QueryOwnerRequest,
                proto.nft.QueryOuterClass.QueryOwnerResponse>(
                  this, METHODID_OWNER)))
          .addMethod(
            getCollectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.nft.QueryOuterClass.QueryCollectionRequest,
                proto.nft.QueryOuterClass.QueryCollectionResponse>(
                  this, METHODID_COLLECTION)))
          .addMethod(
            getDenomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.nft.QueryOuterClass.QueryDenomRequest,
                proto.nft.QueryOuterClass.QueryDenomResponse>(
                  this, METHODID_DENOM)))
          .addMethod(
            getDenomsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.nft.QueryOuterClass.QueryDenomsRequest,
                proto.nft.QueryOuterClass.QueryDenomsResponse>(
                  this, METHODID_DENOMS)))
          .addMethod(
            getNFTMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.nft.QueryOuterClass.QueryNFTRequest,
                proto.nft.QueryOuterClass.QueryNFTResponse>(
                  this, METHODID_NFT)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for NFT module
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
     * Supply queries the total supply of a given denom or owner
     * </pre>
     */
    public void supply(proto.nft.QueryOuterClass.QuerySupplyRequest request,
        io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QuerySupplyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Owner queries the NFTs of the specified owner
     * </pre>
     */
    public void owner(proto.nft.QueryOuterClass.QueryOwnerRequest request,
        io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QueryOwnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Collection queries the NFTs of the specified denom
     * </pre>
     */
    public void collection(proto.nft.QueryOuterClass.QueryCollectionRequest request,
        io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QueryCollectionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Denom queries the definition of a given denom
     * </pre>
     */
    public void denom(proto.nft.QueryOuterClass.QueryDenomRequest request,
        io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QueryDenomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Denoms queries all the denoms
     * </pre>
     */
    public void denoms(proto.nft.QueryOuterClass.QueryDenomsRequest request,
        io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QueryDenomsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDenomsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NFT queries the NFT for the given denom and token ID
     * </pre>
     */
    public void nFT(proto.nft.QueryOuterClass.QueryNFTRequest request,
        io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QueryNFTResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNFTMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for NFT module
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
     * Supply queries the total supply of a given denom or owner
     * </pre>
     */
    public proto.nft.QueryOuterClass.QuerySupplyResponse supply(proto.nft.QueryOuterClass.QuerySupplyRequest request) {
      return blockingUnaryCall(
          getChannel(), getSupplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Owner queries the NFTs of the specified owner
     * </pre>
     */
    public proto.nft.QueryOuterClass.QueryOwnerResponse owner(proto.nft.QueryOuterClass.QueryOwnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Collection queries the NFTs of the specified denom
     * </pre>
     */
    public proto.nft.QueryOuterClass.QueryCollectionResponse collection(proto.nft.QueryOuterClass.QueryCollectionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCollectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Denom queries the definition of a given denom
     * </pre>
     */
    public proto.nft.QueryOuterClass.QueryDenomResponse denom(proto.nft.QueryOuterClass.QueryDenomRequest request) {
      return blockingUnaryCall(
          getChannel(), getDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Denoms queries all the denoms
     * </pre>
     */
    public proto.nft.QueryOuterClass.QueryDenomsResponse denoms(proto.nft.QueryOuterClass.QueryDenomsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDenomsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NFT queries the NFT for the given denom and token ID
     * </pre>
     */
    public proto.nft.QueryOuterClass.QueryNFTResponse nFT(proto.nft.QueryOuterClass.QueryNFTRequest request) {
      return blockingUnaryCall(
          getChannel(), getNFTMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for NFT module
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
     * Supply queries the total supply of a given denom or owner
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.nft.QueryOuterClass.QuerySupplyResponse> supply(
        proto.nft.QueryOuterClass.QuerySupplyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Owner queries the NFTs of the specified owner
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.nft.QueryOuterClass.QueryOwnerResponse> owner(
        proto.nft.QueryOuterClass.QueryOwnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Collection queries the NFTs of the specified denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.nft.QueryOuterClass.QueryCollectionResponse> collection(
        proto.nft.QueryOuterClass.QueryCollectionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCollectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Denom queries the definition of a given denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.nft.QueryOuterClass.QueryDenomResponse> denom(
        proto.nft.QueryOuterClass.QueryDenomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Denoms queries all the denoms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.nft.QueryOuterClass.QueryDenomsResponse> denoms(
        proto.nft.QueryOuterClass.QueryDenomsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDenomsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NFT queries the NFT for the given denom and token ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.nft.QueryOuterClass.QueryNFTResponse> nFT(
        proto.nft.QueryOuterClass.QueryNFTRequest request) {
      return futureUnaryCall(
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

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUPPLY:
          serviceImpl.supply((proto.nft.QueryOuterClass.QuerySupplyRequest) request,
              (io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QuerySupplyResponse>) responseObserver);
          break;
        case METHODID_OWNER:
          serviceImpl.owner((proto.nft.QueryOuterClass.QueryOwnerRequest) request,
              (io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QueryOwnerResponse>) responseObserver);
          break;
        case METHODID_COLLECTION:
          serviceImpl.collection((proto.nft.QueryOuterClass.QueryCollectionRequest) request,
              (io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QueryCollectionResponse>) responseObserver);
          break;
        case METHODID_DENOM:
          serviceImpl.denom((proto.nft.QueryOuterClass.QueryDenomRequest) request,
              (io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QueryDenomResponse>) responseObserver);
          break;
        case METHODID_DENOMS:
          serviceImpl.denoms((proto.nft.QueryOuterClass.QueryDenomsRequest) request,
              (io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QueryDenomsResponse>) responseObserver);
          break;
        case METHODID_NFT:
          serviceImpl.nFT((proto.nft.QueryOuterClass.QueryNFTRequest) request,
              (io.grpc.stub.StreamObserver<proto.nft.QueryOuterClass.QueryNFTResponse>) responseObserver);
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
      return proto.nft.QueryOuterClass.getDescriptor();
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
