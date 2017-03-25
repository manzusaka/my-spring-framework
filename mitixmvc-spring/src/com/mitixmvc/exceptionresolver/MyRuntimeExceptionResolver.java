/*
 * Copyright (c) 2010
 * @date 2017
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitixmvc.exceptionresolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class MyRuntimeExceptionResolver extends AbstractHandlerExceptionResolver{

  @Override
  protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
    ModelAndView mv=null;
    if(ex instanceof RuntimeException){
      mv=new ModelAndView("error", "myerror", "服务器已经飞走了"); 
    }
    return mv;
  }
  
}
