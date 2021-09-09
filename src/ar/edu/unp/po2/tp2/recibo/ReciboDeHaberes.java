package ar.edu.unp.po2.tp2.recibo;

import java.time.LocalDate;

import ar.edu.unp.po2.tp2.empleado.Empleado;
import ar.edu.unp.po2.tp2.sueldo.Sueldo;

public class ReciboDeHaberes {
	
	private LocalDate fechaEmision;
	
	private Empleado empleado;	
	
	private Sueldo sueldo;
	
	public ReciboDeHaberes(Empleado empleado, LocalDate fechaEmision, Sueldo sueldo) {
		this.setEmpleado(empleado);
		this.setFechaEmision(fechaEmision);
		this.setSueldo(sueldo);
	}

	public String desgloseConceptos() {
		return this.getEmpleado().desgloceConceptos();
	}
	
	public String getNombreEmpleado() {
		return this.getEmpleado().getNombre();
	}
	
	public String getDireccionEmpleado() {
		return this.getEmpleado().getDireccion();
	}
	
	public double getSueldoBrutoEmpleado() {
		return this.getEmpleado().calcularSueldoBruto();
	}
	
	public double getSueldoNetoEmpleado() {
		return this.getEmpleado().calcularSueldoNeto();
	}
	
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Sueldo getSueldo() {
		return sueldo;
	}

	public void setSueldo(Sueldo sueldo) {
		this.sueldo = sueldo;
	}

}
