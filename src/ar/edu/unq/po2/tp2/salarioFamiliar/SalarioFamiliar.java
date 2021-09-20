package ar.edu.unq.po2.tp2.salarioFamiliar;

public class SalarioFamiliar {
	
	private double montoFijoAsignacionXHijo = 150.0;
	
	private double montoFijoSiTieneConyuge = 100.0;
	
	private double montoFijoPorAntiguedad = 50.0;

	public double calcularMontoAsignacionPorHijo(int cantidadHijos) {
		return this.montoFijoAsignacionXHijo * cantidadHijos;
	}
	
	public double calcularMontoAsignacionPorConyuge(boolean tieneConyuge) {
		return tieneConyuge ? this.montoFijoSiTieneConyuge : 0l;
	}
	
	public double calcularMontoPorAntiguedad(int antiguedad) {
		return montoFijoPorAntiguedad * antiguedad;
	}
}
