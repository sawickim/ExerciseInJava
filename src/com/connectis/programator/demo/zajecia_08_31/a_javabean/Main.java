package com.connectis.programator.demo.zajecia_08_31.a_javabean;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Andrzej");
		student.setSurname("Kowalski");
		student.setAge(39);
		System.out.println(student);
	}
}
