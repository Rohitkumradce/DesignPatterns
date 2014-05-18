package com.behavioral.designpatterns.state;

public class EmptyState implements State {
	private VendingMachine machine;
	
	public EmptyState(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCoin() throws MachineWarning {
		throw new MachineWarning(" Cannot process the request...out of stock");
	}

	@Override
	public void pressButton() throws MachineWarning {
		throw new MachineWarning(" Invalid operation");
	}

	@Override
	public void dispense() throws MachineWarning {
		throw new MachineWarning(" Invalid operation");		
	}
}
