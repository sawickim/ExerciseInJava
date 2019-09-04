package com.connectis.programator.demo.zajecia_08_31.f_interface;

public class FoodTruck implements BurgerProvider {

	@Override
	public void getBurger() {
		System.out.println(getClassName());
		System.out.println("FoodTruck: oryginalny burger ze swiezych skladnikow!");
	}

	public void metoda() {

	}
}
