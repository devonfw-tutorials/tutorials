package com.devonfw.httpclient.httpdevon4jclient;

import javax.inject.Inject;
import javax.inject.Named;

import com.devonfw.httprestapi.restapi.visitormanagement.service.api.rest.VisitormanagementRestService;
import com.devonfw.module.service.common.api.client.ServiceClientFactory;

@Named("RestClientService")
public class Devon4jRestClientImpl implements Devon4jRestClient {

  @Inject
  private ServiceClientFactory serviceClientFactory;

  private VisitormanagementRestService visitormanagementRestService;

  @Override
  public String showResponse() {

    String result = callSynchronous();
    System.out.println("**********inside client method***********");
    System.out.println(result);
    System.out.println("************Thank you for choosing devon4j ****************");
    return result;
  }

  private String callSynchronous() {

    System.out.println("***********inside synchronous call************");
    VisitormanagementRestService visitormanagementRestService = this.serviceClientFactory
        .create(VisitormanagementRestService.class);
    // call of service over the wire, synchronously blocking until result is received or error occurred
    String resultFromAPICall = visitormanagementRestService.returnResponseToClient("Request sent to API");
    System.out.println("************************got result from api" + resultFromAPICall + "***************");
    return resultFromAPICall;
  }

  @Override
  public String verifyServiceWork() {

    return "this method of client service is working";
  }

}
