package com.behavioral.designpatterns.visitor;

public class Book implements ItemElement {

	private String name;
	private int price;
	private String isbnNumber;

	public Book(String name, int p, String isbnNumber) {
		this.name = name;
		this.price = p;
		this.isbnNumber = isbnNumber;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
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
