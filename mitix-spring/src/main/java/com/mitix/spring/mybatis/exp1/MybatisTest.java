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
package com.mitix.spring.mybatis.exp1;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class MybatisTest {
  private static SqlSessionFactory sqlSessionFactory = null;

  static {
    sqlSessionFactory = MybatisUtil.getSqlsessionfactory();
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    addUser();
    getUser();
    updateUser();
  }

  private static void addUser() {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
      User user = new User();
      user.setAge(48);
      user.setName("infotech");
      user.setSex("女");
      userMapper.insertUser(user);
      sqlSession.commit();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      sqlSession.close();
    }
  }

  private static void getUser() {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
      User param = new User();
      param.setId(1);
      User user = userMapper.selectUser(param);
      System.out.println(user.getName());
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      sqlSession.close();
    }
  }

  private static void updateUser() {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
      User user = new User();
      user.setId(2);
      user.setName("ladidi");
      user.setSex("女");
      user.setAge(68);
      userMapper.updateUser(user);
      sqlSession.commit();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      sqlSession.close();
    }
  }

}
