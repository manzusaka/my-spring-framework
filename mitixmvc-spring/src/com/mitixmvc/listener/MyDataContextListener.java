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
package com.mitixmvc.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class MyDataContextListener implements ServletContextListener {
  private static Logger logger = Logger.getLogger(MyDataContextListener.class);

  private ServletContext context = null;
  

  public MyDataContextListener() {
    logger.debug("MyDataContextListener Instantiation this");
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
   */
  @Override
  public void contextDestroyed(ServletContextEvent event) {
    this.context = null;
    logger.debug("destroy context");
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
   */
  @Override
  public void contextInitialized(ServletContextEvent event) {
    this.context = event.getServletContext();
    logger.debug("init context="+event.getServletContext().getContextPath());
    context.setAttribute("mydate", "this is mydate");
  }

}
