package com.gai.product;
/**
 * 指挥者类
 */
public class Director {

	public void construct(Builder builder) {//指挥建造过程
		builder.buildPartA();
		builder.buildPartB();
	}
	
}
