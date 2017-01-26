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

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class MybatisUtil {
  private final static SqlSessionFactory sqlSessionFactory;

  static {
    String resource = "mybatis/exp1/mybatis-conf.xml";
    Reader reader = null;
    try {
      reader = Resources.getResourceAsReader(resource);
    } catch (Exception e) {
      e.printStackTrace();
    }
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
  }

  public static SqlSessionFactory getSqlsessionfactory() {
    return sqlSessionFactory;
  }

}
