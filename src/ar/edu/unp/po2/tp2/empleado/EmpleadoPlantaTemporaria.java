package ar.edu.unp.po2.tp2.empleado;

import java.time.LocalDate;

import ar.edu.unp.po2.tp2.sueldo.SueldoEmpleadoTemporario;

public class EmpleadoPlantaTemporaria extends Empleado {
	
	private LocalDate fechaFinDesignacion;
	
	private int horasExtras;

	public EmpleadoPlantaTemporaria(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento) {
		super(nombre, direccion, estadoCivil, fechaNacimiento);
	}
	
	@Override
	public double calcularRetenciones() {
		SueldoEmpleadoTemporario sueldoBasicoET = (SueldoEmpleadoTemporario) this.getSueldo();
		return sueldoBasicoET.calcularRetencionesObraSocial() +
				sueldoBasicoET.calcularRetencionXAnios(this.calcularEdad()) +
				sueldoBasicoET.calcularRetencionesJubilatorios() +
				sueldoBasicoET.retencionPorHoraExtra(this.getHorasExtras());
	}
	
	@Override
	public double calcularSueldoBruto() {
		SueldoEmpleadoTemporario sueldoBasicoET = (SueldoEmpleadoTemporario) this.getSueldo();
		return sueldoBasicoET.getMontoBasico() + 
				sueldoBasicoET.calcularMontoXHorasExtras(this.getHorasExtras());			
	}
	
	@Override
	public String desgloceSueldoBruto() {
		StringBuilder sb = new StringBuilder();
		sb.append("Sueldo Bruto: ");
		sb.append(System.lineSeparator());
		sb.append("Sueldo Básico = $");
		sb.append(System.lineSeparator());
		sb.append(this.getSueldo().getMontoBasico());
		sb.append(System.lineSeparator());
		sb.append("Horas Extras = $");
		sb.append(System.lineSeparator());
		sb.append(((SueldoEmpleadoTemporario) this.getSueldo()).calcularMontoXHorasExtras(this.getHorasExtras()));
		sb.append(System.lineSeparator());
		sb.append("Total = $");
		sb.append(System.lineSeparator());
		sb.append(this.calcularSueldoBruto());
		
		return sb.toString();
	}
	
	@Override
	public String desgloceRetenciones() {
		SueldoEmpleadoTemporario sueldoET = (SueldoEmpleadoTemporario) this.getSueldo();
		StringBuilder sb = new StringBuilder();
		sb.append("Retenciones: ");
		sb.append(System.lineSeparator());
		sb.append("Obra Social = $");
		sb.append(System.lineSeparator());
		sb.append(this.getSueldo().calcularRetencionesObraSocial());
		sb.append(System.lineSeparator());
		sb.append("Por edad = $");
		sb.append(System.lineSeparator());
		sb.append(sueldoET.calcularRetencionXAnios(this.calcularEdad()));
		sb.append(System.lineSeparator());
		sb.append("Aportes jubilatorios = $");
		sb.append(System.lineSeparator());
		sb.append("Por hora extra = $");
		sb.append(System.lineSeparator());
		sb.append(sueldoET.retencionPorHoraExtra(this.getHorasExtras()));
		sb.append(System.lineSeparator());
		sb.append("Total = $");
		sb.append(System.lineSeparator());
		sb.append(this.calcularRetenciones());
		
		return sb.toString();
	}
	
	public LocalDate getFechaFinDesignacion() {
		return fechaFinDesignacion;
	}

	public void setFechaFinDesignacion(LocalDate fechaFinDesignacion) {
		this.fechaFinDesignacion = fechaFinDesignacion;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
}
