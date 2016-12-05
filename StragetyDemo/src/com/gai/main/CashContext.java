package com.gai.main;

import com.gai.cash.CashNormal;
import com.gai.cash.CashRebate;
import com.gai.cash.CashReturn;
import com.gai.cash.CashSuper;
/**
 * 策略模式
 */
public class CashContext {

	private CashSuper cs = null;

	public CashContext(String type) {
		switch (type) {
			case "正常收费":
				cs = new CashNormal();
				break;
			case "满300返100":
				cs = new CashReturn(300, 100);
				break;
			case "打8折":
				cs = new CashRebate(0.8);
				break;
		}
	}
	
	public double GetResult(double money) {
		return cs.acceptCash(money);
	}
	
}
