package ar.edu.unq.po2.tp5.factura;

import java.time.LocalDate;

public class Factura {
	
	private double monto;
	
	private LocalDate fecha;
	
	private String nombre;
	
	public Factura(double monto, LocalDate fecha, String nombre) {
		this.setMonto(monto);
		this.setFecha(fecha);
		this.setNombre(nombre);
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
