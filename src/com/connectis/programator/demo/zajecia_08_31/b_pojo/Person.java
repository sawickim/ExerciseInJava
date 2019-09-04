package com.connectis.programator.demo.zajecia_08_31.b_pojo;

public class Person {

	private final String name;

	private final String surname;

	private final int yob;

	public Person(PersonId personId, int yob) {
		this.name = personId.getName();
		this.surname = personId.getSurname();
		this.yob = yob;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getYob() {
		return yob;
	}
}
