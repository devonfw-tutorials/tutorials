package com.sample.application.httprestclient;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/devon4jrestclient")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface Devon4jRestClient {

  @GET
  @Path("/response/")
  public String showResponse();
}
