package com.connectis.programator.demo.zajecia_08_31.a_javabean;

import java.util.Calendar;
import java.util.StringJoiner;

public class Student {

	private String name;

	private String surname;

	private int yob;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getYob() {
		return yob;
	}

	public void setYob(int yob) {
		this.yob = yob;
	}

	public int getAge() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		return currentYear - yob;
	}

	public void setAge(int age) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		this.yob = currentYear - age;
	}

	@Override
	public String toString() {
		return new StringJoiner(
				", ",
				"Student" + "[",
				"]")
				.add("name='" + name + "'")
				.add("surname='" + surname + "'")
				.add("yob=" + yob)
				.add("age=" + getAge())
				.toString();
	}
}

