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
package com.mitix.spring.tx.exp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class UserServiceImpl implements UserService {
  @Autowired
  private JdbcTemplate jdbcTemplate;
  
  /*
   * (non-Javadoc)
   * 
   * @see com.mitix.spring.jdbc.exp1.UserService#save(com.mitix.spring.jdbc.exp1.User)
   */
  @Override
  @Transactional(propagation = Propagation.REQUIRED,value="transactionManager",transactionManager="transactionManager2")
  /*
   * @Transactional(propagation = Propagation.REQUIRED,value="transactionManager",transactionManager="transactionManager2")(non-Javadoc)
   * value  transactionManager  只能配置一个
   */
  public void save(User user) {
    jdbcTemplate.update("insert into user (id,age,name,sex) values(?,?,?,?)", user.getId(), user.getAge(), user.getName(), user.getSex());
    //执行事务
    throw new RuntimeException ("测试事务回滚");
  }


  public JdbcTemplate getJdbcTemplate() {
    return jdbcTemplate;
  }

  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

}
