package ar.edu.unp.po2.tp2.salarioFamiliar;

public class SalarioFamiliar {
	
	private double cantidadAsignacionXHijo = 150.0;
	
	private double cantidadSiTieneConyuge = 100.0;
	
	private double montoPorAntiguedad = 50.0;

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
