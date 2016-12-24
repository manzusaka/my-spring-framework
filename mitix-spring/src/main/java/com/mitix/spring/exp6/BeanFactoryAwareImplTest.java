package com.mitix.spring.exp6;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryAwareImplTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("exp6/applicationContext.xml"));
		BeanNameAwareImpl bnAware= (BeanNameAwareImpl) factory.getBean("bnaware");
		BeanClassLoaderAwareImpl bclAware= (BeanClassLoaderAwareImpl) factory.getBean("bclaware");
		BeanFactoryAwareImpl bfAware= (BeanFactoryAwareImpl) factory.getBean("bfaware");
		bfAware.testFactoryCallHelloBean();
	}

}
