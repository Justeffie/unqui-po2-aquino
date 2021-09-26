package ar.edu.unq.po2.tp5.intangible;

public class Servicio extends Intangible {
	
	private double costoPorUnidad;
	
	private long cantidadConsumida;
	
	public Servicio(String nombre, double costoPorUnidad, long cantidadConsumida) {
		super(nombre);
		this.setCostoPorUnidad(costoPorUnidad);
		this.setCantidadConsumida(cantidadConsumida);
	}
	
	@Override
	public double getPrecio() {
		return this.getCostoPorUnidad() * this.getCantidadConsumida();
	}

	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public void setCostoPorUnidad(double costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}

	public long getCantidadConsumida() {
		return cantidadConsumida;
	}

	public void setCantidadConsumida(long cantidadConsumida) {
		this.cantidadConsumida = cantidadConsumida;
	}

}
