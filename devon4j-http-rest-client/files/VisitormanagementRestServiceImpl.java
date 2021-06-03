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
  public VisitorEto getVisitor(long id) {

    return this.visitormanagement.findVisitor(id);
  }

  @Override
  public VisitorEto saveVisitor(VisitorEto visitor) {

    return this.visitormanagement.saveVisitor(visitor);
  }

  @Override
  public void deleteVisitor(long id) {

    this.visitormanagement.deleteVisitor(id);
  }

  @Override
  public Page<VisitorEto> findVisitors(VisitorSearchCriteriaTo searchCriteriaTo) {

    return this.visitormanagement.findVisitors(searchCriteriaTo);
  }

  @Override
  public String returnResponseToClient(String args) {

    System.out.println("&*************inside api requested*******");
    args = "welcome to rest api";
    System.out.println("***************" + args + "****************");
    return args;
  }
}