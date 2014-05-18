package com.behavioral.designpatterns.command;

public interface FileSystemReceiver {

	public abstract void openFile();

	public abstract void writeFile();

	public abstract void closeFile();
}
