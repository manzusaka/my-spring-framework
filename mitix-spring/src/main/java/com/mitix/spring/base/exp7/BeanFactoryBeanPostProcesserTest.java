package com.mitix.spring.base.exp7;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryBeanPostProcesserTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("base/exp7/applicationContext.xml"));
		Hello hello=(Hello) factory.getBean("hello");
		hello.sayHello();
		ApplicationContext context=new ClassPathXmlApplicationContext("base/exp7/applicationContext.xml");
		Hello hello2= (Hello) context.getBean("hello");
		hello2.sayHello();
	}

}
