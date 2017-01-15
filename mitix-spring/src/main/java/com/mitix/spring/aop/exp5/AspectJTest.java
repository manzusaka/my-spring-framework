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
package com.mitix.spring.aop.exp5;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @version 1.0.0
 * @author oldflame-Jm aspectj切面
 * 
 */
@Aspect
public class AspectJTest {
  @Pointcut("execution(* *.print(..))")
  public void log() {

  }

  @Before("log()")
  public void beforeLog() {
    System.out.println("before log this is print");
  }

  @After("log()")
  public void afterLog() {
    System.out.println("after log this is print");
  }

  @Around("log()")
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
