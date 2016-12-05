package com.gai.main;

import java.util.Scanner;

import com.gai.operation.Operation;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入数字A:");
			String strNumberA = scanner.nextLine();
			System.out.println("请选择运算符号(+,-,*,/)");
			String strOperate = scanner.nextLine();
			System.out.println("请输入数字B:");
			String strNumberB = scanner.nextLine();
			
			Operation oper = OperationFactory.createOperate(strOperate);
			oper.setNumberA(Double.parseDouble(strNumberA));
			oper.setNumberB(Double.parseDouble(strNumberB));
			double result = oper.GetResult();
			
			System.out.println("结果是"+result);
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("您的输入有错");
		}
	}

}
