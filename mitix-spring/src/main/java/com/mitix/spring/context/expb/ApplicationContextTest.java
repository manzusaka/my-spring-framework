package com.mitix.spring.context.expb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//测试ApplicationContext第一个Beans实例
		ApplicationContext context=new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionService bean=(UseFunctionService) context.getBean(UseFunctionService.class);
		bean.sayHello("mami");
	}

}
