/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.contextannotation.exp2;

import javax.annotation.Resource;

/**
 * @version 1.0.0
 * @author oldflame-Jm first example this is a pojo
 */
public class TestBean {
   
	private String testStr = "hello world!!";
	
	//@Autowired
	//@Inject
	//@Value("#{test}")
	@Resource
	private Test2 test;
	
	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
	
	public void print(){
	  System.out.println(test.getName()+" this is testbean say "+this.testStr);
	}

  public Test2 getTest() {
    return test;
  }

  public void setTest(Test2 test) {
    this.test = test;
  }
}
