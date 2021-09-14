package ar.edu.unq.po2.tp3.ejercicio9;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String nombre;
	
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.setNombre(nombre);
		this.setFechaNacimiento(fechaNacimiento);
	}
	
	public int getEdad() {
		return Period.between(this.getFechaNacimiento(), LocalDate.now())
				.getYears();
	}
	
	public boolean menorQue(Persona persona) {
		return persona.getEdad() < this.getEdad();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
