package ar.edu.unq.po2.tp2.empleado;

import java.time.LocalDate;
import java.time.Period;

import ar.edu.unq.po2.tp2.sueldo.Sueldo;

public abstract class Empleado {
	
	private String nombre;
	
	private String direccion;
	
	private String estadoCivil;
	
	private LocalDate fechaNacimiento;
	
	private Sueldo sueldo;
	
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setEstadoCivil(estadoCivil);
		this.setFechaNacimiento(fechaNacimiento);
	}
	
	public double calcularSueldoNeto() {
		return this.calcularSueldoBruto() - this.calcularRetenciones();
	}
	
	public abstract double calcularSueldoBruto();
	
	public abstract double calcularRetenciones();
	
	public int calcularEdad() {
		return Period.between(this.getFechaNacimiento(), LocalDate.now())
				.getYears();
	}
	
	public String desgloceConceptos() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.desgloceSueldoBruto());
		sb.append(System.lineSeparator());
		sb.append(this.desgloceRetenciones());
		return sb.toString();
	}
	
	public abstract String desgloceSueldoBruto();
	
	public abstract String desgloceRetenciones();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Sueldo getSueldo() {
		return sueldo;
	}

	public void setSueldo(Sueldo sueldo) {
		this.sueldo = sueldo;
	}

}
