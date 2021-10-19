// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/v1/osconfig_service.proto

package com.google.cloud.osconfig.v1;

public final class OsConfigProto {
  private OsConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/osconfig/v1/osconfig_serv" +
      "ice.proto\022\030google.cloud.osconfig.v1\032\034goo" +
      "gle/api/annotations.proto\032\027google/api/cl" +
      "ient.proto\032\031google/api/resource.proto\0320g" +
      "oogle/cloud/osconfig/v1/patch_deployment" +
      "s.proto\032)google/cloud/osconfig/v1/patch_" +
      "jobs.proto\032\033google/protobuf/empty.proto2" +
      "\276\r\n\017OsConfigService\022\235\001\n\017ExecutePatchJob\022" +
      "0.google.cloud.osconfig.v1.ExecutePatchJ" +
      "obRequest\032\".google.cloud.osconfig.v1.Pat" +
      "chJob\"4\202\323\344\223\002.\")/v1/{parent=projects/*}/p" +
      "atchJobs:execute:\001*\022\221\001\n\013GetPatchJob\022,.go" +
      "ogle.cloud.osconfig.v1.GetPatchJobReques" +
      "t\032\".google.cloud.osconfig.v1.PatchJob\"0\202" +
      "\323\344\223\002#\022!/v1/{name=projects/*/patchJobs/*}" +
      "\332A\004name\022\232\001\n\016CancelPatchJob\022/.google.clou" +
      "d.osconfig.v1.CancelPatchJobRequest\032\".go" +
      "ogle.cloud.osconfig.v1.PatchJob\"3\202\323\344\223\002-\"" +
      "(/v1/{name=projects/*/patchJobs/*}:cance" +
      "l:\001*\022\244\001\n\rListPatchJobs\022..google.cloud.os" +
      "config.v1.ListPatchJobsRequest\032/.google." +
      "cloud.osconfig.v1.ListPatchJobsResponse\"" +
      "2\202\323\344\223\002#\022!/v1/{parent=projects/*}/patchJo" +
      "bs\332A\006parent\022\340\001\n\033ListPatchJobInstanceDeta" +
      "ils\022<.google.cloud.osconfig.v1.ListPatch" +
      "JobInstanceDetailsRequest\032=.google.cloud" +
      ".osconfig.v1.ListPatchJobInstanceDetails" +
      "Response\"D\202\323\344\223\0025\0223/v1/{parent=projects/*" +
      "/patchJobs/*}/instanceDetails\332A\006parent\022\354" +
      "\001\n\025CreatePatchDeployment\0226.google.cloud." +
      "osconfig.v1.CreatePatchDeploymentRequest" +
      "\032).google.cloud.osconfig.v1.PatchDeploym" +
      "ent\"p\202\323\344\223\002<\"(/v1/{parent=projects/*}/pat" +
      "chDeployments:\020patch_deployment\332A+parent" +
      ",patch_deployment,patch_deployment_id\022\255\001" +
      "\n\022GetPatchDeployment\0223.google.cloud.osco" +
      "nfig.v1.GetPatchDeploymentRequest\032).goog" +
      "le.cloud.osconfig.v1.PatchDeployment\"7\202\323" +
      "\344\223\002*\022(/v1/{name=projects/*/patchDeployme" +
      "nts/*}\332A\004name\022\300\001\n\024ListPatchDeployments\0225" +
      ".google.cloud.osconfig.v1.ListPatchDeplo" +
      "ymentsRequest\0326.google.cloud.osconfig.v1" +
      ".ListPatchDeploymentsResponse\"9\202\323\344\223\002*\022(/" +
      "v1/{parent=projects/*}/patchDeployments\332" +
      "A\006parent\022\240\001\n\025DeletePatchDeployment\0226.goo" +
      "gle.cloud.osconfig.v1.DeletePatchDeploym" +
      "entRequest\032\026.google.protobuf.Empty\"7\202\323\344\223" +
      "\002**(/v1/{name=projects/*/patchDeployment" +
      "s/*}\332A\004name\032K\312A\027osconfig.googleapis.com\322" +
      "A.https://www.googleapis.com/auth/cloud-" +
      "platformB\334\002\n\034com.google.cloud.osconfig.v" +
      "1B\rOsConfigProtoZ@google.golang.org/genp" +
      "roto/googleapis/cloud/osconfig/v1;osconf" +
      "ig\252\002\030Google.Cloud.OsConfig.V1\312\002\030Google\\C" +
      "loud\\OsConfig\\V1\352\002\033Google::Cloud::OsConf" +
      "ig::V1\352A\225\001\n\037compute.googleapis.com/Insta" +
      "nce\0224projects/{project}/zones/{zone}/ins" +
      "tances/{instance}\022<projects/{project}/lo" +
      "cations/{location}/instances/{instance}b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.osconfig.v1.PatchDeployments.getDescriptor(),
          com.google.cloud.osconfig.v1.PatchJobs.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.osconfig.v1.PatchDeployments.getDescriptor();
    com.google.cloud.osconfig.v1.PatchJobs.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
