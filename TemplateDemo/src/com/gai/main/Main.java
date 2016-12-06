package com.gai.main;

import com.gai.paper.TestPaper;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("学生甲的试卷：");
		TestPaper stuA = new TestPaperA();
		stuA.testQuestion1();
		stuA.testQuestion2();
		stuA.testQuestion3();
		
		System.out.println("学生乙的试卷：");
		TestPaper stuB = new TestPaperB();
		stuB.testQuestion1();
		stuB.testQuestion2();
		stuB.testQuestion3();
		
	}

}
