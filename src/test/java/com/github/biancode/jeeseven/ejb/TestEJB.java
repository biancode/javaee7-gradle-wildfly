package com.github.biancode.jeeseven.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class TestEJB
{

  public String helloWorld()
  {

    return "Hello World! Here is your despicable me!";
  }
}
