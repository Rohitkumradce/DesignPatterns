package com.behavioral.designpatterns.strategy;

public class Item {
	private String barCode;
	private int amount;

	public Item(String barcode, int amount) {
		this.barCode = barcode;
		this.amount = amount;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
