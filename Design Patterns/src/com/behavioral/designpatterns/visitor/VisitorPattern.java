package com.behavioral.designpatterns.visitor;

public class VisitorPattern {

	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[]{new Book("book1", 10, "isbn1"), new Book("book2", 20, "isbn2"), new Fruit("fruit1", 10)};
		ShoppingCartVisitor visitor = new ShoppingCartImpl();
        int sum=0;
        for(ItemElement item : items){
        	int variable = item.accept(visitor);
            sum = sum + variable;
        }
        System.out.println("SUM: " + sum);
	}
}
