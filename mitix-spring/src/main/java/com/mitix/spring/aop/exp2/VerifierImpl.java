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

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @version 1.0.0
 * @author oldflame-Jm IVerifier实现
 */
public class VerifierImpl implements IVerifier {

  @Autowired
  private User user;


  @Override
  public boolean validate(User user) {
    if (user.getUsername().equals("infotech") && user.getPassword().equals("123456")) {
      System.out.println("success to validating, username is " + user.getUsername());
      return true;
    } else {
      System.out.println("fail to validating, username is " + user.getUsername());
      return false;
    }
  }

}
