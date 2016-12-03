package com.mitix.spring.exp3;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNameSpaceHandler extends NamespaceHandlerSupport {

  public void init() {
    registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
  }

}
