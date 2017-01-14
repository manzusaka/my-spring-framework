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
package com.mitix.spring.context.expa;

import org.springframework.context.SmartLifecycle;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class MySmartLifecycle2 implements SmartLifecycle {
  private boolean isRunning;

  /*
   * (non-Javadoc)
   * 
   * @see org.springframework.context.Lifecycle#start()
   */
  @Override
  public void start() {
    System.out.println("MySmartLifecycle2 is starting");
    this.isRunning = true;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.springframework.context.Lifecycle#stop()
   */
  @Override
  public void stop() {
    System.out.println("MySmartLifecycle2 is stoped");
    this.isRunning = false;
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

  /*
   * (non-Javadoc)
   * 
   * @see org.springframework.context.Phased#getPhase()
   */
  @Override
  public int getPhase() {
    return 3;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.springframework.context.SmartLifecycle#isAutoStartup()
   */
  @Override
  public boolean isAutoStartup() {
    return false;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.springframework.context.SmartLifecycle#stop(java.lang.Runnable)
   */
  @Override
  public void stop(Runnable callback) {
    System.out.println("Runnable2 is stoped");
    this.isRunning=false;
  }

}
