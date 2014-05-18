package com.structural.designpatterns.proxy;

import java.io.IOException;

public class CommandExecutorProxy implements CommandExecutor {
	private boolean isAdmin;
	private CommandExecutor executor;

	public CommandExecutorProxy(String passKey) {
		if (passKey.equals("proxy")) {
			isAdmin = true;
		}
		executor = new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String command) throws IOException {
		if (isAdmin) {
			executor.runCommand(command);
		} else {
			if (command.contains("rm")) {
				System.out.println("Exception: Cannot execute SUDO commands");
			} else {
				executor.runCommand(command);
			}
		}
	}

	 public static void main(String[] args) throws IOException {
		CommandExecutorProxy proxy = new CommandExecutorProxy("pppp");
		proxy.runCommand("ls -lrt");
		proxy.runCommand("rm abc.pdf");
	}
}
