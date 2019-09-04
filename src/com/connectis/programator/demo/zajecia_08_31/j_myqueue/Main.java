package com.connectis.programator.demo.zajecia_08_31.j_myqueue;

public class Main {

	public static void main(String[] args) {
		long millisStart = System.currentTimeMillis();
		int numOfElements = 100000;
		MyQueue myQueue = new MyQueue();
		for (int i = 0; i < numOfElements; i++) {
			myQueue.add(i);
			System.out.println(i + ", size: " + myQueue.size() + ", arrayLength: " + myQueue.arraySize());
		}

		for (int i = 0; i < numOfElements; i++) {
			System.out.println(myQueue.pop());
		}

		System.out.println("Time: " + (System.currentTimeMillis() - millisStart) + " ms");
	}
}
