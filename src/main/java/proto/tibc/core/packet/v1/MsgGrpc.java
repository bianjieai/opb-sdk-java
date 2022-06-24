package proto.tibc.core.packet.v1;

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
 * Msg defines the tibc/packet Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: tibc/core/packet/v1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "tibc.core.packet.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.Tx.MsgRecvPacket,
      proto.tibc.core.packet.v1.Tx.MsgRecvPacketResponse> getRecvPacketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecvPacket",
      requestType = proto.tibc.core.packet.v1.Tx.MsgRecvPacket.class,
      responseType = proto.tibc.core.packet.v1.Tx.MsgRecvPacketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.Tx.MsgRecvPacket,
      proto.tibc.core.packet.v1.Tx.MsgRecvPacketResponse> getRecvPacketMethod() {
    io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.Tx.MsgRecvPacket, proto.tibc.core.packet.v1.Tx.MsgRecvPacketResponse> getRecvPacketMethod;
    if ((getRecvPacketMethod = MsgGrpc.getRecvPacketMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRecvPacketMethod = MsgGrpc.getRecvPacketMethod) == null) {
          MsgGrpc.getRecvPacketMethod = getRecvPacketMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.core.packet.v1.Tx.MsgRecvPacket, proto.tibc.core.packet.v1.Tx.MsgRecvPacketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.core.packet.v1.Msg", "RecvPacket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.Tx.MsgRecvPacket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.Tx.MsgRecvPacketResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RecvPacket"))
                  .build();
          }
        }
     }
     return getRecvPacketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.Tx.MsgAcknowledgement,
      proto.tibc.core.packet.v1.Tx.MsgAcknowledgementResponse> getAcknowledgementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Acknowledgement",
      requestType = proto.tibc.core.packet.v1.Tx.MsgAcknowledgement.class,
      responseType = proto.tibc.core.packet.v1.Tx.MsgAcknowledgementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.Tx.MsgAcknowledgement,
      proto.tibc.core.packet.v1.Tx.MsgAcknowledgementResponse> getAcknowledgementMethod() {
    io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.Tx.MsgAcknowledgement, proto.tibc.core.packet.v1.Tx.MsgAcknowledgementResponse> getAcknowledgementMethod;
    if ((getAcknowledgementMethod = MsgGrpc.getAcknowledgementMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAcknowledgementMethod = MsgGrpc.getAcknowledgementMethod) == null) {
          MsgGrpc.getAcknowledgementMethod = getAcknowledgementMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.core.packet.v1.Tx.MsgAcknowledgement, proto.tibc.core.packet.v1.Tx.MsgAcknowledgementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.core.packet.v1.Msg", "Acknowledgement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.Tx.MsgAcknowledgement.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.Tx.MsgAcknowledgementResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Acknowledgement"))
                  .build();
          }
        }
     }
     return getAcknowledgementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.Tx.MsgCleanPacket,
      proto.tibc.core.packet.v1.Tx.MsgCleanPacketResponse> getCleanPacketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CleanPacket",
      requestType = proto.tibc.core.packet.v1.Tx.MsgCleanPacket.class,
      responseType = proto.tibc.core.packet.v1.Tx.MsgCleanPacketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.Tx.MsgCleanPacket,
      proto.tibc.core.packet.v1.Tx.MsgCleanPacketResponse> getCleanPacketMethod() {
    io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.Tx.MsgCleanPacket, proto.tibc.core.packet.v1.Tx.MsgCleanPacketResponse> getCleanPacketMethod;
    if ((getCleanPacketMethod = MsgGrpc.getCleanPacketMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCleanPacketMethod = MsgGrpc.getCleanPacketMethod) == null) {
          MsgGrpc.getCleanPacketMethod = getCleanPacketMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.core.packet.v1.Tx.MsgCleanPacket, proto.tibc.core.packet.v1.Tx.MsgCleanPacketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.core.packet.v1.Msg", "CleanPacket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.Tx.MsgCleanPacket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.Tx.MsgCleanPacketResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CleanPacket"))
                  .build();
          }
        }
     }
     return getCleanPacketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacket,
      proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacketResponse> getRecvCleanPacketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecvCleanPacket",
      requestType = proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacket.class,
      responseType = proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacket,
      proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacketResponse> getRecvCleanPacketMethod() {
    io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacket, proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacketResponse> getRecvCleanPacketMethod;
    if ((getRecvCleanPacketMethod = MsgGrpc.getRecvCleanPacketMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRecvCleanPacketMethod = MsgGrpc.getRecvCleanPacketMethod) == null) {
          MsgGrpc.getRecvCleanPacketMethod = getRecvCleanPacketMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacket, proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.core.packet.v1.Msg", "RecvCleanPacket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacketResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RecvCleanPacket"))
                  .build();
          }
        }
     }
     return getRecvCleanPacketMethod;
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
   * Msg defines the tibc/packet Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RecvPacket defines a rpc handler method for MsgRecvPacket.
     * </pre>
     */
    public void recvPacket(proto.tibc.core.packet.v1.Tx.MsgRecvPacket request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.Tx.MsgRecvPacketResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRecvPacketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Acknowledgement defines a rpc handler method for MsgAcknowledgement.
     * </pre>
     */
    public void acknowledgement(proto.tibc.core.packet.v1.Tx.MsgAcknowledgement request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.Tx.MsgAcknowledgementResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAcknowledgementMethod(), responseObserver);
    }

    /**
     * <pre>
     * CleanPacket defines a rpc handler method for MsgCleanPacket.
     * </pre>
     */
    public void cleanPacket(proto.tibc.core.packet.v1.Tx.MsgCleanPacket request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.Tx.MsgCleanPacketResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCleanPacketMethod(), responseObserver);
    }

    /**
     * <pre>
     * RecvCleanPacket defines a rpc handler method for MsgRecvCleanPacket.
     * </pre>
     */
    public void recvCleanPacket(proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacket request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacketResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRecvCleanPacketMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecvPacketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.core.packet.v1.Tx.MsgRecvPacket,
                proto.tibc.core.packet.v1.Tx.MsgRecvPacketResponse>(
                  this, METHODID_RECV_PACKET)))
          .addMethod(
            getAcknowledgementMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.core.packet.v1.Tx.MsgAcknowledgement,
                proto.tibc.core.packet.v1.Tx.MsgAcknowledgementResponse>(
                  this, METHODID_ACKNOWLEDGEMENT)))
          .addMethod(
            getCleanPacketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.core.packet.v1.Tx.MsgCleanPacket,
                proto.tibc.core.packet.v1.Tx.MsgCleanPacketResponse>(
                  this, METHODID_CLEAN_PACKET)))
          .addMethod(
            getRecvCleanPacketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacket,
                proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacketResponse>(
                  this, METHODID_RECV_CLEAN_PACKET)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the tibc/packet Msg service.
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
     * RecvPacket defines a rpc handler method for MsgRecvPacket.
     * </pre>
     */
    public void recvPacket(proto.tibc.core.packet.v1.Tx.MsgRecvPacket request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.Tx.MsgRecvPacketResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecvPacketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Acknowledgement defines a rpc handler method for MsgAcknowledgement.
     * </pre>
     */
    public void acknowledgement(proto.tibc.core.packet.v1.Tx.MsgAcknowledgement request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.Tx.MsgAcknowledgementResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAcknowledgementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CleanPacket defines a rpc handler method for MsgCleanPacket.
     * </pre>
     */
    public void cleanPacket(proto.tibc.core.packet.v1.Tx.MsgCleanPacket request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.Tx.MsgCleanPacketResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCleanPacketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RecvCleanPacket defines a rpc handler method for MsgRecvCleanPacket.
     * </pre>
     */
    public void recvCleanPacket(proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacket request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacketResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecvCleanPacketMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the tibc/packet Msg service.
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
     * RecvPacket defines a rpc handler method for MsgRecvPacket.
     * </pre>
     */
    public proto.tibc.core.packet.v1.Tx.MsgRecvPacketResponse recvPacket(proto.tibc.core.packet.v1.Tx.MsgRecvPacket request) {
      return blockingUnaryCall(
          getChannel(), getRecvPacketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Acknowledgement defines a rpc handler method for MsgAcknowledgement.
     * </pre>
     */
    public proto.tibc.core.packet.v1.Tx.MsgAcknowledgementResponse acknowledgement(proto.tibc.core.packet.v1.Tx.MsgAcknowledgement request) {
      return blockingUnaryCall(
          getChannel(), getAcknowledgementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CleanPacket defines a rpc handler method for MsgCleanPacket.
     * </pre>
     */
    public proto.tibc.core.packet.v1.Tx.MsgCleanPacketResponse cleanPacket(proto.tibc.core.packet.v1.Tx.MsgCleanPacket request) {
      return blockingUnaryCall(
          getChannel(), getCleanPacketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RecvCleanPacket defines a rpc handler method for MsgRecvCleanPacket.
     * </pre>
     */
    public proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacketResponse recvCleanPacket(proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacket request) {
      return blockingUnaryCall(
          getChannel(), getRecvCleanPacketMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the tibc/packet Msg service.
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
     * RecvPacket defines a rpc handler method for MsgRecvPacket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.core.packet.v1.Tx.MsgRecvPacketResponse> recvPacket(
        proto.tibc.core.packet.v1.Tx.MsgRecvPacket request) {
      return futureUnaryCall(
          getChannel().newCall(getRecvPacketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Acknowledgement defines a rpc handler method for MsgAcknowledgement.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.core.packet.v1.Tx.MsgAcknowledgementResponse> acknowledgement(
        proto.tibc.core.packet.v1.Tx.MsgAcknowledgement request) {
      return futureUnaryCall(
          getChannel().newCall(getAcknowledgementMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CleanPacket defines a rpc handler method for MsgCleanPacket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.core.packet.v1.Tx.MsgCleanPacketResponse> cleanPacket(
        proto.tibc.core.packet.v1.Tx.MsgCleanPacket request) {
      return futureUnaryCall(
          getChannel().newCall(getCleanPacketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RecvCleanPacket defines a rpc handler method for MsgRecvCleanPacket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacketResponse> recvCleanPacket(
        proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacket request) {
      return futureUnaryCall(
          getChannel().newCall(getRecvCleanPacketMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECV_PACKET = 0;
  private static final int METHODID_ACKNOWLEDGEMENT = 1;
  private static final int METHODID_CLEAN_PACKET = 2;
  private static final int METHODID_RECV_CLEAN_PACKET = 3;

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
        case METHODID_RECV_PACKET:
          serviceImpl.recvPacket((proto.tibc.core.packet.v1.Tx.MsgRecvPacket) request,
              (io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.Tx.MsgRecvPacketResponse>) responseObserver);
          break;
        case METHODID_ACKNOWLEDGEMENT:
          serviceImpl.acknowledgement((proto.tibc.core.packet.v1.Tx.MsgAcknowledgement) request,
              (io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.Tx.MsgAcknowledgementResponse>) responseObserver);
          break;
        case METHODID_CLEAN_PACKET:
          serviceImpl.cleanPacket((proto.tibc.core.packet.v1.Tx.MsgCleanPacket) request,
              (io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.Tx.MsgCleanPacketResponse>) responseObserver);
          break;
        case METHODID_RECV_CLEAN_PACKET:
          serviceImpl.recvCleanPacket((proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacket) request,
              (io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.Tx.MsgRecvCleanPacketResponse>) responseObserver);
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
      return proto.tibc.core.packet.v1.Tx.getDescriptor();
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
              .addMethod(getRecvPacketMethod())
              .addMethod(getAcknowledgementMethod())
              .addMethod(getCleanPacketMethod())
              .addMethod(getRecvCleanPacketMethod())
              .build();
        }
      }
    }
    return result;
  }
}
