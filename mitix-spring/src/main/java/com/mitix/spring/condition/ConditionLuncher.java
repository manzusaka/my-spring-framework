package com.mitix.spring.condition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by oldflame on 2017/2/13.
 */
public class ConditionLuncher {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context=new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService =context.getBean(ListService.class);
        System.out.println("当前系统的命令为"+listService.showListCmd());
    }
}
