/*
 * Copyright (c) 2010
 * @date 2017
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
/**
 * @version 1.0.0
 * @author oldflame-Jm
 * 测试@Bean注解的注入
 */
package com.mitix.spring.context.expc;
//关于@Bean注解的注入   整个过程
//1.ConfigurationClassPostProcessor  发起@Configuration的解析
//2.整个解析过程委托给ConfigurationClassParser 进行  解析完成以后放入configurationClasses  属性中  
//其实就整理成相当于XML的东西  bean的另外一种格式  这个过程中@Bean的注解会保存两个东西  一个是这个配置类  还有一个就是方法的元数据    
//3.解析完成的configurationClasses委托给ConfigurationClassBeanDefinitionReader 进行注册处理   
//这个是spring为类配置新写的一个处理reader，在这里@Bean的东西会被设置成有工厂方法的bean  工厂方法getObject获取方法应该是一个代理   去调用配置类里面名字一样的方法
//4.然后通过注入的方式去注入属性    这里的注入和普通的@Autowired应该还是有点区别的   普通的@Autowired是按照类型注入    这里的是会按照类型查找相应的Bean  然后进行规则匹配   按照@Primy  等等  这里没有仔细看    如果匹配规则都没有用到   
//那么就直接找名字能够对上的哪个方法  （bean名字和参数名字）

