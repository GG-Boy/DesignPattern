package com.gai.main;

public class Main {

	public static void main(String[] args) {
		Resume a = new Resume("大鸟");
		a.setPersonalInfo("男", "29");
		a.setWorkExperience("1998-2002", "xx公司");
	
		Resume b = (Resume) a.clone();
		b.setWorkExperience("2005-2016", "yy公司");
	
		Resume c = (Resume) a.clone();
		c.setPersonalInfo("男", "24");
		c.setWorkExperience("2010-2015", "zz公司");
		
		a.display();
		b.display();
		c.display();
		
	}

}
