package ar.edu.unq.po2.tp5;

public class Caja {
	
	MercadoCentral mercadoCentral;
	
	double montoAPagar = 0.0;
	
	public Caja(MercadoCentral mercadoCentral) {
		this.setMercadoCentral(mercadoCentral);
	}
	
	public void registrarProducto(Producto producto) {
		this.eliminarDelStock(producto);
		this.montoAPagar = this.montoAPagar + producto.getPrecio();
	}
	
	public void eliminarDelStock(Producto producto) throws ValidationException {
		try {
			this.getMercadoCentral().eliminarProductoDelStock(producto);
		} catch (ValidationException e) {
			System.out.println(e);
		}
	}
	
	public double getMontoAPagar() {
		return this.montoAPagar;
	}

	public MercadoCentral getMercadoCentral() {
		return mercadoCentral;
	}

	public void setMercadoCentral(MercadoCentral mercadoCentral) {
		this.mercadoCentral = mercadoCentral;
	}
}
