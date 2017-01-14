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
package com.mitix.spring.contextannotation.exp3;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @version 1.0.0
 * @author oldflame-Jm first example this is a pojo
 */
@Component
public class TestBean {
  
  @Value("infotech")
  private String name;
  private String testStr = "hello world!!";

  public String getTestStr() {
    return testStr;
  }

  public void setTestStr(String testStr) {
    this.testStr = testStr;
  }

  public void print() {
    System.out.println(name + "this is testbean say " + this.testStr);
  }

  public String getName() {
    return name;
  }
  
  @Required
  public void setName(String name) {
    this.name = name;
  }
}
