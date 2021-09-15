package ar.edu.unq.po2.tp2.sueldo;

public abstract class Sueldo {
	
	private double montoBasico;
	
	private double porcentajeRetencion = 0.1;
	
	public Sueldo(double montoBasico) {
		this.setMontoBasico(montoBasico);
	}
	
	public double calcularRetencionesObraSocial(double montoBruto) {
		return this.porcentajeRetencionSueldoBruto(montoBruto);
	}
	
	public double porcentajeRetencionSueldoBruto(double montoBruto) {
		return montoBruto * this.porcentajeRetencion;
	}
	
	public abstract double calcularRetencionesJubilatorios(double sueldoBruto);

	public double getMontoBasico() {
		return montoBasico;
	}

	public void setMontoBasico(double montoBasico) {
		this.montoBasico = montoBasico;
	}
	
}
