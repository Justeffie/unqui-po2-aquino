package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

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

}
