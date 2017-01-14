package com.mitix.spring.base.exp5;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


/**
 *创建于:2016-3-14<br>
 *版权所有(C) 2016 oldflame-Jm<br>
 * TODO
 * @author hlh19
 * @version TODO
 */
public class CircleReferenceTest {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		try{
			BeanFactory factory=new XmlBeanFactory(new ClassPathResource("base/exp5/applicationContext.xml"));
			TestA a=(TestA) factory.getBean("testA");
			a.getTestB().b();
//			new ClassPathXmlApplicationContext("exp5/applicationContext.xml");
		}catch(Exception e){
			e.printStackTrace();
			//Throwable el=e.getCause().getCause().getCause();
			//throw el;
		}
	}

}
