package com.gai.operation;

public class OperationDiv extends Operation {

	@Override
	public double GetResult() throws Exception {
		double result = 0;
		if (getNumberB()==0) {
			throw new Exception("��������Ϊ0");
		}
		result = getNumberA() / getNumberB();
		return result;
	}

}
