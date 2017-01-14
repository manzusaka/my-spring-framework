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
package com.mitix.spring.context.exp9;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
@Aspect
public class ProfilingAspect {
  @Around("profileMethod()")
  public Object profile(ProceedingJoinPoint point) throws Throwable {
    StopWatch sw = new StopWatch(getClass().getSimpleName());
    try {
      sw.start(point.getSignature().getName());
      return point.proceed();
    } finally {
      sw.stop();
      System.out.println(sw.prettyPrint());
    }
  }

  @Pointcut("execution(public * com.mitix.spring.exp16..*(..))")
  public void profileMethod() {

  }
}
