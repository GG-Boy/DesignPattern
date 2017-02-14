package com.gai.subject;

import com.gai.main.ObserverUpdateListener;

public class Boss extends Subject {
	
	ObserverUpdateListener listener;
	
	public void notifyObserver() {
		listener.update();
	}
	
	public void setListener(ObserverUpdateListener listener) {
		this.listener = listener;
	}
	
}
