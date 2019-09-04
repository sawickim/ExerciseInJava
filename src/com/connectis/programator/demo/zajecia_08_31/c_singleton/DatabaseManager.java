package com.connectis.programator.demo.zajecia_08_31.c_singleton;

public class DatabaseManager {

	private final DatabaseConnection connection;

	private static DatabaseManager instance;

	private DatabaseManager() {
		System.out.println("Creating new DatabaseManager object.");
		connection = new DatabaseConnection();
		connection.initialize();
	}

	public static DatabaseManager getInstance() {
		if (instance == null) {
			instance = new DatabaseManager();
		}

		return instance;
	}

	public void doSomethingInDatabase() {
		connection.runQuery();
	}
}
