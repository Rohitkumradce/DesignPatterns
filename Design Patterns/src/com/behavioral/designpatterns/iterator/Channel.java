package com.behavioral.designpatterns.iterator;

public class Channel {
	private String name;
	private ChannelType type;

	public Channel(String name, ChannelType type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ChannelType getType() {
		return type;
	}

	public void setType(ChannelType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		//System.out.println("Name: "+ name + ", Type: " + type.toString());
		return "Name: "+ name + ", Type: " + type.toString();
	}

}
