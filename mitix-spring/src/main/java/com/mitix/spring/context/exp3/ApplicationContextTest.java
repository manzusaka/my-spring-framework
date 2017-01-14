package com.mitix.spring.context.exp3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//测试ApplicationContext的Aware
		ApplicationContext context=new ClassPathXmlApplicationContext("context/exp3/applicationContext.xml");
	    TestBean bean=(TestBean) context.getBean("testbean");
	    System.out.println(bean.getTestStr());
	}

}
