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
 * Msg defines the bank Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: cosmos/bank/v1beta1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "cosmos.bank.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.Tx.MsgSend,
      proto.cosmos.bank.v1beta1.Tx.MsgSendResponse> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Send",
      requestType = proto.cosmos.bank.v1beta1.Tx.MsgSend.class,
      responseType = proto.cosmos.bank.v1beta1.Tx.MsgSendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.Tx.MsgSend,
      proto.cosmos.bank.v1beta1.Tx.MsgSendResponse> getSendMethod() {
    io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.Tx.MsgSend, proto.cosmos.bank.v1beta1.Tx.MsgSendResponse> getSendMethod;
    if ((getSendMethod = MsgGrpc.getSendMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSendMethod = MsgGrpc.getSendMethod) == null) {
          MsgGrpc.getSendMethod = getSendMethod = 
              io.grpc.MethodDescriptor.<proto.cosmos.bank.v1beta1.Tx.MsgSend, proto.cosmos.bank.v1beta1.Tx.MsgSendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.bank.v1beta1.Msg", "Send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmos.bank.v1beta1.Tx.MsgSend.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmos.bank.v1beta1.Tx.MsgSendResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Send"))
                  .build();
          }
        }
     }
     return getSendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.Tx.MsgMultiSend,
      proto.cosmos.bank.v1beta1.Tx.MsgMultiSendResponse> getMultiSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiSend",
      requestType = proto.cosmos.bank.v1beta1.Tx.MsgMultiSend.class,
      responseType = proto.cosmos.bank.v1beta1.Tx.MsgMultiSendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.Tx.MsgMultiSend,
      proto.cosmos.bank.v1beta1.Tx.MsgMultiSendResponse> getMultiSendMethod() {
    io.grpc.MethodDescriptor<proto.cosmos.bank.v1beta1.Tx.MsgMultiSend, proto.cosmos.bank.v1beta1.Tx.MsgMultiSendResponse> getMultiSendMethod;
    if ((getMultiSendMethod = MsgGrpc.getMultiSendMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMultiSendMethod = MsgGrpc.getMultiSendMethod) == null) {
          MsgGrpc.getMultiSendMethod = getMultiSendMethod = 
              io.grpc.MethodDescriptor.<proto.cosmos.bank.v1beta1.Tx.MsgMultiSend, proto.cosmos.bank.v1beta1.Tx.MsgMultiSendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmos.bank.v1beta1.Msg", "MultiSend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmos.bank.v1beta1.Tx.MsgMultiSend.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmos.bank.v1beta1.Tx.MsgMultiSendResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MultiSend"))
                  .build();
          }
        }
     }
     return getMultiSendMethod;
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
     * Send defines a method for sending coins from one account to another account.
     * </pre>
     */
    public void send(proto.cosmos.bank.v1beta1.Tx.MsgSend request,
        io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.Tx.MsgSendResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    /**
     * <pre>
     * MultiSend defines a method for sending coins from some accounts to other accounts.
     * </pre>
     */
    public void multiSend(proto.cosmos.bank.v1beta1.Tx.MsgMultiSend request,
        io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.Tx.MsgMultiSendResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiSendMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.cosmos.bank.v1beta1.Tx.MsgSend,
                proto.cosmos.bank.v1beta1.Tx.MsgSendResponse>(
                  this, METHODID_SEND)))
          .addMethod(
            getMultiSendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.cosmos.bank.v1beta1.Tx.MsgMultiSend,
                proto.cosmos.bank.v1beta1.Tx.MsgMultiSendResponse>(
                  this, METHODID_MULTI_SEND)))
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
     * Send defines a method for sending coins from one account to another account.
     * </pre>
     */
    public void send(proto.cosmos.bank.v1beta1.Tx.MsgSend request,
        io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.Tx.MsgSendResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MultiSend defines a method for sending coins from some accounts to other accounts.
     * </pre>
     */
    public void multiSend(proto.cosmos.bank.v1beta1.Tx.MsgMultiSend request,
        io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.Tx.MsgMultiSendResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiSendMethod(), getCallOptions()), request, responseObserver);
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
     * Send defines a method for sending coins from one account to another account.
     * </pre>
     */
    public proto.cosmos.bank.v1beta1.Tx.MsgSendResponse send(proto.cosmos.bank.v1beta1.Tx.MsgSend request) {
      return blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MultiSend defines a method for sending coins from some accounts to other accounts.
     * </pre>
     */
    public proto.cosmos.bank.v1beta1.Tx.MsgMultiSendResponse multiSend(proto.cosmos.bank.v1beta1.Tx.MsgMultiSend request) {
      return blockingUnaryCall(
          getChannel(), getMultiSendMethod(), getCallOptions(), request);
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
     * Send defines a method for sending coins from one account to another account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.cosmos.bank.v1beta1.Tx.MsgSendResponse> send(
        proto.cosmos.bank.v1beta1.Tx.MsgSend request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MultiSend defines a method for sending coins from some accounts to other accounts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.cosmos.bank.v1beta1.Tx.MsgMultiSendResponse> multiSend(
        proto.cosmos.bank.v1beta1.Tx.MsgMultiSend request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiSendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;
  private static final int METHODID_MULTI_SEND = 1;

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
        case METHODID_SEND:
          serviceImpl.send((proto.cosmos.bank.v1beta1.Tx.MsgSend) request,
              (io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.Tx.MsgSendResponse>) responseObserver);
          break;
        case METHODID_MULTI_SEND:
          serviceImpl.multiSend((proto.cosmos.bank.v1beta1.Tx.MsgMultiSend) request,
              (io.grpc.stub.StreamObserver<proto.cosmos.bank.v1beta1.Tx.MsgMultiSendResponse>) responseObserver);
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
      return proto.cosmos.bank.v1beta1.Tx.getDescriptor();
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
              .addMethod(getSendMethod())
              .addMethod(getMultiSendMethod())
              .build();
        }
      }
    }
    return result;
  }
}
