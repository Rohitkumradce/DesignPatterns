package com.behavioral.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	private List<User> users;
	
	public ChatMediatorImpl() {
		this.users = new ArrayList<User>();
	}
	
	@Override
	public void sendMessage(String message, User u) {
		for(User user : users) {
			if(u != user) {
				user.receive(message);
			}
		}
	}

	@Override
	public void addUser(User u) {
		users.add(u);
	}

}
