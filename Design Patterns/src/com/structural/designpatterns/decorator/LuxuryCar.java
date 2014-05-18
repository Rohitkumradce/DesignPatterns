package com.structural.designpatterns.decorator;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car car) {
		super(car);
	}
	
	@Override
	public void assembleCar(){
		car.assembleCar();
		System.out.println("Added Luxury to the Car.");
	}

}
