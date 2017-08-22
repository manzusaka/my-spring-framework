/*
 * Copyright (c) 2010
 * @date 2017
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.context.expb;

import org.apache.log4j.Logger;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */

/*
 * 1.当配置bean上的@Conditional注解返回false时  就不会注册这个配置
 * @Conditional(LinuxCondition.class)
 */
/*
 * 2.当标记这个注解时会被处理成full的Configurationcalss
 * @Configuration
 */
/*
 * 3. 当类上有org.springframework.context.annotation.Import  org.springframework.stereotype.Component
 * org.springframework.context.annotation.ImportResource org.springframework.context.annotation.ComponentScan  注解 
 * 或者方法上有  org.springframework.context.annotation.Bean 注解会被标记成Lite
 * @ComponentScan("com.mitix.spring.context.expb")
 */
/*
 * 4.1 @ComponentScan("com.mitix.spring.context.expb") 这个好像可以直接作为配置扫描项的  具体和full有什么区别继续看.  
 * 4.2 @ImportResource(value="context/expb/applicationContext.xml")可以导入文件
 * 4.3 @Import(value=DiImportConfig.class) 这个可以导入其他的配置类
 * 4.4 @Component 这个功能我继续往下看
 * 4.5 @Bean  这个东西配置到方法上好像可以直接当bean使用
 */
/*
 * 5. @Order 实现Order注解可以排序
 */
@Configuration
//@ComponentScan("com.mitix.spring.context.expb")
//@ImportResource(value="context/expb/applicationContext.xml")
//@Import(value=DiImportConfig.class)
//@Component
//@PropertySource(name="test",value="classpath:context/expb/config.properties")
public class DiConfig implements ApplicationContextAware{
   private Logger logger=Logger.getLogger(DiConfig.class);

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) {
//    this.applicationContext=applicationContext;
    if(applicationContext instanceof AbstractApplicationContext){
      AbstractApplicationContext context= (AbstractApplicationContext)applicationContext;
      logger.error(context.getBeanFactory());
    }
  }
  
  //用于处理@PropertySource
  @Bean
  public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
      return new PropertySourcesPlaceholderConfigurer();
  }

  //注册成ConfigurationClassBeanDefinition
  @Bean
  public FunctionService functionService(){
      return new FunctionService();
  }
  
  @Bean
  public UseFunctionService useFunctionService(){
    return new UseFunctionService();
  }


  
}
