package com.github.biancode.jeeseven.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class MockDeviceService
{

  public List<String> getList()
  {
    List<String> liste = new ArrayList<String>();
    liste.add("Das ist ein Test 1!");
    liste.add("Das ist ein Test 2!");
    liste.add("Das ist ein Test 3!");
    
    return liste;
  }

}
