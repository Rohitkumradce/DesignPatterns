package com.behavioral.designpatterns.memento;

public class FileWriterUtil {

	private String fileName;
	private StringBuilder content;

	public FileWriterUtil(String fileName) {
		this.content = new StringBuilder();
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return this.content.toString();
	}

	public void write(String str) {
		content.append(str);
	}

	public Memento save() {
		return new Memento(fileName, content);
	}

	public void undoToLastSave(Object obj) {
		Memento m = (Memento) obj;
		this.content = m.content;
		this.fileName = m.fileName;
	}

	private class Memento {
		private String fileName;
		private StringBuilder content;

		public Memento(String fileName, StringBuilder content) {
			this.content = new StringBuilder(content);
			this.fileName = fileName;
		}
	}
}
