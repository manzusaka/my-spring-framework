/*
 * Copyright (c) 2010
 * @date 2017
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.jdbc.exp1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class SpringJdbcTest {

  /**
   * @param args
   */
  public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("jdbc/exp1/applicationContext.xml");
    UserService service=(UserService) context.getBean("userService");
    User user=new User();
    user.setName("kaka");
    user.setAge(44);
    user.setSex("nan");
    service.save(user);
    
    List<User> list=service.getUsers();
    for(User item:list){
      System.out.println(item.getName());
    }

  }

}
