package ar.edu.unq.po2.tp3;

public class Rectangulo extends Cuadrilatero {

	public Rectangulo(Point puntoInferiorIzquierdo, int base, int altura) {
		super(puntoInferiorIzquierdo, base, altura);
	}
	
	public boolean esHorizontal() {
		return this.getBase() > this.getAltura();
	}
}
