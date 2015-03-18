package com.github.biancode.jeeseven.base;

import java.io.PrintStream;

public class Greeter
{
  /**
   * 
   * @param to
   * @param name
   */
  public void greet(PrintStream to, String name)
  {

    to.println(createGreeting(name));
  }

  /**
   * 
   * @param name
   * @return
   */
  public String createGreeting(String name)
  {

    return "Hello, " + name + "!";
  }
}
