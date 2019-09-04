package com.connectis.programator.demo.zajecia_09_01.b_dziedziczenie;

public class Dog extends Animal {

	private final String smyczBrand;

	public Dog(String name, String smyczBrand) {
		super(name);
		this.smyczBrand = smyczBrand;
		System.out.println(name);
	}

	public String getSmyczBrand() {
		return smyczBrand;
	}

	@Override
	public void makeNoise() {
		System.out.println("Hau!");
	}
}
