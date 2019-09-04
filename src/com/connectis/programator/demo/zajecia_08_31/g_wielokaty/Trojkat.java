package com.connectis.programator.demo.zajecia_08_31.g_wielokaty;

// Zakladamy ze trojkat rownoboczny
public class Trojkat implements Wielokat {

	private final int dlugoscBoku;

	public Trojkat(int dlugoscBoku) {
		this.dlugoscBoku = dlugoscBoku;
	}

	@Override
	public int getSides() {
		return 3;
	}

	@Override
	public int getPerimeter() {
		return dlugoscBoku * 3;
	}
}
