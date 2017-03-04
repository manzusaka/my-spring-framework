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
package com.mitix.spring.context.expb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
@Service
public class FunctionService {
  
  @Value("${spring.configuration.propertysource.test}")
  private String valuestest;
  
  public void doSayHello(String args0) {
    System.out.println("Hello world!!!" + valuestest +args0);
  }
}
