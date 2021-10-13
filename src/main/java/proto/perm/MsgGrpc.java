package proto.perm;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the perm Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: perm/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "iritamod.perm.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Tx.MsgAssignRoles,
      Tx.MsgAssignRolesResponse> getAssignRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignRoles",
      requestType = Tx.MsgAssignRoles.class,
      responseType = Tx.MsgAssignRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgAssignRoles,
      Tx.MsgAssignRolesResponse> getAssignRolesMethod() {
    io.grpc.MethodDescriptor<Tx.MsgAssignRoles, Tx.MsgAssignRolesResponse> getAssignRolesMethod;
    if ((getAssignRolesMethod = MsgGrpc.getAssignRolesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAssignRolesMethod = MsgGrpc.getAssignRolesMethod) == null) {
          MsgGrpc.getAssignRolesMethod = getAssignRolesMethod =
              io.grpc.MethodDescriptor.<Tx.MsgAssignRoles, Tx.MsgAssignRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgAssignRoles.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgAssignRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AssignRoles"))
              .build();
        }
      }
    }
    return getAssignRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgUnassignRoles,
      Tx.MsgUnassignRolesResponse> getUnassignRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnassignRoles",
      requestType = Tx.MsgUnassignRoles.class,
      responseType = Tx.MsgUnassignRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgUnassignRoles,
      Tx.MsgUnassignRolesResponse> getUnassignRolesMethod() {
    io.grpc.MethodDescriptor<Tx.MsgUnassignRoles, Tx.MsgUnassignRolesResponse> getUnassignRolesMethod;
    if ((getUnassignRolesMethod = MsgGrpc.getUnassignRolesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnassignRolesMethod = MsgGrpc.getUnassignRolesMethod) == null) {
          MsgGrpc.getUnassignRolesMethod = getUnassignRolesMethod =
              io.grpc.MethodDescriptor.<Tx.MsgUnassignRoles, Tx.MsgUnassignRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnassignRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgUnassignRoles.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgUnassignRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnassignRoles"))
              .build();
        }
      }
    }
    return getUnassignRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgBlockAccount,
      Tx.MsgBlockAccountResponse> getBlockAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlockAccount",
      requestType = Tx.MsgBlockAccount.class,
      responseType = Tx.MsgBlockAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgBlockAccount,
      Tx.MsgBlockAccountResponse> getBlockAccountMethod() {
    io.grpc.MethodDescriptor<Tx.MsgBlockAccount, Tx.MsgBlockAccountResponse> getBlockAccountMethod;
    if ((getBlockAccountMethod = MsgGrpc.getBlockAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBlockAccountMethod = MsgGrpc.getBlockAccountMethod) == null) {
          MsgGrpc.getBlockAccountMethod = getBlockAccountMethod =
              io.grpc.MethodDescriptor.<Tx.MsgBlockAccount, Tx.MsgBlockAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlockAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgBlockAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgBlockAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BlockAccount"))
              .build();
        }
      }
    }
    return getBlockAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgUnblockAccount,
      Tx.MsgUnblockAccountResponse> getUnblockAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnblockAccount",
      requestType = Tx.MsgUnblockAccount.class,
      responseType = Tx.MsgUnblockAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgUnblockAccount,
      Tx.MsgUnblockAccountResponse> getUnblockAccountMethod() {
    io.grpc.MethodDescriptor<Tx.MsgUnblockAccount, Tx.MsgUnblockAccountResponse> getUnblockAccountMethod;
    if ((getUnblockAccountMethod = MsgGrpc.getUnblockAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnblockAccountMethod = MsgGrpc.getUnblockAccountMethod) == null) {
          MsgGrpc.getUnblockAccountMethod = getUnblockAccountMethod =
              io.grpc.MethodDescriptor.<Tx.MsgUnblockAccount, Tx.MsgUnblockAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnblockAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgUnblockAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgUnblockAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnblockAccount"))
              .build();
        }
      }
    }
    return getUnblockAccountMethod;
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
   * Msg defines the perm Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * AssignRoles defines a method for assigning roles for the operator.
     * </pre>
     */
    public void assignRoles(Tx.MsgAssignRoles request,
                            io.grpc.stub.StreamObserver<Tx.MsgAssignRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignRolesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnassignRoles defines a method for unassigning roles from the operator.
     * </pre>
     */
    public void unassignRoles(Tx.MsgUnassignRoles request,
                              io.grpc.stub.StreamObserver<Tx.MsgUnassignRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnassignRolesMethod(), responseObserver);
    }

    /**
     * <pre>
     * BlockAccount defines a method for blocking an account
     * </pre>
     */
    public void blockAccount(Tx.MsgBlockAccount request,
                             io.grpc.stub.StreamObserver<Tx.MsgBlockAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlockAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnblockAccount defines a method for unblocking a blocked account
     * </pre>
     */
    public void unblockAccount(Tx.MsgUnblockAccount request,
                               io.grpc.stub.StreamObserver<Tx.MsgUnblockAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnblockAccountMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAssignRolesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgAssignRoles,
                Tx.MsgAssignRolesResponse>(
                  this, METHODID_ASSIGN_ROLES)))
          .addMethod(
            getUnassignRolesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgUnassignRoles,
                Tx.MsgUnassignRolesResponse>(
                  this, METHODID_UNASSIGN_ROLES)))
          .addMethod(
            getBlockAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgBlockAccount,
                Tx.MsgBlockAccountResponse>(
                  this, METHODID_BLOCK_ACCOUNT)))
          .addMethod(
            getUnblockAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgUnblockAccount,
                Tx.MsgUnblockAccountResponse>(
                  this, METHODID_UNBLOCK_ACCOUNT)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the perm Msg service.
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
     * AssignRoles defines a method for assigning roles for the operator.
     * </pre>
     */
    public void assignRoles(Tx.MsgAssignRoles request,
                            io.grpc.stub.StreamObserver<Tx.MsgAssignRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnassignRoles defines a method for unassigning roles from the operator.
     * </pre>
     */
    public void unassignRoles(Tx.MsgUnassignRoles request,
                              io.grpc.stub.StreamObserver<Tx.MsgUnassignRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnassignRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BlockAccount defines a method for blocking an account
     * </pre>
     */
    public void blockAccount(Tx.MsgBlockAccount request,
                             io.grpc.stub.StreamObserver<Tx.MsgBlockAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlockAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnblockAccount defines a method for unblocking a blocked account
     * </pre>
     */
    public void unblockAccount(Tx.MsgUnblockAccount request,
                               io.grpc.stub.StreamObserver<Tx.MsgUnblockAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnblockAccountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the perm Msg service.
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
     * AssignRoles defines a method for assigning roles for the operator.
     * </pre>
     */
    public Tx.MsgAssignRolesResponse assignRoles(Tx.MsgAssignRoles request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignRolesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnassignRoles defines a method for unassigning roles from the operator.
     * </pre>
     */
    public Tx.MsgUnassignRolesResponse unassignRoles(Tx.MsgUnassignRoles request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnassignRolesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BlockAccount defines a method for blocking an account
     * </pre>
     */
    public Tx.MsgBlockAccountResponse blockAccount(Tx.MsgBlockAccount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlockAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnblockAccount defines a method for unblocking a blocked account
     * </pre>
     */
    public Tx.MsgUnblockAccountResponse unblockAccount(Tx.MsgUnblockAccount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnblockAccountMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the perm Msg service.
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
     * AssignRoles defines a method for assigning roles for the operator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgAssignRolesResponse> assignRoles(
        Tx.MsgAssignRoles request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignRolesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnassignRoles defines a method for unassigning roles from the operator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgUnassignRolesResponse> unassignRoles(
        Tx.MsgUnassignRoles request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnassignRolesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BlockAccount defines a method for blocking an account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgBlockAccountResponse> blockAccount(
        Tx.MsgBlockAccount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlockAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnblockAccount defines a method for unblocking a blocked account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgUnblockAccountResponse> unblockAccount(
        Tx.MsgUnblockAccount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnblockAccountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ASSIGN_ROLES = 0;
  private static final int METHODID_UNASSIGN_ROLES = 1;
  private static final int METHODID_BLOCK_ACCOUNT = 2;
  private static final int METHODID_UNBLOCK_ACCOUNT = 3;

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
        case METHODID_ASSIGN_ROLES:
          serviceImpl.assignRoles((Tx.MsgAssignRoles) request,
              (io.grpc.stub.StreamObserver<Tx.MsgAssignRolesResponse>) responseObserver);
          break;
        case METHODID_UNASSIGN_ROLES:
          serviceImpl.unassignRoles((Tx.MsgUnassignRoles) request,
              (io.grpc.stub.StreamObserver<Tx.MsgUnassignRolesResponse>) responseObserver);
          break;
        case METHODID_BLOCK_ACCOUNT:
          serviceImpl.blockAccount((Tx.MsgBlockAccount) request,
              (io.grpc.stub.StreamObserver<Tx.MsgBlockAccountResponse>) responseObserver);
          break;
        case METHODID_UNBLOCK_ACCOUNT:
          serviceImpl.unblockAccount((Tx.MsgUnblockAccount) request,
              (io.grpc.stub.StreamObserver<Tx.MsgUnblockAccountResponse>) responseObserver);
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
              .addMethod(getAssignRolesMethod())
              .addMethod(getUnassignRolesMethod())
              .addMethod(getBlockAccountMethod())
              .addMethod(getUnblockAccountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
