package proto.perm;

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
 * Msg defines the perm Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: perm/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "iritamod.perm.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.perm.Tx.MsgAssignRoles,
      proto.perm.Tx.MsgAssignRolesResponse> getAssignRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignRoles",
      requestType = proto.perm.Tx.MsgAssignRoles.class,
      responseType = proto.perm.Tx.MsgAssignRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.perm.Tx.MsgAssignRoles,
      proto.perm.Tx.MsgAssignRolesResponse> getAssignRolesMethod() {
    io.grpc.MethodDescriptor<proto.perm.Tx.MsgAssignRoles, proto.perm.Tx.MsgAssignRolesResponse> getAssignRolesMethod;
    if ((getAssignRolesMethod = MsgGrpc.getAssignRolesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAssignRolesMethod = MsgGrpc.getAssignRolesMethod) == null) {
          MsgGrpc.getAssignRolesMethod = getAssignRolesMethod = 
              io.grpc.MethodDescriptor.<proto.perm.Tx.MsgAssignRoles, proto.perm.Tx.MsgAssignRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iritamod.perm.Msg", "AssignRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.Tx.MsgAssignRoles.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.Tx.MsgAssignRolesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AssignRoles"))
                  .build();
          }
        }
     }
     return getAssignRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.perm.Tx.MsgUnassignRoles,
      proto.perm.Tx.MsgUnassignRolesResponse> getUnassignRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnassignRoles",
      requestType = proto.perm.Tx.MsgUnassignRoles.class,
      responseType = proto.perm.Tx.MsgUnassignRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.perm.Tx.MsgUnassignRoles,
      proto.perm.Tx.MsgUnassignRolesResponse> getUnassignRolesMethod() {
    io.grpc.MethodDescriptor<proto.perm.Tx.MsgUnassignRoles, proto.perm.Tx.MsgUnassignRolesResponse> getUnassignRolesMethod;
    if ((getUnassignRolesMethod = MsgGrpc.getUnassignRolesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnassignRolesMethod = MsgGrpc.getUnassignRolesMethod) == null) {
          MsgGrpc.getUnassignRolesMethod = getUnassignRolesMethod = 
              io.grpc.MethodDescriptor.<proto.perm.Tx.MsgUnassignRoles, proto.perm.Tx.MsgUnassignRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iritamod.perm.Msg", "UnassignRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.Tx.MsgUnassignRoles.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.Tx.MsgUnassignRolesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnassignRoles"))
                  .build();
          }
        }
     }
     return getUnassignRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.perm.Tx.MsgBlockAccount,
      proto.perm.Tx.MsgBlockAccountResponse> getBlockAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlockAccount",
      requestType = proto.perm.Tx.MsgBlockAccount.class,
      responseType = proto.perm.Tx.MsgBlockAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.perm.Tx.MsgBlockAccount,
      proto.perm.Tx.MsgBlockAccountResponse> getBlockAccountMethod() {
    io.grpc.MethodDescriptor<proto.perm.Tx.MsgBlockAccount, proto.perm.Tx.MsgBlockAccountResponse> getBlockAccountMethod;
    if ((getBlockAccountMethod = MsgGrpc.getBlockAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBlockAccountMethod = MsgGrpc.getBlockAccountMethod) == null) {
          MsgGrpc.getBlockAccountMethod = getBlockAccountMethod = 
              io.grpc.MethodDescriptor.<proto.perm.Tx.MsgBlockAccount, proto.perm.Tx.MsgBlockAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iritamod.perm.Msg", "BlockAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.Tx.MsgBlockAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.Tx.MsgBlockAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BlockAccount"))
                  .build();
          }
        }
     }
     return getBlockAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.perm.Tx.MsgUnblockAccount,
      proto.perm.Tx.MsgUnblockAccountResponse> getUnblockAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnblockAccount",
      requestType = proto.perm.Tx.MsgUnblockAccount.class,
      responseType = proto.perm.Tx.MsgUnblockAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.perm.Tx.MsgUnblockAccount,
      proto.perm.Tx.MsgUnblockAccountResponse> getUnblockAccountMethod() {
    io.grpc.MethodDescriptor<proto.perm.Tx.MsgUnblockAccount, proto.perm.Tx.MsgUnblockAccountResponse> getUnblockAccountMethod;
    if ((getUnblockAccountMethod = MsgGrpc.getUnblockAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnblockAccountMethod = MsgGrpc.getUnblockAccountMethod) == null) {
          MsgGrpc.getUnblockAccountMethod = getUnblockAccountMethod = 
              io.grpc.MethodDescriptor.<proto.perm.Tx.MsgUnblockAccount, proto.perm.Tx.MsgUnblockAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iritamod.perm.Msg", "UnblockAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.Tx.MsgUnblockAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.Tx.MsgUnblockAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnblockAccount"))
                  .build();
          }
        }
     }
     return getUnblockAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.perm.Tx.MsgBlockContract,
      proto.perm.Tx.MsgBlockContractResponse> getBlockContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlockContract",
      requestType = proto.perm.Tx.MsgBlockContract.class,
      responseType = proto.perm.Tx.MsgBlockContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.perm.Tx.MsgBlockContract,
      proto.perm.Tx.MsgBlockContractResponse> getBlockContractMethod() {
    io.grpc.MethodDescriptor<proto.perm.Tx.MsgBlockContract, proto.perm.Tx.MsgBlockContractResponse> getBlockContractMethod;
    if ((getBlockContractMethod = MsgGrpc.getBlockContractMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBlockContractMethod = MsgGrpc.getBlockContractMethod) == null) {
          MsgGrpc.getBlockContractMethod = getBlockContractMethod = 
              io.grpc.MethodDescriptor.<proto.perm.Tx.MsgBlockContract, proto.perm.Tx.MsgBlockContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iritamod.perm.Msg", "BlockContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.Tx.MsgBlockContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.Tx.MsgBlockContractResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BlockContract"))
                  .build();
          }
        }
     }
     return getBlockContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.perm.Tx.MsgUnblockContract,
      proto.perm.Tx.MsgUnblockContractResponse> getUnblockContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnblockContract",
      requestType = proto.perm.Tx.MsgUnblockContract.class,
      responseType = proto.perm.Tx.MsgUnblockContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.perm.Tx.MsgUnblockContract,
      proto.perm.Tx.MsgUnblockContractResponse> getUnblockContractMethod() {
    io.grpc.MethodDescriptor<proto.perm.Tx.MsgUnblockContract, proto.perm.Tx.MsgUnblockContractResponse> getUnblockContractMethod;
    if ((getUnblockContractMethod = MsgGrpc.getUnblockContractMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnblockContractMethod = MsgGrpc.getUnblockContractMethod) == null) {
          MsgGrpc.getUnblockContractMethod = getUnblockContractMethod = 
              io.grpc.MethodDescriptor.<proto.perm.Tx.MsgUnblockContract, proto.perm.Tx.MsgUnblockContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iritamod.perm.Msg", "UnblockContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.Tx.MsgUnblockContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.Tx.MsgUnblockContractResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnblockContract"))
                  .build();
          }
        }
     }
     return getUnblockContractMethod;
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
   * Msg defines the perm Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * AssignRoles defines a method for assigning roles for the operator.
     * </pre>
     */
    public void assignRoles(proto.perm.Tx.MsgAssignRoles request,
        io.grpc.stub.StreamObserver<proto.perm.Tx.MsgAssignRolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignRolesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnassignRoles defines a method for unassigning roles from the operator.
     * </pre>
     */
    public void unassignRoles(proto.perm.Tx.MsgUnassignRoles request,
        io.grpc.stub.StreamObserver<proto.perm.Tx.MsgUnassignRolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnassignRolesMethod(), responseObserver);
    }

    /**
     * <pre>
     * BlockAccount defines a method for blocking an account
     * </pre>
     */
    public void blockAccount(proto.perm.Tx.MsgBlockAccount request,
        io.grpc.stub.StreamObserver<proto.perm.Tx.MsgBlockAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlockAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnblockAccount defines a method for unblocking a blocked account
     * </pre>
     */
    public void unblockAccount(proto.perm.Tx.MsgUnblockAccount request,
        io.grpc.stub.StreamObserver<proto.perm.Tx.MsgUnblockAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnblockAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * BlockContract defines a method for blocking an contract
     * </pre>
     */
    public void blockContract(proto.perm.Tx.MsgBlockContract request,
        io.grpc.stub.StreamObserver<proto.perm.Tx.MsgBlockContractResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlockContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnblockContract defines a method for unblocking a blocked contract
     * </pre>
     */
    public void unblockContract(proto.perm.Tx.MsgUnblockContract request,
        io.grpc.stub.StreamObserver<proto.perm.Tx.MsgUnblockContractResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnblockContractMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAssignRolesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.perm.Tx.MsgAssignRoles,
                proto.perm.Tx.MsgAssignRolesResponse>(
                  this, METHODID_ASSIGN_ROLES)))
          .addMethod(
            getUnassignRolesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.perm.Tx.MsgUnassignRoles,
                proto.perm.Tx.MsgUnassignRolesResponse>(
                  this, METHODID_UNASSIGN_ROLES)))
          .addMethod(
            getBlockAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.perm.Tx.MsgBlockAccount,
                proto.perm.Tx.MsgBlockAccountResponse>(
                  this, METHODID_BLOCK_ACCOUNT)))
          .addMethod(
            getUnblockAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.perm.Tx.MsgUnblockAccount,
                proto.perm.Tx.MsgUnblockAccountResponse>(
                  this, METHODID_UNBLOCK_ACCOUNT)))
          .addMethod(
            getBlockContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.perm.Tx.MsgBlockContract,
                proto.perm.Tx.MsgBlockContractResponse>(
                  this, METHODID_BLOCK_CONTRACT)))
          .addMethod(
            getUnblockContractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.perm.Tx.MsgUnblockContract,
                proto.perm.Tx.MsgUnblockContractResponse>(
                  this, METHODID_UNBLOCK_CONTRACT)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the perm Msg service.
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
     * AssignRoles defines a method for assigning roles for the operator.
     * </pre>
     */
    public void assignRoles(proto.perm.Tx.MsgAssignRoles request,
        io.grpc.stub.StreamObserver<proto.perm.Tx.MsgAssignRolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnassignRoles defines a method for unassigning roles from the operator.
     * </pre>
     */
    public void unassignRoles(proto.perm.Tx.MsgUnassignRoles request,
        io.grpc.stub.StreamObserver<proto.perm.Tx.MsgUnassignRolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnassignRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BlockAccount defines a method for blocking an account
     * </pre>
     */
    public void blockAccount(proto.perm.Tx.MsgBlockAccount request,
        io.grpc.stub.StreamObserver<proto.perm.Tx.MsgBlockAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlockAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnblockAccount defines a method for unblocking a blocked account
     * </pre>
     */
    public void unblockAccount(proto.perm.Tx.MsgUnblockAccount request,
        io.grpc.stub.StreamObserver<proto.perm.Tx.MsgUnblockAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnblockAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BlockContract defines a method for blocking an contract
     * </pre>
     */
    public void blockContract(proto.perm.Tx.MsgBlockContract request,
        io.grpc.stub.StreamObserver<proto.perm.Tx.MsgBlockContractResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlockContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnblockContract defines a method for unblocking a blocked contract
     * </pre>
     */
    public void unblockContract(proto.perm.Tx.MsgUnblockContract request,
        io.grpc.stub.StreamObserver<proto.perm.Tx.MsgUnblockContractResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnblockContractMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the perm Msg service.
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
     * AssignRoles defines a method for assigning roles for the operator.
     * </pre>
     */
    public proto.perm.Tx.MsgAssignRolesResponse assignRoles(proto.perm.Tx.MsgAssignRoles request) {
      return blockingUnaryCall(
          getChannel(), getAssignRolesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnassignRoles defines a method for unassigning roles from the operator.
     * </pre>
     */
    public proto.perm.Tx.MsgUnassignRolesResponse unassignRoles(proto.perm.Tx.MsgUnassignRoles request) {
      return blockingUnaryCall(
          getChannel(), getUnassignRolesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BlockAccount defines a method for blocking an account
     * </pre>
     */
    public proto.perm.Tx.MsgBlockAccountResponse blockAccount(proto.perm.Tx.MsgBlockAccount request) {
      return blockingUnaryCall(
          getChannel(), getBlockAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnblockAccount defines a method for unblocking a blocked account
     * </pre>
     */
    public proto.perm.Tx.MsgUnblockAccountResponse unblockAccount(proto.perm.Tx.MsgUnblockAccount request) {
      return blockingUnaryCall(
          getChannel(), getUnblockAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BlockContract defines a method for blocking an contract
     * </pre>
     */
    public proto.perm.Tx.MsgBlockContractResponse blockContract(proto.perm.Tx.MsgBlockContract request) {
      return blockingUnaryCall(
          getChannel(), getBlockContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnblockContract defines a method for unblocking a blocked contract
     * </pre>
     */
    public proto.perm.Tx.MsgUnblockContractResponse unblockContract(proto.perm.Tx.MsgUnblockContract request) {
      return blockingUnaryCall(
          getChannel(), getUnblockContractMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the perm Msg service.
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
     * AssignRoles defines a method for assigning roles for the operator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.perm.Tx.MsgAssignRolesResponse> assignRoles(
        proto.perm.Tx.MsgAssignRoles request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignRolesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnassignRoles defines a method for unassigning roles from the operator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.perm.Tx.MsgUnassignRolesResponse> unassignRoles(
        proto.perm.Tx.MsgUnassignRoles request) {
      return futureUnaryCall(
          getChannel().newCall(getUnassignRolesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BlockAccount defines a method for blocking an account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.perm.Tx.MsgBlockAccountResponse> blockAccount(
        proto.perm.Tx.MsgBlockAccount request) {
      return futureUnaryCall(
          getChannel().newCall(getBlockAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnblockAccount defines a method for unblocking a blocked account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.perm.Tx.MsgUnblockAccountResponse> unblockAccount(
        proto.perm.Tx.MsgUnblockAccount request) {
      return futureUnaryCall(
          getChannel().newCall(getUnblockAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BlockContract defines a method for blocking an contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.perm.Tx.MsgBlockContractResponse> blockContract(
        proto.perm.Tx.MsgBlockContract request) {
      return futureUnaryCall(
          getChannel().newCall(getBlockContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnblockContract defines a method for unblocking a blocked contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.perm.Tx.MsgUnblockContractResponse> unblockContract(
        proto.perm.Tx.MsgUnblockContract request) {
      return futureUnaryCall(
          getChannel().newCall(getUnblockContractMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ASSIGN_ROLES = 0;
  private static final int METHODID_UNASSIGN_ROLES = 1;
  private static final int METHODID_BLOCK_ACCOUNT = 2;
  private static final int METHODID_UNBLOCK_ACCOUNT = 3;
  private static final int METHODID_BLOCK_CONTRACT = 4;
  private static final int METHODID_UNBLOCK_CONTRACT = 5;

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
        case METHODID_ASSIGN_ROLES:
          serviceImpl.assignRoles((proto.perm.Tx.MsgAssignRoles) request,
              (io.grpc.stub.StreamObserver<proto.perm.Tx.MsgAssignRolesResponse>) responseObserver);
          break;
        case METHODID_UNASSIGN_ROLES:
          serviceImpl.unassignRoles((proto.perm.Tx.MsgUnassignRoles) request,
              (io.grpc.stub.StreamObserver<proto.perm.Tx.MsgUnassignRolesResponse>) responseObserver);
          break;
        case METHODID_BLOCK_ACCOUNT:
          serviceImpl.blockAccount((proto.perm.Tx.MsgBlockAccount) request,
              (io.grpc.stub.StreamObserver<proto.perm.Tx.MsgBlockAccountResponse>) responseObserver);
          break;
        case METHODID_UNBLOCK_ACCOUNT:
          serviceImpl.unblockAccount((proto.perm.Tx.MsgUnblockAccount) request,
              (io.grpc.stub.StreamObserver<proto.perm.Tx.MsgUnblockAccountResponse>) responseObserver);
          break;
        case METHODID_BLOCK_CONTRACT:
          serviceImpl.blockContract((proto.perm.Tx.MsgBlockContract) request,
              (io.grpc.stub.StreamObserver<proto.perm.Tx.MsgBlockContractResponse>) responseObserver);
          break;
        case METHODID_UNBLOCK_CONTRACT:
          serviceImpl.unblockContract((proto.perm.Tx.MsgUnblockContract) request,
              (io.grpc.stub.StreamObserver<proto.perm.Tx.MsgUnblockContractResponse>) responseObserver);
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
      return proto.perm.Tx.getDescriptor();
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
              .addMethod(getAssignRolesMethod())
              .addMethod(getUnassignRolesMethod())
              .addMethod(getBlockAccountMethod())
              .addMethod(getUnblockAccountMethod())
              .addMethod(getBlockContractMethod())
              .addMethod(getUnblockContractMethod())
              .build();
        }
      }
    }
    return result;
  }
}
