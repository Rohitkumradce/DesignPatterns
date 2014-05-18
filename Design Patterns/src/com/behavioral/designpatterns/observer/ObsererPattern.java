package com.behavioral.designpatterns.observer;

public class ObsererPattern {
	public static void main(String[] args) {
		Observer ob1 = new MyTopicObserver("ob1");
		Observer ob2 = new MyTopicObserver("ob2");
		
		MyTopic topic = new MyTopic();
		ob1.setSubject(topic);
		ob2.setSubject(topic);
		topic.register(ob1);
		topic.register(ob2);
		
		topic.postMessage("Hello All...");
		
	}
}
