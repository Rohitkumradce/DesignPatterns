package com.behavioral.designpatterns.cor;

public interface DispenseChain {

	public void setNextChain(DispenseChain dc);

	public void dispense(Currency cur);
}
