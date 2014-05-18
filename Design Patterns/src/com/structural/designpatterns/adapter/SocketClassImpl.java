package com.structural.designpatterns.adapter;

public class SocketClassImpl extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volt() {
		return getVolts();
	}

	@Override
	public Volt get40Volt() {
		return convertVolt(3);
	}

	@Override
	public Volt get8Volt() {
		return convertVolt(15);
	}

	private Volt convertVolt(int i) {
		Volt v = getVolts();
		return new Volt(v.getVolts()/i);
	}
}
