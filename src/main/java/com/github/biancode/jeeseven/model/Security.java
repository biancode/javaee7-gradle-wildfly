package com.github.biancode.jeeseven.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the security database table.
 * 
 */
@Entity
@Table(name = "security")
@NamedQuery(name = "Security.findAll", query = "SELECT s FROM Security s")
public class Security implements Serializable
{
  private static final long serialVersionUID = -1234676294700975437L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String name;

  private String password;

  private String role;

  private int tenantid;

  public Security()
  {

  }

  public int getId()
  {

    return this.id;
  }

  public void setId(int id)
  {

    this.id = id;
  }

  public String getName()
  {

    return this.name;
  }

  public void setName(String name)
  {

    this.name = name;
  }

  public String getPassword()
  {

    return this.password;
  }

  public void setPassword(String password)
  {

    this.password = password;
  }

  public String getRole()
  {

    return this.role;
  }

  public void setRole(String role)
  {

    this.role = role;
  }

  public int getTenantid()
  {

    return this.tenantid;
  }

  public void setTenantid(int tenantid)
  {

    this.tenantid = tenantid;
  }

}
