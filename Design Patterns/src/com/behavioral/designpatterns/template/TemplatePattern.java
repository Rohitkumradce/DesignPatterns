package com.behavioral.designpatterns.template;

public class TemplatePattern {
	public static void main(String[] args) {
		HouseTemplate ht = new WoodenHouse();
		ht.buildHouse();
		
		ht = new GlassHouse();
		ht.buildHouse();
	}
}
