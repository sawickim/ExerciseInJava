package com.connectis.programator.demo.zajecia_09_01.a_kolekcje.set.treeset;

import java.util.Comparator;

public class PersonComparatorByName implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {
		return person1.getName().compareTo(person2.getName());
	}
}
