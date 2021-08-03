/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.osconfig.v1alpha;

import static com.google.cloud.osconfig.v1alpha.OsConfigZonalServiceClient.ListInstanceOSPoliciesCompliancesPagedResponse;
import static com.google.cloud.osconfig.v1alpha.OsConfigZonalServiceClient.ListInventoriesPagedResponse;
import static com.google.cloud.osconfig.v1alpha.OsConfigZonalServiceClient.ListOSPolicyAssignmentRevisionsPagedResponse;
import static com.google.cloud.osconfig.v1alpha.OsConfigZonalServiceClient.ListOSPolicyAssignmentsPagedResponse;
import static com.google.cloud.osconfig.v1alpha.OsConfigZonalServiceClient.ListVulnerabilityReportsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.osconfig.v1alpha.stub.OsConfigZonalServiceStubSettings;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link OsConfigZonalServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (osconfig.googleapis.com) and default port (443) are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getOSPolicyAssignment to 30 seconds:
 *
 * <pre>{@code
 * OsConfigZonalServiceSettings.Builder osConfigZonalServiceSettingsBuilder =
 *     OsConfigZonalServiceSettings.newBuilder();
 * osConfigZonalServiceSettingsBuilder
 *     .getOSPolicyAssignmentSettings()
 *     .setRetrySettings(
 *         osConfigZonalServiceSettingsBuilder
 *             .getOSPolicyAssignmentSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * OsConfigZonalServiceSettings osConfigZonalServiceSettings =
 *     osConfigZonalServiceSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class OsConfigZonalServiceSettings extends ClientSettings<OsConfigZonalServiceSettings> {

  /** Returns the object with the settings used for calls to createOSPolicyAssignment. */
  public UnaryCallSettings<CreateOSPolicyAssignmentRequest, Operation>
      createOSPolicyAssignmentSettings() {
    return ((OsConfigZonalServiceStubSettings) getStubSettings())
        .createOSPolicyAssignmentSettings();
  }

  /** Returns the object with the settings used for calls to createOSPolicyAssignment. */
  public OperationCallSettings<
          CreateOSPolicyAssignmentRequest, OSPolicyAssignment, OSPolicyAssignmentOperationMetadata>
      createOSPolicyAssignmentOperationSettings() {
    return ((OsConfigZonalServiceStubSettings) getStubSettings())
        .createOSPolicyAssignmentOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateOSPolicyAssignment. */
  public UnaryCallSettings<UpdateOSPolicyAssignmentRequest, Operation>
      updateOSPolicyAssignmentSettings() {
    return ((OsConfigZonalServiceStubSettings) getStubSettings())
        .updateOSPolicyAssignmentSettings();
  }

  /** Returns the object with the settings used for calls to updateOSPolicyAssignment. */
  public OperationCallSettings<
          UpdateOSPolicyAssignmentRequest, OSPolicyAssignment, OSPolicyAssignmentOperationMetadata>
      updateOSPolicyAssignmentOperationSettings() {
    return ((OsConfigZonalServiceStubSettings) getStubSettings())
        .updateOSPolicyAssignmentOperationSettings();
  }

  /** Returns the object with the settings used for calls to getOSPolicyAssignment. */
  public UnaryCallSettings<GetOSPolicyAssignmentRequest, OSPolicyAssignment>
      getOSPolicyAssignmentSettings() {
    return ((OsConfigZonalServiceStubSettings) getStubSettings()).getOSPolicyAssignmentSettings();
  }

  /** Returns the object with the settings used for calls to listOSPolicyAssignments. */
  public PagedCallSettings<
          ListOSPolicyAssignmentsRequest, ListOSPolicyAssignmentsResponse,
          ListOSPolicyAssignmentsPagedResponse>
      listOSPolicyAssignmentsSettings() {
    return ((OsConfigZonalServiceStubSettings) getStubSettings()).listOSPolicyAssignmentsSettings();
  }

  /** Returns the object with the settings used for calls to listOSPolicyAssignmentRevisions. */
  public PagedCallSettings<
          ListOSPolicyAssignmentRevisionsRequest, ListOSPolicyAssignmentRevisionsResponse,
          ListOSPolicyAssignmentRevisionsPagedResponse>
      listOSPolicyAssignmentRevisionsSettings() {
    return ((OsConfigZonalServiceStubSettings) getStubSettings())
        .listOSPolicyAssignmentRevisionsSettings();
  }

  /** Returns the object with the settings used for calls to deleteOSPolicyAssignment. */
  public UnaryCallSettings<DeleteOSPolicyAssignmentRequest, Operation>
      deleteOSPolicyAssignmentSettings() {
    return ((OsConfigZonalServiceStubSettings) getStubSettings())
        .deleteOSPolicyAssignmentSettings();
  }

  /** Returns the object with the settings used for calls to deleteOSPolicyAssignment. */
  public OperationCallSettings<
          DeleteOSPolicyAssignmentRequest, Empty, OSPolicyAssignmentOperationMetadata>
      deleteOSPolicyAssignmentOperationSettings() {
    return ((OsConfigZonalServiceStubSettings) getStubSettings())
        .deleteOSPolicyAssignmentOperationSettings();
  }

  /** Returns the object with the settings used for calls to getInstanceOSPoliciesCompliance. */
  public UnaryCallSettings<GetInstanceOSPoliciesComplianceRequest, InstanceOSPoliciesCompliance>
      getInstanceOSPoliciesComplianceSettings() {
    return ((OsConfigZonalServiceStubSettings) getStubSettings())
        .getInstanceOSPoliciesComplianceSettings();
  }

  /** Returns the object with the settings used for calls to listInstanceOSPoliciesCompliances. */
  public PagedCallSettings<
          ListInstanceOSPoliciesCompliancesRequest, ListInstanceOSPoliciesCompliancesResponse,
          ListInstanceOSPoliciesCompliancesPagedResponse>
      listInstanceOSPoliciesCompliancesSettings() {
    return ((OsConfigZonalServiceStubSettings) getStubSettings())
        .listInstanceOSPoliciesCompliancesSettings();
  }

  /** Returns the object with the settings used for calls to getInventory. */
  public UnaryCallSettings<GetInventoryRequest, Inventory> getInventorySettings() {
    return ((OsConfigZonalServiceStubSettings) getStubSettings()).getInventorySettings();
  }

  /** Returns the object with the settings used for calls to listInventories. */
  public PagedCallSettings<
          ListInventoriesRequest, ListInventoriesResponse, ListInventoriesPagedResponse>
      listInventoriesSettings() {
    return ((OsConfigZonalServiceStubSettings) getStubSettings()).listInventoriesSettings();
  }

  /** Returns the object with the settings used for calls to getVulnerabilityReport. */
  public UnaryCallSettings<GetVulnerabilityReportRequest, VulnerabilityReport>
      getVulnerabilityReportSettings() {
    return ((OsConfigZonalServiceStubSettings) getStubSettings()).getVulnerabilityReportSettings();
  }

  /** Returns the object with the settings used for calls to listVulnerabilityReports. */
  public PagedCallSettings<
          ListVulnerabilityReportsRequest, ListVulnerabilityReportsResponse,
          ListVulnerabilityReportsPagedResponse>
      listVulnerabilityReportsSettings() {
    return ((OsConfigZonalServiceStubSettings) getStubSettings())
        .listVulnerabilityReportsSettings();
  }

  public static final OsConfigZonalServiceSettings create(OsConfigZonalServiceStubSettings stub)
      throws IOException {
    return new OsConfigZonalServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return OsConfigZonalServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return OsConfigZonalServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return OsConfigZonalServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return OsConfigZonalServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return OsConfigZonalServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return OsConfigZonalServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return OsConfigZonalServiceStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected OsConfigZonalServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for OsConfigZonalServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<OsConfigZonalServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(OsConfigZonalServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(OsConfigZonalServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(OsConfigZonalServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(OsConfigZonalServiceStubSettings.newBuilder());
    }

    public OsConfigZonalServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((OsConfigZonalServiceStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to createOSPolicyAssignment. */
    public UnaryCallSettings.Builder<CreateOSPolicyAssignmentRequest, Operation>
        createOSPolicyAssignmentSettings() {
      return getStubSettingsBuilder().createOSPolicyAssignmentSettings();
    }

    /** Returns the builder for the settings used for calls to createOSPolicyAssignment. */
    public OperationCallSettings.Builder<
            CreateOSPolicyAssignmentRequest, OSPolicyAssignment,
            OSPolicyAssignmentOperationMetadata>
        createOSPolicyAssignmentOperationSettings() {
      return getStubSettingsBuilder().createOSPolicyAssignmentOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateOSPolicyAssignment. */
    public UnaryCallSettings.Builder<UpdateOSPolicyAssignmentRequest, Operation>
        updateOSPolicyAssignmentSettings() {
      return getStubSettingsBuilder().updateOSPolicyAssignmentSettings();
    }

    /** Returns the builder for the settings used for calls to updateOSPolicyAssignment. */
    public OperationCallSettings.Builder<
            UpdateOSPolicyAssignmentRequest, OSPolicyAssignment,
            OSPolicyAssignmentOperationMetadata>
        updateOSPolicyAssignmentOperationSettings() {
      return getStubSettingsBuilder().updateOSPolicyAssignmentOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getOSPolicyAssignment. */
    public UnaryCallSettings.Builder<GetOSPolicyAssignmentRequest, OSPolicyAssignment>
        getOSPolicyAssignmentSettings() {
      return getStubSettingsBuilder().getOSPolicyAssignmentSettings();
    }

    /** Returns the builder for the settings used for calls to listOSPolicyAssignments. */
    public PagedCallSettings.Builder<
            ListOSPolicyAssignmentsRequest, ListOSPolicyAssignmentsResponse,
            ListOSPolicyAssignmentsPagedResponse>
        listOSPolicyAssignmentsSettings() {
      return getStubSettingsBuilder().listOSPolicyAssignmentsSettings();
    }

    /** Returns the builder for the settings used for calls to listOSPolicyAssignmentRevisions. */
    public PagedCallSettings.Builder<
            ListOSPolicyAssignmentRevisionsRequest, ListOSPolicyAssignmentRevisionsResponse,
            ListOSPolicyAssignmentRevisionsPagedResponse>
        listOSPolicyAssignmentRevisionsSettings() {
      return getStubSettingsBuilder().listOSPolicyAssignmentRevisionsSettings();
    }

    /** Returns the builder for the settings used for calls to deleteOSPolicyAssignment. */
    public UnaryCallSettings.Builder<DeleteOSPolicyAssignmentRequest, Operation>
        deleteOSPolicyAssignmentSettings() {
      return getStubSettingsBuilder().deleteOSPolicyAssignmentSettings();
    }

    /** Returns the builder for the settings used for calls to deleteOSPolicyAssignment. */
    public OperationCallSettings.Builder<
            DeleteOSPolicyAssignmentRequest, Empty, OSPolicyAssignmentOperationMetadata>
        deleteOSPolicyAssignmentOperationSettings() {
      return getStubSettingsBuilder().deleteOSPolicyAssignmentOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getInstanceOSPoliciesCompliance. */
    public UnaryCallSettings.Builder<
            GetInstanceOSPoliciesComplianceRequest, InstanceOSPoliciesCompliance>
        getInstanceOSPoliciesComplianceSettings() {
      return getStubSettingsBuilder().getInstanceOSPoliciesComplianceSettings();
    }

    /** Returns the builder for the settings used for calls to listInstanceOSPoliciesCompliances. */
    public PagedCallSettings.Builder<
            ListInstanceOSPoliciesCompliancesRequest, ListInstanceOSPoliciesCompliancesResponse,
            ListInstanceOSPoliciesCompliancesPagedResponse>
        listInstanceOSPoliciesCompliancesSettings() {
      return getStubSettingsBuilder().listInstanceOSPoliciesCompliancesSettings();
    }

    /** Returns the builder for the settings used for calls to getInventory. */
    public UnaryCallSettings.Builder<GetInventoryRequest, Inventory> getInventorySettings() {
      return getStubSettingsBuilder().getInventorySettings();
    }

    /** Returns the builder for the settings used for calls to listInventories. */
    public PagedCallSettings.Builder<
            ListInventoriesRequest, ListInventoriesResponse, ListInventoriesPagedResponse>
        listInventoriesSettings() {
      return getStubSettingsBuilder().listInventoriesSettings();
    }

    /** Returns the builder for the settings used for calls to getVulnerabilityReport. */
    public UnaryCallSettings.Builder<GetVulnerabilityReportRequest, VulnerabilityReport>
        getVulnerabilityReportSettings() {
      return getStubSettingsBuilder().getVulnerabilityReportSettings();
    }

    /** Returns the builder for the settings used for calls to listVulnerabilityReports. */
    public PagedCallSettings.Builder<
            ListVulnerabilityReportsRequest, ListVulnerabilityReportsResponse,
            ListVulnerabilityReportsPagedResponse>
        listVulnerabilityReportsSettings() {
      return getStubSettingsBuilder().listVulnerabilityReportsSettings();
    }

    @Override
    public OsConfigZonalServiceSettings build() throws IOException {
      return new OsConfigZonalServiceSettings(this);
    }
  }
}
