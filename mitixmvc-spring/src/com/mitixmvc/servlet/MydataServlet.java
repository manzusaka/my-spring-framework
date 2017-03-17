/*
 * Copyright (c) 2010
 * @date 2017
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitixmvc.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class MydataServlet extends GenericServlet {
  private static Logger logger = Logger.getLogger(MydataServlet.class);

  /**
   * 
   */
  private static final long serialVersionUID = 2836408336949949723L;

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    ServletContext context=super.getServletContext();
    logger.info(context);
    Object text=context.getAttribute("mydata");
    logger.info(text);
  }
  

}
