package com.behavioral.designpatterns.state;


public class CoinInsertedState implements State {
	private VendingMachine machine;
	
	public CoinInsertedState(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCoin() throws MachineWarning {
		throw new MachineWarning("Coin is already inserted");
	}

	@Override
	public void pressButton() throws MachineWarning {
		machine.setMachineState(machine.getDispensingState());
		
	}

	@Override
	public void dispense() throws MachineWarning {
		throw new MachineWarning(" Dispense button is not yet pressed");
		
	}
}
