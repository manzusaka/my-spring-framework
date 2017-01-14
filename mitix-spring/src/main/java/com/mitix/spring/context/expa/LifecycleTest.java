/*
 * Copyright (c) 2010
 * 
 * @date 2016
 * 
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0 http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.context.expa;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class LifecycleTest {
  
  public static void main(String[] args) {
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("context/expa/applicationContext.xml");
    System.out.println("----------------there is not auto start---------------------");
    context.start();
    System.out.println("----------------there is stop---------------------");
    context.stop();
  }

}
