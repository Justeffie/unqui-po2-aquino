package ar.edu.unq.po2.tp4.producto;

public class ProductoPrimeraNecesidad extends Producto {
	
	private double descuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio);
		this.setDescuento(descuento);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCiudado, double descuento) {
		super(nombre, precio, esPrecioCiudado);
		this.setDescuento(descuento);
	}

	public double getPrecio() {
		return super.getPrecio() * this.getDescuento();
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
}
