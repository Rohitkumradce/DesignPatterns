package com.behavioral.designpatterns.visitor;

public class Fruit implements ItemElement{

	private String name;
	private int price;
	
	public Fruit(String name, int p) {
		this.name = name;
		this.price = p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
