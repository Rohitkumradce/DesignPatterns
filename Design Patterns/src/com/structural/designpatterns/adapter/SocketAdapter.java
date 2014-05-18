package com.structural.designpatterns.adapter;

public interface SocketAdapter {
	public Volt get120Volt();
	
	public Volt get40Volt();
	
	public Volt get8Volt();
}
