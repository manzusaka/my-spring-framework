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
    TestBean bean=(TestBean) context.getBean("testbean");
    bean.print();
  }

}
