/*
 * Copyright (c) 2010
 * @date 2017
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.contextannotation.exp1;

import org.springframework.stereotype.Component;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
@Component
public class TestBean22 implements ITestBesn2 {
  private String name = "local test22";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getLookName() {
    return name;
  }

}
