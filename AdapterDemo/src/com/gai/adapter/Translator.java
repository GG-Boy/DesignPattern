package com.gai.adapter;

import com.gai.player.Player;

public class Translator extends Player {
	
	private ForeignCenter ym = new ForeignCenter();

	public Translator(String name) {
		super(name);
		ym.setName(name);
	}

	@Override
	public void attack() {
		ym.进攻();
	}

	@Override
	public void defense() {
		ym.防守();
	}

}
