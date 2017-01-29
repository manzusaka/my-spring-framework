/*
 * Copyright (c) 2010
 * 
 * @date 2017
 * 
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0 http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.mybatis.exp3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class MybatisTest {
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    ApplicationContext context=new ClassPathXmlApplicationContext("mybatis/exp3/applicationContext.xml");
    UserMapper mapper=(UserMapper)context.getBean("userMapper");
    User user=new User();
    user.setId(1);
    System.out.println(mapper.selectUser(user));
  }

}
