package ar.edu.unq.po2.tpenumerativos;

public enum Color {
	
	ROJO("rojo", Riesgo.ALTO), 
	GRIS("gris", Riesgo.MEDIO), 
	AMARILLO("amarillo", Riesgo.MEDIO), 
	MIEL("miel", Riesgo.BAJO);
	
	Color(String descripcion, Riesgo riesgo) {
		this.descripcion = descripcion;
		this.riesgo = riesgo;
	}
	
	private String descripcion;
	
	private Riesgo riesgo;
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public Riesgo getRiesgo() {
		return this.riesgo;
	}
	
	public Color getProximo() {
		Color[] colores = Color.values();
		if (this.ordinal() + 1 == colores.length) {
			return colores[0];
		} else {
			return colores[this.ordinal() + 1];
		}
	}
	

}
