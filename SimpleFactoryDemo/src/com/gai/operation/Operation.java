package com.gai.operation;

public abstract class Operation {
	
	private double numberA;
	private double numberB;
	
	public abstract double GetResult() throws Exception;

	public double getNumberA() {
		return numberA;
	}

	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}

	public double getNumberB() {
		return numberB;
	}

	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}

}
