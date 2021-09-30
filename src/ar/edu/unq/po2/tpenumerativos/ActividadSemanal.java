package ar.edu.unq.po2.tpenumerativos;

import java.time.LocalTime;

public class ActividadSemanal {
	
	private DiaDeLaSemana dia;
	
	private LocalTime hora;
	
	// duración en horas;
	private int duracion; 
	
	private Deporte deporte;
	
	private double costo;

	public ActividadSemanal(DiaDeLaSemana dia, LocalTime hora, int duracion, Deporte deporte) {
		this.setDia(dia);
		this.setHora(hora);
		this.setDuracion(duracion);
		this.setDeporte(deporte);
		this.calculateCosto();
	}
	
	public DiaDeLaSemana getDia() {
		return dia;
	}

	public void setDia(DiaDeLaSemana dia) {
		this.dia = dia;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	public double getCosto() {
		return costo;
	}
	
	public int getComplejidad() {
		return this.getDeporte().getComplejidad();
	}

	public void calculateCosto() {
		double costo;
		if (dia.equals(DiaDeLaSemana.LUNES) ||
			dia.equals(DiaDeLaSemana.MARTES) ||
			dia.equals(DiaDeLaSemana.MIERCOLES)) {
			costo = 500;
		} else {
			costo = 1000;
		}
		
		this.costo = costo + this.getComplejidad() * 200;
	}

}
