package com.medicamentos_management.stubs.medicamento;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: medicamento.proto")
public final class MedicamentoServiceGrpc {

  private MedicamentoServiceGrpc() {}

  public static final String SERVICE_NAME = "com.medicamentos_management.stubs.medicamento.MedicamentoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.Medicamento,
      com.medicamentos_management.stubs.medicamento.Medicamento> getAltaMedicamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "altaMedicamento",
      requestType = com.medicamentos_management.stubs.medicamento.Medicamento.class,
      responseType = com.medicamentos_management.stubs.medicamento.Medicamento.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.Medicamento,
      com.medicamentos_management.stubs.medicamento.Medicamento> getAltaMedicamentoMethod() {
    io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.Medicamento, com.medicamentos_management.stubs.medicamento.Medicamento> getAltaMedicamentoMethod;
    if ((getAltaMedicamentoMethod = MedicamentoServiceGrpc.getAltaMedicamentoMethod) == null) {
      synchronized (MedicamentoServiceGrpc.class) {
        if ((getAltaMedicamentoMethod = MedicamentoServiceGrpc.getAltaMedicamentoMethod) == null) {
          MedicamentoServiceGrpc.getAltaMedicamentoMethod = getAltaMedicamentoMethod =
              io.grpc.MethodDescriptor.<com.medicamentos_management.stubs.medicamento.Medicamento, com.medicamentos_management.stubs.medicamento.Medicamento>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "altaMedicamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medicamentos_management.stubs.medicamento.Medicamento.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medicamentos_management.stubs.medicamento.Medicamento.getDefaultInstance()))
              .setSchemaDescriptor(new MedicamentoServiceMethodDescriptorSupplier("altaMedicamento"))
              .build();
        }
      }
    }
    return getAltaMedicamentoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.Pagination,
      com.medicamentos_management.stubs.medicamento.MedicamentoList> getListarMedicamentosAerosolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listarMedicamentosAerosol",
      requestType = com.medicamentos_management.stubs.medicamento.Pagination.class,
      responseType = com.medicamentos_management.stubs.medicamento.MedicamentoList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.Pagination,
      com.medicamentos_management.stubs.medicamento.MedicamentoList> getListarMedicamentosAerosolMethod() {
    io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.Pagination, com.medicamentos_management.stubs.medicamento.MedicamentoList> getListarMedicamentosAerosolMethod;
    if ((getListarMedicamentosAerosolMethod = MedicamentoServiceGrpc.getListarMedicamentosAerosolMethod) == null) {
      synchronized (MedicamentoServiceGrpc.class) {
        if ((getListarMedicamentosAerosolMethod = MedicamentoServiceGrpc.getListarMedicamentosAerosolMethod) == null) {
          MedicamentoServiceGrpc.getListarMedicamentosAerosolMethod = getListarMedicamentosAerosolMethod =
              io.grpc.MethodDescriptor.<com.medicamentos_management.stubs.medicamento.Pagination, com.medicamentos_management.stubs.medicamento.MedicamentoList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listarMedicamentosAerosol"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medicamentos_management.stubs.medicamento.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medicamentos_management.stubs.medicamento.MedicamentoList.getDefaultInstance()))
              .setSchemaDescriptor(new MedicamentoServiceMethodDescriptorSupplier("listarMedicamentosAerosol"))
              .build();
        }
      }
    }
    return getListarMedicamentosAerosolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.Pagination,
      com.medicamentos_management.stubs.medicamento.MedicamentoList> getListarMedicamentosNombreComercialAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listarMedicamentosNombreComercialA",
      requestType = com.medicamentos_management.stubs.medicamento.Pagination.class,
      responseType = com.medicamentos_management.stubs.medicamento.MedicamentoList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.Pagination,
      com.medicamentos_management.stubs.medicamento.MedicamentoList> getListarMedicamentosNombreComercialAMethod() {
    io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.Pagination, com.medicamentos_management.stubs.medicamento.MedicamentoList> getListarMedicamentosNombreComercialAMethod;
    if ((getListarMedicamentosNombreComercialAMethod = MedicamentoServiceGrpc.getListarMedicamentosNombreComercialAMethod) == null) {
      synchronized (MedicamentoServiceGrpc.class) {
        if ((getListarMedicamentosNombreComercialAMethod = MedicamentoServiceGrpc.getListarMedicamentosNombreComercialAMethod) == null) {
          MedicamentoServiceGrpc.getListarMedicamentosNombreComercialAMethod = getListarMedicamentosNombreComercialAMethod =
              io.grpc.MethodDescriptor.<com.medicamentos_management.stubs.medicamento.Pagination, com.medicamentos_management.stubs.medicamento.MedicamentoList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listarMedicamentosNombreComercialA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medicamentos_management.stubs.medicamento.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medicamentos_management.stubs.medicamento.MedicamentoList.getDefaultInstance()))
              .setSchemaDescriptor(new MedicamentoServiceMethodDescriptorSupplier("listarMedicamentosNombreComercialA"))
              .build();
        }
      }
    }
    return getListarMedicamentosNombreComercialAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.MedicamentoRequest,
      com.medicamentos_management.stubs.medicamento.MedicamentoResponse> getGetMedicamentoInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMedicamentoInfo",
      requestType = com.medicamentos_management.stubs.medicamento.MedicamentoRequest.class,
      responseType = com.medicamentos_management.stubs.medicamento.MedicamentoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.MedicamentoRequest,
      com.medicamentos_management.stubs.medicamento.MedicamentoResponse> getGetMedicamentoInfoMethod() {
    io.grpc.MethodDescriptor<com.medicamentos_management.stubs.medicamento.MedicamentoRequest, com.medicamentos_management.stubs.medicamento.MedicamentoResponse> getGetMedicamentoInfoMethod;
    if ((getGetMedicamentoInfoMethod = MedicamentoServiceGrpc.getGetMedicamentoInfoMethod) == null) {
      synchronized (MedicamentoServiceGrpc.class) {
        if ((getGetMedicamentoInfoMethod = MedicamentoServiceGrpc.getGetMedicamentoInfoMethod) == null) {
          MedicamentoServiceGrpc.getGetMedicamentoInfoMethod = getGetMedicamentoInfoMethod =
              io.grpc.MethodDescriptor.<com.medicamentos_management.stubs.medicamento.MedicamentoRequest, com.medicamentos_management.stubs.medicamento.MedicamentoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMedicamentoInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medicamentos_management.stubs.medicamento.MedicamentoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medicamentos_management.stubs.medicamento.MedicamentoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MedicamentoServiceMethodDescriptorSupplier("getMedicamentoInfo"))
              .build();
        }
      }
    }
    return getGetMedicamentoInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MedicamentoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MedicamentoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MedicamentoServiceStub>() {
        @java.lang.Override
        public MedicamentoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MedicamentoServiceStub(channel, callOptions);
        }
      };
    return MedicamentoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MedicamentoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MedicamentoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MedicamentoServiceBlockingStub>() {
        @java.lang.Override
        public MedicamentoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MedicamentoServiceBlockingStub(channel, callOptions);
        }
      };
    return MedicamentoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MedicamentoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MedicamentoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MedicamentoServiceFutureStub>() {
        @java.lang.Override
        public MedicamentoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MedicamentoServiceFutureStub(channel, callOptions);
        }
      };
    return MedicamentoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MedicamentoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void altaMedicamento(com.medicamentos_management.stubs.medicamento.Medicamento request,
        io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.Medicamento> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAltaMedicamentoMethod(), responseObserver);
    }

    /**
     */
    public void listarMedicamentosAerosol(com.medicamentos_management.stubs.medicamento.Pagination request,
        io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.MedicamentoList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListarMedicamentosAerosolMethod(), responseObserver);
    }

    /**
     */
    public void listarMedicamentosNombreComercialA(com.medicamentos_management.stubs.medicamento.Pagination request,
        io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.MedicamentoList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListarMedicamentosNombreComercialAMethod(), responseObserver);
    }

    /**
     */
    public void getMedicamentoInfo(com.medicamentos_management.stubs.medicamento.MedicamentoRequest request,
        io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.MedicamentoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMedicamentoInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAltaMedicamentoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.medicamentos_management.stubs.medicamento.Medicamento,
                com.medicamentos_management.stubs.medicamento.Medicamento>(
                  this, METHODID_ALTA_MEDICAMENTO)))
          .addMethod(
            getListarMedicamentosAerosolMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.medicamentos_management.stubs.medicamento.Pagination,
                com.medicamentos_management.stubs.medicamento.MedicamentoList>(
                  this, METHODID_LISTAR_MEDICAMENTOS_AEROSOL)))
          .addMethod(
            getListarMedicamentosNombreComercialAMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.medicamentos_management.stubs.medicamento.Pagination,
                com.medicamentos_management.stubs.medicamento.MedicamentoList>(
                  this, METHODID_LISTAR_MEDICAMENTOS_NOMBRE_COMERCIAL_A)))
          .addMethod(
            getGetMedicamentoInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.medicamentos_management.stubs.medicamento.MedicamentoRequest,
                com.medicamentos_management.stubs.medicamento.MedicamentoResponse>(
                  this, METHODID_GET_MEDICAMENTO_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class MedicamentoServiceStub extends io.grpc.stub.AbstractAsyncStub<MedicamentoServiceStub> {
    private MedicamentoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MedicamentoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MedicamentoServiceStub(channel, callOptions);
    }

    /**
     */
    public void altaMedicamento(com.medicamentos_management.stubs.medicamento.Medicamento request,
        io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.Medicamento> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAltaMedicamentoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listarMedicamentosAerosol(com.medicamentos_management.stubs.medicamento.Pagination request,
        io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.MedicamentoList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListarMedicamentosAerosolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listarMedicamentosNombreComercialA(com.medicamentos_management.stubs.medicamento.Pagination request,
        io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.MedicamentoList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListarMedicamentosNombreComercialAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMedicamentoInfo(com.medicamentos_management.stubs.medicamento.MedicamentoRequest request,
        io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.MedicamentoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMedicamentoInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MedicamentoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MedicamentoServiceBlockingStub> {
    private MedicamentoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MedicamentoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MedicamentoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.medicamentos_management.stubs.medicamento.Medicamento altaMedicamento(com.medicamentos_management.stubs.medicamento.Medicamento request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAltaMedicamentoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.medicamentos_management.stubs.medicamento.MedicamentoList listarMedicamentosAerosol(com.medicamentos_management.stubs.medicamento.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListarMedicamentosAerosolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.medicamentos_management.stubs.medicamento.MedicamentoList listarMedicamentosNombreComercialA(com.medicamentos_management.stubs.medicamento.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListarMedicamentosNombreComercialAMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.medicamentos_management.stubs.medicamento.MedicamentoResponse getMedicamentoInfo(com.medicamentos_management.stubs.medicamento.MedicamentoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMedicamentoInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MedicamentoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MedicamentoServiceFutureStub> {
    private MedicamentoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MedicamentoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MedicamentoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.medicamentos_management.stubs.medicamento.Medicamento> altaMedicamento(
        com.medicamentos_management.stubs.medicamento.Medicamento request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAltaMedicamentoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.medicamentos_management.stubs.medicamento.MedicamentoList> listarMedicamentosAerosol(
        com.medicamentos_management.stubs.medicamento.Pagination request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListarMedicamentosAerosolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.medicamentos_management.stubs.medicamento.MedicamentoList> listarMedicamentosNombreComercialA(
        com.medicamentos_management.stubs.medicamento.Pagination request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListarMedicamentosNombreComercialAMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.medicamentos_management.stubs.medicamento.MedicamentoResponse> getMedicamentoInfo(
        com.medicamentos_management.stubs.medicamento.MedicamentoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMedicamentoInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALTA_MEDICAMENTO = 0;
  private static final int METHODID_LISTAR_MEDICAMENTOS_AEROSOL = 1;
  private static final int METHODID_LISTAR_MEDICAMENTOS_NOMBRE_COMERCIAL_A = 2;
  private static final int METHODID_GET_MEDICAMENTO_INFO = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MedicamentoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MedicamentoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALTA_MEDICAMENTO:
          serviceImpl.altaMedicamento((com.medicamentos_management.stubs.medicamento.Medicamento) request,
              (io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.Medicamento>) responseObserver);
          break;
        case METHODID_LISTAR_MEDICAMENTOS_AEROSOL:
          serviceImpl.listarMedicamentosAerosol((com.medicamentos_management.stubs.medicamento.Pagination) request,
              (io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.MedicamentoList>) responseObserver);
          break;
        case METHODID_LISTAR_MEDICAMENTOS_NOMBRE_COMERCIAL_A:
          serviceImpl.listarMedicamentosNombreComercialA((com.medicamentos_management.stubs.medicamento.Pagination) request,
              (io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.MedicamentoList>) responseObserver);
          break;
        case METHODID_GET_MEDICAMENTO_INFO:
          serviceImpl.getMedicamentoInfo((com.medicamentos_management.stubs.medicamento.MedicamentoRequest) request,
              (io.grpc.stub.StreamObserver<com.medicamentos_management.stubs.medicamento.MedicamentoResponse>) responseObserver);
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

  private static abstract class MedicamentoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MedicamentoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.medicamentos_management.stubs.medicamento.MedicamentoOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MedicamentoService");
    }
  }

  private static final class MedicamentoServiceFileDescriptorSupplier
      extends MedicamentoServiceBaseDescriptorSupplier {
    MedicamentoServiceFileDescriptorSupplier() {}
  }

  private static final class MedicamentoServiceMethodDescriptorSupplier
      extends MedicamentoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MedicamentoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MedicamentoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MedicamentoServiceFileDescriptorSupplier())
              .addMethod(getAltaMedicamentoMethod())
              .addMethod(getListarMedicamentosAerosolMethod())
              .addMethod(getListarMedicamentosNombreComercialAMethod())
              .addMethod(getGetMedicamentoInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
