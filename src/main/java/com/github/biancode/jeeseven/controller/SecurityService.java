package com.github.biancode.jeeseven.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.github.biancode.jeeseven.ejb.BaseEJB;
import com.github.biancode.jeeseven.model.Security;


@ManagedBean(name = "securityService")
@RequestScoped
public class SecurityService
{

  @EJB
  private BaseEJB<Security> securityEJB;

  private List<Security> securities = new ArrayList<>();

  public List<Security> getSecurities()
  {

    securities = securityEJB.findAll(Security.class);
    return securities;
  }

}
