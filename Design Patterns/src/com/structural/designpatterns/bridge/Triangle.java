package com.structural.designpatterns.bridge;

public class Triangle extends Shape {

	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.println(" The Triangle is");
		color.applyColor();
	}

}
