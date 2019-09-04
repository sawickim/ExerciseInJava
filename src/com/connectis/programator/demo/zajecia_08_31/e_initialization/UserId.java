package com.connectis.programator.demo.zajecia_08_31.e_initialization;

// ValueObject
public class UserId {

	private final long id;

	public UserId(long id) {
		this.id = id;
	}

	public UserId(int id) {
		this.id = id;
	}

	public UserId(String id) {
		this.id = Long.valueOf(id);
	}
}
