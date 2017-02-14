package com.gai.subject;

/**
 * 通知类接口
 */
/**
 * @author gai_gong_ext
 *
 */
public abstract class Subject {
	
	private String action;
	
//	public abstract void attach(Observer observer);
//	
//	public abstract void detach(Observer observer);
	
	public abstract void notifyObserver();

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
}
