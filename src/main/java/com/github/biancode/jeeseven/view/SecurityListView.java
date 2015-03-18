package com.github.biancode.jeeseven.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.github.biancode.jeeseven.controller.SecurityService;
import com.github.biancode.jeeseven.model.Security;

@ManagedBean
public class SecurityListView implements Serializable
{

  private static final long serialVersionUID = 1L;

  private List<Security> securities;

  private List<Security> filteredSecurities;

  @ManagedProperty("#{securityService}")
  private SecurityService service;

  @PostConstruct
  public void init()
  {

    securities = service.getSecurities();
  }

  public List<Security> getSecurities()
  {

    return securities;
  }

  public void setService(SecurityService service)
  {

    this.service = service;
  }

  public List<Security> getFilteredSecurities()
  {

    return filteredSecurities;
  }

  public void setFilteredSecurities(List<Security> filteredSecurities)
  {

    this.filteredSecurities = filteredSecurities;
  }
}
