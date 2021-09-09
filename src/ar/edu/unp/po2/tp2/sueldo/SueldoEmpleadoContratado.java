package ar.edu.unp.po2.tp2.sueldo;

public class SueldoEmpleadoContratado extends Sueldo {
	
	private double gastosAdministrativos = 150.0;
	
	public SueldoEmpleadoContratado(double montoBasico) {
		super(montoBasico);
	}

	@Override
	public double calcularRetencionesJubilatorios(double sueldoBruto) {
		return 0;
	}

	public double getGastosAdministrativos() {
		return gastosAdministrativos;
	}

	public void setGastosAdministrativos(double gastosAdministrativos) {
		this.gastosAdministrativos = gastosAdministrativos;
	}

}
