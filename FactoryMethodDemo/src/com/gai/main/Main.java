package com.gai.main;

import com.gai.factory.IFactory;
import com.gai.factory.UndergraduateFactory;
import com.gai.leifeng.LeiFeng;

public class Main {

	public static void main(String[] args) {
		IFactory factory = new UndergraduateFactory();
		LeiFeng stu = factory.createLeiFeng();
		
		stu.buyRice();
		stu.sweep();
		stu.wash();
		
	}

}
