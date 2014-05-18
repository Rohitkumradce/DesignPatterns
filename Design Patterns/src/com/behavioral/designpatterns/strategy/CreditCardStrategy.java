package com.behavioral.designpatterns.strategy;

public class CreditCardStrategy implements PaymentStrategy {

	private String cardNumber;
	private String name;
	private String ccvNumber;
	
	public CreditCardStrategy(String cardNumber, String name, String ccvNumber) {
		this.cardNumber = cardNumber;
		this.ccvNumber = ccvNumber;
		this.name = name;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Procesed with Credit Card with amount: "+ amount);
	}

}
