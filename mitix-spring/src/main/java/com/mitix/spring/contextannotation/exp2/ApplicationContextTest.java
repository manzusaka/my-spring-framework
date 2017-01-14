package com.mitix.spring.contextannotation.exp2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//测试ApplicationContext第一个Beans实例
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("contextannotation/exp2/applicationContext.xml");
		System.out.println(context.getBeanFactory());
	    TestBean bean=(TestBean) context.getBean("testBean");
	    bean.print();
	}

}
