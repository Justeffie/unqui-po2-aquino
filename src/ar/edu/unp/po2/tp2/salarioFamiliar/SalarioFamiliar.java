package ar.edu.unp.po2.tp2.salarioFamiliar;

public class SalarioFamiliar {
	
	private long cantidadAsignacionXHijo = 150l;
	
	private long cantidadSiTieneConyuge = 100l;
	
	private long montoPorAntiguedad = 50l;

	public long calcularMontoAsignacionPorHijo(int cantidadHijos) {
		return this.cantidadAsignacionXHijo * cantidadHijos;
	}
	
	public long calcularMontoAsignacionPorConyuge(boolean tieneConyuge) {
		return tieneConyuge ? this.cantidadSiTieneConyuge : 0l;
	}
	
	public long calcularMontoPorAntiguedad(int antiguedad) {
		return montoPorAntiguedad * antiguedad;
	}
}
