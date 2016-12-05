package com.gai.main;

import java.util.Scanner;

import com.gai.operation.Operation;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("����������A");
			String strNumberA = scanner.nextLine();
			System.out.println("�������������(+,-,*,/)");
			String strOperate = scanner.nextLine();
			System.out.println("����������B");
			String strNumberB = scanner.nextLine();
			
			Operation oper = OperationFactory.createOperate(strOperate);
			oper.setNumberA(Double.parseDouble(strNumberA));
			oper.setNumberB(Double.parseDouble(strNumberB));
			double result = oper.GetResult();
			
			System.out.println("����ǣ�"+result);
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��������д�");
		}
	}

}
