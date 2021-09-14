package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.figuras.Cuadrado;
import ar.edu.unq.po2.tp3.figuras.Point;
import ar.edu.unq.po2.tp3.figuras.Rectangulo;

class FigurasTestCase {
	
	Point punto = new Point(0, 0);

	@Test
	void cuadradoTest() {
		Cuadrado cuadrado = new Cuadrado(punto, 4);
		
		assertEquals(16, cuadrado.perimetro());
		assertEquals(16, cuadrado.area());
	}
	
	@Test
	void rectanguloTest() {
		Rectangulo rectangulo = new Rectangulo(punto, 4, 8);
		
		assertEquals(24, rectangulo.perimetro());
		assertEquals(32, rectangulo.area());
		assertFalse(rectangulo.esHorizontal());
	}

}
