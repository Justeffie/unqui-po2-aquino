package ar.edu.unp.po2.tp2.sueldo;

public class SueldoEmpleadoTemporario extends Sueldo {
	
	private double montoRetencionEdad = 25;
	
	private int retencionAnios = 50;
	
	private int retencionXHora = 5;
	
	private int montoXHoraExtra = 40;

	public SueldoEmpleadoTemporario(double montoBruto) {
		super(montoBruto);
	}
	
	public double calcularAñosAporte() {
		return 0;
	}
	
	public double calcularMontoXHorasExtras(int horas) {
		return this.montoXHoraExtra * horas;
	}
	
	public double calcularRetencionXAnios(int edad) {
		return edad > this.retencionAnios ? this.montoRetencionEdad : 0;
	}

	@Override
	public double calcularRetencionesJubilatorios(double sueldoBruto) {
		return this.porcentajeRetencionSueldoBruto(sueldoBruto);
	}
	
	public double retencionPorHoraExtra(int horas) {
		return this.retencionXHora * horas;
	}
}
