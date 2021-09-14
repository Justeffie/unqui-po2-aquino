package ar.edu.unq.po2.tp3.ejercicio10;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String nombre;
	
	private String apellido;
	
	private int edad;

	public Persona(String nombre, String apellido, int edad) {
		this.setApellido(apellido);
		this.setEdad(edad);
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}