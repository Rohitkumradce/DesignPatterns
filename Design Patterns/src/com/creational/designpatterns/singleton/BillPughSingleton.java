package com.creational.designpatterns.singleton;

public class BillPughSingleton {
	
	public BillPughSingleton() {
	}
	
	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
