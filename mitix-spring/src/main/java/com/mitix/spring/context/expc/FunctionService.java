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
package com.mitix.spring.context.expc;


/**0
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class FunctionService {
  
  private User user;
  private User user2;
  
  public void doSayHello() {
    System.out.println("Hello world!!!"+user.getName());
    System.out.println("Hello world!!!"+user2.getName());
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public User getUser2() {
    return user2;
  }

  public void setUser2(User user2) {
    this.user2 = user2;
  }
}
