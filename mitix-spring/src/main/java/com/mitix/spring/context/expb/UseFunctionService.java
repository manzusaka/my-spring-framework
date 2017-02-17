/*
 * Copyright (c) 2010
 * @date 2017
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.context.expb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
@Service
public class UseFunctionService {
  @Autowired
  private FunctionService service;
  
  public void sayHello(String text){
    service.doSayHello(text);
  }
}
