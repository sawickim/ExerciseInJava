package com.connectis.programator.demo.zajecia_08_31.j_myqueue;

public class MyQueue {

	private Object[] queue;

	private int firstEmptyIndex = 0;

	public MyQueue(int size) {
		if (size <= 0) {
			size = 1;
		}

		this.queue = new Object[size];
	}

	public MyQueue() {
		this(100);
	}

	// Nazywana czasami push
	public void add(Object o) {
		if (100 * firstEmptyIndex / queue.length > 80) {
			queue = getDoubleSizedArray(queue);
		}

		queue[firstEmptyIndex] = o;
		firstEmptyIndex++;
	}

	private Object[] getDoubleSizedArray(Object[] array) {
		Object[] result = new Object[array.length * 2];
		for (int i = 0; i < firstEmptyIndex; i++) {
			result[i] = array[i];
		}

		return result;
	}

	public Object pop() {
		if (firstEmptyIndex == 0) {
			throw new IllegalStateException("Queue is empty!");
		}

		Object result = queue[0];
		for (int i = 0; i < firstEmptyIndex; i++) {
			queue[i] = queue[i + 1];
		}

		queue[firstEmptyIndex - 1] = null;
		firstEmptyIndex--;
		return result;
	}

	public int size() {
		return firstEmptyIndex;
	}

	public int arraySize() {
		return queue.length;
	}
}