package ar.edu.unq.po2.tp5.pagable;

import ar.edu.unq.po2.tp5.exception.ValidationException;

public interface Pagable {

	public double getPrecio();

	public void registrar() throws ValidationException;
}
