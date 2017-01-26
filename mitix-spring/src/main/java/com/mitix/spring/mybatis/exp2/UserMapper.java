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
package com.mitix.spring.mybatis.exp2;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public interface UserMapper {
  public void insertUser(User user);

  public User selectUser(User user);

  public void updateUser(User user);
}
