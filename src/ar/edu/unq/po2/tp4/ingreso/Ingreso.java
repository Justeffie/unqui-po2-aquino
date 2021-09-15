package ar.edu.unq.po2.tp4.ingreso;

import java.time.Month;

public class Ingreso {
	
	private double monto;
	
	private String concepto;
	
	private Month mes;
	
	public Ingreso(double monto, String concepto, Month mes) {
		this.setConcepto(concepto);
		this.setMes(mes);
		this.setMonto(monto);
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.98;
	}
	
	public double getMontoImponible() {
		return this.getMonto();
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Month getMes() {
		return mes;
	}

	public void setMes(Month mes) {
		this.mes = mes;
	}

}
