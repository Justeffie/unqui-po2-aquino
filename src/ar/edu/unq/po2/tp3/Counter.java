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
	
	// 2. Desarmando numeros
	public long desarmandoNumeros(ArrayList<Long> numeros) {
		long numeroConMasPares = 0;
		long cantidadPares = 0;
		for (long numero : numeros) {
			long pares = 0;
			long n = numero;
			long size = this.getNumberSize(numero);
			while (size > 0) {
				n = n % this.get10PotenciaDeNumero(size);
				if (Math.floor(n) % 2 == 0) {
					pares++;
				}
				n = numero - this.get10PotenciaDeNumero(size) * n;
				size--;
			}
			
			if (pares > cantidadPares) {
				cantidadPares = pares;
				numeroConMasPares = numero;
			}
		}
		
		return numeroConMasPares;
	}
	
	public long getNumberSize(long numero) {
		long contador = 0;
		while (Math.floor(numero) > 0) {
			numero = numero / 10;
			contador++;
		}
		
		return contador;
	}
	
	public long get10PotenciaDeNumero(long numero) {
		return (long) Math.pow(10, numero);
	}
	
	// Multiplos
	public long getMultiplosDe(long x, long y) {
		long maxNum = 1000;
		while (maxNum >= 0 && 
				!this.isMultiploDe(maxNum, x) && 
				!this.isMultiploDe(maxNum, y) ) {
			maxNum--;
		}
		
		return maxNum > 0 ? maxNum : -1; 
	}
	
	public boolean isMultiploDe(long numero, long multiplo) {
		return numero % multiplo == 0;
	}
}
