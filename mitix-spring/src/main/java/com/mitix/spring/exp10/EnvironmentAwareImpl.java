/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.exp10;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class EnvironmentAwareImpl implements EnvironmentAware {
	private Environment environment;
	/* (non-Javadoc)
	 * @see org.springframework.context.EnvironmentAware#setEnvironment(org.springframework.core.env.Environment)
	 */
	@Override
	public void setEnvironment(Environment environment) {
		this.environment=environment;
		for(String name:environment.getDefaultProfiles()){
			System.out.println(name);
		}
	}

}
