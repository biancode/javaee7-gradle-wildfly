package com.github.biancode.jeeseven.base

class HelloGroovy {

    static def NAME = "HelloGroovy"
    
    /**
     * Says Hello.
     * @return
     * Hello String
     */
    public static def sayHello() {
        "Hello it's me - ${HelloGroovy.NAME}!"
    }

    /**
     * Calc a bit.
     * @param a
     *          value a product
     * @param b
     *          value b product
     * @return
     * 			product of a and b by multiply
     */
    public static def calcHello(def a, def b) {
        a*b
    }
}
