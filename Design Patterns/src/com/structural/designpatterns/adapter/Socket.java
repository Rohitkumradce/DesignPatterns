package com.structural.designpatterns.adapter;

public class Socket {
	public Volt getVolts() {
		return new Volt(120);
	}
}
