package ar.edu.unq.po2.tp5.nombrable;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Mascota perro = new Mascota("Chopper", "Pepe");
		Mascota perra = new Mascota("Nami", "Labrador");
		
		Persona maria = new Persona("María", LocalDate.of(1990, 1, 1));
		Persona jose = new Persona("José", LocalDate.of(1990, 2, 2));
		List<Nombrable> seres = Arrays.asList(perro, perra, maria, jose);
		
		seres.stream().forEach(ser -> System.out.print(ser.getNombre() + System.lineSeparator()));

	}

}
