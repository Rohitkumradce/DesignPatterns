package com.behavioral.designpatterns.command;

public class CommandPattern {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		System.out.println("Underlying OS is: "+ osName);
		FileSystemReceiver fs = osName.contains("Windows") ? new WindowsFileSystemReceiver()
 : new UnixFileSystemReceiver();
		
		OpenFileCommand open = new OpenFileCommand(fs);
		FileInvoker inv = new FileInvoker(open);
		inv.execute();
	}
}
