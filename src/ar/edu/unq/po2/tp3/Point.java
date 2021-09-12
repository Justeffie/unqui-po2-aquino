package ar.edu.unq.po2.tp3;

public class Point {
	
	private int x = 0;
	
	private int y = 0;
	
	public Point() {}
	
	public Point(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public void sumarPuntos(int x, int y) {
		this.setX(x + this.getX());
		this.setY(y + this.getY());
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
