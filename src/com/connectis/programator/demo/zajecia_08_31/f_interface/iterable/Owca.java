package com.connectis.programator.demo.zajecia_08_31.f_interface.iterable;

import java.util.Iterator;
import java.util.List;

public class Owca implements Iterable<Zwierze> {

	private List<Zwierze> listaZwierzat;

	public Owca(List<Zwierze> listaZwierzat) {
		this.listaZwierzat = listaZwierzat;
	}

	@Override
	public Iterator<Zwierze> iterator() {
		return listaZwierzat.iterator();
	}
}
