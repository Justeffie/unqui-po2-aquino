package ar.edu.unp.po2.tp2.sueldo;

public abstract class Sueldo {
	
	private double montoBasico;
	
	private double porcentajeRetencion = 0.1;
	
	public Sueldo(double montoBasico) {
		this.setMontoBasico(montoBasico);
	}
	
	public double calcularRetencionesObraSocial() {
		return this.porcentajeRetencionSueldoBruto();
	}
	
	public abstract double calcularRetencionesJubilatorios();

	public double getMontoBasico() {
		return montoBasico;
	}

	public void setMontoBasico(double montoBasico) {
		this.montoBasico = montoBasico;
	}
	
	public double porcentajeRetencionSueldoBruto() {
		return this.getMontoBasico() * this.porcentajeRetencion;
	}

}
