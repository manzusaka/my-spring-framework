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

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class HijackAroundMethod implements MethodInterceptor {

  @Override
  public Object invoke(MethodInvocation methodInvocation) throws Throwable {
    System.out.println("Method name : " + methodInvocation.getMethod().getName());
    System.out.println("Method arguments : " + Arrays.toString(methodInvocation.getArguments()));

    // 相当于 MethodBeforeAdvice
    System.out.println("HijackAroundMethod : Before method hijacked!");

    try {
      // 调用原方法，即调用CustomerService中的方法
      Object result = methodInvocation.proceed();

      // 相当于 AfterReturningAdvice
      System.out.println("HijackAroundMethod : After method hijacked!");

      return result;

    } catch (IllegalArgumentException e) {
      // 相当于 ThrowsAdvice
      System.out.println("HijackAroundMethod : Throw exception hijacked!");
      throw e;
    }

  }



}
