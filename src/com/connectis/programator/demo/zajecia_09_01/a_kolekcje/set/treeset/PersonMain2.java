package com.connectis.programator.demo.zajecia_09_01.a_kolekcje.set.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonMain2 {

	public static void main(String[] args) {
		Set<Person> personSet = new TreeSet<>(getComparator(SortingType.UBER));
		personSet.add(new Person(2, "Jan"));
		personSet.add(new Person(1, "Alicja"));
		personSet.add(new Person(4, "Bartek"));
		personSet.add(new Person(8, "Andrzej"));
		personSet.add(new Person(3, "Emil"));
		personSet.add(new Person(6, "Jaroslaw"));
		personSet.add(new Person(5, "Michal"));
		personSet.add(new Person(9, "Michal"));
		personSet.add(new Person(9, "Michal"));

		for (Person person : personSet) {
			System.out.println(person);
		}
	}

	private static Comparator<Person> getComparator(SortingType sortingType) {
		switch (sortingType) {
			case ID:
				return new PersonComparatorByID();
			case NAME:
				return new PersonComparatorByName();
			case UBER:
				return new com.connectis.programator.demo.zajecia_09_01.a_kolekcje.set.treeset.PersonComparatorUber();
			default:
				throw new IllegalArgumentException();
		}
	}

	private enum SortingType {
		NAME, ID, UBER
	}
}
