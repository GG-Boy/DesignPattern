package com.gai.main;

import com.gai.finery.BigTrouser;
import com.gai.finery.Finery;
import com.gai.finery.LeatherShoes;
import com.gai.finery.Sneakers;
import com.gai.finery.Suit;
import com.gai.finery.TShirts;
import com.gai.finery.Tie;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person("小明");
		
		System.out.println("第一种装扮：");
		Finery dtx = new TShirts();
		Finery kk = new BigTrouser();
		Finery qx = new Sneakers();
		qx.Decorate(person);
		kk.Decorate(person);
		dtx.Decorate(person);
		dtx.show();
		
		System.out.println("第二种装扮：");
		Finery xz = new Suit();
		Finery ld = new Tie();
		Finery px = new LeatherShoes();
		px.Decorate(person);
		ld.Decorate(person);
		xz.Decorate(person);
		xz.show();
	}

}
