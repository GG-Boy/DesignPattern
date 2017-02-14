package com.gai.main;

import com.gai.product.Builder;
import com.gai.product.ConcreteBuilder1;
import com.gai.product.ConcreteBuilder2;
import com.gai.product.Director;
import com.gai.product.Product;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
		Builder b1 = new ConcreteBuilder1();
		Builder b2 = new ConcreteBuilder2();
		//指挥者用ConcreteBuilder1的方法来构造产品
		director.construct(b1);
		Product p1 = b1.getResult();
		p1.show();
		
		//指挥者用ConcreteBuilder2的方法来构造产品
		director.construct(b2);
		Product p2 = b2.getResult();
		p2.show();
	}
	
}
