/*
 * Copyright (c) 2010
 * @date 2017
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.aop.exp2;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * 提供user验证的接口
 */
public interface IVerifier {
  public boolean validate(User user);
}
