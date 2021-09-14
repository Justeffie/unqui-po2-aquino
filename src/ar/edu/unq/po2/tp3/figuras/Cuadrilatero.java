package ar.edu.unq.po2.tp3.figuras;

public class Cuadrilatero {
	
	private Point puntoInferiorIzquierdo;
	
	private Point puntoSuperiorIzquierdo = new Point();
	
	private Point puntoInferiorDerecho = new Point();
	
	private Point puntoSuperiorDerecho = new Point();
	
	private int base;
	
	private int altura;
	
	public Cuadrilatero(Point puntoInferiorIzquierdo, int base, int altura) {
		this.setPuntoInferiorIzquierdo(puntoInferiorIzquierdo);
		this.setBase(base);
		this.setAltura(altura);
		this.setearPuntosRestantes();
	}
	
	public int area() {
		return this.getBase() * this.getAltura();
	}
	
	public int perimetro() {
		return this.getBase() * 2 + this.getAltura() * 2;
	}
	
	private void setearPuntosRestantes() {
		
		this.puntoSuperiorIzquierdo.setX(this.puntoInferiorIzquierdo.getX());
		this.puntoSuperiorIzquierdo.setY(this.puntoInferiorIzquierdo.getY() + this.altura);
		
		this.puntoInferiorDerecho.setX(this.puntoInferiorIzquierdo.getX() + this.base);
		this.puntoInferiorDerecho.setY(this.puntoInferiorIzquierdo.getY());
		
		this.puntoSuperiorDerecho.setX(this.puntoSuperiorIzquierdo.getX() + this.base);
		this.puntoSuperiorDerecho.setY(this.puntoSuperiorIzquierdo.getY());
	}

	public Point getPuntoInferiorIzquierdo() {
		return puntoInferiorIzquierdo;
	}

	public void setPuntoInferiorIzquierdo(Point puntoInferiorIzquierdo) {
		this.puntoInferiorIzquierdo = puntoInferiorIzquierdo;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

}
