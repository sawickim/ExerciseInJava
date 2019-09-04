package com.connectis.programator.demo.zajecia_09_01.b_dziedziczenie;

public class Cow extends Animal {

	public Cow(String name) {
		super(name);
	}

	@Override
	public void makeNoise() {
		System.out.println("Moooo!");
	}
}
