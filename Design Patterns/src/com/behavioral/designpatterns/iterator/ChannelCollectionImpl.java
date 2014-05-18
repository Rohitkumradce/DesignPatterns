package com.behavioral.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

	private List<Channel> channels;
	
	public ChannelCollectionImpl() {
		channels = new ArrayList<Channel>();
	}
	
	@Override
	public void removeChannel(Channel c) {
		channels.remove(c);
	}

	@Override
	public void addChannel(Channel c) {
		if(!channels.contains(c)) {
			channels.add(c);
		}
	}

	@Override
	public ChannelIterator iterator(ChannelType type) {
		return new ChannelIteratorImpl(type, this.channels);
	}
	
	private static final class ChannelIteratorImpl implements ChannelIterator{
		private ChannelType type;
		private List<Channel> channels;
		private int position;
		
		public ChannelIteratorImpl(ChannelType name, List<Channel> channels) {
			this.channels = channels;
			this.type = name;
		}

		@Override
		public boolean hasNext() {
			while(position < channels.size()) {
				Channel c = channels.get(position);
                if (c.getType().equals(type) || type.equals(ChannelType.ALL)) {
                    return true;
                } else
                    position++;
			}
			return false;
		}

		@Override
		public Channel next() {
			Channel c = channels.get(position);
			position++;
			return c;
		}
		
	}

}
