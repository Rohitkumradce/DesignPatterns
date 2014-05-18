package com.behavioral.designpatterns.iterator;

public interface ChannelCollection {

	public void removeChannel(Channel c);

	public void addChannel(Channel c);

	public ChannelIterator iterator(ChannelType type);
}
