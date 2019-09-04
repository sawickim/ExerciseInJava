package com.connectis.programator.demo.zajecia_08_31.f_interface;

public class Wendys implements BurgerProvider, Restaurant {

	@Override
	public void getBurger() {
		System.out.println("Wendys: burger ze swiezej, niemrozonej wolowiny!");
	}

	@Override
	public void getMenu() {
		System.out.println("Wendy's menu: y");
	}
}
