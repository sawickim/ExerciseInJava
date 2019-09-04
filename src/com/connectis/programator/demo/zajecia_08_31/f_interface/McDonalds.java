package com.connectis.programator.demo.zajecia_08_31.f_interface;

public class McDonalds implements BurgerProvider, Restaurant {

	@Override
	public void getBurger() {
		System.out.println("McDonalds: klasyczny BigMac!");
	}

	@Override
	public void getMenu() {
		System.out.println("McMenu: x");
	}
}
