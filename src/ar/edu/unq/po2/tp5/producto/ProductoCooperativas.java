package ar.edu.unq.po2.tp5.producto;

public class ProductoCooperativas extends Producto {

	public ProductoCooperativas(double precioBase, String nombre) {
		super(precioBase, nombre);
	}

	@Override
	public double getPrecio() {
		return this.getPrecioBase() * 0.9;
	}
}
