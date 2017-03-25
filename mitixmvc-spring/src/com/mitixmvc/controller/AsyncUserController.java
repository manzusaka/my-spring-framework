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
package com.mitixmvc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.WebAsyncTask;

import com.mitixmvc.model.User;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
@RestController
@RequestMapping("/SpringMVC")
public class AsyncUserController {

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.springframework.web.servlet.mvc.AbstractController#handleRequestInternal(javax.servlet.http
   * .HttpServletRequest, javax.servlet.http.HttpServletResponse)
   */
  @RequestMapping(value = "/asynctest.do", method = RequestMethod.POST)
  public WebAsyncTask test(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Callable<List> callable = new Callable<List>() {
      public List call() throws Exception {
        List<User> list = new ArrayList<User>();
        User user1 = new User();
        User user2 = new User();
        user1.setName("张三");
        user1.setAge(22);
        user2.setName("里斯");
        user2.setAge(44);
        list.add(user1);
        list.add(user2);
        return list;
      }
    };
    return new WebAsyncTask(callable);
  }

}
