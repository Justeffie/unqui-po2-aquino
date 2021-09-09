package ar.edu.unp.po2.tp2.salarioFamiliar;

public class SalarioFamiliar {
	
	private double cantidadAsignacionXHijo = 150l;
	
	private double cantidadSiTieneConyuge = 100l;
	
	private double montoPorAntiguedad = 50l;

	public double calcularMontoAsignacionPorHijo(int cantidadHijos) {
		return this.cantidadAsignacionXHijo * cantidadHijos;
	}
	
	public double calcularMontoAsignacionPorConyuge(boolean tieneConyuge) {
		return tieneConyuge ? this.cantidadSiTieneConyuge : 0l;
	}
	
	public double calcularMontoPorAntiguedad(int antiguedad) {
		return montoPorAntiguedad * antiguedad;
	}
}
