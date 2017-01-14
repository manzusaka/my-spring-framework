/*
 * Copyright (c) 2010
 * 
 * @date 2016
 * 
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0 http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.aop.exp1;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @version 1.0.0
 * @author oldflame-Jm aspectj切面
 * 
 */
public class AspectJTest {
  public void log() {

  }

  public void beforeLog() {
    System.out.println("before log this is print");
  }

  public void afterLog() {
    System.out.println("after log this is print");
  }

  public Object aroundLog(ProceedingJoinPoint point) {
    System.out.println("this is around before");
    Object object = null;

    try {
      object = point.proceed();
    } catch (Throwable e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    System.out.println("this is around after");
    return object;
  }

}
