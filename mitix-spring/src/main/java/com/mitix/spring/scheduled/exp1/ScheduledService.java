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

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
@Service
public class ScheduledService {
  private static final SimpleDateFormat dateFormat=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
  
  @Scheduled(fixedRate=5000)
  public void reportCurrentTime(){
    System.out.println("每隔五秒运行一次"+dateFormat.format(new Date()));
    try {
      Thread.sleep(6000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  @Scheduled(cron="0/10 33 19 ? * *")
  public void fireTimeExecution(){
    System.out.println("在指定的时间执行"+dateFormat.format(new Date()));
  }
}
