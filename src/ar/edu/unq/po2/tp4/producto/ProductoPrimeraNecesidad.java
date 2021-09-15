package ar.edu.unq.po2.tp4.producto;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
	}

	public double getPrecio() {
		return super.getPrecio() * 0.9;
	}
}