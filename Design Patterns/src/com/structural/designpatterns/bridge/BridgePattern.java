package com.structural.designpatterns.bridge;

public class BridgePattern {
	public static void main(String[] args) {
		Triangle t = new Triangle(new GreenColor());
		t.applyColor();
		
		Pentagon p = new Pentagon(new RedColor());
		p.applyColor();
	}
}
