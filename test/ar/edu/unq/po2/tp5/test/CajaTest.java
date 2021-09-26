package ar.edu.unq.po2.tp5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.agencia.Agencia;
import ar.edu.unq.po2.tp5.agencia.AgenciaRecaudadora;
import ar.edu.unq.po2.tp5.caja.Caja;
import ar.edu.unq.po2.tp5.intangible.Impuesto;
import ar.edu.unq.po2.tp5.intangible.Servicio;
import ar.edu.unq.po2.tp5.mercado.central.MercadoCentral;
import ar.edu.unq.po2.tp5.producto.Producto;
import ar.edu.unq.po2.tp5.producto.ProductoCooperativas;
import ar.edu.unq.po2.tp5.producto.ProductoEmpresas;

public class CajaTest {
	
	Caja caja;
	MercadoCentral mercadoCentral;
	Producto yerba;
	Producto azucar;
	Impuesto rentas;
	Servicio luz;
	AgenciaRecaudadora agencia;
	
	@BeforeEach
	public void setup() {
		agencia = new AgenciaRecaudadora();
		luz = new Servicio("Luz", 100.0, 3000);
		luz.setAgencia(agencia);
		rentas = new Impuesto("Renta", 3000.0);
		rentas.setAgencia(agencia);
		yerba = new ProductoCooperativas(100.0, "Yerba");
		azucar = new ProductoEmpresas(150.0, "Azucar");
		mercadoCentral = new MercadoCentral();
		mercadoCentral.agregarProductoAlStock(yerba);
		mercadoCentral.agregarProductoAlStock(azucar);
		yerba.setMercadoCentral(mercadoCentral);
		azucar.setMercadoCentral(mercadoCentral);
		caja = new Caja();
	}
	
	@Test
	public void compraProductosEnStockTest() {
		caja.registrar(yerba);
		
		assertEquals(1, mercadoCentral.getStock().size());
		assertEquals(90.0, caja.getMontoAPagar());
	}
	
	@Test
	public void compraProductosSinStockTest() {
		Producto aceite = new ProductoEmpresas(100.0, "Aceite");
		
		aceite.setMercadoCentral(mercadoCentral);
		caja.registrar(aceite);
		assertEquals(2, mercadoCentral.getStock().size());
		assertEquals(0.0, caja.getMontoAPagar());
	}
	
	@Test
	public void pagarImpuestoTest() {
		caja.registrar(rentas);
		
		assertEquals(1, agencia.getRegistros().size());
	}
	
	@Test
	public void pagarServicioTest() {
		caja.registrar(luz);
		
		assertEquals(1, agencia.getRegistros().size());
	}
	
	@Test
	public void pagarImpuestoYServicioTest() {
		caja.registrar(luz);
		caja.registrar(rentas);
		
		assertEquals(2, agencia.getRegistros().size());
	}

}
