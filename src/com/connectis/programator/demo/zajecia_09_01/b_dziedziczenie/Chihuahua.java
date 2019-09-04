package com.connectis.programator.demo.zajecia_09_01.b_dziedziczenie;

public class Chihuahua extends Dog {

	public Chihuahua(String name, String smyczBrand) {
		super(name, smyczBrand);
	}

	@Override
	public void makeNoise() {
		System.out.println("Chihuahua!");
	}
}
