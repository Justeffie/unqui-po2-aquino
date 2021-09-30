package ar.edu.unq.po2.tpenumerativos;

public enum Deporte {
	
	RUNNING(1),
	FUTBOL(2),
	BASKET(2),
	TENNIS(3),
	JABALINA(4);
	
	
	Deporte(int complejidad) {
		this.setComplejidad(complejidad);
	}
	
	private int complejidad;

	public int getComplejidad() {
		return complejidad;
	}

	public void setComplejidad(int complejidad) {
		this.complejidad = complejidad;
	}

}
