/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.exp12;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{
	private Set<String> illegals;
	
	
	public MyBeanFactoryPostProcessor(){
		this.illegals=new HashSet<String>();
	}
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanNames=beanFactory.getBeanDefinitionNames();
		for(String beanName:beanNames){
			BeanDefinition bd=beanFactory.getBeanDefinition(beanName);
			StringValueResolver valueResolver=new StringValueResolver() {
				
				@Override
				public String resolveStringValue(String strVal) {
					if(isIllegal(strVal)){
						return "******";
					}
					return strVal;
				}


			};
			BeanDefinitionVisitor visitor =new BeanDefinitionVisitor(valueResolver);
			visitor.visitBeanDefinition(bd);
		}
		
	}
	
	private boolean isIllegal(Object val) {
		String tmp=val.toString().toUpperCase();
		return this.illegals.contains(tmp);
	}
	
	public Set<String> getIllegals() {
		return illegals;
	}
	
	public void setIllegals(Set<String> illegals) {
		this.illegals.clear();
		for(String value:illegals){
			this.illegals.add(value.toUpperCase());
		}
	}

}
