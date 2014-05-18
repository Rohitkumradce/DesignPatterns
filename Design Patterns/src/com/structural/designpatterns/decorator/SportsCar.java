package com.structural.designpatterns.decorator;

public class SportsCar extends CarDecorator{

	public SportsCar(Car car) {
		super(car);
	}
	
	@Override
	public void assembleCar() {
		car.assembleCar();
		System.out.println("Added Sports to the Car. ");
	}

}
