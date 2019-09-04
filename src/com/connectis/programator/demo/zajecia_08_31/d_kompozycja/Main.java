package com.connectis.programator.demo.zajecia_08_31.d_kompozycja;

import com.connectis.programator.demo.zajecia_08_31.d_kompozycja.car.Car;
import com.connectis.programator.demo.zajecia_08_31.d_kompozycja.car.Engine;
import com.connectis.programator.demo.zajecia_08_31.d_kompozycja.car.FuelTank;
import com.connectis.programator.demo.zajecia_08_31.d_kompozycja.car.GPS;
import com.connectis.programator.demo.zajecia_08_31.d_kompozycja.car.Wheels;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(
				new Engine(150),
				new Wheels(),
				new GPS(),
				new FuelTank(50)
		);

		if (car.getRemainingFuel() < car.getTotalCapacity()) {
			car.addFuel(car.getTotalCapacity() - car.getRemainingFuel());
		}

		car.goTo("Krakow");
	}
}
