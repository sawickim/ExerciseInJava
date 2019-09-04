package com.connectis.programator.demo.zajecia_08_31.d_kompozycja.car;

public class FuelTank {

	private final int totalCapacity;

	private int remainingFuel;

	public FuelTank(int totalCapacity) {
		this.totalCapacity = totalCapacity;
		this.remainingFuel = 0;
	}

	public int getTotalCapacity() {
		return totalCapacity;
	}

	public int getRemainingFuel() {
		return remainingFuel;
	}

	public void reportRemainingFuel() {
		System.out.println("Remaining fuel: " + remainingFuel + "/" + totalCapacity);
	}

	public void addFuel(int amount) {
		if (amount + remainingFuel > totalCapacity) {
			throw new IllegalArgumentException(
					"Not enough capacity! amount + remaining = "
							+ (amount + remainingFuel)
							+ ", totalCapacity = "
							+ totalCapacity);
		}

		remainingFuel += amount;
	}

	public void useFuel(int amount) {
		if (amount > remainingFuel) {
			throw new IllegalArgumentException(
					"Fuel tank is empty! Remaining fuel: "
					+ remainingFuel
					+ ", amount: " + amount);
		}

		remainingFuel -= amount;
	}
}
