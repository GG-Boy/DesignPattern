package com.gai.fund;
//使用基金类来管理投资
public class Fund {

	Stock stock;
	NationalDebt debt;
	Realty realty;
	
	public Fund() {
		stock = new Stock();
		debt = new NationalDebt();
		realty = new Realty();
	}
	
	public void buyFound() {
		stock.buy();
		debt.buy();
		realty.buy();
	}
	
	public void sellFund() {
		stock.sell();
		debt.sell();
		realty.sell();
	}
	
}
