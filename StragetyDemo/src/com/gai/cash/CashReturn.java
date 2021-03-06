package com.gai.cash;
/*
 * 返利收费
 */
public class CashReturn extends CashSuper {
	
	private double moneyCondition;
	private double moneyReturn;
	
	public CashReturn(double moneyCondition, double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}

	@Override
	public double acceptCash(double money) {
		double result = money;
		if (money >= moneyCondition) {
			result = money - Math.floor(money/moneyCondition) * moneyReturn;
		}
		return result;
	}

}
