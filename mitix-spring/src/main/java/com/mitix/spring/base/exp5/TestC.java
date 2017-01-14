package com.mitix.spring.base.exp5;

/**
 *创建于:2016-3-18<br>
 *版权所有(C) 2016 oldflame-Jm<br>
 * TODO
 * @author hlh19
 * @version TODO
 */
public class TestC {
	private TestA testA;
	public void c() {
		getTestA().aa();
		
	}
	public void cc(){
		System.out.println("ccccc");
	}
	
	public TestA getTestA() {
		return testA;
	}
	public void setTestA(TestA testA) {
		this.testA = testA;
	}

}
