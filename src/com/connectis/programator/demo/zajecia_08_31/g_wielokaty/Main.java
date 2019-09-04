package com.connectis.programator.demo.zajecia_08_31.g_wielokaty;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Wielokat[] wielokaty = new Wielokat[10];

		Random randomGenerator = new Random();
		for (int i = 0; i < 10; i++) {
			switch (randomGenerator.nextInt(3)) {
				case 0:
					wielokaty[i] = new Trojkat(2);
					break;
				case 1:
					wielokaty[i] = new Kwadrat(3);
					break;
				case 2:
					wielokaty[i] = new Prostokat(4, 8);
					break;
			}
		}

		int sides = 0;
		int perimeterSum = 0;

		for (Wielokat wielokat : wielokaty) {
			sides += wielokat.getSides();
			perimeterSum += wielokat.getPerimeter();
		}

		System.out.println(sides);
		System.out.println(perimeterSum);
		for (Wielokat wielokat : wielokaty) {
			System.out.println(
					wielokat.getClass().getSimpleName()
					+ ": sides - " + wielokat.getSides()
					+ ", permieter - " + wielokat.getPerimeter()
			);
		}
	}
}
