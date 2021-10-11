package proto.tibc.core.packet.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the tibc/packet Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: tibc/core/packet/v1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "tibc.core.packet.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Tx.MsgRecvPacket,
      Tx.MsgRecvPacketResponse> getRecvPacketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecvPacket",
      requestType = Tx.MsgRecvPacket.class,
      responseType = Tx.MsgRecvPacketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgRecvPacket,
      Tx.MsgRecvPacketResponse> getRecvPacketMethod() {
    io.grpc.MethodDescriptor<Tx.MsgRecvPacket, Tx.MsgRecvPacketResponse> getRecvPacketMethod;
    if ((getRecvPacketMethod = MsgGrpc.getRecvPacketMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRecvPacketMethod = MsgGrpc.getRecvPacketMethod) == null) {
          MsgGrpc.getRecvPacketMethod = getRecvPacketMethod =
              io.grpc.MethodDescriptor.<Tx.MsgRecvPacket, Tx.MsgRecvPacketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecvPacket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgRecvPacket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgRecvPacketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RecvPacket"))
              .build();
        }
      }
    }
    return getRecvPacketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgAcknowledgement,
      Tx.MsgAcknowledgementResponse> getAcknowledgementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Acknowledgement",
      requestType = Tx.MsgAcknowledgement.class,
      responseType = Tx.MsgAcknowledgementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgAcknowledgement,
      Tx.MsgAcknowledgementResponse> getAcknowledgementMethod() {
    io.grpc.MethodDescriptor<Tx.MsgAcknowledgement, Tx.MsgAcknowledgementResponse> getAcknowledgementMethod;
    if ((getAcknowledgementMethod = MsgGrpc.getAcknowledgementMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAcknowledgementMethod = MsgGrpc.getAcknowledgementMethod) == null) {
          MsgGrpc.getAcknowledgementMethod = getAcknowledgementMethod =
              io.grpc.MethodDescriptor.<Tx.MsgAcknowledgement, Tx.MsgAcknowledgementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Acknowledgement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgAcknowledgement.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgAcknowledgementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Acknowledgement"))
              .build();
        }
      }
    }
    return getAcknowledgementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgCleanPacket,
      Tx.MsgCleanPacketResponse> getCleanPacketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CleanPacket",
      requestType = Tx.MsgCleanPacket.class,
      responseType = Tx.MsgCleanPacketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgCleanPacket,
      Tx.MsgCleanPacketResponse> getCleanPacketMethod() {
    io.grpc.MethodDescriptor<Tx.MsgCleanPacket, Tx.MsgCleanPacketResponse> getCleanPacketMethod;
    if ((getCleanPacketMethod = MsgGrpc.getCleanPacketMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCleanPacketMethod = MsgGrpc.getCleanPacketMethod) == null) {
          MsgGrpc.getCleanPacketMethod = getCleanPacketMethod =
              io.grpc.MethodDescriptor.<Tx.MsgCleanPacket, Tx.MsgCleanPacketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CleanPacket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgCleanPacket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgCleanPacketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CleanPacket"))
              .build();
        }
      }
    }
    return getCleanPacketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgRecvCleanPacket,
      Tx.MsgRecvCleanPacketResponse> getRecvCleanPacketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecvCleanPacket",
      requestType = Tx.MsgRecvCleanPacket.class,
      responseType = Tx.MsgRecvCleanPacketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgRecvCleanPacket,
      Tx.MsgRecvCleanPacketResponse> getRecvCleanPacketMethod() {
    io.grpc.MethodDescriptor<Tx.MsgRecvCleanPacket, Tx.MsgRecvCleanPacketResponse> getRecvCleanPacketMethod;
    if ((getRecvCleanPacketMethod = MsgGrpc.getRecvCleanPacketMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRecvCleanPacketMethod = MsgGrpc.getRecvCleanPacketMethod) == null) {
          MsgGrpc.getRecvCleanPacketMethod = getRecvCleanPacketMethod =
              io.grpc.MethodDescriptor.<Tx.MsgRecvCleanPacket, Tx.MsgRecvCleanPacketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecvCleanPacket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgRecvCleanPacket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgRecvCleanPacketResponse.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<MsgStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgStub>() {
        @Override
        public MsgStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgStub(channel, callOptions);
        }
      };
    return MsgStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub>() {
        @Override
        public MsgBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgBlockingStub(channel, callOptions);
        }
      };
    return MsgBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub>() {
        @Override
        public MsgFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgFutureStub(channel, callOptions);
        }
      };
    return MsgFutureStub.newStub(factory, channel);
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
    public void recvPacket(Tx.MsgRecvPacket request,
                           io.grpc.stub.StreamObserver<Tx.MsgRecvPacketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecvPacketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Acknowledgement defines a rpc handler method for MsgAcknowledgement.
     * </pre>
     */
    public void acknowledgement(Tx.MsgAcknowledgement request,
                                io.grpc.stub.StreamObserver<Tx.MsgAcknowledgementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAcknowledgementMethod(), responseObserver);
    }

    /**
     * <pre>
     * CleanPacket defines a rpc handler method for MsgCleanPacket.
     * </pre>
     */
    public void cleanPacket(Tx.MsgCleanPacket request,
                            io.grpc.stub.StreamObserver<Tx.MsgCleanPacketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCleanPacketMethod(), responseObserver);
    }

    /**
     * <pre>
     * RecvCleanPacket defines a rpc handler method for MsgRecvCleanPacket.
     * </pre>
     */
    public void recvCleanPacket(Tx.MsgRecvCleanPacket request,
                                io.grpc.stub.StreamObserver<Tx.MsgRecvCleanPacketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecvCleanPacketMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecvPacketMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgRecvPacket,
                Tx.MsgRecvPacketResponse>(
                  this, METHODID_RECV_PACKET)))
          .addMethod(
            getAcknowledgementMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgAcknowledgement,
                Tx.MsgAcknowledgementResponse>(
                  this, METHODID_ACKNOWLEDGEMENT)))
          .addMethod(
            getCleanPacketMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgCleanPacket,
                Tx.MsgCleanPacketResponse>(
                  this, METHODID_CLEAN_PACKET)))
          .addMethod(
            getRecvCleanPacketMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgRecvCleanPacket,
                Tx.MsgRecvCleanPacketResponse>(
                  this, METHODID_RECV_CLEAN_PACKET)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the tibc/packet Msg service.
   * </pre>
   */
  public static final class MsgStub extends io.grpc.stub.AbstractAsyncStub<MsgStub> {
    private MsgStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MsgStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgStub(channel, callOptions);
    }

    /**
     * <pre>
     * RecvPacket defines a rpc handler method for MsgRecvPacket.
     * </pre>
     */
    public void recvPacket(Tx.MsgRecvPacket request,
                           io.grpc.stub.StreamObserver<Tx.MsgRecvPacketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecvPacketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Acknowledgement defines a rpc handler method for MsgAcknowledgement.
     * </pre>
     */
    public void acknowledgement(Tx.MsgAcknowledgement request,
                                io.grpc.stub.StreamObserver<Tx.MsgAcknowledgementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAcknowledgementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CleanPacket defines a rpc handler method for MsgCleanPacket.
     * </pre>
     */
    public void cleanPacket(Tx.MsgCleanPacket request,
                            io.grpc.stub.StreamObserver<Tx.MsgCleanPacketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCleanPacketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RecvCleanPacket defines a rpc handler method for MsgRecvCleanPacket.
     * </pre>
     */
    public void recvCleanPacket(Tx.MsgRecvCleanPacket request,
                                io.grpc.stub.StreamObserver<Tx.MsgRecvCleanPacketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecvCleanPacketMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the tibc/packet Msg service.
   * </pre>
   */
  public static final class MsgBlockingStub extends io.grpc.stub.AbstractBlockingStub<MsgBlockingStub> {
    private MsgBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MsgBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RecvPacket defines a rpc handler method for MsgRecvPacket.
     * </pre>
     */
    public Tx.MsgRecvPacketResponse recvPacket(Tx.MsgRecvPacket request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecvPacketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Acknowledgement defines a rpc handler method for MsgAcknowledgement.
     * </pre>
     */
    public Tx.MsgAcknowledgementResponse acknowledgement(Tx.MsgAcknowledgement request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAcknowledgementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CleanPacket defines a rpc handler method for MsgCleanPacket.
     * </pre>
     */
    public Tx.MsgCleanPacketResponse cleanPacket(Tx.MsgCleanPacket request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCleanPacketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RecvCleanPacket defines a rpc handler method for MsgRecvCleanPacket.
     * </pre>
     */
    public Tx.MsgRecvCleanPacketResponse recvCleanPacket(Tx.MsgRecvCleanPacket request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecvCleanPacketMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the tibc/packet Msg service.
   * </pre>
   */
  public static final class MsgFutureStub extends io.grpc.stub.AbstractFutureStub<MsgFutureStub> {
    private MsgFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MsgFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RecvPacket defines a rpc handler method for MsgRecvPacket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgRecvPacketResponse> recvPacket(
        Tx.MsgRecvPacket request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecvPacketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Acknowledgement defines a rpc handler method for MsgAcknowledgement.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgAcknowledgementResponse> acknowledgement(
        Tx.MsgAcknowledgement request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAcknowledgementMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CleanPacket defines a rpc handler method for MsgCleanPacket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgCleanPacketResponse> cleanPacket(
        Tx.MsgCleanPacket request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCleanPacketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RecvCleanPacket defines a rpc handler method for MsgRecvCleanPacket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgRecvCleanPacketResponse> recvCleanPacket(
        Tx.MsgRecvCleanPacket request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECV_PACKET:
          serviceImpl.recvPacket((Tx.MsgRecvPacket) request,
              (io.grpc.stub.StreamObserver<Tx.MsgRecvPacketResponse>) responseObserver);
          break;
        case METHODID_ACKNOWLEDGEMENT:
          serviceImpl.acknowledgement((Tx.MsgAcknowledgement) request,
              (io.grpc.stub.StreamObserver<Tx.MsgAcknowledgementResponse>) responseObserver);
          break;
        case METHODID_CLEAN_PACKET:
          serviceImpl.cleanPacket((Tx.MsgCleanPacket) request,
              (io.grpc.stub.StreamObserver<Tx.MsgCleanPacketResponse>) responseObserver);
          break;
        case METHODID_RECV_CLEAN_PACKET:
          serviceImpl.recvCleanPacket((Tx.MsgRecvCleanPacket) request,
              (io.grpc.stub.StreamObserver<Tx.MsgRecvCleanPacketResponse>) responseObserver);
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

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Tx.getDescriptor();
    }

    @Override
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

    @Override
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
