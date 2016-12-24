/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.exp13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class ApplicationContextBeanPostProcessorTest {
  public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("exp13/applicationContext.xml");
    TestBean bean=(TestBean) context.getBean("testbean");
    System.out.println(bean.getTestStr());
  }
}
