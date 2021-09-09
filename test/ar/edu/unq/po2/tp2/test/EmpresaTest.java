package ar.edu.unq.po2.tp2.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unp.po2.tp2.empleado.EmpleadoPlantaPermanente;
import ar.edu.unp.po2.tp2.empleado.EmpleadoPlantaTemporaria;
import ar.edu.unp.po2.tp2.empresa.Empresa;
import ar.edu.unp.po2.tp2.sueldo.SueldoEmpleadoPermanente;
import ar.edu.unp.po2.tp2.sueldo.SueldoEmpleadoTemporario;

class EmpresaTest {
	
	Empresa empresa = new Empresa("Empresa Test", "30-32345676-5");

	@BeforeEach
	public void setUp() {
		EmpleadoPlantaPermanente empleadoPP = new EmpleadoPlantaPermanente(
				"Pepito Test", "Calle Falsa, 1234", "Casado", LocalDate.of(1990, 1, 1));
		SueldoEmpleadoPermanente sueldoPP = new SueldoEmpleadoPermanente(20000.00);
		empleadoPP.setSueldo(sueldoPP);
		empleadoPP.setCantidadHijos(1);
		empleadoPP.setAntiguedad(1);
		// Sueldo neto = (20000 + 150 + 100 + 50) - (20000 + 150 + 100 + 50) * 0.1 - 20 - (20000 + 150 + 100 + 50) * 0.15
		// 15205
		
		EmpleadoPlantaTemporaria empleadoPT = new EmpleadoPlantaTemporaria(
				"Josesito Test", "Calle 14, 1234", "Soltero", LocalDate.of(1991,  2,  2));
		SueldoEmpleadoTemporario sueldoET = new SueldoEmpleadoTemporario(15000.00);
		empleadoPT.setSueldo(sueldoET);
		empleadoPT.setFechaFinDesignacion(LocalDate.of(2021, 11, 11));
		empleadoPT.setHorasExtras(1);
		// Sueldo neto = (15000.00 + 40) - (15000.00 + 40) * 0.1 - 0 - (15000.00 + 40) * 0.1 - 5
		// 12027
		
		// 15205 + 12027 = 27232
		empresa.addNuevoEmpleado(empleadoPP);
		empresa.addNuevoEmpleado(empleadoPT);
	}
	
	@Test
	void TestLiquidacionDeSueldos() {
		empresa.realizarLiquidacionDeSueldos();
		
		assertEquals(2, empresa.getRecibos().size());
	}
	
	@Test
	void TestCalculoDeTotalDeSueldosNeto() {
		
		assertEquals(27232.0, empresa.montoTotalSueldoNetos());
	}

}
