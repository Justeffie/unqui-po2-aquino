package ar.edu.unq.po2.tp5.nombrable;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Nombrable {
	
	private String nombre;

	private LocalDate fechaNacimiento;
	
	private int edad;
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.setNombre(nombre);
		this.setFechaNacimiento(fechaNacimiento);
		this.edad = this.calcularEdad();
	}

	public boolean comparar(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEdad() {
		return edad;
	}
	
	private int calcularEdad() {
		return Period.between(this.getFechaNacimiento(), LocalDate.now())
				.getYears();
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
