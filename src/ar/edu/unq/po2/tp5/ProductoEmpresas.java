package ar.edu.unq.po2.tp5;

public class ProductoEmpresas extends Producto {

	public ProductoEmpresas(double precioBase, String nombre) {
		super(precioBase, nombre);
	}

	@Override
	public double getPrecio() {
		return this.getPrecioBase();
	}

}
