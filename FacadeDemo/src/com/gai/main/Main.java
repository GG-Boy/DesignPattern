package com.gai.main;

import com.gai.fund.Fund;
import com.gai.fund.NationalDebt;
import com.gai.fund.Realty;
import com.gai.fund.Stock;

public class Main {

	public static void main(String[] args) {
//		//用户需要了解股票，国债，房地产情况，需要参与具体的买和卖。耦合性很高
//		Stock stock = new Stock();
//		NationalDebt debt = new NationalDebt();
//		Realty realty = new Realty();
//		
//		stock.buy();
//		debt.buy();
//		realty.buy();
//		
//		stock.sell();
//		debt.sell();
//		realty.sell();
		
		//通过基金来参与具体的买卖
		Fund fund = new Fund();
		fund.buyFound();
		fund.sellFund();
		
	}

}
