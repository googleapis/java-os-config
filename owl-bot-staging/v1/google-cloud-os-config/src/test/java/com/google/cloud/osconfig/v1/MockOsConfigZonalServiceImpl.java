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

package com.google.cloud.osconfig.v1;

import com.google.api.core.BetaApi;
import com.google.cloud.osconfig.v1.OsConfigZonalServiceGrpc.OsConfigZonalServiceImplBase;
import com.google.protobuf.AbstractMessage;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockOsConfigZonalServiceImpl extends OsConfigZonalServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockOsConfigZonalServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void getInventory(
      GetInventoryRequest request, StreamObserver<Inventory> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Inventory) {
      requests.add(request);
      responseObserver.onNext(((Inventory) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetInventory, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Inventory.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void listInventories(
      ListInventoriesRequest request, StreamObserver<ListInventoriesResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListInventoriesResponse) {
      requests.add(request);
      responseObserver.onNext(((ListInventoriesResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListInventories, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListInventoriesResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void getVulnerabilityReport(
      GetVulnerabilityReportRequest request, StreamObserver<VulnerabilityReport> responseObserver) {
    Object response = responses.poll();
    if (response instanceof VulnerabilityReport) {
      requests.add(request);
      responseObserver.onNext(((VulnerabilityReport) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetVulnerabilityReport, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  VulnerabilityReport.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void listVulnerabilityReports(
      ListVulnerabilityReportsRequest request,
      StreamObserver<ListVulnerabilityReportsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListVulnerabilityReportsResponse) {
      requests.add(request);
      responseObserver.onNext(((ListVulnerabilityReportsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListVulnerabilityReports, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListVulnerabilityReportsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}
