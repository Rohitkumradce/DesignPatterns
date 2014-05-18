package com.behavioral.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> items;
	
	public ShoppingCart() {
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void pay(PaymentStrategy strategy) {
		int amount = 0;
		for(Item item : items) {
			amount += item.getAmount();
		}
		strategy.pay(amount);
	}
	
	public static void main(String[] args) {
		ShoppingCart sc = new ShoppingCart();
		sc.addItem(new Item("item1", 1));
		sc.addItem(new Item("item2", 14));
		
		sc.pay(new PayPalStrategy("username", "password"));
	}
}
