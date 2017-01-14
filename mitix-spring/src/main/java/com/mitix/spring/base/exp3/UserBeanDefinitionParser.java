package com.mitix.spring.base.exp3;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * 创建于:2016年7月28日<br>
 * 版权所有(C) 2016 one dream code farmer<br>
 * TODO
 * 
 * @author hlh19
 * @version TODO
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
  /**
   * 
   */
 @Override
  protected Class<?> getBeanClass(Element element) {
    return User.class;
  }
  @Override
  protected void doParse(Element element, BeanDefinitionBuilder bean) {
    String acname=element.getAttribute("acname");
    String email=element.getAttribute("email");
    if(StringUtils.hasText(acname)){
      bean.addPropertyValue("acname", acname);
    }
    if(StringUtils.hasText(email)){
      bean.addPropertyValue("email", email);
    }
  }
}
