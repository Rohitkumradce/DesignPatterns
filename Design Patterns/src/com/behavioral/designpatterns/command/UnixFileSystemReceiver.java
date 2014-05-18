package com.behavioral.designpatterns.command;

public class UnixFileSystemReceiver implements FileSystemReceiver {
	@Override
	public void openFile() {
		System.out.println("Mac: Open File operation");
	}

	@Override
	public void writeFile() {
		System.out.println("Mac: Write File operation");		
	}

	@Override
	public void closeFile() {
		System.out.println("Mac: Close File operation");		
	}
}
