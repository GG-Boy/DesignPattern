package com.gai.product;

import java.util.ArrayList;
import java.util.List;
/**
 * 产品类，由多个部件组成
 */
public class Product {

	List<String> parts = new ArrayList<>();
	
	public void add(String part) {//添加产品部件
		parts.add(part);
	}
	
	public void show() {
		System.out.println("产品创建-----");
		for (String part : parts) {
			System.out.println(part);
		}
	}
	
}
