package com.mitix;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextStart {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        //测试ApplicationContext第一个Beans实例
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyTestBean bean = (MyTestBean) context.getBean("mytestbean");
        System.out.println(bean.getTestStr());
    }
}
