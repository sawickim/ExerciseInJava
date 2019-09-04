package com.connectis.programator.demo.zajecia_09_01.a_kolekcje.pantadeusz;

import java.util.Comparator;
import java.util.Map;

public class WordCountComparator implements Comparator<Map.Entry<String, Integer>> {

	@Override
	public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
		return entry1.getValue() - entry2.getValue();
	}
}
