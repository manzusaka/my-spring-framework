package com.mitix.spring.context.exp8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//测试ApplicationContext第一个Beans实例
		ApplicationContext context=new ClassPathXmlApplicationContext("context/exp8/applicationContext.xml");
	    TestBean bean=(TestBean) context.getBean("testbean");
	    System.out.println(bean.getTestStr());
	}

}
