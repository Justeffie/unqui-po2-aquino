package ar.edu.unq.po2.tp3.ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	
	private String nombre;
	
	private List<Persona> integrantes = new ArrayList<Persona>();

	public EquipoDeTrabajo(String nombre, List<Persona> integrantes) {
		this.setNombre(nombre);
		this.setIntegrantes(integrantes);
	}
	
	public double promedioDeEdad() {
		double edades = integrantes.stream()
						.reduce(0.0, (subtotal, integrante) -> subtotal + integrante.getEdad(), Double::sum);
		
		return edades / integrantes.size();
	}
	
	public void addIntegrante(Persona integrante) {
		this.integrantes.add(integrante);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Persona> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(List<Persona> integrantes) {
		this.integrantes = integrantes;
	}

}
