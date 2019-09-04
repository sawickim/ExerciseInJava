package com.connectis.programator.demo.zajecia_09_01.a_kolekcje.set.treeset;

import java.util.Comparator;

public class PersonComparatorUber implements Comparator<Person> {

	private final PersonComparatorByID byId = new PersonComparatorByID();

	private final PersonComparatorByName byName = new PersonComparatorByName();

	@Override
	public int compare(Person person1, Person person2) {
		int byNameResult = byName.compare(person1, person2);
		if (byNameResult == 0) {
			return byId.compare(person1, person2);
		}

		return byNameResult;
	}
}
