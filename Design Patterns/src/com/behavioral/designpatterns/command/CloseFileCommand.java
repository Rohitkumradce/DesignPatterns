package com.behavioral.designpatterns.command;

public class CloseFileCommand implements Command {

	private FileSystemReceiver fs;
	
	public CloseFileCommand(FileSystemReceiver fs) {
		this.fs = fs;
	}
	
	@Override
	public void execute() {
		this.fs.closeFile();
	}

}
