package ar.edu.unq.po2.tp2.sueldo;

public class SueldoEmpleadoTemporario extends Sueldo {
	
	private double montoFijoRetencionEdad = 25.0;
	
	private long edadDeRetencion = 50;
	
	private double montoFijoRetencionXHora = 5.0;
	
	private double montoAdicionalXHoraExtra = 40.0;

	public SueldoEmpleadoTemporario(double montoBasico) {
		super(montoBasico);
	}
	
	public double calcularMontoXHorasExtras(int horas) {
		return this.montoAdicionalXHoraExtra * horas;
	}
	
	public double calcularRetencionXAnios(int edad) {
		return edad > this.edadDeRetencion ? this.montoFijoRetencionEdad : 0;
	}

	@Override
	public double calcularRetencionesJubilatorios(double sueldoBruto) {
		return this.porcentajeRetencionSueldoBruto(sueldoBruto);
	}
	
	public double retencionPorHoraExtra(int horas) {
		return this.montoFijoRetencionXHora * horas;
	}
}
