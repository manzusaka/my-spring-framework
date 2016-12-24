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

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.util.StringValueResolver;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class EmbeddedValueResolverAwareImpl implements EmbeddedValueResolverAware{
	private StringValueResolver resolver;
	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		this.resolver=resolver;
		System.out.println(resolver);
	}

}
