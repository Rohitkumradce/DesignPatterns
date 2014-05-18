package com.structural.designpatterns.proxy;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void runCommand(String command) throws IOException {
		System.out.println("Executing command: " + command);
		Runtime.getRuntime().exec(command);
	}

}
