/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.exp19;

import javax.inject.Named;

import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Role;

/**
 * @version 1.0.0
 * @author oldflame-Jm first example this is a pojo
 */
@FruitName
@Named(value="testbean")
//@Lazy(value=false)
//@Primary
//@DependsOn
//@Role(value=0)
public class TestBean {
   
	private String testStr = "hello world!!";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
	
	public void print(){
	  System.out.println("this is testbean say "+this.testStr);
	}
}
