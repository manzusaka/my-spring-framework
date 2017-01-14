package com.mitix.spring.context.exp4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//测试ApplicationContext第一个Beans实例
		ApplicationContext context=new ClassPathXmlApplicationContext("context/exp4/applicationContext.xml");
		HelloMessage bean=(HelloMessage) context.getBean("message");
	    System.out.println(bean.getMessagetext());
	}

}
