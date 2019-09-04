package com.connectis.programator.demo.zajecia_09_01.a_kolekcje.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("Pies");
		stringList.add("Kot");
		stringList.add("Kon");
		stringList.add("Krowa");
		stringList.add("Pies");

		for (String s : stringList) {
			System.out.println(s);
		}

		System.out.println("--------------------");

		stringList.sort(Comparator.comparing(String::toString));
		for (String s : stringList) {
			System.out.println(s);
		}

		System.out.println("--------------------");
		System.out.println(stringList.contains("Krowa"));
		System.out.println("--------------------");

		List<String> toRemove = new ArrayList<>();
		toRemove.add("Pies");

		stringList.removeAll(toRemove);
		for (String s : stringList) {
			System.out.println(s);
		}

		System.out.println("--------------------");
		System.out.println(stringList.get(0));
		System.out.println("--------------------");
		System.out.println(stringList.indexOf("Krowa"));
		System.out.println(stringList.indexOf("Orzel"));

		stringList.add("Krowa");
		stringList.add("Krowa");
		stringList.add("Krowa");

		System.out.println(stringList.lastIndexOf("Krowa"));

		System.out.println("--------------------");
		stringList.set(5, "Orzel");
		for (String s : stringList) {
			System.out.println(s);
		}

		System.out.println("--------------------");
		Object[] array = stringList.toArray();
		for (Object s : array) {
			System.out.println(s);
		}

		System.out.println("--------------------");
		List<String> toRetain = new ArrayList<>();
		toRetain.add("Orzel");
		toRetain.add("Krowa");
		stringList.retainAll(toRetain);
		for (String s : stringList) {
			System.out.println(s);
		}


		// List<int> intList; -> niepoprawnie
		List<Integer> intList = new ArrayList<>();
		intList.add(1);

		Integer myInt = 1;
		myInt = null;

		// int mySmallInt = null;
		Boolean myBoolean = false;

	}
}
