package com.connectis.programator.demo.zajecia_09_01.a_kolekcje.map;

public class Main {

	public static void main(String[] args) {
		NewAllegro newAllegro = new NewAllegro();
		newAllegro.createUser("jan.kowalski");
		newAllegro.createUser("andrzej.nowak");
		newAllegro.createUser("jerzy.abc");

		User user = newAllegro.getUser(1);
		System.out.println(user);

		for (User userIter : newAllegro.getAllUsers()) {
			System.out.println(userIter);
		}
	}

	public enum SortingType {
		NAME, ID, UBER
	}
}
