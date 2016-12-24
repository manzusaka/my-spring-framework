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

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class SimpleBean {
	private String name;
	private String password;
	private String todos;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTodos() {
		return todos;
	}
	public void setTodos(String todos) {
		this.todos = todos;
		Object t=new Object();
	}
	
	@Override
	public String toString() {
		return "name is "+getName()+"--- password is "+getPassword()+"--- todos is "+getTodos();
	}
	
}
