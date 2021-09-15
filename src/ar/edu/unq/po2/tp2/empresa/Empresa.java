package ar.edu.unq.po2.tp2.empresa; 
	
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp2.empleado.Empleado;
import ar.edu.unq.po2.tp2.recibo.ReciboDeHaberes;

public class Empresa {

	private String nombre;
	
	private String cuit;
	
	private List<Empleado> empleados = new ArrayList<Empleado>();
	
	private List<ReciboDeHaberes> recibos = new ArrayList<ReciboDeHaberes>();
	
	public Empresa(String nombre, String cuit) {
		this.setNombre(nombre);
		this.setCuit(cuit);
	}
	
	public double montoTotalSueldoBrutos() {
		return this.getEmpleados()
				.stream()
				.reduce(0.0,(subTotal, empleado) -> subTotal + empleado.calcularSueldoBruto(), Double::sum);
	}
	
	public double montoTotalSueldoNetos() {
		return this.getEmpleados()
				.stream()
				.reduce(0.0, (subTotal, empleado) -> subTotal + empleado.calcularSueldoNeto(), Double::sum);
	}
	
	public double montoTotalRetenciones() {
		return this.getEmpleados()
				.stream()
				.reduce(0.0, (subTotal, empleado) -> subTotal + empleado.calcularRetenciones(), Double::sum);
	}
	
	public void realizarLiquidacionDeSueldos() {
		this.getEmpleados()
			.stream()
			.forEach(empleado -> recibos.add(this.createNewReciboDeHaberes(empleado)));
		
	}
	
	private ReciboDeHaberes createNewReciboDeHaberes(Empleado empleado) {
		ReciboDeHaberes recibo = new ReciboDeHaberes(empleado, LocalDate.now(), empleado.getSueldo());
		
		return recibo;
	}
	
	public void addNuevoEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public List<ReciboDeHaberes> getRecibos() {
		return recibos;
	}

	public void setRecibos(ArrayList<ReciboDeHaberes> recibos) {
		this.recibos = recibos;
	}
}
