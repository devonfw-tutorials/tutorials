package com.example.application.httprestserver.visitormanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import com.example.application.httprestserver.visitormanagement.service.api.rest.VisitormanagementRestService;

@Named("VisitormanagementRestService")
public class VisitormanagementRestServiceImpl implements VisitormanagementRestService {

  @Override
  public String returnResponseToClient() {
   String args = "welcome to rest api";
   return args;
  }
}