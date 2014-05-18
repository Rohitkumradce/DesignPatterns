package com.structural.designpatterns.decorator;

public class DecoratorPattern {
	public static void main(String[] args) {

		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assembleCar();
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assembleCar();
	}
}
