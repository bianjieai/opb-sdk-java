package proto.identity;

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
 * Query defines the gRPC querier service for identity module
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: identity/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "iritamod.identity.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.identity.QueryOuterClass.QueryIdentityRequest,
      proto.identity.QueryOuterClass.QueryIdentityResponse> getIdentityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Identity",
      requestType = proto.identity.QueryOuterClass.QueryIdentityRequest.class,
      responseType = proto.identity.QueryOuterClass.QueryIdentityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.identity.QueryOuterClass.QueryIdentityRequest,
      proto.identity.QueryOuterClass.QueryIdentityResponse> getIdentityMethod() {
    io.grpc.MethodDescriptor<proto.identity.QueryOuterClass.QueryIdentityRequest, proto.identity.QueryOuterClass.QueryIdentityResponse> getIdentityMethod;
    if ((getIdentityMethod = QueryGrpc.getIdentityMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIdentityMethod = QueryGrpc.getIdentityMethod) == null) {
          QueryGrpc.getIdentityMethod = getIdentityMethod = 
              io.grpc.MethodDescriptor.<proto.identity.QueryOuterClass.QueryIdentityRequest, proto.identity.QueryOuterClass.QueryIdentityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iritamod.identity.Query", "Identity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.identity.QueryOuterClass.QueryIdentityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.identity.QueryOuterClass.QueryIdentityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Identity"))
                  .build();
          }
        }
     }
     return getIdentityMethod;
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
   * Query defines the gRPC querier service for identity module
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Identity queries the identity by the given id
     * </pre>
     */
    public void identity(proto.identity.QueryOuterClass.QueryIdentityRequest request,
        io.grpc.stub.StreamObserver<proto.identity.QueryOuterClass.QueryIdentityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIdentityMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIdentityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.identity.QueryOuterClass.QueryIdentityRequest,
                proto.identity.QueryOuterClass.QueryIdentityResponse>(
                  this, METHODID_IDENTITY)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for identity module
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
     * Identity queries the identity by the given id
     * </pre>
     */
    public void identity(proto.identity.QueryOuterClass.QueryIdentityRequest request,
        io.grpc.stub.StreamObserver<proto.identity.QueryOuterClass.QueryIdentityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIdentityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for identity module
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
     * Identity queries the identity by the given id
     * </pre>
     */
    public proto.identity.QueryOuterClass.QueryIdentityResponse identity(proto.identity.QueryOuterClass.QueryIdentityRequest request) {
      return blockingUnaryCall(
          getChannel(), getIdentityMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for identity module
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
     * Identity queries the identity by the given id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.identity.QueryOuterClass.QueryIdentityResponse> identity(
        proto.identity.QueryOuterClass.QueryIdentityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIdentityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IDENTITY = 0;

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
        case METHODID_IDENTITY:
          serviceImpl.identity((proto.identity.QueryOuterClass.QueryIdentityRequest) request,
              (io.grpc.stub.StreamObserver<proto.identity.QueryOuterClass.QueryIdentityResponse>) responseObserver);
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
      return proto.identity.QueryOuterClass.getDescriptor();
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
              .addMethod(getIdentityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
