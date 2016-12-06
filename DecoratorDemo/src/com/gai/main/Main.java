package com.gai.main;

import com.gai.finery.BigTrouser;
import com.gai.finery.LeatherShoes;
import com.gai.finery.Sneakers;
import com.gai.finery.Suit;
import com.gai.finery.TShirts;
import com.gai.finery.Tie;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person("小明");
		
		System.out.println("第一种装扮：");
		TShirts dtx = new TShirts();
		BigTrouser kk = new BigTrouser();
		Sneakers qx = new Sneakers();
		qx.Decorate(person);
		kk.Decorate(qx);
		dtx.Decorate(kk);
		dtx.show();
		
		System.out.println("第二种装扮：");
		Suit xz = new Suit();
		Tie ld = new Tie();
		LeatherShoes px = new LeatherShoes();
		px.Decorate(person);
		ld.Decorate(px);
		xz.Decorate(ld);
		xz.show();
	}

}
