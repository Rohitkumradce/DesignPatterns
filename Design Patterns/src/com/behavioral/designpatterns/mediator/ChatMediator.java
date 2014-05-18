package com.behavioral.designpatterns.mediator;

public interface ChatMediator {

	public void sendMessage(String message, User u);
	
	public void addUser(User u);
}
