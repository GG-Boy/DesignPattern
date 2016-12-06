package com.gai.proxy;

import com.gai.bean.SchoolGirl;

public class Proxy implements IGiveGift {

	Pursuit gg;

	public Proxy(SchoolGirl mm) {
		gg = new Pursuit(mm);
	}
	
	public void giveDolls() {
		gg.giveDolls();
	}
	
	public void giveFlowers() {
		gg.giveFlowers();
	}
	
	public void giveChocolate() {
		gg.giveChocolate();
	}
	
}
