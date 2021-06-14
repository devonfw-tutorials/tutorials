package com.devonfw.httprestapi.restapi.visitormanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.httprestapi.restapi.visitormanagement.logic.api.Visitormanagement;
import com.devonfw.httprestapi.restapi.visitormanagement.logic.api.to.VisitorEto;
import com.devonfw.httprestapi.restapi.visitormanagement.logic.api.to.VisitorSearchCriteriaTo;
import com.devonfw.httprestapi.restapi.visitormanagement.service.api.rest.VisitormanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Visitormanagement}.
 */
@Named("VisitormanagementRestService")
public class VisitormanagementRestServiceImpl implements VisitormanagementRestService {

  @Inject
  private Visitormanagement visitormanagement;

  @Override
  public String returnResponseToClient(String args) {
    args = "welcome to rest api";
    return args;
  }
}