/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.exp4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class CarFactoryBeanTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("exp4/applicationContext.xml"));
	    Car bean=(Car) factory.getBean("car");
	    System.out.println(bean.getBrand());
	}

}
