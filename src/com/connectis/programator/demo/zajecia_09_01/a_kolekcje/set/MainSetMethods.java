package com.connectis.programator.demo.zajecia_09_01.a_kolekcje.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainSetMethods {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("String A");
		hashSet.add("String B");
		hashSet.add("String C");
		hashSet.add("String A");
		hashSet.add("Ala ma kota");

		hashSet.remove("Ala ma kota");

		for (String s : hashSet) {
			System.out.println(s);
		}

		System.out.println(hashSet.contains("String A"));

		List<String> stringList = new ArrayList<>();
		stringList.add("String A");
		stringList.add("String B");

		hashSet.removeAll(stringList);
		for (String s : hashSet) {
			System.out.println(s);
		}

		System.out.println("------------------");

		hashSet.addAll(stringList);
		for (String s : hashSet) {
			System.out.println(s);
		}

		System.out.println("------------------");

		System.out.println(hashSet.containsAll(stringList));

		hashSet.remove("String A");

		System.out.println(hashSet.containsAll(stringList));

		System.out.println("------------------");

		System.out.println(hashSet.size());
		System.out.println(hashSet.isEmpty());

		hashSet.clear();
		System.out.println(hashSet.size());
		System.out.println(hashSet.isEmpty());
	}
}
