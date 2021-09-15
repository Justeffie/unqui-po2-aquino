package ar.edu.unq.po2.tp2.sueldo;

public class SueldoEmpleadoTemporario extends Sueldo {
	
	private double montoRetencionEdad = 25.0;
	
	private double retencionAnios = 50.0;
	
	private double retencionXHora = 5.0;
	
	private double montoXHoraExtra = 40.0;

	public SueldoEmpleadoTemporario(double montoBasico) {
		super(montoBasico);
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
