package com.mitix.spring.context.expc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//测试ApplicationContext第一个Beans实例
		ApplicationContext context=new AnnotationConfigApplicationContext(DiConfig.class);
		FunctionService bean=(FunctionService) context.getBean(FunctionService.class);
		bean.doSayHello();
	}

}
