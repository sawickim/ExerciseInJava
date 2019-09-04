package com.connectis.programator.demo.zajecia_08_31.g_wielokaty;

public class Kwadrat implements Wielokat {

	private final int dlugoscBoku;

	public Kwadrat(int dlugoscBoku) {
		this.dlugoscBoku = dlugoscBoku;
	}

	@Override
	public int getSides() {
		return 4;
	}

	@Override
	public int getPerimeter() {
		return dlugoscBoku * 4;
	}
}
