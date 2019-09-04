package com.connectis.programator.demo.zajecia_09_01.a_kolekcje.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class PersonMain {

	public static void main(String[] args) {
		Set<Person> personSet = new TreeSet<>(new PersonComparatorByName());
		personSet.add(new Person(2, "Jan"));
		personSet.add(new Person(1, "Alicja"));
		personSet.add(new Person(4, "Bartek"));
		personSet.add(new Person(8, "Andrzej"));
		personSet.add(new Person(3, "Emil"));
		personSet.add(new Person(6, "Jaroslaw"));
		personSet.add(new Person(5, "Michal"));
		personSet.add(new Person(9, "Michal"));

		for (Person person : personSet) {
			System.out.println(person);
		}

		Set<Person> personSet2 = new TreeSet<>(new PersonComparatorByID());
		personSet2.add(new Person(2, "Jan"));
		personSet2.add(new Person(1, "Alicja"));
		personSet2.add(new Person(4, "Bartek"));
		personSet2.add(new Person(8, "Andrzej"));
		personSet2.add(new Person(3, "Emil"));
		personSet2.add(new Person(6, "Jaroslaw"));
		personSet2.add(new Person(5, "Michal"));
		personSet2.add(new Person(9, "Michal"));

		for (Person person : personSet2) {
			System.out.println(person);
		}

		PersonMain2.
	}
}
