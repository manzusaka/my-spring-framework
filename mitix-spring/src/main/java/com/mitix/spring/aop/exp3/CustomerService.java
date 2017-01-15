/*
 * Copyright (c) 2010
 * 
 * @date 2017
 * 
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0 http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.aop.exp3;

/**
 * @version 1.0.0
 * @author oldflame-Jm 
 * Advice  
 */
public class CustomerService {
  private String name;
  private String url;

  public void setName(String name) {
    this.name = name;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void printName() {
    System.out.println("Customer name : " + this.name);
  }

  public void printURL() {
    System.out.println("Customer website : " + this.url);
  }

  public void printThrowException() {
    throw new IllegalArgumentException();
  }

}
