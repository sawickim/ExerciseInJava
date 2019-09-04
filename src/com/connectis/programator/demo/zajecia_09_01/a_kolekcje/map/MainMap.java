package com.connectis.programator.demo.zajecia_09_01.a_kolekcje.map;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("jeden", "uno");
		map.put("dwa", "dos");
		map.put("trzy", "tres");

		for (String key : map.keySet()) {
			System.out.println(key);
		}

		System.out.println("--------------");
		for (String value : map.values()) {
			System.out.println(value);
		}

		System.out.println("--------------");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " to po hiszpansku: " + entry.getValue());
			System.out.println(entry);
		}

		Main.SortingType sortingType = Main.SortingType.ID;
	}
}
