package ar.edu.unq.po2.tp2.empleado;

import java.time.LocalDate;

import ar.edu.unq.po2.tp2.sueldo.SueldoEmpleadoPermanente;

public class EmpleadoPlantaPermanente extends Empleado {

	private int cantidadHijos;
	
	private int antiguedad;
	
	public EmpleadoPlantaPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento) {
		super(nombre, direccion, estadoCivil, fechaNacimiento);
	}

	@Override
	public double calcularRetenciones() {
		SueldoEmpleadoPermanente sueldoEP = (SueldoEmpleadoPermanente) this.getSueldo();
		return sueldoEP.calcularRetencionesObraSocial(this.calcularSueldoBruto()) + 
				sueldoEP.calcularRetencionesObraSocialPorHijo(this.getCantidadHijos()) + 
				sueldoEP.calcularRetencionesJubilatorios(this.calcularSueldoBruto());
	}
	
	@Override
	public double calcularSueldoBruto() {
		SueldoEmpleadoPermanente sueldoEP = (SueldoEmpleadoPermanente) this.getSueldo();
		return sueldoEP.getMontoBasico() + 
				sueldoEP.calcularMontoAsignacionXHijo(this.getCantidadHijos()) +
				sueldoEP.calcularAsignacionXConyuge(this.tieneConyuge()) +
				sueldoEP.calcularMontoPorAntiguedad(this.antiguedad);
	}
	
	@Override
	public String desgloceSueldoBruto() {
		SueldoEmpleadoPermanente sueldoEP = (SueldoEmpleadoPermanente) this.getSueldo();
		StringBuilder sb = new StringBuilder();
		sb.append("Sueldo Bruto: ");
		sb.append(System.lineSeparator());
		sb.append("Sueldo Básico = $");
		sb.append(System.lineSeparator());
		sb.append(sueldoEP.getMontoBasico());
		sb.append(System.lineSeparator());
		sb.append("Asignacion por hijo = $");
		sb.append(System.lineSeparator());
		sb.append(sueldoEP.calcularMontoAsignacionXHijo(this.getCantidadHijos()));
		sb.append(System.lineSeparator());
		sb.append("Asignacion por conyuge = $");
		sb.append(System.lineSeparator());
		sb.append(sueldoEP.calcularAsignacionXConyuge(this.tieneConyuge()));
		sb.append(System.lineSeparator());
		sb.append("Antiguedad = $");
		sb.append(System.lineSeparator());
		sb.append(sueldoEP.calcularMontoPorAntiguedad(this.antiguedad));
		sb.append(System.lineSeparator());
		sb.append("Total = $");
		sb.append(System.lineSeparator());
		sb.append(this.calcularSueldoBruto());
		
		return sb.toString();
	}

	@Override
	public String desgloceRetenciones() {
		SueldoEmpleadoPermanente sueldoEP = (SueldoEmpleadoPermanente) this.getSueldo();
		StringBuilder sb = new StringBuilder();
		sb.append("Retenciones: ");
		sb.append(System.lineSeparator());
		sb.append("Obra Social = $");
		sb.append(System.lineSeparator());
		sb.append(sueldoEP.calcularRetencionesObraSocial(this.calcularSueldoBruto()));
		sb.append(System.lineSeparator());
		sb.append("Por hijo = $");
		sb.append(System.lineSeparator());
		sb.append(sueldoEP.calcularRetencionesObraSocialPorHijo(this.getCantidadHijos()));
		sb.append(System.lineSeparator());
		sb.append("Aportes jubilatorios = $");
		sb.append(System.lineSeparator());
		sb.append(sueldoEP.calcularRetencionesJubilatorios(this.calcularSueldoBruto()));
		sb.append(System.lineSeparator());
		sb.append("Total = $");
		sb.append(System.lineSeparator());
		sb.append(this.calcularRetenciones());
		
		return sb.toString();
	}
	
	public boolean tieneConyuge() {
		return this.getEstadoCivil().equals("Casadx");
	}
	
	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
}
