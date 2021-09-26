package ar.edu.unq.po2.tp5.agencia;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp5.factura.Factura;

public class AgenciaRecaudadora implements Agencia {

	List<Factura> registros = new ArrayList<Factura>();

	@Override
	public void registrarPago(Factura factura) {
		registros.add(factura);
	}
	
	public List<Factura> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Factura> registros) {
		this.registros = registros;
	}

}
