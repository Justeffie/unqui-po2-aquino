package ar.edu.unp.po2.tp2.empleado;

import java.time.LocalDate;

import ar.edu.unp.po2.tp2.sueldo.SueldoEmpleadoContratado;
import ar.edu.unp.po2.tp2.sueldo.SueldoEmpleadoPermanente;

public class EmpleadoContratado extends Empleado {

	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento) {
		super(nombre, direccion, estadoCivil, fechaNacimiento);
	}

	@Override
	public double calcularSueldoBruto() {
		return this.getSueldo().getMontoBasico();
	}

	@Override
	public double calcularRetenciones() {
		return ((SueldoEmpleadoContratado) this.getSueldo()).getGastosAdministrativos();
	}

	@Override
	public String desgloceSueldoBruto() {
		StringBuilder sb = new StringBuilder();
		sb.append("Sueldo Bruto: ");
		sb.append(System.lineSeparator());
		sb.append("Sueldo Básico = $");
		sb.append(System.lineSeparator());
		sb.append(((SueldoEmpleadoContratado) this.getSueldo()).getMontoBasico());
		sb.append(System.lineSeparator());
		sb.append("Total = $");
		sb.append(System.lineSeparator());
		sb.append(this.calcularSueldoBruto());
		
		return sb.toString();
	}

	@Override
	public String desgloceRetenciones() {
		StringBuilder sb = new StringBuilder();
		sb.append("Retenciones: ");
		sb.append(System.lineSeparator());
		sb.append("Gastos administrativos = $");
		sb.append(System.lineSeparator());
		sb.append(((SueldoEmpleadoPermanente) this.getSueldo()).calcularRetencionesObraSocial(this.calcularSueldoBruto()));
		sb.append(this.calcularRetenciones());
		
		return sb.toString();
	}

}
