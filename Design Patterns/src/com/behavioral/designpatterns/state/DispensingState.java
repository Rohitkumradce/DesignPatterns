package com.behavioral.designpatterns.state;

public class DispensingState implements State {
	private VendingMachine machine;
	
	public DispensingState(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCoin() throws MachineWarning {
		throw new MachineWarning(" Previous order is being processed");
	}

	@Override
	public void pressButton() throws MachineWarning {
		throw new MachineWarning(" Previous order is being processed");		
	}

	@Override
	public void dispense() throws MachineWarning {
		machine.setMachineState(machine.getNoCoinInsertedState());
	}
}
