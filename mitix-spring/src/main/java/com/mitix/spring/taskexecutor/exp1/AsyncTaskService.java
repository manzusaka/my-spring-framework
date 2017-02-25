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

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
@Service
public class AsyncTaskService {
  @Async
  public void executeAsyncTask(Integer i) {
    System.out.println("execute async" + i);
  }
  
  @Async
  public void executeAsyncTaskPlus(Integer i) {
    System.out.println("execute async plus" + (i + 1));
  }
}
