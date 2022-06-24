package proto.tibc.core.client.v1;

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
 * Query provides defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: tibc/core/client/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "tibc.core.client.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateRequest,
      proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateResponse> getClientStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClientState",
      requestType = proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateRequest.class,
      responseType = proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateRequest,
      proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateResponse> getClientStateMethod() {
    io.grpc.MethodDescriptor<proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateRequest, proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateResponse> getClientStateMethod;
    if ((getClientStateMethod = QueryGrpc.getClientStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClientStateMethod = QueryGrpc.getClientStateMethod) == null) {
          QueryGrpc.getClientStateMethod = getClientStateMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateRequest, proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.core.client.v1.Query", "ClientState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClientState"))
                  .build();
          }
        }
     }
     return getClientStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesRequest,
      proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesResponse> getClientStatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClientStates",
      requestType = proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesRequest.class,
      responseType = proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesRequest,
      proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesResponse> getClientStatesMethod() {
    io.grpc.MethodDescriptor<proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesRequest, proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesResponse> getClientStatesMethod;
    if ((getClientStatesMethod = QueryGrpc.getClientStatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClientStatesMethod = QueryGrpc.getClientStatesMethod) == null) {
          QueryGrpc.getClientStatesMethod = getClientStatesMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesRequest, proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.core.client.v1.Query", "ClientStates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClientStates"))
                  .build();
          }
        }
     }
     return getClientStatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateRequest,
      proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse> getConsensusStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConsensusState",
      requestType = proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateRequest.class,
      responseType = proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateRequest,
      proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse> getConsensusStateMethod() {
    io.grpc.MethodDescriptor<proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateRequest, proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse> getConsensusStateMethod;
    if ((getConsensusStateMethod = QueryGrpc.getConsensusStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getConsensusStateMethod = QueryGrpc.getConsensusStateMethod) == null) {
          QueryGrpc.getConsensusStateMethod = getConsensusStateMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateRequest, proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.core.client.v1.Query", "ConsensusState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ConsensusState"))
                  .build();
          }
        }
     }
     return getConsensusStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesRequest,
      proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse> getConsensusStatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConsensusStates",
      requestType = proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesRequest.class,
      responseType = proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesRequest,
      proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse> getConsensusStatesMethod() {
    io.grpc.MethodDescriptor<proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesRequest, proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse> getConsensusStatesMethod;
    if ((getConsensusStatesMethod = QueryGrpc.getConsensusStatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getConsensusStatesMethod = QueryGrpc.getConsensusStatesMethod) == null) {
          QueryGrpc.getConsensusStatesMethod = getConsensusStatesMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesRequest, proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.core.client.v1.Query", "ConsensusStates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ConsensusStates"))
                  .build();
          }
        }
     }
     return getConsensusStatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersRequest,
      proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersResponse> getRelayersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Relayers",
      requestType = proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersRequest.class,
      responseType = proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersRequest,
      proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersResponse> getRelayersMethod() {
    io.grpc.MethodDescriptor<proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersRequest, proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersResponse> getRelayersMethod;
    if ((getRelayersMethod = QueryGrpc.getRelayersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRelayersMethod = QueryGrpc.getRelayersMethod) == null) {
          QueryGrpc.getRelayersMethod = getRelayersMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersRequest, proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.core.client.v1.Query", "Relayers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Relayers"))
                  .build();
          }
        }
     }
     return getRelayersMethod;
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
   * Query provides defines the gRPC querier service
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ClientState queries an TIBC light client.
     * </pre>
     */
    public void clientState(proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClientStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClientStates queries all the TIBC light clients of a chain.
     * </pre>
     */
    public void clientStates(proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClientStatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConsensusState queries a consensus state associated with a client state at
     * a given height.
     * </pre>
     */
    public void consensusState(proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConsensusStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConsensusStates queries all the consensus state associated with a given
     * client.
     * </pre>
     */
    public void consensusStates(proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConsensusStatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Relayers queries all the relayers associated with a given
     * client.
     * </pre>
     */
    public void relayers(proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRelayersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getClientStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateRequest,
                proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateResponse>(
                  this, METHODID_CLIENT_STATE)))
          .addMethod(
            getClientStatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesRequest,
                proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesResponse>(
                  this, METHODID_CLIENT_STATES)))
          .addMethod(
            getConsensusStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateRequest,
                proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse>(
                  this, METHODID_CONSENSUS_STATE)))
          .addMethod(
            getConsensusStatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesRequest,
                proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse>(
                  this, METHODID_CONSENSUS_STATES)))
          .addMethod(
            getRelayersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersRequest,
                proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersResponse>(
                  this, METHODID_RELAYERS)))
          .build();
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service
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
     * ClientState queries an TIBC light client.
     * </pre>
     */
    public void clientState(proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClientStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClientStates queries all the TIBC light clients of a chain.
     * </pre>
     */
    public void clientStates(proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClientStatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConsensusState queries a consensus state associated with a client state at
     * a given height.
     * </pre>
     */
    public void consensusState(proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConsensusStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConsensusStates queries all the consensus state associated with a given
     * client.
     * </pre>
     */
    public void consensusStates(proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConsensusStatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Relayers queries all the relayers associated with a given
     * client.
     * </pre>
     */
    public void relayers(proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRelayersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service
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
     * ClientState queries an TIBC light client.
     * </pre>
     */
    public proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateResponse clientState(proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getClientStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClientStates queries all the TIBC light clients of a chain.
     * </pre>
     */
    public proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesResponse clientStates(proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getClientStatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConsensusState queries a consensus state associated with a client state at
     * a given height.
     * </pre>
     */
    public proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse consensusState(proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getConsensusStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConsensusStates queries all the consensus state associated with a given
     * client.
     * </pre>
     */
    public proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse consensusStates(proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getConsensusStatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Relayers queries all the relayers associated with a given
     * client.
     * </pre>
     */
    public proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersResponse relayers(proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersRequest request) {
      return blockingUnaryCall(
          getChannel(), getRelayersMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service
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
     * ClientState queries an TIBC light client.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateResponse> clientState(
        proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClientStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClientStates queries all the TIBC light clients of a chain.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesResponse> clientStates(
        proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClientStatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConsensusState queries a consensus state associated with a client state at
     * a given height.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse> consensusState(
        proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConsensusStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConsensusStates queries all the consensus state associated with a given
     * client.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse> consensusStates(
        proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConsensusStatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Relayers queries all the relayers associated with a given
     * client.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersResponse> relayers(
        proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRelayersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLIENT_STATE = 0;
  private static final int METHODID_CLIENT_STATES = 1;
  private static final int METHODID_CONSENSUS_STATE = 2;
  private static final int METHODID_CONSENSUS_STATES = 3;
  private static final int METHODID_RELAYERS = 4;

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
        case METHODID_CLIENT_STATE:
          serviceImpl.clientState((proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateRequest) request,
              (io.grpc.stub.StreamObserver<proto.tibc.core.client.v1.QueryOuterClass.QueryClientStateResponse>) responseObserver);
          break;
        case METHODID_CLIENT_STATES:
          serviceImpl.clientStates((proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesRequest) request,
              (io.grpc.stub.StreamObserver<proto.tibc.core.client.v1.QueryOuterClass.QueryClientStatesResponse>) responseObserver);
          break;
        case METHODID_CONSENSUS_STATE:
          serviceImpl.consensusState((proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateRequest) request,
              (io.grpc.stub.StreamObserver<proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStateResponse>) responseObserver);
          break;
        case METHODID_CONSENSUS_STATES:
          serviceImpl.consensusStates((proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesRequest) request,
              (io.grpc.stub.StreamObserver<proto.tibc.core.client.v1.QueryOuterClass.QueryConsensusStatesResponse>) responseObserver);
          break;
        case METHODID_RELAYERS:
          serviceImpl.relayers((proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersRequest) request,
              (io.grpc.stub.StreamObserver<proto.tibc.core.client.v1.QueryOuterClass.QueryRelayersResponse>) responseObserver);
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
      return proto.tibc.core.client.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getClientStateMethod())
              .addMethod(getClientStatesMethod())
              .addMethod(getConsensusStateMethod())
              .addMethod(getConsensusStatesMethod())
              .addMethod(getRelayersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
