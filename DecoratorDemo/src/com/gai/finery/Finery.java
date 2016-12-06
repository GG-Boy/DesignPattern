package com.gai.finery;

import com.gai.main.Person;

public class Finery extends Person {

	protected Person person;
	
	public void Decorate(Person person) {
		this.person = person;
	}
	
	@Override
	public void show() {
		if (person!=null) {
			person.show();
		}
	}
	
}
