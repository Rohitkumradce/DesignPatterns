package com.behavioral.designpatterns.strategy;

public class PayPalStrategy implements PaymentStrategy {

	private String username;
	private String password;
	
	public PayPalStrategy(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println("Processing with PayPal with amount: " + amount);
	}

}
