package com.mitix.spring.base.exp5;

/**
 *创建于:2016-3-18<br>
 *版权所有(C) 2016 oldflame-Jm<br>
 * TODO
 * @author hlh19
 * @version TODO
 */
public class TestA {
	private TestB testB;
	
	public void a(){
		getTestB().bb();
	}
	
	public void aa(){
		System.out.println("aaaaa");
	}
	public TestB getTestB() {
		return testB;
	}
	public void setTestB(TestB testB) {
		this.testB = testB;
	}
	
}
