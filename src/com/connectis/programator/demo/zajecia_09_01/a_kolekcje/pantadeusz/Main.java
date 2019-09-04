package com.connectis.programator.demo.zajecia_09_01.a_kolekcje.pantadeusz;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		long millisStart = System.currentTimeMillis();
		List<String> allLines = getAllPanTadeuszLines();
		System.out.println("Wczytywanie z pliku zajelo: "
				+ (System.currentTimeMillis() - millisStart) + " ms");

		Map<String, Integer> wordCount = new HashMap<>();
		for (String line : allLines) {
			for (String word : getWords(line)) {
				Integer count = wordCount.computeIfAbsent(word, key -> 0);
				count++;
				wordCount.put(word, count);
			}
		}

		int minWordLength = 4;
		List<String> bannedWords = new ArrayList<>();
		for (String word : wordCount.keySet()) {
			if (word.length() < minWordLength) {
				bannedWords.add(word);
			}
		}

		for (String bannedWord : bannedWords) {
			wordCount.remove(bannedWord);
		}

		List<Map.Entry<String, Integer>> sortedEntries =
				new ArrayList<>(wordCount.entrySet());
		sortedEntries.sort(new WordCountComparator().reversed());

		int counter = 0;
		for (Map.Entry<String, Integer> entry : sortedEntries) {
			if (counter >= 10) {
				break;
			}

			System.out.println(entry);
			counter++;
		}

		System.out.println("Koniec: "
				+ (System.currentTimeMillis() - millisStart) + " ms");
	}


	private static List<String> getWords(String line) {
		return Arrays.asList(line.split(" "));
	}

	private static List<String> getAllPanTadeuszLines() {
		try {
			String fileName = "/Users/bartlomiejstyczynski/Downloads/pan-tadeusz.txt";
			return Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
