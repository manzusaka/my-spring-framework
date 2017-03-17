/*
 * Copyright (c) 2010
 * @date 2017
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitixmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.mitixmvc.model.User;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */

public class UserController3 extends AbstractController implements BeanNameAware{
  
  @Override
  protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
    List<User> list = new ArrayList<User>();
    User user1 = new User();
    User user2 = new User();
    user1.setName("张三3");
    user1.setAge(22);
    user2.setName("里斯3");
    user2.setAge(44);
    list.add(user1);
    list.add(user2);
    return new ModelAndView("userlist", "users", list);
  }

  @Override
  public void setBeanName(String name) {
    System.out.println(name);
  }

}
