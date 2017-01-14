/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.context.exp7;

import org.springframework.context.ApplicationEvent;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class EmailListEvent extends ApplicationEvent {
  private static final long serialVersionUID = 1850997101751473723L;
  private String address;
  private String text;
  
  public EmailListEvent(Object source) {
    super(source);
  }
  
  public EmailListEvent(Object source,String address,String text) {
    super(source);
    this.address=address;
    this.text=text;
  }
  
  
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void print(){
    System.out.println("Hello,spring event!!");
  }

}
