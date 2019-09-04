package com.connectis.programator.demo.zajecia_08_31.f_interface.iterable;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Zwierze> lista = new ArrayList<>();
		lista.add(new Zwierze());
		lista.add(new Zwierze());
		lista.add(new Zwierze());

		Owca owca = new Owca(lista);

		for (Zwierze zwierze : owca) {
			zwierze.makeNoise();
		}
	}
}
