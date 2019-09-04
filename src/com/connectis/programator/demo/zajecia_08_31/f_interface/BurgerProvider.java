package com.connectis.programator.demo.zajecia_08_31.f_interface;

public interface BurgerProvider {


	String pole = "";

	void getBurger();

	default String getClassName() {
		return this.getClass().getSimpleName();
	}
}
