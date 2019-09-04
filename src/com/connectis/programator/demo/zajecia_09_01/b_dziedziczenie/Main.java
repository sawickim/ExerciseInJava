package com.connectis.programator.demo.zajecia_09_01.b_dziedziczenie;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Dog andrzej = new Dog("Andrzej", "Marka smyczy");
		Dog chihuahua = new Chihuahua("Chi", "Marka smyczy 2");
		andrzej.makeNoise();
		System.out.println(andrzej.getName());

		List<Animal> animals = new ArrayList<>();
		animals.add(andrzej);
		animals.add(new Cat("Felix"));
		animals.add(new Cow("Mucka"));
		animals.add(chihuahua);

		for (Animal animal : animals) {
			animal.makeNoise();
//			animal.getSmyczBrand(); -> niedostepne
		}
	}
}
