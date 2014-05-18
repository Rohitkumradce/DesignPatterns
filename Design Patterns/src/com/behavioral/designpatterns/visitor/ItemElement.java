package com.behavioral.designpatterns.visitor;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}
