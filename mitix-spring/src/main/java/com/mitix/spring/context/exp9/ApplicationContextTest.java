package com.mitix.spring.context.exp9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//测试ApplicationContext第一个Beans实例
		ApplicationContext context=new ClassPathXmlApplicationContext("context/exp9/applicationContext.xml");
		DemoBean bean=(DemoBean) context.getBean("denoBean");
		bean.doSomething();
	}

}
