package ar.edu.unq.po2.tp5.caja;

import ar.edu.unq.po2.tp5.exception.ValidationException;
import ar.edu.unq.po2.tp5.pagable.Pagable;

public class Caja {
	
	double montoAPagar = 0.0;
	
	public void registrar(Pagable pagable) {
		try {
			pagable.registrar();
			this.montoAPagar = this.montoAPagar + pagable.getPrecio();
		} catch (ValidationException e) {
			System.out.print("Ha ocurrido un problema: " + e.getMessage());
		}
	}
	
	public double getMontoAPagar() {
		return this.montoAPagar;
	}
}
