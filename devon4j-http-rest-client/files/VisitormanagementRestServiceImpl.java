package com.example.application.httprestserver.general.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import com.example.application.httprestserver.general.service.api.rest.VisitormanagementRestService;

@Named("VisitormanagementRestService")
public class VisitormanagementRestServiceImpl implements VisitormanagementRestService {

  @Override
  public String returnResponseToClient(String args) {
    args = "welcome to rest api";
    return args;
  }
}