package com.connectis.programator.demo.zajecia_09_01.a_kolekcje.set.treeset;

import java.util.StringJoiner;

public class Person {//implements Comparable<Person> {

	private final int id;

	private final String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
				.add("id=" + id)
				.add("name='" + name + "'")
				.toString();
	}

//	@Override
//	public int compareTo(Person person2) {
//		return this.id - person2.id;
//	}
}
