/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.base.exp6;

import org.springframework.beans.factory.BeanClassLoaderAware;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class BeanClassLoaderAwareImpl implements BeanClassLoaderAware {
	private static ClassLoader beanFactoryClassLoader;

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.BeanClassLoaderAware#setBeanClassLoader(java.lang.ClassLoader)
	 */
	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		this.beanFactoryClassLoader=classLoader;
		System.out.println(beanFactoryClassLoader);
	}

}
