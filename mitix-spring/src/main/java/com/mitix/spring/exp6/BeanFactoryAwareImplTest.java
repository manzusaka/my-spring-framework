package com.mitix.spring.exp6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryAwareImplTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("exp6/applicationContext.xml");
		BeanFactoryAwareImpl bfAware= (BeanFactoryAwareImpl) context.getBean("bfaware");
		bfAware.testFactoryCallHelloBean();
	}

}
