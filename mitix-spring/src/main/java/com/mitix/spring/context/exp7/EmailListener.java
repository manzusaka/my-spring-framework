/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.context.exp7;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class EmailListener implements ApplicationListener<ApplicationEvent> {

  public void onApplicationEvent(ApplicationEvent event) {
    if(event instanceof EmailListEvent){
      EmailListEvent emailEvent=(EmailListEvent)event;
      emailEvent.print();
      System.out.println("this source is "+emailEvent.getSource());
      System.out.println("this address is "+emailEvent.getAddress());
      System.out.println("this text is "+emailEvent.getText());
    }
  }

}
