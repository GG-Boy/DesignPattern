package com.gai.main;

import java.util.Scanner;

import com.gai.cash.CashSuper;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("单价：");
		String price = scanner.nextLine();
		System.out.println("数量：");
		String num = scanner.nextLine();
		System.out.println("请输入打折方式(正常收费、满300返100、打8折)");
		String type = scanner.nextLine();
		double total;
		
//		CashSuper cs = CashFactory.createCashAccept(type);
//		total = cs.acceptCash(Double.parseDouble(price) * Double.parseDouble(num));
		//具体的收费算法彻底与客户端分离，只需要认识context类即可
		CashContext cc = new CashContext(type);
		total = cc.GetResult(Double.parseDouble(price) * Double.parseDouble(num));
		
		System.out.println("合计:" + total);
		scanner.close();
	}

}
