package com.gai.factory;

import com.gai.leifeng.LeiFeng;
import com.gai.leifeng.Volunteer;

public class VolunteerFactory implements IFactory {

	@Override
	public LeiFeng createLeiFeng() {
		return new Volunteer();
	}

}
