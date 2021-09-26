package ar.edu.unq.po2.tp5.intangible;

import ar.edu.unq.po2.tp5.pagable.Pagable;

public class Impuesto extends Intangible implements Pagable {

	private double tasaServicio;
	
	public Impuesto(String nombre, double tasaServicio) {
		super(nombre);
		this.setTasaServicio(tasaServicio);
	}

	public double getTasaServicio() {
		return tasaServicio;
	}

	public void setTasaServicio(double tasaServicio) {
		this.tasaServicio = tasaServicio;
	}

	@Override
	public double getPrecio() {
		return this.getTasaServicio();
	}

}
