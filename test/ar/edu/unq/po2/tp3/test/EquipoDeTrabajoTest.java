package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.ejercicio10.EquipoDeTrabajo;
import ar.edu.unq.po2.tp3.ejercicio10.Persona;

class EquipoDeTrabajoTest {
	
	Persona persona1 = new Persona("Nombre Test 1", "Apellido Test 1", 30);
	Persona persona2 = new Persona("Nombre Test 2", "Apellido Test 2", 38);
	Persona persona3 = new Persona("Nombre Test 3", "Apellido Test 3", 35);
	Persona persona4 = new Persona("Nombre Test 4", "Apellido Test 4", 44);
	Persona persona5 = new Persona("Nombre Test 5", "Apellido Test 5", 30);
	
	List<Persona> integrantes = Arrays.asList(persona1, persona2, persona3, persona4, persona5);
	
	EquipoDeTrabajo equipo = new EquipoDeTrabajo("Equipo Test", integrantes);

	@Test
	void promedioEdadTest() {
		assertEquals(35.4, equipo.promedioDeEdad());
	}

}
