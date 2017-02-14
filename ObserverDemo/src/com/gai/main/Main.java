package com.gai.main;

import com.gai.observer.NBAObserver;
import com.gai.observer.StockObserver;
import com.gai.subject.Boss;

public class Main {
	
	public static void main(String[] args) {
		//前台同事
		Boss qiantai = new Boss();
		
		//看股票的同事
		StockObserver tongshi1 = new StockObserver("童诗怡", qiantai);
		NBAObserver tongshi2 = new NBAObserver("童世尔", qiantai);
		
		ObserverUpdate observerUpdate = new ObserverUpdate(tongshi1, tongshi2);
		qiantai.setListener(observerUpdate);
		
		//前台几下两位同事
//		qiantai.attach(tongshi1);
//		qiantai.attach(tongshi2);
//		
//		qiantai.detach(tongshi1);
		//发现老板回来
		qiantai.setAction("我胡汉三又回来啦！！！");
		qiantai.notifyObserver();
	}
	
}
