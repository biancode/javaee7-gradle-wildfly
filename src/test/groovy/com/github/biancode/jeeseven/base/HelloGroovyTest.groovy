package com.github.biancode.jeeseven.base

import static org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class HelloGroovyTest {

	@Test
	public void testSayHello() {
		assertEquals "testSayHello", HelloGroovy.sayHello(), "Hello it's me - ${HelloGroovy.NAME}!"
	}

  @Test
  public void testSetNameAndSayHello() {
    def name = "BAYMAX" // damit zum Vergleich ein GString erstellt wird
    HelloGroovy.NAME = name
    assertEquals "testSetNameAndSayHello", HelloGroovy.sayHello(), "Hello it's me - ${name}!"
  }
  
	@Test
	public void testCalcHello() {
		
		def number = HelloGroovy.calcHello(1, 1)
		
		assert number == 1
		
		assertEquals 0, HelloGroovy.calcHello(0, 0), 0
		assertEquals 8.0, HelloGroovy.calcHello(2.0, 4.0), 0.0
		assertEquals 8.0, HelloGroovy.calcHello(4.0, 2.0), 0.0
	}

}
