package com.behavioral.designpatterns.command;

public class WindowsFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("Windows: Open File operation");
	}

	@Override
	public void writeFile() {
		System.out.println("Windows: Write File operation");		
	}

	@Override
	public void closeFile() {
		System.out.println("Windows: Close File operation");		
	}

}
