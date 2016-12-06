/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
/**
 * @version 1.0.0
 * @author oldflame-Jm
 * Spring循环依赖处理
 */
package com.mitix.spring.exp5;
//只有在单例模式下才尝试解决循环依赖的问题
//使用构造函数的循环依赖无法解决  所以直接抛出BeanCurrentlyInCreationException
//应该是发现了depends-on方式在循环依赖上的bug,所以spring4.0对于depends-on的循环依赖进行了限制 设置成无法解决直接抛出循环依赖异常了