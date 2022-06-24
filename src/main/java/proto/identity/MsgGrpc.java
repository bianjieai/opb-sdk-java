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
 * Msg defines the bank Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: identity/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "iritamod.identity.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.identity.Tx.MsgCreateIdentity,
      proto.identity.Tx.MsgCreateIdentityResponse> getCreateIdentityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIdentity",
      requestType = proto.identity.Tx.MsgCreateIdentity.class,
      responseType = proto.identity.Tx.MsgCreateIdentityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.identity.Tx.MsgCreateIdentity,
      proto.identity.Tx.MsgCreateIdentityResponse> getCreateIdentityMethod() {
    io.grpc.MethodDescriptor<proto.identity.Tx.MsgCreateIdentity, proto.identity.Tx.MsgCreateIdentityResponse> getCreateIdentityMethod;
    if ((getCreateIdentityMethod = MsgGrpc.getCreateIdentityMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateIdentityMethod = MsgGrpc.getCreateIdentityMethod) == null) {
          MsgGrpc.getCreateIdentityMethod = getCreateIdentityMethod = 
              io.grpc.MethodDescriptor.<proto.identity.Tx.MsgCreateIdentity, proto.identity.Tx.MsgCreateIdentityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iritamod.identity.Msg", "CreateIdentity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.identity.Tx.MsgCreateIdentity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.identity.Tx.MsgCreateIdentityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateIdentity"))
                  .build();
          }
        }
     }
     return getCreateIdentityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.identity.Tx.MsgUpdateIdentity,
      proto.identity.Tx.MsgUpdateIdentityResponse> getUpdateIdentityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateIdentity",
      requestType = proto.identity.Tx.MsgUpdateIdentity.class,
      responseType = proto.identity.Tx.MsgUpdateIdentityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.identity.Tx.MsgUpdateIdentity,
      proto.identity.Tx.MsgUpdateIdentityResponse> getUpdateIdentityMethod() {
    io.grpc.MethodDescriptor<proto.identity.Tx.MsgUpdateIdentity, proto.identity.Tx.MsgUpdateIdentityResponse> getUpdateIdentityMethod;
    if ((getUpdateIdentityMethod = MsgGrpc.getUpdateIdentityMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateIdentityMethod = MsgGrpc.getUpdateIdentityMethod) == null) {
          MsgGrpc.getUpdateIdentityMethod = getUpdateIdentityMethod = 
              io.grpc.MethodDescriptor.<proto.identity.Tx.MsgUpdateIdentity, proto.identity.Tx.MsgUpdateIdentityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iritamod.identity.Msg", "UpdateIdentity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.identity.Tx.MsgUpdateIdentity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.identity.Tx.MsgUpdateIdentityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateIdentity"))
                  .build();
          }
        }
     }
     return getUpdateIdentityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgStub newStub(io.grpc.Channel channel) {
    return new MsgStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MsgBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MsgFutureStub(channel);
  }

  /**
   * <pre>
   * Msg defines the bank Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CreateIdentity defines a method for creating a new identity.
     * </pre>
     */
    public void createIdentity(proto.identity.Tx.MsgCreateIdentity request,
        io.grpc.stub.StreamObserver<proto.identity.Tx.MsgCreateIdentityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateIdentityMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateIdentity defines a method for Updating a identity.
     * </pre>
     */
    public void updateIdentity(proto.identity.Tx.MsgUpdateIdentity request,
        io.grpc.stub.StreamObserver<proto.identity.Tx.MsgUpdateIdentityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateIdentityMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateIdentityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.identity.Tx.MsgCreateIdentity,
                proto.identity.Tx.MsgCreateIdentityResponse>(
                  this, METHODID_CREATE_IDENTITY)))
          .addMethod(
            getUpdateIdentityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.identity.Tx.MsgUpdateIdentity,
                proto.identity.Tx.MsgUpdateIdentityResponse>(
                  this, METHODID_UPDATE_IDENTITY)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the bank Msg service.
   * </pre>
   */
  public static final class MsgStub extends io.grpc.stub.AbstractStub<MsgStub> {
    private MsgStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MsgStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MsgStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateIdentity defines a method for creating a new identity.
     * </pre>
     */
    public void createIdentity(proto.identity.Tx.MsgCreateIdentity request,
        io.grpc.stub.StreamObserver<proto.identity.Tx.MsgCreateIdentityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateIdentityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateIdentity defines a method for Updating a identity.
     * </pre>
     */
    public void updateIdentity(proto.identity.Tx.MsgUpdateIdentity request,
        io.grpc.stub.StreamObserver<proto.identity.Tx.MsgUpdateIdentityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateIdentityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the bank Msg service.
   * </pre>
   */
  public static final class MsgBlockingStub extends io.grpc.stub.AbstractStub<MsgBlockingStub> {
    private MsgBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MsgBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MsgBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateIdentity defines a method for creating a new identity.
     * </pre>
     */
    public proto.identity.Tx.MsgCreateIdentityResponse createIdentity(proto.identity.Tx.MsgCreateIdentity request) {
      return blockingUnaryCall(
          getChannel(), getCreateIdentityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateIdentity defines a method for Updating a identity.
     * </pre>
     */
    public proto.identity.Tx.MsgUpdateIdentityResponse updateIdentity(proto.identity.Tx.MsgUpdateIdentity request) {
      return blockingUnaryCall(
          getChannel(), getUpdateIdentityMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the bank Msg service.
   * </pre>
   */
  public static final class MsgFutureStub extends io.grpc.stub.AbstractStub<MsgFutureStub> {
    private MsgFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MsgFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MsgFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateIdentity defines a method for creating a new identity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.identity.Tx.MsgCreateIdentityResponse> createIdentity(
        proto.identity.Tx.MsgCreateIdentity request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateIdentityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateIdentity defines a method for Updating a identity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.identity.Tx.MsgUpdateIdentityResponse> updateIdentity(
        proto.identity.Tx.MsgUpdateIdentity request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateIdentityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_IDENTITY = 0;
  private static final int METHODID_UPDATE_IDENTITY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MsgImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MsgImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_IDENTITY:
          serviceImpl.createIdentity((proto.identity.Tx.MsgCreateIdentity) request,
              (io.grpc.stub.StreamObserver<proto.identity.Tx.MsgCreateIdentityResponse>) responseObserver);
          break;
        case METHODID_UPDATE_IDENTITY:
          serviceImpl.updateIdentity((proto.identity.Tx.MsgUpdateIdentity) request,
              (io.grpc.stub.StreamObserver<proto.identity.Tx.MsgUpdateIdentityResponse>) responseObserver);
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

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.identity.Tx.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Msg");
    }
  }

  private static final class MsgFileDescriptorSupplier
      extends MsgBaseDescriptorSupplier {
    MsgFileDescriptorSupplier() {}
  }

  private static final class MsgMethodDescriptorSupplier
      extends MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgMethodDescriptorSupplier(String methodName) {
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
      synchronized (MsgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgFileDescriptorSupplier())
              .addMethod(getCreateIdentityMethod())
              .addMethod(getUpdateIdentityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
