package com.connectis.programator.demo.zajecia_09_01.b_dziedziczenie;

public abstract class Animal {

	private final String name;

	protected Animal(String name) {
		this.name = name;
	}

	public abstract void makeNoise();

	public String getName() {
		return name;
	}
}
