package com.gai.main;

import com.gai.bean.SchoolGirl;
import com.gai.proxy.Proxy;

public class Main {

	public static void main(String[] args) {
		SchoolGirl mm = new SchoolGirl();
		mm.setName("娇娇");
		
		Proxy daili = new Proxy(mm);
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
	}

}
