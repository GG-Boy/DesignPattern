package com.gai.factory;

import com.gai.leifeng.LeiFeng;
import com.gai.leifeng.Undergraduate;

public class UndergraduateFactory implements IFactory {

	@Override
	public LeiFeng createLeiFeng() {
		return new Undergraduate();
	}

}
