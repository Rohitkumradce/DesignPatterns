package com.behavioral.designpatterns.observer;

public class MyTopicObserver implements Observer {

	private String name;
	private Subject topic;

	public MyTopicObserver(String name) {
		this.name = name;
	}

	@Override
	public void updateObserver() {
		String message = (String) topic.getUpdate(this);
		if (message == null) {
			System.out.println(name + ": No new Message..");
		} else {
			System.out.println(name + ": New Message to be processed: " + message);
		}
	}

	@Override
	public void setSubject(Subject subject) {
		this.topic = subject;
	}

}