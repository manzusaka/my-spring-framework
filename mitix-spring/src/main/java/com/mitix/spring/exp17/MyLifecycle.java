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
package com.mitix.spring.exp17;

import org.springframework.context.Lifecycle;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class MyLifecycle implements Lifecycle {
  private boolean isRunning;

  /*
   * (non-Javadoc)
   * 
   * @see org.springframework.context.Lifecycle#start()
   */
  @Override
  public void start() {
    System.out.println("MyLifecycle is starting");
    this.isRunning = true;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.springframework.context.Lifecycle#stop()
   */
  @Override
  public void stop() {
    System.out.println("MyLifecycle is stoped");
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.springframework.context.Lifecycle#isRunning()
   */
  @Override
  public boolean isRunning() {
    return this.isRunning;
  }

}
