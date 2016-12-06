package com.mitix.spring.exp5;

/**
 *创建于:2016-3-18<br>
 *版权所有(C) 2016 oldflame-Jm<br>
 * TODO
 * @author hlh19
 * @version TODO
 */
public class TestB {
	private TestC testC;
	public void b() {
		getTestC().cc();
		
	}
	public void bb(){
		System.out.println("bbbbb");
	}
	public TestC getTestC() {
		return testC;
	}
	public void setTestC(TestC testC) {
		this.testC = testC;
	}

}
