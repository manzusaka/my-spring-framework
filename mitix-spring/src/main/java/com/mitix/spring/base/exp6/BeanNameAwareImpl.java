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

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class BeanNameAwareImpl implements BeanNameAware {
	private Set<String> beanNameSet=new HashSet<String>();
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.BeanNameAware#setBeanName(java.lang.String)
	 */
	@Override
	public void setBeanName(String name) {
		System.out.println(name);
		beanNameSet.add(name);

	}

}
