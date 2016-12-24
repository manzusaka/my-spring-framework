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

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class MessageSourceAwareImpl implements MessageSourceAware {

	/* (non-Javadoc)
	 * @see org.springframework.context.MessageSourceAware#setMessageSource(org.springframework.context.MessageSource)
	 */
	@Override
	public void setMessageSource(MessageSource messageSource) {
		System.out.println(messageSource);

	}

}
