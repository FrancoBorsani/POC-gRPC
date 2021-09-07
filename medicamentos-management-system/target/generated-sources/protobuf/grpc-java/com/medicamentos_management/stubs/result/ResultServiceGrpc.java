package com.medicamentos_management.stubs.result;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Now let's define our service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: result.proto")
public final class ResultServiceGrpc {

  private ResultServiceGrpc() {}

  public static final String SERVICE_NAME = "com.medicamentos_management.stubs.result.ResultService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.medicamentos_management.stubs.result.ResultRequest,
      com.medicamentos_management.stubs.result.ResultResponse> getGetResultForMedicamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getResultForMedicamento",
      requestType = com.medicamentos_management.stubs.result.ResultRequest.class,
      responseType = com.medicamentos_management.stubs.result.ResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.medicamentos_management.stubs.result.ResultRequest,
      com.medicamentos_management.stubs.result.ResultResponse> getGetResultForMedicamentoMethod() {
    io.grpc.MethodDescriptor<com.medicamentos_management.stubs.result.ResultRequest, com.medicamentos_management.stubs.result.ResultResponse> getGetResultForMedicamentoMethod;
    if ((getGetResultForMedicamentoMethod = ResultServiceGrpc.getGetResultForMedicamentoMethod) == null) {
      synchronized (ResultServiceGrpc.class) {
        if ((getGetResultForMedicamentoMethod = ResultServiceGrpc.getGetResultForMedicamentoMethod) == null) {
          ResultServiceGrpc.getGetResultForMedicamentoMethod = getGetResultForMedicamentoMethod =
              io.grpc.MethodDescriptor.<com.medicamentos_management.stubs.result.ResultRequest, com.medicamentos_management.stubs.result.ResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getResultForMedicamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medicamentos_management.stubs.result.ResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medicamentos_management.stubs.result.ResultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResultServiceMethodDescriptorSupplier("getResultForMedicamento"))
              .build();
        }
      }
    }
    return getGetResultForMedicamentoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.medicamentos_management.stubs.result.ResultRequest,
      com.medicamentos_management.stubs.result.TipoMedicamento> getGetResultForTipoMedicamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getResultForTipoMedicamento",
      requestType = com.medicamentos_management.stubs.result.ResultRequest.class,
      responseType = com.medicamentos_management.stubs.result.TipoMedicamento.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.medicamentos_management.stubs.result.ResultRequest,
      com.medicamentos_management.stubs.result.TipoMedicamento> getGetResultForTipoMedicamentoMethod() {
    io.grpc.MethodDescriptor<com.medicamentos_management.stubs.result.ResultRequest, com.medicamentos_management.stubs.result.TipoMedicamento> getGetResultForTipoMedicamentoMethod;
    if ((getGetResultForTipoMedicamentoMethod = ResultServiceGrpc.getGetResultForTipoMedicamentoMethod) == null) {
      synchronized (ResultServiceGrpc.class) {
        if ((getGetResultForTipoMedicamentoMethod = ResultServiceGrpc.getGetResultForTipoMedicamentoMethod) == null) {
          ResultServiceGrpc.getGetResultForTipoMedicamentoMethod = getGetResultForTipoMedicamentoMethod =
              io.grpc.MethodDescriptor.<com.medicamentos_management.stubs.result.ResultRequest, com.medicamentos_management.stubs.result.TipoMedicamento>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getResultForTipoMedicamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medicamentos_management.stubs.result.ResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medicamentos_management.stubs.result.TipoMedicamento.getDefaultInstance()))
              .setSchemaDescriptor(new ResultServiceMethodDescriptorSupplier("getResultForTipoMedicamento"))
              .build();
        }
      }
    }
    return getGetResultForTipoMedicamentoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResultServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResultServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResultServiceStub>() {
        @java.lang.Override
        public ResultServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResultServiceStub(channel, callOptions);
        }
      };
    return ResultServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResultServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResultServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResultServiceBlockingStub>() {
        @java.lang.Override
        public ResultServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResultServiceBlockingStub(channel, callOptions);
        }
      };
    return ResultServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResultServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResultServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResultServiceFutureStub>() {
        @java.lang.Override
        public ResultServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResultServiceFutureStub(channel, callOptions);
        }
      };
    return ResultServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Now let's define our service
   * </pre>
   */
  public static abstract class ResultServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getResultForMedicamento(com.medicamentos_management.stubs.result.ResultRequest request,
        io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.result.ResultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetResultForMedicamentoMethod(), responseObserver);
    }

    /**
     */
    public void getResultForTipoMedicamento(com.medicamentos_management.stubs.result.ResultRequest request,
        io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.result.TipoMedicamento> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetResultForTipoMedicamentoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetResultForMedicamentoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.medicamentos_management.stubs.result.ResultRequest,
                com.medicamentos_management.stubs.result.ResultResponse>(
                  this, METHODID_GET_RESULT_FOR_MEDICAMENTO)))
          .addMethod(
            getGetResultForTipoMedicamentoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.medicamentos_management.stubs.result.ResultRequest,
                com.medicamentos_management.stubs.result.TipoMedicamento>(
                  this, METHODID_GET_RESULT_FOR_TIPO_MEDICAMENTO)))
          .build();
    }
  }

  /**
   * <pre>
   * Now let's define our service
   * </pre>
   */
  public static final class ResultServiceStub extends io.grpc.stub.AbstractAsyncStub<ResultServiceStub> {
    private ResultServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResultServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResultServiceStub(channel, callOptions);
    }

    /**
     */
    public void getResultForMedicamento(com.medicamentos_management.stubs.result.ResultRequest request,
        io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.result.ResultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetResultForMedicamentoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getResultForTipoMedicamento(com.medicamentos_management.stubs.result.ResultRequest request,
        io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.result.TipoMedicamento> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetResultForTipoMedicamentoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Now let's define our service
   * </pre>
   */
  public static final class ResultServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ResultServiceBlockingStub> {
    private ResultServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResultServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResultServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.medicamentos_management.stubs.result.ResultResponse getResultForMedicamento(com.medicamentos_management.stubs.result.ResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetResultForMedicamentoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.medicamentos_management.stubs.result.TipoMedicamento getResultForTipoMedicamento(com.medicamentos_management.stubs.result.ResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetResultForTipoMedicamentoMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Now let's define our service
   * </pre>
   */
  public static final class ResultServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ResultServiceFutureStub> {
    private ResultServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResultServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResultServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.medicamentos_management.stubs.result.ResultResponse> getResultForMedicamento(
        com.medicamentos_management.stubs.result.ResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetResultForMedicamentoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.medicamentos_management.stubs.result.TipoMedicamento> getResultForTipoMedicamento(
        com.medicamentos_management.stubs.result.ResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetResultForTipoMedicamentoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RESULT_FOR_MEDICAMENTO = 0;
  private static final int METHODID_GET_RESULT_FOR_TIPO_MEDICAMENTO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResultServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResultServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RESULT_FOR_MEDICAMENTO:
          serviceImpl.getResultForMedicamento((com.medicamentos_management.stubs.result.ResultRequest) request,
              (io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.result.ResultResponse>) responseObserver);
          break;
        case METHODID_GET_RESULT_FOR_TIPO_MEDICAMENTO:
          serviceImpl.getResultForTipoMedicamento((com.medicamentos_management.stubs.result.ResultRequest) request,
              (io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.result.TipoMedicamento>) responseObserver);
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

  private static abstract class ResultServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResultServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.medicamentos_management.stubs.result.Result.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResultService");
    }
  }

  private static final class ResultServiceFileDescriptorSupplier
      extends ResultServiceBaseDescriptorSupplier {
    ResultServiceFileDescriptorSupplier() {}
  }

  private static final class ResultServiceMethodDescriptorSupplier
      extends ResultServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResultServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResultServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResultServiceFileDescriptorSupplier())
              .addMethod(getGetResultForMedicamentoMethod())
              .addMethod(getGetResultForTipoMedicamentoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
