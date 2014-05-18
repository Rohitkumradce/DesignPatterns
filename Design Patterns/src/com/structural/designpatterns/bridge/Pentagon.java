package com.structural.designpatterns.bridge;

public class Pentagon extends Shape {

	public Pentagon(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.println("The Pentagon is ");
		color.applyColor();
	}

}
