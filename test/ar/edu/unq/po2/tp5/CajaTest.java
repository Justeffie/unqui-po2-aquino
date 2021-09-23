package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaTest {
	
	Caja caja;
	MercadoCentral mercadoCentral;
	Producto yerba;
	Producto azucar;
	
	@BeforeEach
	public void setup() {
		yerba = new ProductoCooperativas(100.0, "Yerba");
		azucar = new ProductoEmpresas(150.0, "Azucar");
		mercadoCentral = new MercadoCentral();
		mercadoCentral.agregarProductoAlStock(yerba);
		mercadoCentral.agregarProductoAlStock(azucar);
		caja = new Caja(mercadoCentral);
	}
	
	@Test
	public void compraProductosEnStockTest() {
		caja.registrarProducto(yerba);
		
		assertEquals(1, mercadoCentral.getStock().size());
		assertEquals(90.0, caja.getMontoAPagar());
	}
	
	@Test
	public void compraProductosSinStockTest() {
		Producto aceite = new ProductoEmpresas(100.0, "Aceite");
		
		caja.registrarProducto(aceite);
		assertEquals(2, mercadoCentral.getStock().size());
		assertEquals(0.0, caja.getMontoAPagar());
	}

}
