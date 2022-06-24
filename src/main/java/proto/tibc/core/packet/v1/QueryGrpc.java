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
 * Query provides defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: tibc/core/packet/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "tibc.core.packet.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentRequest,
      proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentResponse> getPacketCommitmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PacketCommitment",
      requestType = proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentRequest.class,
      responseType = proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentRequest,
      proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentResponse> getPacketCommitmentMethod() {
    io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentRequest, proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentResponse> getPacketCommitmentMethod;
    if ((getPacketCommitmentMethod = QueryGrpc.getPacketCommitmentMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPacketCommitmentMethod = QueryGrpc.getPacketCommitmentMethod) == null) {
          QueryGrpc.getPacketCommitmentMethod = getPacketCommitmentMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentRequest, proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.core.packet.v1.Query", "PacketCommitment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PacketCommitment"))
                  .build();
          }
        }
     }
     return getPacketCommitmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsRequest,
      proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsResponse> getPacketCommitmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PacketCommitments",
      requestType = proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsRequest.class,
      responseType = proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsRequest,
      proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsResponse> getPacketCommitmentsMethod() {
    io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsRequest, proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsResponse> getPacketCommitmentsMethod;
    if ((getPacketCommitmentsMethod = QueryGrpc.getPacketCommitmentsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPacketCommitmentsMethod = QueryGrpc.getPacketCommitmentsMethod) == null) {
          QueryGrpc.getPacketCommitmentsMethod = getPacketCommitmentsMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsRequest, proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.core.packet.v1.Query", "PacketCommitments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PacketCommitments"))
                  .build();
          }
        }
     }
     return getPacketCommitmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptRequest,
      proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptResponse> getPacketReceiptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PacketReceipt",
      requestType = proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptRequest.class,
      responseType = proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptRequest,
      proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptResponse> getPacketReceiptMethod() {
    io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptRequest, proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptResponse> getPacketReceiptMethod;
    if ((getPacketReceiptMethod = QueryGrpc.getPacketReceiptMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPacketReceiptMethod = QueryGrpc.getPacketReceiptMethod) == null) {
          QueryGrpc.getPacketReceiptMethod = getPacketReceiptMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptRequest, proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.core.packet.v1.Query", "PacketReceipt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PacketReceipt"))
                  .build();
          }
        }
     }
     return getPacketReceiptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementRequest,
      proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementResponse> getPacketAcknowledgementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PacketAcknowledgement",
      requestType = proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementRequest.class,
      responseType = proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementRequest,
      proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementResponse> getPacketAcknowledgementMethod() {
    io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementRequest, proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementResponse> getPacketAcknowledgementMethod;
    if ((getPacketAcknowledgementMethod = QueryGrpc.getPacketAcknowledgementMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPacketAcknowledgementMethod = QueryGrpc.getPacketAcknowledgementMethod) == null) {
          QueryGrpc.getPacketAcknowledgementMethod = getPacketAcknowledgementMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementRequest, proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.core.packet.v1.Query", "PacketAcknowledgement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PacketAcknowledgement"))
                  .build();
          }
        }
     }
     return getPacketAcknowledgementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsRequest,
      proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsResponse> getPacketAcknowledgementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PacketAcknowledgements",
      requestType = proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsRequest.class,
      responseType = proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsRequest,
      proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsResponse> getPacketAcknowledgementsMethod() {
    io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsRequest, proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsResponse> getPacketAcknowledgementsMethod;
    if ((getPacketAcknowledgementsMethod = QueryGrpc.getPacketAcknowledgementsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPacketAcknowledgementsMethod = QueryGrpc.getPacketAcknowledgementsMethod) == null) {
          QueryGrpc.getPacketAcknowledgementsMethod = getPacketAcknowledgementsMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsRequest, proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.core.packet.v1.Query", "PacketAcknowledgements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PacketAcknowledgements"))
                  .build();
          }
        }
     }
     return getPacketAcknowledgementsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsRequest,
      proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsResponse> getUnreceivedPacketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnreceivedPackets",
      requestType = proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsRequest.class,
      responseType = proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsRequest,
      proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsResponse> getUnreceivedPacketsMethod() {
    io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsRequest, proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsResponse> getUnreceivedPacketsMethod;
    if ((getUnreceivedPacketsMethod = QueryGrpc.getUnreceivedPacketsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnreceivedPacketsMethod = QueryGrpc.getUnreceivedPacketsMethod) == null) {
          QueryGrpc.getUnreceivedPacketsMethod = getUnreceivedPacketsMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsRequest, proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.core.packet.v1.Query", "UnreceivedPackets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnreceivedPackets"))
                  .build();
          }
        }
     }
     return getUnreceivedPacketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksRequest,
      proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksResponse> getUnreceivedAcksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnreceivedAcks",
      requestType = proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksRequest.class,
      responseType = proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksRequest,
      proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksResponse> getUnreceivedAcksMethod() {
    io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksRequest, proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksResponse> getUnreceivedAcksMethod;
    if ((getUnreceivedAcksMethod = QueryGrpc.getUnreceivedAcksMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnreceivedAcksMethod = QueryGrpc.getUnreceivedAcksMethod) == null) {
          QueryGrpc.getUnreceivedAcksMethod = getUnreceivedAcksMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksRequest, proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.core.packet.v1.Query", "UnreceivedAcks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnreceivedAcks"))
                  .build();
          }
        }
     }
     return getUnreceivedAcksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentRequest,
      proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentResponse> getCleanPacketCommitmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CleanPacketCommitment",
      requestType = proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentRequest.class,
      responseType = proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentRequest,
      proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentResponse> getCleanPacketCommitmentMethod() {
    io.grpc.MethodDescriptor<proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentRequest, proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentResponse> getCleanPacketCommitmentMethod;
    if ((getCleanPacketCommitmentMethod = QueryGrpc.getCleanPacketCommitmentMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCleanPacketCommitmentMethod = QueryGrpc.getCleanPacketCommitmentMethod) == null) {
          QueryGrpc.getCleanPacketCommitmentMethod = getCleanPacketCommitmentMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentRequest, proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.core.packet.v1.Query", "CleanPacketCommitment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CleanPacketCommitment"))
                  .build();
          }
        }
     }
     return getCleanPacketCommitmentMethod;
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
     * PacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public void packetCommitment(proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPacketCommitmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * PacketCommitments returns all the packet commitments hashes associated
     * </pre>
     */
    public void packetCommitments(proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPacketCommitmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * PacketReceipt queries if a given packet sequence has been received on the queried chain
     * </pre>
     */
    public void packetReceipt(proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPacketReceiptMethod(), responseObserver);
    }

    /**
     * <pre>
     * PacketAcknowledgement queries a stored packet acknowledgement hash.
     * </pre>
     */
    public void packetAcknowledgement(proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPacketAcknowledgementMethod(), responseObserver);
    }

    /**
     * <pre>
     * PacketAcknowledgements returns all the packet acknowledgements associated
     * </pre>
     */
    public void packetAcknowledgements(proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPacketAcknowledgementsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnreceivedPackets returns all the unreceived TIBC packets associated with sequences.
     * </pre>
     */
    public void unreceivedPackets(proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnreceivedPacketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnreceivedAcks returns all the unreceived TIBC acknowledgements associated with sequences.
     * </pre>
     */
    public void unreceivedAcks(proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnreceivedAcksMethod(), responseObserver);
    }

    /**
     * <pre>
     * CleanPacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public void cleanPacketCommitment(proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCleanPacketCommitmentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPacketCommitmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentRequest,
                proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentResponse>(
                  this, METHODID_PACKET_COMMITMENT)))
          .addMethod(
            getPacketCommitmentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsRequest,
                proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsResponse>(
                  this, METHODID_PACKET_COMMITMENTS)))
          .addMethod(
            getPacketReceiptMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptRequest,
                proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptResponse>(
                  this, METHODID_PACKET_RECEIPT)))
          .addMethod(
            getPacketAcknowledgementMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementRequest,
                proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementResponse>(
                  this, METHODID_PACKET_ACKNOWLEDGEMENT)))
          .addMethod(
            getPacketAcknowledgementsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsRequest,
                proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsResponse>(
                  this, METHODID_PACKET_ACKNOWLEDGEMENTS)))
          .addMethod(
            getUnreceivedPacketsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsRequest,
                proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsResponse>(
                  this, METHODID_UNRECEIVED_PACKETS)))
          .addMethod(
            getUnreceivedAcksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksRequest,
                proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksResponse>(
                  this, METHODID_UNRECEIVED_ACKS)))
          .addMethod(
            getCleanPacketCommitmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentRequest,
                proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentResponse>(
                  this, METHODID_CLEAN_PACKET_COMMITMENT)))
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
     * PacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public void packetCommitment(proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPacketCommitmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PacketCommitments returns all the packet commitments hashes associated
     * </pre>
     */
    public void packetCommitments(proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPacketCommitmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PacketReceipt queries if a given packet sequence has been received on the queried chain
     * </pre>
     */
    public void packetReceipt(proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPacketReceiptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PacketAcknowledgement queries a stored packet acknowledgement hash.
     * </pre>
     */
    public void packetAcknowledgement(proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPacketAcknowledgementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PacketAcknowledgements returns all the packet acknowledgements associated
     * </pre>
     */
    public void packetAcknowledgements(proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPacketAcknowledgementsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnreceivedPackets returns all the unreceived TIBC packets associated with sequences.
     * </pre>
     */
    public void unreceivedPackets(proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnreceivedPacketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnreceivedAcks returns all the unreceived TIBC acknowledgements associated with sequences.
     * </pre>
     */
    public void unreceivedAcks(proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnreceivedAcksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CleanPacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public void cleanPacketCommitment(proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentRequest request,
        io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCleanPacketCommitmentMethod(), getCallOptions()), request, responseObserver);
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
     * PacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentResponse packetCommitment(proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getPacketCommitmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PacketCommitments returns all the packet commitments hashes associated
     * </pre>
     */
    public proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsResponse packetCommitments(proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPacketCommitmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PacketReceipt queries if a given packet sequence has been received on the queried chain
     * </pre>
     */
    public proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptResponse packetReceipt(proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptRequest request) {
      return blockingUnaryCall(
          getChannel(), getPacketReceiptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PacketAcknowledgement queries a stored packet acknowledgement hash.
     * </pre>
     */
    public proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementResponse packetAcknowledgement(proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementRequest request) {
      return blockingUnaryCall(
          getChannel(), getPacketAcknowledgementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PacketAcknowledgements returns all the packet acknowledgements associated
     * </pre>
     */
    public proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsResponse packetAcknowledgements(proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPacketAcknowledgementsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnreceivedPackets returns all the unreceived TIBC packets associated with sequences.
     * </pre>
     */
    public proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsResponse unreceivedPackets(proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnreceivedPacketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnreceivedAcks returns all the unreceived TIBC acknowledgements associated with sequences.
     * </pre>
     */
    public proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksResponse unreceivedAcks(proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnreceivedAcksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CleanPacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentResponse cleanPacketCommitment(proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCleanPacketCommitmentMethod(), getCallOptions(), request);
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
     * PacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentResponse> packetCommitment(
        proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPacketCommitmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PacketCommitments returns all the packet commitments hashes associated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsResponse> packetCommitments(
        proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPacketCommitmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PacketReceipt queries if a given packet sequence has been received on the queried chain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptResponse> packetReceipt(
        proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPacketReceiptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PacketAcknowledgement queries a stored packet acknowledgement hash.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementResponse> packetAcknowledgement(
        proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPacketAcknowledgementMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PacketAcknowledgements returns all the packet acknowledgements associated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsResponse> packetAcknowledgements(
        proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPacketAcknowledgementsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnreceivedPackets returns all the unreceived TIBC packets associated with sequences.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsResponse> unreceivedPackets(
        proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnreceivedPacketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnreceivedAcks returns all the unreceived TIBC acknowledgements associated with sequences.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksResponse> unreceivedAcks(
        proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnreceivedAcksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CleanPacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentResponse> cleanPacketCommitment(
        proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCleanPacketCommitmentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PACKET_COMMITMENT = 0;
  private static final int METHODID_PACKET_COMMITMENTS = 1;
  private static final int METHODID_PACKET_RECEIPT = 2;
  private static final int METHODID_PACKET_ACKNOWLEDGEMENT = 3;
  private static final int METHODID_PACKET_ACKNOWLEDGEMENTS = 4;
  private static final int METHODID_UNRECEIVED_PACKETS = 5;
  private static final int METHODID_UNRECEIVED_ACKS = 6;
  private static final int METHODID_CLEAN_PACKET_COMMITMENT = 7;

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
        case METHODID_PACKET_COMMITMENT:
          serviceImpl.packetCommitment((proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentRequest) request,
              (io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentResponse>) responseObserver);
          break;
        case METHODID_PACKET_COMMITMENTS:
          serviceImpl.packetCommitments((proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsRequest) request,
              (io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketCommitmentsResponse>) responseObserver);
          break;
        case METHODID_PACKET_RECEIPT:
          serviceImpl.packetReceipt((proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptRequest) request,
              (io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketReceiptResponse>) responseObserver);
          break;
        case METHODID_PACKET_ACKNOWLEDGEMENT:
          serviceImpl.packetAcknowledgement((proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementRequest) request,
              (io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementResponse>) responseObserver);
          break;
        case METHODID_PACKET_ACKNOWLEDGEMENTS:
          serviceImpl.packetAcknowledgements((proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsRequest) request,
              (io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryPacketAcknowledgementsResponse>) responseObserver);
          break;
        case METHODID_UNRECEIVED_PACKETS:
          serviceImpl.unreceivedPackets((proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsRequest) request,
              (io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedPacketsResponse>) responseObserver);
          break;
        case METHODID_UNRECEIVED_ACKS:
          serviceImpl.unreceivedAcks((proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksRequest) request,
              (io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryUnreceivedAcksResponse>) responseObserver);
          break;
        case METHODID_CLEAN_PACKET_COMMITMENT:
          serviceImpl.cleanPacketCommitment((proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentRequest) request,
              (io.grpc.stub.StreamObserver<proto.tibc.core.packet.v1.QueryOuterClass.QueryCleanPacketCommitmentResponse>) responseObserver);
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
      return proto.tibc.core.packet.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getPacketCommitmentMethod())
              .addMethod(getPacketCommitmentsMethod())
              .addMethod(getPacketReceiptMethod())
              .addMethod(getPacketAcknowledgementMethod())
              .addMethod(getPacketAcknowledgementsMethod())
              .addMethod(getUnreceivedPacketsMethod())
              .addMethod(getUnreceivedAcksMethod())
              .addMethod(getCleanPacketCommitmentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
