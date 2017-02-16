package com.gai.main;

import com.gai.adapter.Translator;
import com.gai.player.Forwards;
import com.gai.player.Guards;
import com.gai.player.Player;

public class Main {

	public static void main(String[] args) {
		Player b = new Forwards("巴蒂尔");
		b.attack();
		Player m = new Guards("迈克尔雷迪");
		m.defense();
		
		Player ym = new Translator("姚明");
		ym.attack();
		ym.defense();
	}

}
