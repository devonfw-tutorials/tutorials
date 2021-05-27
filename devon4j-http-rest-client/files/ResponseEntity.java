package com.devonfw.httprestclient.restclient.responsemanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.devonfw.httprestclient.restclient.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.httprestclient.restclient.responsemanagement.common.api.response;

@Entity
@Table(name = "Response")
public class ResponseEntity extends ApplicationPersistenceEntity implements Response {

  private String response;

  

  private static final long serialVersionUID = 1L;

  /**
   * @return response
   */
  public String getResponse() {

    return this.response;
  }

  /**
   * @param response new value of {@link #getresponse}.
   */
  public void setResponse(String response) {

    this.response = response;
  }