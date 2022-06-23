/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.osconfig.v1beta.samples;

// [START osconfig_v1beta_generated_osconfigserviceclient_resumepatchdeployment_patchdeploymentname_sync]
import com.google.cloud.osconfig.v1beta.OsConfigServiceClient;
import com.google.cloud.osconfig.v1beta.PatchDeploymentName;
import com.google.cloud.osconfig.v1beta.PatchDeployments;

public class SyncResumePatchDeploymentPatchdeploymentname {

  public static void main(String[] args) throws Exception {
    syncResumePatchDeploymentPatchdeploymentname();
  }

  public static void syncResumePatchDeploymentPatchdeploymentname() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (OsConfigServiceClient osConfigServiceClient = OsConfigServiceClient.create()) {
      PatchDeploymentName name = PatchDeploymentName.of("[PROJECT]", "[PATCH_DEPLOYMENT]");
      PatchDeployments.PatchDeployment response = osConfigServiceClient.resumePatchDeployment(name);
    }
  }
}
// [END osconfig_v1beta_generated_osconfigserviceclient_resumepatchdeployment_patchdeploymentname_sync]
