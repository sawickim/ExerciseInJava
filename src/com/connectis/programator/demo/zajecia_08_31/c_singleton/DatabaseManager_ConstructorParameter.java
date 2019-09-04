package com.connectis.programator.demo.zajecia_08_31.c_singleton;

public class DatabaseManager_ConstructorParameter {

	private final DatabaseConnection connection;

	private static DatabaseManager_ConstructorParameter instance;

	private DatabaseManager_ConstructorParameter(DatabaseConnection connection) {
		System.out.println("Creating new DatabaseManager object.");
		this.connection = connection;
	}

	public static DatabaseManager_ConstructorParameter getInstance() {
		if (instance == null) {
			DatabaseConnection connection = new DatabaseConnection();
			connection.initialize();
			instance = new DatabaseManager_ConstructorParameter(connection);
		}

		return instance;
	}

	public void doSomethingInDatabase() {
		connection.runQuery();
	}
}
