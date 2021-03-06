package ar.edu.unq.po2.tp5.mercado.central;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp5.exception.ValidationException;
import ar.edu.unq.po2.tp5.producto.Producto;

public class MercadoCentral {

	List<Producto> stock = new ArrayList<Producto>();
	
	public List<Producto> getStock() {
		return stock;
	}

	public void setStock(List<Producto> stock) {
		this.stock = stock;
	}

	public void agregarProductoAlStock(Producto producto) {
		stock.add(producto);
	}
	
	public void eliminarProductoDelStock(Producto producto) throws ValidationException {
		if (!stock.contains(producto)) {
			throw new ValidationException("El producto no se encuentra en stock");
		}
		stock.remove(producto);
	}
}
