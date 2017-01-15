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
package com.mitix.spring.aop.exp2;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class UserService {
  public void save(User user) {
    System.out.println("save user as username=" + user.getUsername());
  }
}
