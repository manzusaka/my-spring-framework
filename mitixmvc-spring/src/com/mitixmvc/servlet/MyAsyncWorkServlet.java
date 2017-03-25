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
package com.mitixmvc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mitixmvc.listener.MyAsyncListener;


/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class MyAsyncWorkServlet extends HttpServlet {

  /**
   * 
   */
  private static final long serialVersionUID = -3262509902385699944L;

  private ExecutorService executor = Executors.newFixedThreadPool(10);

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    processRequest(req, resp);
  }

  private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setContentType("text/plain;charset=UTF-8");
    resp.setHeader("Cache-Control", "private");
    resp.setHeader("Pragma", "no-cache");

    // 请求
    PrintWriter writer = resp.getWriter();
    System.out.println("老板检查当前需要的工作");
    writer.println("老板检查当前需要的工作");
    writer.flush();
    // 循环初始化工作
    List<String> jobs = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      jobs.add("this is job " + i);
    }

    AsyncContext ac = req.startAsync();
    ac.addListener(new MyAsyncListener());
    ac.setTimeout(1000L);
    executor.submit(new AsyncRequest(ac, jobs));
    System.out.println("老板布置玩工作，走了");
    writer.println("老板布置玩工作，走了");
    writer.flush();
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    processRequest(req, resp);
  }

  public class AsyncRequest implements Runnable {
    private AsyncContext context;
    private List<String> jobs;

    public AsyncRequest(AsyncContext context, List<String> jobs) {
      this.context = context;
      this.jobs = jobs;
    }

    @Override
    public void run() {
      try {
        ServletResponse response=context.getResponse();
        PrintWriter writer = context.getResponse().getWriter();
        for (String job : jobs) {
          System.out.println(job);
          writer.println(job);
          Thread.sleep(2000L);
          writer.flush();
        }
      } catch (IOException | InterruptedException e1) {
        e1.printStackTrace();
      }
      context.complete();
    }
  }

}
