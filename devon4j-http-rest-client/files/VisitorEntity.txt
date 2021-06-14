package com.devonfw.httprestapi.restapi.visitormanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.devonfw.httprestapi.restapi.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.httprestapi.restapi.visitormanagement.common.api.Visitor;

@Entity
@Table(name = "Visitor")
public class VisitorEntity extends ApplicationPersistenceEntity implements Visitor {

  private String username;

  private String password;

  private static final long serialVersionUID = 1L;

  /**
   * @return username
   */
  public String getUsername() {

    return this.username;
  }

  /**
   * @param username new value of {@link #getusername}.
   */
  public void setUsername(String username) {

    this.username = username;
  }

  /**
   * @return password
   */
  public String getPassword() {

    return this.password;
  }

  /**
   * @param password new value of {@link #getpassword}.
   */
  public void setPassword(String password) {

    this.password = password;
  }

}
