package com.behavioral.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

	private List<Observer> observers;
	private boolean isChanged;
	private String message;
	private final Object MUTEX = new Object();

	public MyTopic() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer observer) {
		if (observer == null) {
			System.out.println(" Null observer");
		}
		synchronized (MUTEX) {
			if (!observers.contains(observer)) {
				observers.add(observer);
			}
		}
	}

	@Override
	public void unregister(Observer observer) {
		synchronized (MUTEX) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		List<Observer> observerLocal = null;
		synchronized (MUTEX) {
			if (!isChanged) {
				return;
			}
			observerLocal = new ArrayList<Observer>(observers);
			isChanged = false;
		}
		for (Observer ob : observerLocal) {
			ob.updateObserver();
		}
	}

	@Override
	public Object getUpdate(Observer observer) {
		return this.message;
	}

	public void postMessage(String msg) {
		System.out.println("Msg Posted to Topic: " + msg);
		isChanged = true;
		message = msg;
		notifyObservers();
	}

}
