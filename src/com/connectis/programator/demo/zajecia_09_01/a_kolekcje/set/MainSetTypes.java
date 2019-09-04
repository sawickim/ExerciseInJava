package com.connectis.programator.demo.zajecia_09_01.a_kolekcje.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSetTypes {


	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("String A");
		hashSet.add("String B");
		hashSet.add("String C");
		hashSet.add("String A");
		hashSet.add("Ala ma kota");
		for (String s : hashSet) {
			System.out.println(s);
		}

		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("String A");
		linkedHashSet.add("String B");
		linkedHashSet.add("String C");
		linkedHashSet.add("String A");
		linkedHashSet.add("Ala ma kota");
		for (String s : linkedHashSet) {
			System.out.println(s);
		}

		Set<String> treeSet = new TreeSet<>();
		treeSet.add("String A");
		treeSet.add("String B");
		treeSet.add("String C");
		treeSet.add("String A");
		treeSet.add("Ala ma kota");
		for (String s : treeSet) {
			System.out.println(s);
		}

	}
}
