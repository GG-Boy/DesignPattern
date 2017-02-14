package com.gai.subject;

import com.gai.main.ObserverUpdateListener;

public class Secretary {
	
	ObserverUpdateListener listener;
	
	public void notifyObserver() {
		listener.update();
	}
	
	public void setListener(ObserverUpdateListener listener) {
		this.listener = listener;
	}

}
