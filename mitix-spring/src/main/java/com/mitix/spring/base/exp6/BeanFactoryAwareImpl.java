/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.base.exp6;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class BeanFactoryAwareImpl implements BeanFactoryAware {
	private BeanFactory factory;
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.factory=beanFactory;
	}
	
	public void testFactoryCallHelloBean(){
		System.out.println(factory);
		Hello hello=(Hello) factory.getBean("hello");
		hello.sayHello();
	}
}
