package proto.tibc.core.packet.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query provides defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: tibc/core/packet/v1/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "tibc.core.packet.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryPacketCommitmentRequest,
      QueryOuterClass.QueryPacketCommitmentResponse> getPacketCommitmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PacketCommitment",
      requestType = QueryOuterClass.QueryPacketCommitmentRequest.class,
      responseType = QueryOuterClass.QueryPacketCommitmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryPacketCommitmentRequest,
      QueryOuterClass.QueryPacketCommitmentResponse> getPacketCommitmentMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryPacketCommitmentRequest, QueryOuterClass.QueryPacketCommitmentResponse> getPacketCommitmentMethod;
    if ((getPacketCommitmentMethod = QueryGrpc.getPacketCommitmentMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPacketCommitmentMethod = QueryGrpc.getPacketCommitmentMethod) == null) {
          QueryGrpc.getPacketCommitmentMethod = getPacketCommitmentMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryPacketCommitmentRequest, QueryOuterClass.QueryPacketCommitmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PacketCommitment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryPacketCommitmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryPacketCommitmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PacketCommitment"))
              .build();
        }
      }
    }
    return getPacketCommitmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryPacketCommitmentsRequest,
      QueryOuterClass.QueryPacketCommitmentsResponse> getPacketCommitmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PacketCommitments",
      requestType = QueryOuterClass.QueryPacketCommitmentsRequest.class,
      responseType = QueryOuterClass.QueryPacketCommitmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryPacketCommitmentsRequest,
      QueryOuterClass.QueryPacketCommitmentsResponse> getPacketCommitmentsMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryPacketCommitmentsRequest, QueryOuterClass.QueryPacketCommitmentsResponse> getPacketCommitmentsMethod;
    if ((getPacketCommitmentsMethod = QueryGrpc.getPacketCommitmentsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPacketCommitmentsMethod = QueryGrpc.getPacketCommitmentsMethod) == null) {
          QueryGrpc.getPacketCommitmentsMethod = getPacketCommitmentsMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryPacketCommitmentsRequest, QueryOuterClass.QueryPacketCommitmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PacketCommitments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryPacketCommitmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryPacketCommitmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PacketCommitments"))
              .build();
        }
      }
    }
    return getPacketCommitmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryPacketReceiptRequest,
      QueryOuterClass.QueryPacketReceiptResponse> getPacketReceiptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PacketReceipt",
      requestType = QueryOuterClass.QueryPacketReceiptRequest.class,
      responseType = QueryOuterClass.QueryPacketReceiptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryPacketReceiptRequest,
      QueryOuterClass.QueryPacketReceiptResponse> getPacketReceiptMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryPacketReceiptRequest, QueryOuterClass.QueryPacketReceiptResponse> getPacketReceiptMethod;
    if ((getPacketReceiptMethod = QueryGrpc.getPacketReceiptMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPacketReceiptMethod = QueryGrpc.getPacketReceiptMethod) == null) {
          QueryGrpc.getPacketReceiptMethod = getPacketReceiptMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryPacketReceiptRequest, QueryOuterClass.QueryPacketReceiptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PacketReceipt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryPacketReceiptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryPacketReceiptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PacketReceipt"))
              .build();
        }
      }
    }
    return getPacketReceiptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryPacketAcknowledgementRequest,
      QueryOuterClass.QueryPacketAcknowledgementResponse> getPacketAcknowledgementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PacketAcknowledgement",
      requestType = QueryOuterClass.QueryPacketAcknowledgementRequest.class,
      responseType = QueryOuterClass.QueryPacketAcknowledgementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryPacketAcknowledgementRequest,
      QueryOuterClass.QueryPacketAcknowledgementResponse> getPacketAcknowledgementMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryPacketAcknowledgementRequest, QueryOuterClass.QueryPacketAcknowledgementResponse> getPacketAcknowledgementMethod;
    if ((getPacketAcknowledgementMethod = QueryGrpc.getPacketAcknowledgementMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPacketAcknowledgementMethod = QueryGrpc.getPacketAcknowledgementMethod) == null) {
          QueryGrpc.getPacketAcknowledgementMethod = getPacketAcknowledgementMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryPacketAcknowledgementRequest, QueryOuterClass.QueryPacketAcknowledgementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PacketAcknowledgement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryPacketAcknowledgementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryPacketAcknowledgementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PacketAcknowledgement"))
              .build();
        }
      }
    }
    return getPacketAcknowledgementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryPacketAcknowledgementsRequest,
      QueryOuterClass.QueryPacketAcknowledgementsResponse> getPacketAcknowledgementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PacketAcknowledgements",
      requestType = QueryOuterClass.QueryPacketAcknowledgementsRequest.class,
      responseType = QueryOuterClass.QueryPacketAcknowledgementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryPacketAcknowledgementsRequest,
      QueryOuterClass.QueryPacketAcknowledgementsResponse> getPacketAcknowledgementsMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryPacketAcknowledgementsRequest, QueryOuterClass.QueryPacketAcknowledgementsResponse> getPacketAcknowledgementsMethod;
    if ((getPacketAcknowledgementsMethod = QueryGrpc.getPacketAcknowledgementsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPacketAcknowledgementsMethod = QueryGrpc.getPacketAcknowledgementsMethod) == null) {
          QueryGrpc.getPacketAcknowledgementsMethod = getPacketAcknowledgementsMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryPacketAcknowledgementsRequest, QueryOuterClass.QueryPacketAcknowledgementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PacketAcknowledgements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryPacketAcknowledgementsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryPacketAcknowledgementsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PacketAcknowledgements"))
              .build();
        }
      }
    }
    return getPacketAcknowledgementsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryUnreceivedPacketsRequest,
      QueryOuterClass.QueryUnreceivedPacketsResponse> getUnreceivedPacketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnreceivedPackets",
      requestType = QueryOuterClass.QueryUnreceivedPacketsRequest.class,
      responseType = QueryOuterClass.QueryUnreceivedPacketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryUnreceivedPacketsRequest,
      QueryOuterClass.QueryUnreceivedPacketsResponse> getUnreceivedPacketsMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryUnreceivedPacketsRequest, QueryOuterClass.QueryUnreceivedPacketsResponse> getUnreceivedPacketsMethod;
    if ((getUnreceivedPacketsMethod = QueryGrpc.getUnreceivedPacketsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnreceivedPacketsMethod = QueryGrpc.getUnreceivedPacketsMethod) == null) {
          QueryGrpc.getUnreceivedPacketsMethod = getUnreceivedPacketsMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryUnreceivedPacketsRequest, QueryOuterClass.QueryUnreceivedPacketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnreceivedPackets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryUnreceivedPacketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryUnreceivedPacketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnreceivedPackets"))
              .build();
        }
      }
    }
    return getUnreceivedPacketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryUnreceivedAcksRequest,
      QueryOuterClass.QueryUnreceivedAcksResponse> getUnreceivedAcksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnreceivedAcks",
      requestType = QueryOuterClass.QueryUnreceivedAcksRequest.class,
      responseType = QueryOuterClass.QueryUnreceivedAcksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryUnreceivedAcksRequest,
      QueryOuterClass.QueryUnreceivedAcksResponse> getUnreceivedAcksMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryUnreceivedAcksRequest, QueryOuterClass.QueryUnreceivedAcksResponse> getUnreceivedAcksMethod;
    if ((getUnreceivedAcksMethod = QueryGrpc.getUnreceivedAcksMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnreceivedAcksMethod = QueryGrpc.getUnreceivedAcksMethod) == null) {
          QueryGrpc.getUnreceivedAcksMethod = getUnreceivedAcksMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryUnreceivedAcksRequest, QueryOuterClass.QueryUnreceivedAcksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnreceivedAcks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryUnreceivedAcksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryUnreceivedAcksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnreceivedAcks"))
              .build();
        }
      }
    }
    return getUnreceivedAcksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryCleanPacketCommitmentRequest,
      QueryOuterClass.QueryCleanPacketCommitmentResponse> getCleanPacketCommitmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CleanPacketCommitment",
      requestType = QueryOuterClass.QueryCleanPacketCommitmentRequest.class,
      responseType = QueryOuterClass.QueryCleanPacketCommitmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryCleanPacketCommitmentRequest,
      QueryOuterClass.QueryCleanPacketCommitmentResponse> getCleanPacketCommitmentMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryCleanPacketCommitmentRequest, QueryOuterClass.QueryCleanPacketCommitmentResponse> getCleanPacketCommitmentMethod;
    if ((getCleanPacketCommitmentMethod = QueryGrpc.getCleanPacketCommitmentMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCleanPacketCommitmentMethod = QueryGrpc.getCleanPacketCommitmentMethod) == null) {
          QueryGrpc.getCleanPacketCommitmentMethod = getCleanPacketCommitmentMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryCleanPacketCommitmentRequest, QueryOuterClass.QueryCleanPacketCommitmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CleanPacketCommitment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryCleanPacketCommitmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryCleanPacketCommitmentResponse.getDefaultInstance()))
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
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
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
    public void packetCommitment(QueryOuterClass.QueryPacketCommitmentRequest request,
                                 io.grpc.stub.StreamObserver<QueryOuterClass.QueryPacketCommitmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPacketCommitmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * PacketCommitments returns all the packet commitments hashes associated
     * </pre>
     */
    public void packetCommitments(QueryOuterClass.QueryPacketCommitmentsRequest request,
                                  io.grpc.stub.StreamObserver<QueryOuterClass.QueryPacketCommitmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPacketCommitmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * PacketReceipt queries if a given packet sequence has been received on the queried chain
     * </pre>
     */
    public void packetReceipt(QueryOuterClass.QueryPacketReceiptRequest request,
                              io.grpc.stub.StreamObserver<QueryOuterClass.QueryPacketReceiptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPacketReceiptMethod(), responseObserver);
    }

    /**
     * <pre>
     * PacketAcknowledgement queries a stored packet acknowledgement hash.
     * </pre>
     */
    public void packetAcknowledgement(QueryOuterClass.QueryPacketAcknowledgementRequest request,
                                      io.grpc.stub.StreamObserver<QueryOuterClass.QueryPacketAcknowledgementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPacketAcknowledgementMethod(), responseObserver);
    }

    /**
     * <pre>
     * PacketAcknowledgements returns all the packet acknowledgements associated
     * </pre>
     */
    public void packetAcknowledgements(QueryOuterClass.QueryPacketAcknowledgementsRequest request,
                                       io.grpc.stub.StreamObserver<QueryOuterClass.QueryPacketAcknowledgementsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPacketAcknowledgementsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnreceivedPackets returns all the unreceived TIBC packets associated with sequences.
     * </pre>
     */
    public void unreceivedPackets(QueryOuterClass.QueryUnreceivedPacketsRequest request,
                                  io.grpc.stub.StreamObserver<QueryOuterClass.QueryUnreceivedPacketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnreceivedPacketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnreceivedAcks returns all the unreceived TIBC acknowledgements associated with sequences.
     * </pre>
     */
    public void unreceivedAcks(QueryOuterClass.QueryUnreceivedAcksRequest request,
                               io.grpc.stub.StreamObserver<QueryOuterClass.QueryUnreceivedAcksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnreceivedAcksMethod(), responseObserver);
    }

    /**
     * <pre>
     * CleanPacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public void cleanPacketCommitment(QueryOuterClass.QueryCleanPacketCommitmentRequest request,
                                      io.grpc.stub.StreamObserver<QueryOuterClass.QueryCleanPacketCommitmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCleanPacketCommitmentMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPacketCommitmentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryPacketCommitmentRequest,
                QueryOuterClass.QueryPacketCommitmentResponse>(
                  this, METHODID_PACKET_COMMITMENT)))
          .addMethod(
            getPacketCommitmentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryPacketCommitmentsRequest,
                QueryOuterClass.QueryPacketCommitmentsResponse>(
                  this, METHODID_PACKET_COMMITMENTS)))
          .addMethod(
            getPacketReceiptMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryPacketReceiptRequest,
                QueryOuterClass.QueryPacketReceiptResponse>(
                  this, METHODID_PACKET_RECEIPT)))
          .addMethod(
            getPacketAcknowledgementMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryPacketAcknowledgementRequest,
                QueryOuterClass.QueryPacketAcknowledgementResponse>(
                  this, METHODID_PACKET_ACKNOWLEDGEMENT)))
          .addMethod(
            getPacketAcknowledgementsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryPacketAcknowledgementsRequest,
                QueryOuterClass.QueryPacketAcknowledgementsResponse>(
                  this, METHODID_PACKET_ACKNOWLEDGEMENTS)))
          .addMethod(
            getUnreceivedPacketsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryUnreceivedPacketsRequest,
                QueryOuterClass.QueryUnreceivedPacketsResponse>(
                  this, METHODID_UNRECEIVED_PACKETS)))
          .addMethod(
            getUnreceivedAcksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryUnreceivedAcksRequest,
                QueryOuterClass.QueryUnreceivedAcksResponse>(
                  this, METHODID_UNRECEIVED_ACKS)))
          .addMethod(
            getCleanPacketCommitmentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryCleanPacketCommitmentRequest,
                QueryOuterClass.QueryCleanPacketCommitmentResponse>(
                  this, METHODID_CLEAN_PACKET_COMMITMENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service
   * </pre>
   */
  public static final class QueryStub extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * PacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public void packetCommitment(QueryOuterClass.QueryPacketCommitmentRequest request,
                                 io.grpc.stub.StreamObserver<QueryOuterClass.QueryPacketCommitmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPacketCommitmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PacketCommitments returns all the packet commitments hashes associated
     * </pre>
     */
    public void packetCommitments(QueryOuterClass.QueryPacketCommitmentsRequest request,
                                  io.grpc.stub.StreamObserver<QueryOuterClass.QueryPacketCommitmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPacketCommitmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PacketReceipt queries if a given packet sequence has been received on the queried chain
     * </pre>
     */
    public void packetReceipt(QueryOuterClass.QueryPacketReceiptRequest request,
                              io.grpc.stub.StreamObserver<QueryOuterClass.QueryPacketReceiptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPacketReceiptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PacketAcknowledgement queries a stored packet acknowledgement hash.
     * </pre>
     */
    public void packetAcknowledgement(QueryOuterClass.QueryPacketAcknowledgementRequest request,
                                      io.grpc.stub.StreamObserver<QueryOuterClass.QueryPacketAcknowledgementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPacketAcknowledgementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PacketAcknowledgements returns all the packet acknowledgements associated
     * </pre>
     */
    public void packetAcknowledgements(QueryOuterClass.QueryPacketAcknowledgementsRequest request,
                                       io.grpc.stub.StreamObserver<QueryOuterClass.QueryPacketAcknowledgementsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPacketAcknowledgementsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnreceivedPackets returns all the unreceived TIBC packets associated with sequences.
     * </pre>
     */
    public void unreceivedPackets(QueryOuterClass.QueryUnreceivedPacketsRequest request,
                                  io.grpc.stub.StreamObserver<QueryOuterClass.QueryUnreceivedPacketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnreceivedPacketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnreceivedAcks returns all the unreceived TIBC acknowledgements associated with sequences.
     * </pre>
     */
    public void unreceivedAcks(QueryOuterClass.QueryUnreceivedAcksRequest request,
                               io.grpc.stub.StreamObserver<QueryOuterClass.QueryUnreceivedAcksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnreceivedAcksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CleanPacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public void cleanPacketCommitment(QueryOuterClass.QueryCleanPacketCommitmentRequest request,
                                      io.grpc.stub.StreamObserver<QueryOuterClass.QueryCleanPacketCommitmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCleanPacketCommitmentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service
   * </pre>
   */
  public static final class QueryBlockingStub extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * PacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public QueryOuterClass.QueryPacketCommitmentResponse packetCommitment(QueryOuterClass.QueryPacketCommitmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPacketCommitmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PacketCommitments returns all the packet commitments hashes associated
     * </pre>
     */
    public QueryOuterClass.QueryPacketCommitmentsResponse packetCommitments(QueryOuterClass.QueryPacketCommitmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPacketCommitmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PacketReceipt queries if a given packet sequence has been received on the queried chain
     * </pre>
     */
    public QueryOuterClass.QueryPacketReceiptResponse packetReceipt(QueryOuterClass.QueryPacketReceiptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPacketReceiptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PacketAcknowledgement queries a stored packet acknowledgement hash.
     * </pre>
     */
    public QueryOuterClass.QueryPacketAcknowledgementResponse packetAcknowledgement(QueryOuterClass.QueryPacketAcknowledgementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPacketAcknowledgementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PacketAcknowledgements returns all the packet acknowledgements associated
     * </pre>
     */
    public QueryOuterClass.QueryPacketAcknowledgementsResponse packetAcknowledgements(QueryOuterClass.QueryPacketAcknowledgementsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPacketAcknowledgementsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnreceivedPackets returns all the unreceived TIBC packets associated with sequences.
     * </pre>
     */
    public QueryOuterClass.QueryUnreceivedPacketsResponse unreceivedPackets(QueryOuterClass.QueryUnreceivedPacketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnreceivedPacketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnreceivedAcks returns all the unreceived TIBC acknowledgements associated with sequences.
     * </pre>
     */
    public QueryOuterClass.QueryUnreceivedAcksResponse unreceivedAcks(QueryOuterClass.QueryUnreceivedAcksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnreceivedAcksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CleanPacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public QueryOuterClass.QueryCleanPacketCommitmentResponse cleanPacketCommitment(QueryOuterClass.QueryCleanPacketCommitmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCleanPacketCommitmentMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service
   * </pre>
   */
  public static final class QueryFutureStub extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * PacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryPacketCommitmentResponse> packetCommitment(
        QueryOuterClass.QueryPacketCommitmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPacketCommitmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PacketCommitments returns all the packet commitments hashes associated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryPacketCommitmentsResponse> packetCommitments(
        QueryOuterClass.QueryPacketCommitmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPacketCommitmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PacketReceipt queries if a given packet sequence has been received on the queried chain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryPacketReceiptResponse> packetReceipt(
        QueryOuterClass.QueryPacketReceiptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPacketReceiptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PacketAcknowledgement queries a stored packet acknowledgement hash.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryPacketAcknowledgementResponse> packetAcknowledgement(
        QueryOuterClass.QueryPacketAcknowledgementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPacketAcknowledgementMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PacketAcknowledgements returns all the packet acknowledgements associated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryPacketAcknowledgementsResponse> packetAcknowledgements(
        QueryOuterClass.QueryPacketAcknowledgementsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPacketAcknowledgementsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnreceivedPackets returns all the unreceived TIBC packets associated with sequences.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryUnreceivedPacketsResponse> unreceivedPackets(
        QueryOuterClass.QueryUnreceivedPacketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnreceivedPacketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnreceivedAcks returns all the unreceived TIBC acknowledgements associated with sequences.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryUnreceivedAcksResponse> unreceivedAcks(
        QueryOuterClass.QueryUnreceivedAcksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnreceivedAcksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CleanPacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryCleanPacketCommitmentResponse> cleanPacketCommitment(
        QueryOuterClass.QueryCleanPacketCommitmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PACKET_COMMITMENT:
          serviceImpl.packetCommitment((QueryOuterClass.QueryPacketCommitmentRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryPacketCommitmentResponse>) responseObserver);
          break;
        case METHODID_PACKET_COMMITMENTS:
          serviceImpl.packetCommitments((QueryOuterClass.QueryPacketCommitmentsRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryPacketCommitmentsResponse>) responseObserver);
          break;
        case METHODID_PACKET_RECEIPT:
          serviceImpl.packetReceipt((QueryOuterClass.QueryPacketReceiptRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryPacketReceiptResponse>) responseObserver);
          break;
        case METHODID_PACKET_ACKNOWLEDGEMENT:
          serviceImpl.packetAcknowledgement((QueryOuterClass.QueryPacketAcknowledgementRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryPacketAcknowledgementResponse>) responseObserver);
          break;
        case METHODID_PACKET_ACKNOWLEDGEMENTS:
          serviceImpl.packetAcknowledgements((QueryOuterClass.QueryPacketAcknowledgementsRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryPacketAcknowledgementsResponse>) responseObserver);
          break;
        case METHODID_UNRECEIVED_PACKETS:
          serviceImpl.unreceivedPackets((QueryOuterClass.QueryUnreceivedPacketsRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryUnreceivedPacketsResponse>) responseObserver);
          break;
        case METHODID_UNRECEIVED_ACKS:
          serviceImpl.unreceivedAcks((QueryOuterClass.QueryUnreceivedAcksRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryUnreceivedAcksResponse>) responseObserver);
          break;
        case METHODID_CLEAN_PACKET_COMMITMENT:
          serviceImpl.cleanPacketCommitment((QueryOuterClass.QueryCleanPacketCommitmentRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryCleanPacketCommitmentResponse>) responseObserver);
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

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return QueryOuterClass.getDescriptor();
    }

    @Override
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

    @Override
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
