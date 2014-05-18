package com.behavioral.designpatterns.mediator;

public class UserImpl extends User {

	public UserImpl(ChatMediator m, String name) {
		super(m, name);
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name + ": Sent Message: " + msg);
		chatMediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name + ": Received Message: " + msg);
	}

}
