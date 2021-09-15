package ar.edu.unq.po2.tp4.ingreso;

import java.time.Month;

public class IngresoPorHorasExtras extends Ingreso {
	
	private int horas;

	public IngresoPorHorasExtras(double monto, String concepto, Month mes, int horas) {
		super(monto, concepto, mes);
		this.setHoras(horas);
	}
	
	@Override
	public double getMontoImponible() {
		return 0.0;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

}
