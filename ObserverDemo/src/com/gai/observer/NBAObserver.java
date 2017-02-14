package com.gai.observer;

import com.gai.subject.Subject;
//看NBA的同事
public class NBAObserver {
	
	private String name;
	private Subject s;
	
	public NBAObserver(String name, Subject s) {
		this.name = name;
		this.s = s;
	}

	//关闭NBA直播
	public void closeNBADirectSeeding() {
		System.out.println(s.getAction()+","+name+"关闭NBA直播，继续工作！");
	}

}
