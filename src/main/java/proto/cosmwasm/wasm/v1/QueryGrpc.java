package proto.cosmwasm.wasm.v1;

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
    comments = "Source: cosmwasm/wasm/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "cosmwasm.wasm.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest,
      proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse> getContractInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractInfo",
      requestType = proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest.class,
      responseType = proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest,
      proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse> getContractInfoMethod() {
    io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest, proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse> getContractInfoMethod;
    if ((getContractInfoMethod = QueryGrpc.getContractInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractInfoMethod = QueryGrpc.getContractInfoMethod) == null) {
          QueryGrpc.getContractInfoMethod = getContractInfoMethod = 
              io.grpc.MethodDescriptor.<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest, proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmwasm.wasm.v1.Query", "ContractInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractInfo"))
                  .build();
          }
        }
     }
     return getContractInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest,
      proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse> getContractHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractHistory",
      requestType = proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest.class,
      responseType = proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest,
      proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse> getContractHistoryMethod() {
    io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest, proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse> getContractHistoryMethod;
    if ((getContractHistoryMethod = QueryGrpc.getContractHistoryMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractHistoryMethod = QueryGrpc.getContractHistoryMethod) == null) {
          QueryGrpc.getContractHistoryMethod = getContractHistoryMethod = 
              io.grpc.MethodDescriptor.<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest, proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmwasm.wasm.v1.Query", "ContractHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractHistory"))
                  .build();
          }
        }
     }
     return getContractHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest,
      proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse> getContractsByCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractsByCode",
      requestType = proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest.class,
      responseType = proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest,
      proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse> getContractsByCodeMethod() {
    io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest, proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse> getContractsByCodeMethod;
    if ((getContractsByCodeMethod = QueryGrpc.getContractsByCodeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractsByCodeMethod = QueryGrpc.getContractsByCodeMethod) == null) {
          QueryGrpc.getContractsByCodeMethod = getContractsByCodeMethod = 
              io.grpc.MethodDescriptor.<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest, proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmwasm.wasm.v1.Query", "ContractsByCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractsByCode"))
                  .build();
          }
        }
     }
     return getContractsByCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest,
      proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse> getAllContractStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllContractState",
      requestType = proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest.class,
      responseType = proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest,
      proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse> getAllContractStateMethod() {
    io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest, proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse> getAllContractStateMethod;
    if ((getAllContractStateMethod = QueryGrpc.getAllContractStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllContractStateMethod = QueryGrpc.getAllContractStateMethod) == null) {
          QueryGrpc.getAllContractStateMethod = getAllContractStateMethod = 
              io.grpc.MethodDescriptor.<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest, proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmwasm.wasm.v1.Query", "AllContractState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllContractState"))
                  .build();
          }
        }
     }
     return getAllContractStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest,
      proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse> getRawContractStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawContractState",
      requestType = proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest.class,
      responseType = proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest,
      proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse> getRawContractStateMethod() {
    io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest, proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse> getRawContractStateMethod;
    if ((getRawContractStateMethod = QueryGrpc.getRawContractStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRawContractStateMethod = QueryGrpc.getRawContractStateMethod) == null) {
          QueryGrpc.getRawContractStateMethod = getRawContractStateMethod = 
              io.grpc.MethodDescriptor.<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest, proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmwasm.wasm.v1.Query", "RawContractState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RawContractState"))
                  .build();
          }
        }
     }
     return getRawContractStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest,
      proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse> getSmartContractStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SmartContractState",
      requestType = proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest.class,
      responseType = proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest,
      proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse> getSmartContractStateMethod() {
    io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest, proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse> getSmartContractStateMethod;
    if ((getSmartContractStateMethod = QueryGrpc.getSmartContractStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSmartContractStateMethod = QueryGrpc.getSmartContractStateMethod) == null) {
          QueryGrpc.getSmartContractStateMethod = getSmartContractStateMethod = 
              io.grpc.MethodDescriptor.<proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest, proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmwasm.wasm.v1.Query", "SmartContractState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SmartContractState"))
                  .build();
          }
        }
     }
     return getSmartContractStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest,
      proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse> getCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Code",
      requestType = proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest.class,
      responseType = proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest,
      proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse> getCodeMethod() {
    io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest, proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse> getCodeMethod;
    if ((getCodeMethod = QueryGrpc.getCodeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCodeMethod = QueryGrpc.getCodeMethod) == null) {
          QueryGrpc.getCodeMethod = getCodeMethod = 
              io.grpc.MethodDescriptor.<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest, proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmwasm.wasm.v1.Query", "Code"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Code"))
                  .build();
          }
        }
     }
     return getCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest,
      proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse> getCodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Codes",
      requestType = proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest.class,
      responseType = proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest,
      proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse> getCodesMethod() {
    io.grpc.MethodDescriptor<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest, proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse> getCodesMethod;
    if ((getCodesMethod = QueryGrpc.getCodesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCodesMethod = QueryGrpc.getCodesMethod) == null) {
          QueryGrpc.getCodesMethod = getCodesMethod = 
              io.grpc.MethodDescriptor.<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest, proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cosmwasm.wasm.v1.Query", "Codes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Codes"))
                  .build();
          }
        }
     }
     return getCodesMethod;
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
     * ContractInfo gets the contract meta data
     * </pre>
     */
    public void contractInfo(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest request,
        io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getContractInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * ContractHistory gets the contract code history
     * </pre>
     */
    public void contractHistory(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest request,
        io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getContractHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * ContractsByCode lists all smart contracts for a code id
     * </pre>
     */
    public void contractsByCode(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest request,
        io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getContractsByCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllContractState gets all raw store data for a single contract
     * </pre>
     */
    public void allContractState(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest request,
        io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllContractStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * RawContractState gets single key from the raw store data of a contract
     * </pre>
     */
    public void rawContractState(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest request,
        io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRawContractStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * SmartContractState get smart query result from the contract
     * </pre>
     */
    public void smartContractState(proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest request,
        io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSmartContractStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Code gets the binary code and metadata for a singe wasm code
     * </pre>
     */
    public void code(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest request,
        io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Codes gets the metadata for all stored wasm codes
     * </pre>
     */
    public void codes(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest request,
        io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCodesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getContractInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest,
                proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse>(
                  this, METHODID_CONTRACT_INFO)))
          .addMethod(
            getContractHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest,
                proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse>(
                  this, METHODID_CONTRACT_HISTORY)))
          .addMethod(
            getContractsByCodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest,
                proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse>(
                  this, METHODID_CONTRACTS_BY_CODE)))
          .addMethod(
            getAllContractStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest,
                proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse>(
                  this, METHODID_ALL_CONTRACT_STATE)))
          .addMethod(
            getRawContractStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest,
                proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse>(
                  this, METHODID_RAW_CONTRACT_STATE)))
          .addMethod(
            getSmartContractStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest,
                proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse>(
                  this, METHODID_SMART_CONTRACT_STATE)))
          .addMethod(
            getCodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest,
                proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse>(
                  this, METHODID_CODE)))
          .addMethod(
            getCodesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest,
                proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse>(
                  this, METHODID_CODES)))
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
     * ContractInfo gets the contract meta data
     * </pre>
     */
    public void contractInfo(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest request,
        io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getContractInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ContractHistory gets the contract code history
     * </pre>
     */
    public void contractHistory(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest request,
        io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getContractHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ContractsByCode lists all smart contracts for a code id
     * </pre>
     */
    public void contractsByCode(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest request,
        io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getContractsByCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllContractState gets all raw store data for a single contract
     * </pre>
     */
    public void allContractState(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest request,
        io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllContractStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RawContractState gets single key from the raw store data of a contract
     * </pre>
     */
    public void rawContractState(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest request,
        io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRawContractStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SmartContractState get smart query result from the contract
     * </pre>
     */
    public void smartContractState(proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest request,
        io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSmartContractStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Code gets the binary code and metadata for a singe wasm code
     * </pre>
     */
    public void code(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest request,
        io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Codes gets the metadata for all stored wasm codes
     * </pre>
     */
    public void codes(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest request,
        io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCodesMethod(), getCallOptions()), request, responseObserver);
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
     * ContractInfo gets the contract meta data
     * </pre>
     */
    public proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse contractInfo(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getContractInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ContractHistory gets the contract code history
     * </pre>
     */
    public proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse contractHistory(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getContractHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ContractsByCode lists all smart contracts for a code id
     * </pre>
     */
    public proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse contractsByCode(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest request) {
      return blockingUnaryCall(
          getChannel(), getContractsByCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllContractState gets all raw store data for a single contract
     * </pre>
     */
    public proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse allContractState(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllContractStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RawContractState gets single key from the raw store data of a contract
     * </pre>
     */
    public proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse rawContractState(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getRawContractStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SmartContractState get smart query result from the contract
     * </pre>
     */
    public proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse smartContractState(proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSmartContractStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Code gets the binary code and metadata for a singe wasm code
     * </pre>
     */
    public proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse code(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest request) {
      return blockingUnaryCall(
          getChannel(), getCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Codes gets the metadata for all stored wasm codes
     * </pre>
     */
    public proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse codes(proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest request) {
      return blockingUnaryCall(
          getChannel(), getCodesMethod(), getCallOptions(), request);
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
     * ContractInfo gets the contract meta data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse> contractInfo(
        proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getContractInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ContractHistory gets the contract code history
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse> contractHistory(
        proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getContractHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ContractsByCode lists all smart contracts for a code id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse> contractsByCode(
        proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getContractsByCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllContractState gets all raw store data for a single contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse> allContractState(
        proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllContractStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RawContractState gets single key from the raw store data of a contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse> rawContractState(
        proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRawContractStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SmartContractState get smart query result from the contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse> smartContractState(
        proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSmartContractStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Code gets the binary code and metadata for a singe wasm code
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse> code(
        proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Codes gets the metadata for all stored wasm codes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse> codes(
        proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCodesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONTRACT_INFO = 0;
  private static final int METHODID_CONTRACT_HISTORY = 1;
  private static final int METHODID_CONTRACTS_BY_CODE = 2;
  private static final int METHODID_ALL_CONTRACT_STATE = 3;
  private static final int METHODID_RAW_CONTRACT_STATE = 4;
  private static final int METHODID_SMART_CONTRACT_STATE = 5;
  private static final int METHODID_CODE = 6;
  private static final int METHODID_CODES = 7;

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
        case METHODID_CONTRACT_INFO:
          serviceImpl.contractInfo((proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest) request,
              (io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse>) responseObserver);
          break;
        case METHODID_CONTRACT_HISTORY:
          serviceImpl.contractHistory((proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest) request,
              (io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse>) responseObserver);
          break;
        case METHODID_CONTRACTS_BY_CODE:
          serviceImpl.contractsByCode((proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest) request,
              (io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse>) responseObserver);
          break;
        case METHODID_ALL_CONTRACT_STATE:
          serviceImpl.allContractState((proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest) request,
              (io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse>) responseObserver);
          break;
        case METHODID_RAW_CONTRACT_STATE:
          serviceImpl.rawContractState((proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest) request,
              (io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse>) responseObserver);
          break;
        case METHODID_SMART_CONTRACT_STATE:
          serviceImpl.smartContractState((proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest) request,
              (io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse>) responseObserver);
          break;
        case METHODID_CODE:
          serviceImpl.code((proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest) request,
              (io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse>) responseObserver);
          break;
        case METHODID_CODES:
          serviceImpl.codes((proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest) request,
              (io.grpc.stub.StreamObserver<proto.cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse>) responseObserver);
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
      return proto.cosmwasm.wasm.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getContractInfoMethod())
              .addMethod(getContractHistoryMethod())
              .addMethod(getContractsByCodeMethod())
              .addMethod(getAllContractStateMethod())
              .addMethod(getRawContractStateMethod())
              .addMethod(getSmartContractStateMethod())
              .addMethod(getCodeMethod())
              .addMethod(getCodesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
