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
package com.mitix.spring.contextannotation.exp4;

/**
 * @version 1.0.0
 * @author oldflame-Jm first example this is a pojo
 */
public class TestBean {
  
  private String name1;
  private String name2;

  public String getName1() {
    return name1;
  }

  public void setName1(String name1) {
    this.name1 = name1;
  }

  public String getName2() {
    return name2;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }
  
  public void print(){
    System.out.println("this name1="+name1);
    System.out.println("this name2="+name2);
  }

}
