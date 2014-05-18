package com.behavioral.designpatterns.state;

public class VendingMachine {
	private State noCoinInsertedState = new NoCoinInsertedState(this);
	private State coinInsertedState = new CoinInsertedState(this);
	private State emptyState = new EmptyState(this);
	private State dispensingState = new DispensingState(this);

	private State machineState = null;

	private int capacity;

	public VendingMachine() {
		machineState = noCoinInsertedState;
		capacity = 0;
	}

	public void increaseCapacity(int count) {
		capacity += count;
	}

	public void insertCoin() throws MachineWarning {
		machineState.insertCoin();
	}

	public void pressButton() throws MachineWarning {
		machineState.pressButton();
		machineState.dispense();
		capacity--;
	}

	public boolean isEmpty() {
		if (capacity <= 0) {
			return true;
		}
		return false;
	}

	public State getNoCoinInsertedState() {
		return noCoinInsertedState;
	}

	public void setNoCoinInsertedState(State noCoinInsertedState) {
		this.noCoinInsertedState = noCoinInsertedState;
	}

	public State getCoinInsertedState() {
		return coinInsertedState;
	}

	public void setCoinInsertedState(State coinInsertedState) {
		this.coinInsertedState = coinInsertedState;
	}

	public State getEmptyState() {
		return emptyState;
	}

	public void setEmptyState(State emptyState) {
		this.emptyState = emptyState;
	}

	public State getDispensingState() {
		return dispensingState;
	}

	public void setDispensingState(State dispensingState) {
		this.dispensingState = dispensingState;
	}

	public State getMachineState() {
		return machineState;
	}

	public void setMachineState(State machineState) {
		this.machineState = machineState;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public static void main(String[] args) throws MachineWarning {
		VendingMachine myMachine = new VendingMachine();
		myMachine.increaseCapacity(2);

		System.out.println("\nTest 1: ");
		myMachine.insertCoin();
		myMachine.pressButton();

		System.out.println("\nTest 2: ");
		try {
			myMachine.insertCoin();
			myMachine.insertCoin();
			myMachine.pressButton();
		} catch (MachineWarning e) {
			System.out.println(e.getMessage());
			try {
				myMachine.pressButton();
			} catch (MachineWarning ex) {
				//do nothing
			}
		}
		System.out.println("\nTest 3: ");
		try {
			myMachine.pressButton();
		} catch (MachineWarning e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\nTest 4: ");
		try {
			myMachine.insertCoin();
		} catch (MachineWarning e) {
			System.out.println(e.getMessage());
		}
	}

}
