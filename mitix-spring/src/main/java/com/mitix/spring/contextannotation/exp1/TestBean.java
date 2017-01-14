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
package com.mitix.spring.contextannotation.exp1;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.ws.WebServiceRef;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Role;

/**
 * @version 1.0.0
 * @author oldflame-Jm first example this is a pojo
 */
@FruitName
@Named(value = "testbean")
// @Lazy(value=false)
// @Primary
// @DependsOn
// @Role(value=0)
public class TestBean {
  
  private ITestBesn2 iTestBean2;
  private TestBean2 testBean2;
  
  private String testStr = "hello world!!";

  public String getTestStr() {
    return testStr;
  }

  public void setTestStr(String testStr) {
    this.testStr = testStr;
  }

  public void print() {
    System.out.println("testBean2 getname="+testBean2.getName() );
    System.out.println("iTestBean2 getname="+iTestBean2.getLookName());
    System.out.println("this is testbean say " + this.testStr);
  }

  public TestBean2 getTestBean2() {
    return testBean2;
  }
  /*
   * Inject by AutowiredAnnotationBeanPostProcessor
   * @Autowired
   * @Value("#{testBean2}")
   * @Inject
   */
  /*
   * Inject by CommonAnnotationBeanPostProcessor
   * @Resource
   */
  @Resource
  @Autowired
  public void setTestBean2(TestBean2 testBean2) {
    this.testBean2 = testBean2;
  }
  
  
  public ITestBesn2 getiTestBean2() {
    return iTestBean2;
  }
  //@Autowired
  //@Resource
  public void setiTestBean2(ITestBesn2 iTestBean2) {
    this.iTestBean2 = iTestBean2;
  }

}
