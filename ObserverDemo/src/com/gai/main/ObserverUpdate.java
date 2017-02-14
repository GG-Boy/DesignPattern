package com.gai.main;

import com.gai.observer.NBAObserver;
import com.gai.observer.StockObserver;

public class ObserverUpdate implements ObserverUpdateListener{
	
	private StockObserver tongshi1;
	private NBAObserver tongshi2;
	
	public ObserverUpdate(StockObserver tongshi1, NBAObserver tongshi2) {
		super();
		this.tongshi1 = tongshi1;
		this.tongshi2 = tongshi2;
	}

	@Override
	public void update() {
		tongshi1.closeStockMarket();
		tongshi2.closeNBADirectSeeding();
	}

}
