/*
 * Copyright (c) 2010
 * @date 2017
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.context.expc;

import org.springframework.stereotype.Service;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
@Service
public class User {
  private String name;
  
  private String age;
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getAge() {
    return age;
  }
  public void setAge(String age) {
    this.age = age;
  }
  

}
