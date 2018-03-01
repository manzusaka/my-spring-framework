package com.mitix.spring.base.exp1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.io.IOException;

@SuppressWarnings("deprecation")
public class MyTestBeanTest {

	public static void main(String[] args) throws IOException {
		//测试第一个Beans实例
//		FileSystemResource fileSystemResource = new FileSystemResource("base/exp1/applicationContext.xml");
//		fileSystemResource.getFile();
//		fileSystemResource.getInputStream();

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("base/exp1/applicationContext.xml"));
	    MyTestBean bean=(MyTestBean) factory.getBean("mytestbean");
	    System.out.println(bean.getTestStr());
	}

}
