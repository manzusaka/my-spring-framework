/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.aop.exp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class SpringAOPTest {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //测试ApplicationContext第一个Beans实例
    ApplicationContext context=new ClassPathXmlApplicationContext("aop/exp1/applicationContext.xml");
    ITestBean bean=(ITestBean) context.getBean("testbean");
    Class<?> beanclass=bean.getClass();
    System.out.println(beanclass.getName());
    System.out.println(beanclass.getSuperclass().getName());
    System.out.println(beanclass.getSuperclass().getSuperclass().getName());
    System.out.println(beanclass.getInterfaces()[0].getName());
    System.out.println(beanclass.getInterfaces()[1].getName());
    

    bean.print();
    bean.print2();
  }

}
