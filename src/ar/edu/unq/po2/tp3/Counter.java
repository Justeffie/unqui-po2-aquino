package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Long> numeros = new ArrayList<Long>();
	
	public Counter(ArrayList<Long> numeros) {
		this.numeros.addAll(numeros);
	}
	
	public Counter() {}

	public void addNumero(long numero) {
		this.numeros.add(numero);
	}

	public long cantidadDePares() {
		return numeros.stream()
				.filter(numero -> numero % 2 == 0)
				.count();
	}
	
	public long cantidadDeImpares() {
		return numeros.stream()
				.filter(numero -> numero % 2 != 0)
				.count();
	}
	
	public long cantidadDeMultiplosDeNumero(long numero) {
		return numeros.stream()
				.filter(num -> num % numero == 0)
				.count();
	}
}
