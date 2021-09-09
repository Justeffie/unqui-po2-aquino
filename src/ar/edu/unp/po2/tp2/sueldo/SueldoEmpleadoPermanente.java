package ar.edu.unp.po2.tp2.sueldo;

import ar.edu.unp.po2.tp2.salarioFamiliar.SalarioFamiliar;

public class SueldoEmpleadoPermanente extends Sueldo {
	
	private SalarioFamiliar salarioFamiliar;
	
	private double porcentajeRetencionJubilatorio = 0.15;
	
	private int porcentajeRetencionXHijo = 20;
	
	private int montoAsignacionXHijo = 150;
	
	private int montoAsignacionXConyuge = 100;

	public SueldoEmpleadoPermanente(double montoBruto) {
		super(montoBruto);
	}
	
	public double calcularRetencionesObraSocial() {
		return this.calcularRetencionesObraSocial();
	}
	
	public double calcularRetencionesObraSocialPorHijo(int cantidadHijos) {
		return cantidadHijos * this.porcentajeRetencionXHijo;
	}
	
	public double calcularMontoPorAntiguedad(int aniosAntiguedad) {
		return 0;
	}
	
	public double calcularMontoAsignacionXHijo(int hijos) {
		return this.montoAsignacionXHijo * hijos;
	}
	
	public double calcularAsignacionXConyuge(boolean tieneConyuge) {
		return tieneConyuge ? this.montoAsignacionXConyuge : 0;
	}
	
	@Override
	public double calcularRetencionesJubilatorios() {
		return this.getMontoBasico() * this.porcentajeRetencionJubilatorio;
	}

	public SalarioFamiliar getSalarioFamiliar() {
		return salarioFamiliar;
	}

	public void setSalarioFamiliar(SalarioFamiliar salarioFamiliar) {
		this.salarioFamiliar = salarioFamiliar;
	}

	public double getPorcentajeRetencionJubilatorio() {
		return porcentajeRetencionJubilatorio;
	}

	public void setPorcentajeRetencionJubilatorio(double porcentajeRetencionJubilatorio) {
		this.porcentajeRetencionJubilatorio = porcentajeRetencionJubilatorio;
	}
}
