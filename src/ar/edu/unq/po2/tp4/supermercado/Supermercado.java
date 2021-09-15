package ar.edu.unq.po2.tp4.supermercado;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp4.producto.Producto;

public class Supermercado {
	
	private String nombre;
	
	private String direccion;
	
	public Supermercado(String nombre, String direccion) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
	}
	
	private List<Producto> productos = new ArrayList<Producto>();
	
	public long getCantidadDeProductos() {
		return this.getProductos().size();
	}

	public double getPrecioTotal() {
		return this.getProductos()
				.stream()
				.reduce(0.0, (subtotal, producto) -> subtotal + producto.getPrecio(), Double::sum);
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
}
