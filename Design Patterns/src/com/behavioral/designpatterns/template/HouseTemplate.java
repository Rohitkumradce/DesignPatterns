package com.behavioral.designpatterns.template;

public abstract class HouseTemplate {

	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
	}

	private void buildWindows() {
		System.out.println(" Building Windows..\n");
	}

	public abstract void buildWalls();

	public abstract void buildPillars();

	public void buildFoundation() {
		System.out.println("New House: Building Foundation..");
	}
}
