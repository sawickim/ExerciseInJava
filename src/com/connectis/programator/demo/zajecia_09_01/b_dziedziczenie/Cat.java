package com.connectis.programator.demo.zajecia_09_01.b_dziedziczenie;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeNoise() {
		System.out.println("Meow!");
	}
}
