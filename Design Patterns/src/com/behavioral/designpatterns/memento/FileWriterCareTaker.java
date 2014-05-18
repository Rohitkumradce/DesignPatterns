package com.behavioral.designpatterns.memento;

public class FileWriterCareTaker {

	private Object obj;
	
	public void save(FileWriterUtil fw) {
		this.obj = fw.save();
	}
	
	public void undo(FileWriterUtil fw) {
		fw.undoToLastSave(obj);
	}
}
