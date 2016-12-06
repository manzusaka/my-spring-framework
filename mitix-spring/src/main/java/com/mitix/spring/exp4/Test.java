/*
 * Copyright (c) 2010
 * @date 2016
 * @author oldflame-Jm
 * 
 * Apache License Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.mitix.spring.exp4;

/**
 * @version 1.0.0
 * @author oldflame-Jm
 * TODO
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car=new Car();
		car.setBrand("aaaaaaaa");
		
		processCar(car);
		
		System.out.println("car brand is out "+car.getBrand());

	}

	private static void processCar(Car car) {
		Car carToUse=car;
		carToUse.setBrand("infotech");
		System.out.println("carToUse brand is" +carToUse.getBrand());
		System.out.println("car brand is" +car.getBrand());
		
	}

}
