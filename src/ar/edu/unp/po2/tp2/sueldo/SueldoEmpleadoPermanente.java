package ar.edu.unp.po2.tp2.sueldo;

import ar.edu.unp.po2.tp2.salarioFamiliar.SalarioFamiliar;

public class SueldoEmpleadoPermanente extends Sueldo {
	
	private SalarioFamiliar salarioFamiliar = new SalarioFamiliar();
	
	private double porcentajeRetencionJubilatorio = 0.15;
	
	private int porcentajeRetencionXHijo = 20;

	public SueldoEmpleadoPermanente(double montoBruto) {
		super(montoBruto);
	}
	
	public double calcularRetencionesObraSocialPorHijo(int cantidadHijos) {
		return cantidadHijos * this.porcentajeRetencionXHijo;
	}
	
	public double calcularMontoPorAntiguedad(int antiguedad) {
		return this.getSalarioFamiliar().calcularMontoPorAntiguedad(antiguedad);
	}
	
	public double calcularMontoAsignacionXHijo(int hijos) {
		return this.getSalarioFamiliar().calcularMontoAsignacionPorHijo(hijos);
	}
	
	public double calcularAsignacionXConyuge(boolean tieneConyuge) {
		return this.getSalarioFamiliar().calcularMontoAsignacionPorConyuge(tieneConyuge);
	}
	
	@Override
	public double calcularRetencionesJubilatorios(double sueldoBruto) {
		return sueldoBruto * this.porcentajeRetencionJubilatorio;
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
