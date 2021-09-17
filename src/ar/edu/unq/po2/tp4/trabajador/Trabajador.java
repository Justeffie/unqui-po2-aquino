package ar.edu.unq.po2.tp4.trabajador;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp4.ingreso.Ingreso;

public class Trabajador {

	private List<Ingreso> ingresosAnuales = new ArrayList<Ingreso>();

	
	public double getTotalPercibido() {
		return this.getIngresosAnuales()
				.stream()
				.reduce(0.0, (subtotal, ingreso) -> subtotal + ingreso.getMonto(), Double::sum);
	}
	
	public double getMontoImponible() {
		return this.getIngresosAnuales()
				.stream()
				.reduce(0.0, (subtotal, ingreso) -> subtotal + ingreso.getMontoImponible(), Double::sum);
	}
	
	public double getImpuestoAPagar() {
		return this.getIngresosAnuales()
				.stream()
				.reduce(0.0, (subtotal, ingreso) -> subtotal + ingreso.getImpuestoAPagar(), Double::sum);
	}
	
	
	public void nuevoIngreso(Ingreso ingreso) {
		this.ingresosAnuales.add(ingreso);
	}
	
	public List<Ingreso> getIngresosAnuales() {
		return ingresosAnuales;
	}

	public void setIngresosAnuales(List<Ingreso> ingresosAnuales) {
		this.ingresosAnuales = ingresosAnuales;
	}
}
