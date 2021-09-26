package ar.edu.unq.po2.tp5.producto;

import ar.edu.unq.po2.tp5.exception.ValidationException;
import ar.edu.unq.po2.tp5.mercado.central.MercadoCentral;
import ar.edu.unq.po2.tp5.pagable.Pagable;

public abstract class Producto implements Pagable {
	
	private MercadoCentral mercadoCentral;
	
	private double precioBase;
	
	private String nombre;
	
	public Producto(double precioBase, String nombre) {
		this.setNombre(nombre);
		this.setPrecioBase(precioBase);
	}
	
	@Override
	public void registrar() throws ValidationException { 
		this.getMercadoCentral().eliminarProductoDelStock(this);
	}
	
	public double getPrecioBase() {
		return this.precioBase;
	}
	
	public void setPrecioBase(double precio) {
		this.precioBase = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public MercadoCentral getMercadoCentral() {
		return mercadoCentral;
	}

	public void setMercadoCentral(MercadoCentral mercadoCentral) {
		this.mercadoCentral = mercadoCentral;
	}

}
