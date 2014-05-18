package com.behavioral.designpatterns.command;

public class WriteFileCommand implements Command {

	private FileSystemReceiver fs;
	
	public WriteFileCommand(FileSystemReceiver fs) {
		this.fs = fs;
	}
	
	@Override
	public void execute() {
		this.fs.writeFile();
	}

}
