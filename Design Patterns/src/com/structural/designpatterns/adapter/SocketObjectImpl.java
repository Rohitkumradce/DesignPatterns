package com.structural.designpatterns.adapter;

public class SocketObjectImpl implements SocketAdapter {
	public Socket socket = new Socket();

	@Override
	public Volt get120Volt() {
		return socket.getVolts();
	}

	@Override
	public Volt get40Volt() {
		return convertVolts(3);
	}

	@Override
	public Volt get8Volt() {
		return convertVolts(15);
	}

	private Volt convertVolts(int i) {
		Volt v = socket.getVolts();
		return new Volt(v.getVolts() / i);
	}

}
