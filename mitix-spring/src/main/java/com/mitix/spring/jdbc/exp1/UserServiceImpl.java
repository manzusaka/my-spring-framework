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
package com.mitix.spring.jdbc.exp1;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class UserServiceImpl implements UserService {
  @Autowired
  private JdbcTemplate jdbcTemplate;

  
  public void setDataSource(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }
  /*
   * (non-Javadoc)
   * 
   * @see com.mitix.spring.jdbc.exp1.UserService#save(com.mitix.spring.jdbc.exp1.User)
   */
  @Override
  public void save(User user) {
//    jdbcTemplate.update("insert into user (id,age,name,sex) values(?,?,?,?)", new Object[] {user.getId(), user.getAge(), user.getName(), user.getSex()},
//        new int[] {java.sql.Types.INTEGER, java.sql.Types.INTEGER, java.sql.Types.VARCHAR, java.sql.Types.VARCHAR});
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.mitix.spring.jdbc.exp1.UserService#getUsers()
   */
  @Override
  public List<User> getUsers() {
//    List<User> list=jdbcTemplate.query("select * from user", new UserRowMapper());
    return null;
  }

}
