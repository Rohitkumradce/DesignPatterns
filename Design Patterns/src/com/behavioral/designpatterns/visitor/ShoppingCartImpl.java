package com.behavioral.designpatterns.visitor;

public class ShoppingCartImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {
		int cost = 0;
		// apply 5$ discount if book price is greater than 50
		if (book.getPrice() > 50) {
			cost = book.getPrice() - 5;
		} else
			cost = book.getPrice();
		System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost ="
				+ cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = 0;
		cost = fruit.getPrice();
		System.out.println("Fruit name::" + fruit.getName() + " cost =" + cost);
		return cost;
	}

}
