package com.mitix.spring.exp2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class TestAliasBeanTest {

	public static void main(String[] args) {
		//测试第一个Beans实例
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("exp2/applicationContext.xml"));
	    TestAliasBean bean=(TestAliasBean) factory.getBean("myaliasbean");
	    System.out.println(bean.getTestStr());
	}

}
