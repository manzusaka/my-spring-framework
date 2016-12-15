/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.exp9;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * initPropertySources方法重载  进行验证VAR
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
	
	public MyClassPathXmlApplicationContext(String configLocation) throws BeansException {
		super(configLocation);
	}
	
	@Override
	protected void initPropertySources() {
		getEnvironment().setRequiredProperties("VAR");
	}
}
