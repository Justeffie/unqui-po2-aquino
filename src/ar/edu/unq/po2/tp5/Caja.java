package ar.edu.unq.po2.tp5;

public class Caja {
	
	MercadoCentral mercadoCentral;
	
	double montoAPagar = 0.0;
	
	public Caja(MercadoCentral mercadoCentral) {
		this.setMercadoCentral(mercadoCentral);
	}
	
	public void registrarProducto(Producto producto) {
		try {
			this.eliminarDelStock(producto);
			this.montoAPagar = this.montoAPagar + producto.getPrecio();
		} catch (ValidationException e) {
			System.out.println(e);
		}
	}
	
	public void eliminarDelStock(Producto producto) throws ValidationException {
		this.getMercadoCentral().eliminarProductoDelStock(producto);
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
