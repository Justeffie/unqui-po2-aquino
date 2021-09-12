package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

class CounterTestCase {
	
	Counter counter = new Counter();
	
	@BeforeEach
	public void setUp() {
		counter.addNumero(1);
		counter.addNumero(2);
		counter.addNumero(3);
		counter.addNumero(3);
		counter.addNumero(3);
		counter.addNumero(4);
		counter.addNumero(5);
		counter.addNumero(6);
		counter.addNumero(7);
		counter.addNumero(10);
	}

	@Test
	public void testNumeroImpares() {
		long cantidad = this.counter.cantidadDeImpares();
		assertEquals(6, cantidad);
	}
	
	@Test
	public void testNumeroPares() {
		long cantidad = this.counter.cantidadDePares();
		assertEquals(4, cantidad);
	}
	
	@Test
	public void testCantidadDeMultiplos() {
		long cantidad = this.counter.cantidadDeMultiplosDeNumero(2);
		assertEquals(4, cantidad);
	}
	
	@Test
	public void testDesarmandoNumeros() {
		ArrayList<Long> numeros = new ArrayList<Long>();
		numeros.add(567l);
		numeros.add(8888l);
		numeros.add(333l);
		
		assertEquals(8888l, this.counter.desarmandoNumeros(numeros));
	}
	
	@Test
	public void testDesarmandoNumeros2() {
		ArrayList<Long> numeros = new ArrayList<Long>();
		numeros.add(222l);
		numeros.add(8888l);
		numeros.add(22l);
		numeros.add(222222l);
		
		assertEquals(222222l, this.counter.desarmandoNumeros(numeros));
	}
	
	@Test 
	public void testMultiploDe() {
		assertEquals(999, this.counter.getMultiplosDe(3, 9));
	}

}
