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
package com.mitix.spring.exp16;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class DemoBean {


  public void doSomething() {
    System.out.println("start");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("end");
  }
  
}
