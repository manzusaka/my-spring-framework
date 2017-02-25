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
package com.mitix.spring.taskexecutor.exp1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class AsyncMain {

  /**
   * @param args
   */
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
    AsyncTaskService service = (AsyncTaskService) context.getBean("asyncTaskService");
    for (int i = 0; i < 20; i++) {
      service.executeAsyncTask(i);
      service.executeAsyncTaskPlus(i);
    }
  }

}
