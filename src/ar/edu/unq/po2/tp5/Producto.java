package ar.edu.unq.po2.tp5;

public abstract class Producto {
	
	private double precioBase;
	
	private String nombre;
	
	public Producto(double precioBase, String nombre) {
		this.setNombre(nombre);
		this.setPrecioBase(precioBase);
	}
	
	public abstract double getPrecio();

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

}
