package com.behavioral.designpatterns.state;

public class NoCoinInsertedState implements State{
	private VendingMachine machine;
	
	public NoCoinInsertedState(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCoin() throws MachineWarning {
		if(!machine.isEmpty()) {
			machine.setMachineState(machine.getCoinInsertedState());
		} else {
			throw new MachineWarning(" Machine cannot process your request... out of stock");
		}
	}

	@Override
	public void pressButton() throws MachineWarning {
		throw new MachineWarning(" Coin is not yet inserted... ");
	}

	@Override
	public void dispense() throws MachineWarning {
		throw new MachineWarning("Invalid Operation");
	}
}
