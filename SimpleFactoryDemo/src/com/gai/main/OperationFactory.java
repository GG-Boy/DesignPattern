package com.gai.main;

import com.gai.operation.Operation;
import com.gai.operation.OperationAdd;
import com.gai.operation.OperationDiv;
import com.gai.operation.OperationMul;
import com.gai.operation.OperationSub;

/**
 * 简单工厂模式
 * @author gai_gong_ext
 *
 */
public class OperationFactory {

	public static Operation createOperate(String operate) {
		Operation oper = null;
		switch (operate) {
		case "+":
			oper = new OperationAdd();
			break;
		case "-":
			oper = new OperationSub();
			break;
		case "*":
			oper = new OperationMul();
			break;
		case "/":
			oper = new OperationDiv();
			break;
		}
		
		return oper;
	}
	
}
