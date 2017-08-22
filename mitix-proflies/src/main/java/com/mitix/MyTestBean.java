/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix;

import org.springframework.beans.factory.annotation.Value;

/**
 * @version 1.0.0
 * @author oldflame-Jm first example this is a pojo
 */
public class MyTestBean {

	@Value("${test.teststr}")
	private String testStr = "";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
}
