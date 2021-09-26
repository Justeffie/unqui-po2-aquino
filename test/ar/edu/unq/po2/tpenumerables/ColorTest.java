package ar.edu.unq.po2.tpenumerables;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpenumerativos.Color;
import ar.edu.unq.po2.tpenumerativos.Riesgo;

public class ColorTest {
	
	@Test
	public void coloresTest() {
		Color rojo = Color.ROJO;
		Color miel = Color.MIEL;
		assertEquals("rojo", rojo.getDescripcion());
		assertEquals(Color.GRIS, rojo.getProximo());
		assertEquals(Riesgo.ALTO, rojo.getRiesgo());
		assertEquals("miel", miel.getDescripcion());
		assertEquals(rojo, miel.getProximo());
		assertEquals(Riesgo.BAJO, miel.getRiesgo());
	}

}
