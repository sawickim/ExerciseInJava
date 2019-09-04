package com.connectis.programator.demo.zajecia_08_31.g_wielokaty;

public class Prostokat implements Wielokat {

	private final int dlugoscBoku1;

	private final int dlugoscBoku2;

	public Prostokat(int dlugoscBoku1, int dlugoscBoku2) {
		this.dlugoscBoku1 = dlugoscBoku1;
		this.dlugoscBoku2 = dlugoscBoku2;
	}

	@Override
	public int getSides() {
		return 4;
	}

	@Override
	public int getPerimeter() {
		return 2 * dlugoscBoku1 + 2 * dlugoscBoku2;
	}
}
