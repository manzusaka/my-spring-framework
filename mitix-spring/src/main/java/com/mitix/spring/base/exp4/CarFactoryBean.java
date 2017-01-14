/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.base.exp4;

import org.springframework.beans.factory.FactoryBean;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class CarFactoryBean<T> implements FactoryBean<T> {
	private String carInfo;

	@SuppressWarnings("unchecked")
	@Override
	public T getObject() throws Exception {
		Car car=new Car();
		String[] infos=carInfo.split(",");
		car.setBrand(infos[0]);
		car.setMaxSpeed(Integer.valueOf(infos[1]));
		car.setPrice(Double.valueOf(infos[2]));
		return (T) car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	public String getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(String info) {
		this.carInfo = info;
	}



}
