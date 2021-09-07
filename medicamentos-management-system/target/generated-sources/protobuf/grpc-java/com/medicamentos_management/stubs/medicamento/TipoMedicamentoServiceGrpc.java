package com.medicamentos_management.stubs.medicamento;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: medicamento.proto")
public final class TipoMedicamentoServiceGrpc {

  private TipoMedicamentoServiceGrpc() {}

  public static final String SERVICE_NAME = "com.medicamentos_management.stubs.medicamento.TipoMedicamentoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.TipoMedicamento,
      com.medicamentos_management.stubs.medicamento.TipoMedicamento> getAltaTipoMedicamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "altaTipoMedicamento",
      requestType = com.medicamentos_management.stubs.medicamento.TipoMedicamento.class,
      responseType = com.medicamentos_management.stubs.medicamento.TipoMedicamento.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.TipoMedicamento,
      com.medicamentos_management.stubs.medicamento.TipoMedicamento> getAltaTipoMedicamentoMethod() {
    io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.TipoMedicamento, com.medicamentos_management.stubs.medicamento.TipoMedicamento> getAltaTipoMedicamentoMethod;
    if ((getAltaTipoMedicamentoMethod = TipoMedicamentoServiceGrpc.getAltaTipoMedicamentoMethod) == null) {
      synchronized (TipoMedicamentoServiceGrpc.class) {
        if ((getAltaTipoMedicamentoMethod = TipoMedicamentoServiceGrpc.getAltaTipoMedicamentoMethod) == null) {
          TipoMedicamentoServiceGrpc.getAltaTipoMedicamentoMethod = getAltaTipoMedicamentoMethod =
              io.grpc.MethodDescriptor.<com.medicamentos_management.stubs.medicamento.TipoMedicamento, com.medicamentos_management.stubs.medicamento.TipoMedicamento>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "altaTipoMedicamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medicamentos_management.stubs.medicamento.TipoMedicamento.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medicamentos_management.stubs.medicamento.TipoMedicamento.getDefaultInstance()))
              .setSchemaDescriptor(new TipoMedicamentoServiceMethodDescriptorSupplier("altaTipoMedicamento"))
              .build();
        }
      }
    }
    return getAltaTipoMedicamentoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      com.google.protobuf.Empty> getBajaTipoMedicamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bajaTipoMedicamento",
      requestType = com.google.protobuf.Int32Value.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      com.google.protobuf.Empty> getBajaTipoMedicamentoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int32Value, com.google.protobuf.Empty> getBajaTipoMedicamentoMethod;
    if ((getBajaTipoMedicamentoMethod = TipoMedicamentoServiceGrpc.getBajaTipoMedicamentoMethod) == null) {
      synchronized (TipoMedicamentoServiceGrpc.class) {
        if ((getBajaTipoMedicamentoMethod = TipoMedicamentoServiceGrpc.getBajaTipoMedicamentoMethod) == null) {
          TipoMedicamentoServiceGrpc.getBajaTipoMedicamentoMethod = getBajaTipoMedicamentoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Int32Value, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "bajaTipoMedicamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int32Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TipoMedicamentoServiceMethodDescriptorSupplier("bajaTipoMedicamento"))
              .build();
        }
      }
    }
    return getBajaTipoMedicamentoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.TipoMedicamentoRequest,
      com.medicamentos_management.stubs.medicamento.TipoMedicamentoResponse> getGetTipoMedicamentoInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTipoMedicamentoInfo",
      requestType = com.medicamentos_management.stubs.medicamento.TipoMedicamentoRequest.class,
      responseType = com.medicamentos_management.stubs.medicamento.TipoMedicamentoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.TipoMedicamentoRequest,
      com.medicamentos_management.stubs.medicamento.TipoMedicamentoResponse> getGetTipoMedicamentoInfoMethod() {
    io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.TipoMedicamentoRequest, com.medicamentos_management.stubs.medicamento.TipoMedicamentoResponse> getGetTipoMedicamentoInfoMethod;
    if ((getGetTipoMedicamentoInfoMethod = TipoMedicamentoServiceGrpc.getGetTipoMedicamentoInfoMethod) == null) {
      synchronized (TipoMedicamentoServiceGrpc.class) {
        if ((getGetTipoMedicamentoInfoMethod = TipoMedicamentoServiceGrpc.getGetTipoMedicamentoInfoMethod) == null) {
          TipoMedicamentoServiceGrpc.getGetTipoMedicamentoInfoMethod = getGetTipoMedicamentoInfoMethod =
              io.grpc.MethodDescriptor.<com.medicamentos_management.stubs.medicamento.TipoMedicamentoRequest, com.medicamentos_management.stubs.medicamento.TipoMedicamentoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTipoMedicamentoInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medicamentos_management.stubs.medicamento.TipoMedicamentoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medicamentos_management.stubs.medicamento.TipoMedicamentoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TipoMedicamentoServiceMethodDescriptorSupplier("getTipoMedicamentoInfo"))
              .build();
        }
      }
    }
    return getGetTipoMedicamentoInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TipoMedicamentoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TipoMedicamentoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TipoMedicamentoServiceStub>() {
        @java.lang.Override
        public TipoMedicamentoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TipoMedicamentoServiceStub(channel, callOptions);
        }
      };
    return TipoMedicamentoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TipoMedicamentoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TipoMedicamentoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TipoMedicamentoServiceBlockingStub>() {
        @java.lang.Override
        public TipoMedicamentoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TipoMedicamentoServiceBlockingStub(channel, callOptions);
        }
      };
    return TipoMedicamentoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TipoMedicamentoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TipoMedicamentoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TipoMedicamentoServiceFutureStub>() {
        @java.lang.Override
        public TipoMedicamentoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TipoMedicamentoServiceFutureStub(channel, callOptions);
        }
      };
    return TipoMedicamentoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TipoMedicamentoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void altaTipoMedicamento(com.medicamentos_management.stubs.medicamento.TipoMedicamento request,
        io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.TipoMedicamento> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAltaTipoMedicamentoMethod(), responseObserver);
    }

    /**
     */
    public void bajaTipoMedicamento(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBajaTipoMedicamentoMethod(), responseObserver);
    }

    /**
     */
    public void getTipoMedicamentoInfo(com.medicamentos_management.stubs.medicamento.TipoMedicamentoRequest request,
        io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.TipoMedicamentoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTipoMedicamentoInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAltaTipoMedicamentoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.medicamentos_management.stubs.medicamento.TipoMedicamento,
                com.medicamentos_management.stubs.medicamento.TipoMedicamento>(
                  this, METHODID_ALTA_TIPO_MEDICAMENTO)))
          .addMethod(
            getBajaTipoMedicamentoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Int32Value,
                com.google.protobuf.Empty>(
                  this, METHODID_BAJA_TIPO_MEDICAMENTO)))
          .addMethod(
            getGetTipoMedicamentoInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.medicamentos_management.stubs.medicamento.TipoMedicamentoRequest,
                com.medicamentos_management.stubs.medicamento.TipoMedicamentoResponse>(
                  this, METHODID_GET_TIPO_MEDICAMENTO_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class TipoMedicamentoServiceStub extends io.grpc.stub.AbstractAsyncStub<TipoMedicamentoServiceStub> {
    private TipoMedicamentoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TipoMedicamentoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TipoMedicamentoServiceStub(channel, callOptions);
    }

    /**
     */
    public void altaTipoMedicamento(com.medicamentos_management.stubs.medicamento.TipoMedicamento request,
        io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.TipoMedicamento> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAltaTipoMedicamentoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bajaTipoMedicamento(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBajaTipoMedicamentoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTipoMedicamentoInfo(com.medicamentos_management.stubs.medicamento.TipoMedicamentoRequest request,
        io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.TipoMedicamentoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTipoMedicamentoInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TipoMedicamentoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TipoMedicamentoServiceBlockingStub> {
    private TipoMedicamentoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TipoMedicamentoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TipoMedicamentoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.medicamentos_management.stubs.medicamento.TipoMedicamento altaTipoMedicamento(com.medicamentos_management.stubs.medicamento.TipoMedicamento request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAltaTipoMedicamentoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty bajaTipoMedicamento(com.google.protobuf.Int32Value request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBajaTipoMedicamentoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.medicamentos_management.stubs.medicamento.TipoMedicamentoResponse getTipoMedicamentoInfo(com.medicamentos_management.stubs.medicamento.TipoMedicamentoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTipoMedicamentoInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TipoMedicamentoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TipoMedicamentoServiceFutureStub> {
    private TipoMedicamentoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TipoMedicamentoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TipoMedicamentoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.medicamentos_management.stubs.medicamento.TipoMedicamento> altaTipoMedicamento(
        com.medicamentos_management.stubs.medicamento.TipoMedicamento request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAltaTipoMedicamentoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> bajaTipoMedicamento(
        com.google.protobuf.Int32Value request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBajaTipoMedicamentoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.medicamentos_management.stubs.medicamento.TipoMedicamentoResponse> getTipoMedicamentoInfo(
        com.medicamentos_management.stubs.medicamento.TipoMedicamentoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTipoMedicamentoInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALTA_TIPO_MEDICAMENTO = 0;
  private static final int METHODID_BAJA_TIPO_MEDICAMENTO = 1;
  private static final int METHODID_GET_TIPO_MEDICAMENTO_INFO = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TipoMedicamentoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TipoMedicamentoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALTA_TIPO_MEDICAMENTO:
          serviceImpl.altaTipoMedicamento((com.medicamentos_management.stubs.medicamento.TipoMedicamento) request,
              (io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.TipoMedicamento>) responseObserver);
          break;
        case METHODID_BAJA_TIPO_MEDICAMENTO:
          serviceImpl.bajaTipoMedicamento((com.google.protobuf.Int32Value) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_TIPO_MEDICAMENTO_INFO:
          serviceImpl.getTipoMedicamentoInfo((com.medicamentos_management.stubs.medicamento.TipoMedicamentoRequest) request,
              (io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.TipoMedicamentoResponse>) responseObserver);
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

  private static abstract class TipoMedicamentoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TipoMedicamentoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.medicamentos_management.stubs.medicamento.MedicamentoOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TipoMedicamentoService");
    }
  }

  private static final class TipoMedicamentoServiceFileDescriptorSupplier
      extends TipoMedicamentoServiceBaseDescriptorSupplier {
    TipoMedicamentoServiceFileDescriptorSupplier() {}
  }

  private static final class TipoMedicamentoServiceMethodDescriptorSupplier
      extends TipoMedicamentoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TipoMedicamentoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TipoMedicamentoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TipoMedicamentoServiceFileDescriptorSupplier())
              .addMethod(getAltaTipoMedicamentoMethod())
              .addMethod(getBajaTipoMedicamentoMethod())
              .addMethod(getGetTipoMedicamentoInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
