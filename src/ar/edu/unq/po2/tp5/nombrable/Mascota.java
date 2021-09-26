package ar.edu.unq.po2.tp5.nombrable;

public class Mascota implements Nombrable {
	
	private String nombre;
	
	private String raza;
	
	public Mascota(String nombre, String raza) {
		this.setNombre(nombre);
		this.setRaza(raza);
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
