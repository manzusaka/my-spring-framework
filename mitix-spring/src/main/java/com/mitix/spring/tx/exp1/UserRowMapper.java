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

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @version 1.0.0
 * @author oldflame-Jm TODO
 */
public class UserRowMapper<T> implements RowMapper<T> {

  @SuppressWarnings("unchecked")
  @Override
  public T mapRow(ResultSet rs, int rowNum) throws SQLException {
    User person = new User();
    person.setId(rs.getInt("id"));
    person.setName(rs.getString("name"));
    person.setSex(rs.getString("sex"));
    person.setAge(rs.getInt("age"));
    return (T) person;
  }
  
}
