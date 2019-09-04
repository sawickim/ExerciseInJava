package com.connectis.programator.demo.zajecia_08_31.c_singleton;

public class Main {

	public static void main(String[] args) {
		DatabaseManager manager = DatabaseManager.getInstance();
		manager.doSomethingInDatabase();
		manager.doSomethingInDatabase();
		manager.doSomethingInDatabase();
		DatabaseManager.getInstance();
		DatabaseManager.getInstance();
		DatabaseManager.getInstance();
	}
}
