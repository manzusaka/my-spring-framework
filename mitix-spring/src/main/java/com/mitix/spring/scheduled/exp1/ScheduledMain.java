/*
 * Copyright (c) 2010
 * @date 2017
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.scheduled.exp1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mitix.spring.taskexecutor.exp1.TaskExecutorConfig;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class ScheduledMain {

  /**
   * @param args
   */
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduledConfig.class);
  }

}
