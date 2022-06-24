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
 * Query defines the gRPC querier service for perm module
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: perm/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "iritamod.perm.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.perm.QueryOuterClass.QueryRolesRequest,
      proto.perm.QueryOuterClass.QueryRolesResponse> getRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Roles",
      requestType = proto.perm.QueryOuterClass.QueryRolesRequest.class,
      responseType = proto.perm.QueryOuterClass.QueryRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.perm.QueryOuterClass.QueryRolesRequest,
      proto.perm.QueryOuterClass.QueryRolesResponse> getRolesMethod() {
    io.grpc.MethodDescriptor<proto.perm.QueryOuterClass.QueryRolesRequest, proto.perm.QueryOuterClass.QueryRolesResponse> getRolesMethod;
    if ((getRolesMethod = QueryGrpc.getRolesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRolesMethod = QueryGrpc.getRolesMethod) == null) {
          QueryGrpc.getRolesMethod = getRolesMethod = 
              io.grpc.MethodDescriptor.<proto.perm.QueryOuterClass.QueryRolesRequest, proto.perm.QueryOuterClass.QueryRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iritamod.perm.Query", "Roles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.QueryOuterClass.QueryRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.QueryOuterClass.QueryRolesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Roles"))
                  .build();
          }
        }
     }
     return getRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.perm.QueryOuterClass.QueryBlockListRequest,
      proto.perm.QueryOuterClass.QueryBlockListResponse> getAccountBlockListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountBlockList",
      requestType = proto.perm.QueryOuterClass.QueryBlockListRequest.class,
      responseType = proto.perm.QueryOuterClass.QueryBlockListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.perm.QueryOuterClass.QueryBlockListRequest,
      proto.perm.QueryOuterClass.QueryBlockListResponse> getAccountBlockListMethod() {
    io.grpc.MethodDescriptor<proto.perm.QueryOuterClass.QueryBlockListRequest, proto.perm.QueryOuterClass.QueryBlockListResponse> getAccountBlockListMethod;
    if ((getAccountBlockListMethod = QueryGrpc.getAccountBlockListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountBlockListMethod = QueryGrpc.getAccountBlockListMethod) == null) {
          QueryGrpc.getAccountBlockListMethod = getAccountBlockListMethod = 
              io.grpc.MethodDescriptor.<proto.perm.QueryOuterClass.QueryBlockListRequest, proto.perm.QueryOuterClass.QueryBlockListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iritamod.perm.Query", "AccountBlockList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.QueryOuterClass.QueryBlockListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.QueryOuterClass.QueryBlockListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountBlockList"))
                  .build();
          }
        }
     }
     return getAccountBlockListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.perm.QueryOuterClass.QueryContractDenyList,
      proto.perm.QueryOuterClass.QueryContractDenyListResponse> getContractDenyListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractDenyList",
      requestType = proto.perm.QueryOuterClass.QueryContractDenyList.class,
      responseType = proto.perm.QueryOuterClass.QueryContractDenyListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.perm.QueryOuterClass.QueryContractDenyList,
      proto.perm.QueryOuterClass.QueryContractDenyListResponse> getContractDenyListMethod() {
    io.grpc.MethodDescriptor<proto.perm.QueryOuterClass.QueryContractDenyList, proto.perm.QueryOuterClass.QueryContractDenyListResponse> getContractDenyListMethod;
    if ((getContractDenyListMethod = QueryGrpc.getContractDenyListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractDenyListMethod = QueryGrpc.getContractDenyListMethod) == null) {
          QueryGrpc.getContractDenyListMethod = getContractDenyListMethod = 
              io.grpc.MethodDescriptor.<proto.perm.QueryOuterClass.QueryContractDenyList, proto.perm.QueryOuterClass.QueryContractDenyListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iritamod.perm.Query", "ContractDenyList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.QueryOuterClass.QueryContractDenyList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.perm.QueryOuterClass.QueryContractDenyListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractDenyList"))
                  .build();
          }
        }
     }
     return getContractDenyListMethod;
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
   * Query defines the gRPC querier service for perm module
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Roles queries the roles of a given address
     * </pre>
     */
    public void roles(proto.perm.QueryOuterClass.QueryRolesRequest request,
        io.grpc.stub.StreamObserver<proto.perm.QueryOuterClass.QueryRolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRolesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Blacklist queries the black list
     * </pre>
     */
    public void accountBlockList(proto.perm.QueryOuterClass.QueryBlockListRequest request,
        io.grpc.stub.StreamObserver<proto.perm.QueryOuterClass.QueryBlockListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountBlockListMethod(), responseObserver);
    }

    /**
     * <pre>
     * ContractDenyList queries the contract deny list
     * </pre>
     */
    public void contractDenyList(proto.perm.QueryOuterClass.QueryContractDenyList request,
        io.grpc.stub.StreamObserver<proto.perm.QueryOuterClass.QueryContractDenyListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getContractDenyListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRolesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.perm.QueryOuterClass.QueryRolesRequest,
                proto.perm.QueryOuterClass.QueryRolesResponse>(
                  this, METHODID_ROLES)))
          .addMethod(
            getAccountBlockListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.perm.QueryOuterClass.QueryBlockListRequest,
                proto.perm.QueryOuterClass.QueryBlockListResponse>(
                  this, METHODID_ACCOUNT_BLOCK_LIST)))
          .addMethod(
            getContractDenyListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.perm.QueryOuterClass.QueryContractDenyList,
                proto.perm.QueryOuterClass.QueryContractDenyListResponse>(
                  this, METHODID_CONTRACT_DENY_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for perm module
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
     * Roles queries the roles of a given address
     * </pre>
     */
    public void roles(proto.perm.QueryOuterClass.QueryRolesRequest request,
        io.grpc.stub.StreamObserver<proto.perm.QueryOuterClass.QueryRolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Blacklist queries the black list
     * </pre>
     */
    public void accountBlockList(proto.perm.QueryOuterClass.QueryBlockListRequest request,
        io.grpc.stub.StreamObserver<proto.perm.QueryOuterClass.QueryBlockListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountBlockListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ContractDenyList queries the contract deny list
     * </pre>
     */
    public void contractDenyList(proto.perm.QueryOuterClass.QueryContractDenyList request,
        io.grpc.stub.StreamObserver<proto.perm.QueryOuterClass.QueryContractDenyListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getContractDenyListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for perm module
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
     * Roles queries the roles of a given address
     * </pre>
     */
    public proto.perm.QueryOuterClass.QueryRolesResponse roles(proto.perm.QueryOuterClass.QueryRolesRequest request) {
      return blockingUnaryCall(
          getChannel(), getRolesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Blacklist queries the black list
     * </pre>
     */
    public proto.perm.QueryOuterClass.QueryBlockListResponse accountBlockList(proto.perm.QueryOuterClass.QueryBlockListRequest request) {
      return blockingUnaryCall(
          getChannel(), getAccountBlockListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ContractDenyList queries the contract deny list
     * </pre>
     */
    public proto.perm.QueryOuterClass.QueryContractDenyListResponse contractDenyList(proto.perm.QueryOuterClass.QueryContractDenyList request) {
      return blockingUnaryCall(
          getChannel(), getContractDenyListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query defines the gRPC querier service for perm module
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
     * Roles queries the roles of a given address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.perm.QueryOuterClass.QueryRolesResponse> roles(
        proto.perm.QueryOuterClass.QueryRolesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRolesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Blacklist queries the black list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.perm.QueryOuterClass.QueryBlockListResponse> accountBlockList(
        proto.perm.QueryOuterClass.QueryBlockListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountBlockListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ContractDenyList queries the contract deny list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.perm.QueryOuterClass.QueryContractDenyListResponse> contractDenyList(
        proto.perm.QueryOuterClass.QueryContractDenyList request) {
      return futureUnaryCall(
          getChannel().newCall(getContractDenyListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ROLES = 0;
  private static final int METHODID_ACCOUNT_BLOCK_LIST = 1;
  private static final int METHODID_CONTRACT_DENY_LIST = 2;

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
        case METHODID_ROLES:
          serviceImpl.roles((proto.perm.QueryOuterClass.QueryRolesRequest) request,
              (io.grpc.stub.StreamObserver<proto.perm.QueryOuterClass.QueryRolesResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_BLOCK_LIST:
          serviceImpl.accountBlockList((proto.perm.QueryOuterClass.QueryBlockListRequest) request,
              (io.grpc.stub.StreamObserver<proto.perm.QueryOuterClass.QueryBlockListResponse>) responseObserver);
          break;
        case METHODID_CONTRACT_DENY_LIST:
          serviceImpl.contractDenyList((proto.perm.QueryOuterClass.QueryContractDenyList) request,
              (io.grpc.stub.StreamObserver<proto.perm.QueryOuterClass.QueryContractDenyListResponse>) responseObserver);
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
      return proto.perm.QueryOuterClass.getDescriptor();
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
              .addMethod(getRolesMethod())
              .addMethod(getAccountBlockListMethod())
              .addMethod(getContractDenyListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
