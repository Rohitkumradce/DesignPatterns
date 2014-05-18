package com.behavioral.designpatterns.cor;

/*
 * Chain of Responsibility
 */
public class CORPattern {
	public static void main(String[] args) {
		DispenseChain dc1 = new Dollar50Chain();
		DispenseChain dc2 = new Dollar20Chain();
		dc1.setNextChain(dc2);
		dc2.setNextChain(new Dollar10Chain());
		System.out.println(" Processing now...");
		int amount = 130;
		if (amount % 10 != 0) {
			System.out.println(" Amount should be in multiple of 10");
		} else {
			dc1.dispense(new Currency(amount));
		}
	}
}
