package com.mitix.spring.contextannotation.exp1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//测试ApplicationContext第一个Beans实例
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("contextannotation/exp1/applicationContext.xml");
		System.out.println(context.getBeanFactory());
	    TestBean bean=(TestBean) context.getBean("testbean");
	    bean.print();
	}

}
