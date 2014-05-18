package com.behavioral.designpatterns.cor;

public class Dollar10Chain implements DispenseChain {

	private DispenseChain dc;

	@Override
	public void setNextChain(DispenseChain dc) {
		this.dc = dc;
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 10) {
			int amount = cur.getAmount();
			int num = amount / 10;
			int remainder = amount % 10;
			if (num > 0) {
				System.out.println("10$ Notes: " + num);
			}
			if (remainder != 0) {
				this.dc.dispense(new Currency(remainder));
			} else {
				//this.dc.dispense(cur);
			}
		}
	}
}
