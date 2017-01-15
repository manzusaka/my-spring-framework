/*
 * Copyright (c) 2010
 * 
 * @date 2017
 * 
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0 http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.aop.exp4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class ContextApplicationTest {

  /**
   * @param args
   */
  public static void main(String[] args) {
    ApplicationContext appContext = new ClassPathXmlApplicationContext("aop/exp4/applicationContext.xml");
    System.out.println("使用Spring AOP 如下");
    CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxy");
    System.out.println("*************************");
    cust.printName();
    System.out.println("*************************");
    cust.printURL();
    System.out.println("*************************");

    try {
      cust.printThrowException();
    } catch (Exception e) {

    }

  }

}
