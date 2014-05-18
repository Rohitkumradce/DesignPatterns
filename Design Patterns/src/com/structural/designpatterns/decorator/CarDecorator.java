package com.structural.designpatterns.decorator;

public class CarDecorator implements Car {

	protected Car car;

	public CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public void assembleCar() {
		this.car.assembleCar();
	}

}
