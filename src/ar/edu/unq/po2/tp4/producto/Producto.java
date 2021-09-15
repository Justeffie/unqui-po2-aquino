package ar.edu.unq.po2.tp4.producto;

public class Producto {
	
	private String nombre;
	
	private double precio;
	
	private boolean esPrecioCuidado = false;
	
	public Producto(String nombre, double precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
	}
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setEsPrecioCuidado(esPrecioCuidado);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}

}
