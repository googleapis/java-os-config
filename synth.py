# Copyright 2020 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

"""This script is used to synthesize generated parts of this library."""

import synthtool as s
import synthtool.gcp as gcp
import synthtool.languages.java as java

service = 'accesscontextmanager'
versions = ['v1', 'type']

gapic = gcp.GAPICBazel()

for version in versions:
  library = gapic.java_library(
    service=service,
    version=version,
    proto_path=f'google/identity/accesscontextmanager/{version}',
    bazel_target=f'//google/identity/accesscontextmanager/{version}:google-cloud-accesscontextmanager-{version}-java',
  )
  library = library / f"google-cloud-accesscontextmanager-{version}-java"
  java.fix_proto_headers(library / f"proto-google-cloud-accesscontextmanager-{version}-java")
  s.copy(
    [library / f"proto-google-cloud-accesscontextmanager-{version}-java/src"],
    f"proto-google-identity-accesscontextmanager-{version}/src",
    required=True,
  )
  java.format_code(f"proto-google-identity-accesscontextmanager-{version}/src")

java.common_templates(excludes=[
  'README.md',
  'samples/*',
])
