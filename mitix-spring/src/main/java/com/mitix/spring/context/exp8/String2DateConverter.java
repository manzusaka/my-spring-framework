/*
 * Copyright (c) 2010
 * 
 * @date 2016
 * 
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0 http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.context.exp8;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * @version 1.0.0
 * @author oldflame-Jm String
 * @todo 字符串到日期格式的解析 如果解析失败返回null
 */
public class String2DateConverter implements Converter<String, Date> {

  @Override
  public Date convert(String source) {
    if (source == null) {
      return null;
    }
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    try {
      return sdf.parse(source);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

}
