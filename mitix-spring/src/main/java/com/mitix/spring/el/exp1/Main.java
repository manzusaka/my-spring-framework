package com.mitix.spring.el.exp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
  public static void main(String[] args) {
    // 测试ApplicationContext第一个Beans实例
    ApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
    ElConfig bean = (ElConfig) context.getBean(ElConfig.class);
    bean.outputtest();
  }
}
