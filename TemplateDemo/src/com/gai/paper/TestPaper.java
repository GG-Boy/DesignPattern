package com.gai.paper;

public abstract class TestPaper {
	public void testQuestion1() {
		System.out.println("问题1");
		System.out.println("答案：" + Answer1());
	}
	
	public void testQuestion2() {
		System.out.println("问题2");
		System.out.println("答案：" + Answer2());
	}

	public void testQuestion3() {
		System.out.println("问题3");
		System.out.println("答案：" + Answer3());
	}
	
	public abstract String Answer1();
	
	public abstract String Answer2();
	
	public abstract String Answer3();
	
}
