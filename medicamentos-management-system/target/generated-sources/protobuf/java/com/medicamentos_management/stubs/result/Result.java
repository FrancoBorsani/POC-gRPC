// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: result.proto

package com.medicamentos_management.stubs.result;

public final class Result {
  private Result() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_medicamentos_management_stubs_result_ResultRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_medicamentos_management_stubs_result_ResultRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_medicamentos_management_stubs_result_ResultResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_medicamentos_management_stubs_result_ResultResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_medicamentos_management_stubs_result_TipoMedicamento_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_medicamentos_management_stubs_result_TipoMedicamento_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014result.proto\022(com.medicamentos_managem" +
      "ent.stubs.result\"\033\n\rResultRequest\022\n\n\002id\030" +
      "\001 \001(\005\"\243\001\n\016ResultResponse\022\n\n\002id\030\001 \001(\005\022\016\n\006" +
      "codigo\030\002 \001(\t\022\027\n\017nombreComercial\030\003 \001(\t\022\023\n" +
      "\013nombreDroga\030\004 \001(\t\022G\n\004tipo\030\005 \001(\01329.com.m" +
      "edicamentos_management.stubs.result.Tipo" +
      "Medicamento\"-\n\017TipoMedicamento\022\n\n\002id\030\001 \001" +
      "(\005\022\016\n\006nombre\030\002 \001(\t2\262\002\n\rResultService\022\214\001\n" +
      "\027getResultForMedicamento\0227.com.medicamen" +
      "tos_management.stubs.result.ResultReques" +
      "t\0328.com.medicamentos_management.stubs.re" +
      "sult.ResultResponse\022\221\001\n\033getResultForTipo" +
      "Medicamento\0227.com.medicamentos_managemen" +
      "t.stubs.result.ResultRequest\0329.com.medic" +
      "amentos_management.stubs.result.TipoMedi" +
      "camentoB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_medicamentos_management_stubs_result_ResultRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_medicamentos_management_stubs_result_ResultRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_medicamentos_management_stubs_result_ResultRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_medicamentos_management_stubs_result_ResultResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_medicamentos_management_stubs_result_ResultResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_medicamentos_management_stubs_result_ResultResponse_descriptor,
        new java.lang.String[] { "Id", "Codigo", "NombreComercial", "NombreDroga", "Tipo", });
    internal_static_com_medicamentos_management_stubs_result_TipoMedicamento_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_medicamentos_management_stubs_result_TipoMedicamento_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_medicamentos_management_stubs_result_TipoMedicamento_descriptor,
        new java.lang.String[] { "Id", "Nombre", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
