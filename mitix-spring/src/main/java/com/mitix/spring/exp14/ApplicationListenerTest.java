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
package com.mitix.spring.exp14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class ApplicationListenerTest {

  /**
   * @param args
   */
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("exp14/applicationContext.xml");
    EmailListEvent event=new EmailListEvent("hello", "honglvhang@163.com", "this is an text");
    context.publishEvent(event);
  }

}
