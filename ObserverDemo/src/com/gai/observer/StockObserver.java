package com.gai.observer;

import com.gai.subject.Subject;
//看股票的同事
public class StockObserver {

	private String name;
	private Subject s;
	
	public StockObserver(String name, Subject s) {
		this.name = name;
		this.s = s;
	}

	//关闭股票行情
	public void closeStockMarket() {
		System.out.println(s.getAction()+","+name+"关闭股票行情，继续工作！");
	}
	
}
