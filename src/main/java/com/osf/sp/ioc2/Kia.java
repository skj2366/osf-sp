package com.osf.sp.ioc2;

public class Kia implements CarMaker {

	private Car c;
	public Kia(Car c) {
		this.c = c;
	}
	
	public void sellCar() {
		System.out.println("기아자동차 :" + c + "를팜");
	}
}
