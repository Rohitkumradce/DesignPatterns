package com.behavioral.designpatterns.template;

public class GlassHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println(" Building Glass Walls..");
	}

	@Override
	public void buildPillars() {
		System.out.println(" Building Glass Pillars..");
	}

}
