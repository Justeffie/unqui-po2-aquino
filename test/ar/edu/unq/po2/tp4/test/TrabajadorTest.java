package ar.edu.unq.po2.tp4.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ingreso.Ingreso;
import ar.edu.unq.po2.tp4.ingreso.IngresoPorHorasExtras;
import ar.edu.unq.po2.tp4.trabajador.Trabajador;

public class TrabajadorTest {
	
	Trabajador trabajador = new Trabajador();
	
	@BeforeEach
	public void setup() {
		Ingreso ingresoEnero = new Ingreso(1000.0, "Pago", Month.JANUARY);
		Ingreso ingresoFebrero = new Ingreso(1000.0, "Pago", Month.FEBRUARY);
		Ingreso ingresoMarzo = new Ingreso(1000.0, "Pago", Month.MARCH);
		Ingreso ingresoAbril = new IngresoPorHorasExtras(1000.0, "Pago", Month.APRIL, 3);
		List<Ingreso> ingresos = Arrays.asList(ingresoEnero, ingresoFebrero, ingresoMarzo, ingresoAbril);
		trabajador.setIngresosAnuales(ingresos);
	}
	
	@Test
	public void totalPercibidoTest() {
		assertEquals(4000.0, trabajador.getTotalPercibido());
	}
	
	@Test
	public void totalImponibleTest() {
		assertEquals(3000.0, trabajador.getMontoImponible());
	}
	
	@Test
	public void totalImpuestoAPagarTest() {
		assertEquals(2940, trabajador.getImpuestoAPagar());
	}
}
