package com.mitix.spring.exp9;

import org.springframework.context.ApplicationContext;

public class ApplicationContextTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//测试ApplicationContext第一个Beans实例
		ApplicationContext context=new MyClassPathXmlApplicationContext("exp9/applicationContext.xml");
	    TestBean bean=(TestBean) context.getBean("testbean");
	    System.out.println(bean.getTestStr());
	}

}
