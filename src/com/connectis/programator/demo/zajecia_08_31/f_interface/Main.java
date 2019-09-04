package com.connectis.programator.demo.zajecia_08_31.f_interface;

public class Main {

	public static void main(String[] args) {
		McDonalds mcDonalds = new McDonalds();
		Wendys wendys = new Wendys();

		BurgerProvider[] burgerProviders = new BurgerProvider[] {
			new FoodTruck(),
				mcDonalds,
				wendys
		};

		Restaurant[] restaurants = new Restaurant[] {
				mcDonalds,
				wendys
		};

		for (BurgerProvider provider : burgerProviders) {
			provider.getBurger();
		}

		for (Restaurant restaurant : restaurants) {
			restaurant.getMenu();
		}
	}
}
