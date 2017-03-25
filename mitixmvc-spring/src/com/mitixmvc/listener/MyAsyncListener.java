/*
 * Copyright (c) 2010
 * @date 2017
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitixmvc.listener;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class MyAsyncListener implements AsyncListener {
  final SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  @Override
  public void onComplete(AsyncEvent event) throws IOException {
    System.out.println("onComplete on"+format.format(new Date())+"cd");
  }

  @Override
  public void onTimeout(AsyncEvent event) throws IOException {
    System.out.println("onTimeout on"+format.format(new Date())+"cd");
    
  }

  @Override
  public void onError(AsyncEvent event) throws IOException {
    System.out.println("onError on"+format.format(new Date())+"cd");
    
  }
  
  @Override
  public void onStartAsync(AsyncEvent event) throws IOException {
    System.out.println("onStartAsync on"+format.format(new Date())+"cd");
    
  }

}
