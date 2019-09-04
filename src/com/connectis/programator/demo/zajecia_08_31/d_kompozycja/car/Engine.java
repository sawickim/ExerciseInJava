package com.connectis.programator.demo.zajecia_08_31.d_kompozycja.car;

public class Engine {

	private final int horsePower;

	private boolean isStarted;

	public Engine(int horsePower) {
		this.horsePower = horsePower;
		isStarted = false;
	}

	public void giveFuel(int amount) {
		accelerate(amount);
	}

	private void accelerate(int fuelAmount) {
		System.out.println("Meters moved: " + fuelAmount * horsePower);
	}

	public void start() {
		isStarted = true;
	}

	public void stop() {
		isStarted = false;
	}

	public boolean isStarted() {
		return isStarted;
	}
}
