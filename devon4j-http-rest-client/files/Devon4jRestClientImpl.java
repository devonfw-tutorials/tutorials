package com.sample.application.httprestclient.general.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;
import com.sample.application.httprestclient.general.service.api.rest.Devon4jRestClient;
import com.sample.application.httprestclient.general.service.api.rest.VisitormanagementRestService;
import com.devonfw.module.service.common.api.client.ServiceClientFactory;

@Named("Devon4jRestClient")
public class Devon4jRestClientImpl implements Devon4jRestClient {

  @Inject
  private ServiceClientFactory serviceClientFactory;

  @Override
  public String showResponse() {

    String result = callSynchronous();
    System.out.println(result);
    return result;
  }

  private String callSynchronous() {

    VisitormanagementRestService visitormanagementRestService = this.serviceClientFactory
        .create(VisitormanagementRestService.class);
    // call of service over the wire, synchronously blocking until result is received or error occurred
    String resultFromAPICall = visitormanagementRestService.returnResponseToClient();
    return resultFromAPICall;
  }

  @Override
  public String returnServiceDetail() {

    String result = "This is devon4j rest service client";
    return result;
  }
}
