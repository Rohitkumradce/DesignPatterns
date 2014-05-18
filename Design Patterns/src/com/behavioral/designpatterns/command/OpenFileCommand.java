package com.behavioral.designpatterns.command;

public class OpenFileCommand implements Command{

	private FileSystemReceiver fs;
	
	public OpenFileCommand(FileSystemReceiver fs) {
		this.fs = fs;
	}
	
	@Override
	public void execute() {
		this.fs.openFile();
	}

}
