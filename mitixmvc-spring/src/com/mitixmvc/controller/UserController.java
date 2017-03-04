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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;

import com.mitixmvc.model.User;


/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
/*
 * 当bean上有@Controller  或者（@RequestMapping @Component）成对出现的时候，会被当成一个springmvc的bean 
 *注：其实@Controller  是@Component子类   上述注解卸载类名上有效
 */
//@Controller
//@Component
//@RestController
@Controller
@RequestMapping("/SpringMVC")
public class UserController extends AbstractController implements LastModified{
  private long lastModified;
  /*
   * (non-Javadoc)
   * 
   * @see
   * org.springframework.web.servlet.mvc.AbstractController#handleRequestInternal(javax.servlet.http
   * .HttpServletRequest, javax.servlet.http.HttpServletResponse)
   */
  @Override
  @RequestMapping(value="/test.do",method=RequestMethod.POST)
  protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
    List<User> list = new ArrayList<User>();
    User user1 = new User();
    User user2 = new User();
    user1.setName("张三");
    user1.setAge(22);
    user2.setName("里斯");
    user2.setAge(44);
    list.add(user1);
    list.add(user2);
    return new ModelAndView("userlist", "users", list);
  }
  
  @Override
  public long getLastModified(HttpServletRequest arg0) {
    if(lastModified==0L){
      lastModified=System.currentTimeMillis();
    }
    return lastModified;
  }

}
