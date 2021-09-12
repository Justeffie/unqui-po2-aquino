package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	public long suma(ArrayList<Integer> numeros) {
		return numeros.stream()
				.reduce(0, (subTotal, numero) -> subTotal + numero, Integer::sum);
	}
	
	public long restar(ArrayList<Integer> numeros) {
		int first = numeros.get(0);
		numeros.remove(0);
		return numeros.stream()
				.reduce(first, (subTotal, numero) -> subTotal - numero, Integer::sum);
	}
	
	public long multiplicar(ArrayList<Integer> numeros) {
		return numeros.stream()
				.reduce(1, (subTotal, numero) -> subTotal * numero, Integer::sum);
	}

}
