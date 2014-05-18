package com.behavioral.designpatterns.state;

public class MachineWarning extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MachineWarning(String message) {
		super(message);
	}

	public MachineWarning(Throwable cause) {
		super(cause);
	}

	public MachineWarning(String message, Throwable cause) {
		super(message, cause);
	}

}
