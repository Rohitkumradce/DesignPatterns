package com.behavioral.designpatterns.mediator;

public abstract class User {

	protected ChatMediator chatMediator;
	protected String name;

	public User(ChatMediator m, String name) {
		this.chatMediator = m;
		this.name = name;
	}

	public abstract void send(String msg);

	public abstract void receive(String msg);
}
