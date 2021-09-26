package ar.edu.unq.po2.tp5.intangible;

import java.time.LocalDate;

import ar.edu.unq.po2.tp5.agencia.Agencia;
import ar.edu.unq.po2.tp5.factura.Factura;
import ar.edu.unq.po2.tp5.pagable.Pagable;

public abstract class Intangible implements Pagable {
	
	private String nombre;
	
	private Agencia agencia;
	
	public Intangible(String nombre) {
		this.setNombre(nombre);
	}

	public void registrar() { 
		Factura factura = new Factura(this.getPrecio(), LocalDate.now(), nombre);
		this.getAgencia().registrarPago(factura);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
}
