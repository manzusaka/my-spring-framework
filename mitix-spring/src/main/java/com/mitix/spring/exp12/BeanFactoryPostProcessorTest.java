package com.mitix.spring.exp12;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryPostProcessorTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//测试ApplicationContext第一个Beans实例
		ConfigurableListableBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("exp12/applicationContext.xml"));
		BeanFactoryPostProcessor processor=(BeanFactoryPostProcessor) beanFactory.getBean("mybfpp");
		processor.postProcessBeanFactory(beanFactory);
		SimpleBean bean=(SimpleBean) beanFactory.getBean("simplebean");
	    System.out.println(bean.toString());
	}

}
