package com.behavioral.designpatterns.cor;

public class Dollar50Chain implements DispenseChain {

	private DispenseChain dc;

	@Override
	public void setNextChain(DispenseChain dc) {
		this.dc = dc;
	}

	@Override
	public void dispense(Currency cur) {
		int amount = cur.getAmount();
		if (amount >= 50) {
			int num = amount / 50;
			int remainder = amount % 50;
			if (num > 0) {
				System.out.println("50$ Notes: " + num);
			}
			if (remainder != 0) {
				this.dc.dispense(new Currency(remainder));
			} else {
				this.dc.dispense(cur);
			}
		}
	}

}
