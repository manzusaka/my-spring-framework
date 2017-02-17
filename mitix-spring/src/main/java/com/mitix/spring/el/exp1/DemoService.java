/*
 * Copyright (c) 2010
 * @date 2017
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.el.exp1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
@Service
public class DemoService {
  @Value("其他的类的属性")
  private String another;

  public String getAnother() {
    return another;
  }

  public void setAnother(String another) {
    this.another = another;
  }
  
}
