package com.behavioral.designpatterns.mediator;

public class MediatorPattern {
	public static void main(String[] args) {
		ChatMediator cm = new ChatMediatorImpl();
		User u1 = new UserImpl(cm, "user1");
		User u2 = new UserImpl(cm, "user2");
		User u3 = new UserImpl(cm, "user3");
		cm.addUser(u1);
		cm.addUser(u2);
		cm.addUser(u3);
		
		u1.send("Hello All!!" );
	}
}
