package com.devonfw.httprestapi.restapi.visitormanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.httprestapi.restapi.visitormanagement.logic.api.Visitormanagement;
import com.devonfw.httprestapi.restapi.visitormanagement.logic.api.to.VisitorEto;
import com.devonfw.httprestapi.restapi.visitormanagement.logic.api.to.VisitorSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Visitormanagement}.
 */
@Path("/visitormanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface VisitormanagementRestService {

  /**
   * Delegates to {@link Visitormanagement#findVisitor}.
   *
   * @param id the ID of the {@link VisitorEto}
   * @return the {@link VisitorEto}
   */
  @GET
  @Path("/clientrequest")
  public String returnResponseToClient(String args);

}