/*
 * Copyright (c) 2010
 * @date 2017
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.el.exp1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
@Configuration
@ComponentScan("com.mitix.spring.el.exp1")
@PropertySource("el/exp1/test.properties")
public class ElConfig {
  @Value("hello world!!!")
  private String normal;
  @Value("#{systemProperties['os.name']}")
  private String osName;
  @Value("#{T(java.lang.Math).random() * 100.0}")
  private double randomNumber;
  @Value("#{demoService.another}")
  private String fromAnother;
  @Value("el/exp1/test.txt")
  private Resource testFile;
  @Value("www.163.com")
  private Resource testUrl;
  @Value("${book.name}")
  private String bookName;
  
  @Bean
  public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
    return new PropertySourcesPlaceholderConfigurer();
  }
  
  public void outputtest(){
    try{
      System.out.println(normal);
      System.out.println(osName);
      System.out.println(randomNumber);
      System.out.println(fromAnother);
      System.out.println(testFile);
      System.out.println(testUrl);
      System.out.println(bookName);
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
