package com.mitix.spring.context.exp2;

import org.springframework.context.ApplicationContext;

public class ApplicationContextTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//测试ApplicationContext第一个Beans实例
		ApplicationContext context=new MyClassPathXmlApplicationContext("context/exp2/applicationContext.xml");
	    TestBean bean=(TestBean) context.getBean("testbean");
	    System.out.println(bean.getTestStr());
	}

}
