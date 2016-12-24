/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.exp12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class ApplicationContextBeanFactoryPostProcessorTest {

  /**
   * @param args
   */
  public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("exp12/applicationContext.xml");
    SimpleBean bean=(SimpleBean) context.getBean("simplebean");
    System.out.println(bean.toString());
  }

}
