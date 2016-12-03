package com.mitix.spring.exp3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 *创建于:2016年7月30日<br>
 *版权所有(C) 2016 one dream code farmer<br>
 * TODO
 * @author hlh19
 * @version TODO
 */
public class CustomParseTest {

  /**
   * @param args
   */
  public static void main(String[] args) {
    BeanFactory context = new XmlBeanFactory(new ClassPathResource("exp3/applicationContext.xml"));
//    ApplicationContext context=new ClassPathXmlApplicationContext("exp3/applicationContext.xml");
    User user=(User) context.getBean("infotech");
    System.out.println(user.getAcname());

  }

}
