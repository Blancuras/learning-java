package enero22Poo2;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

	public static void main(String[] args) {
		Jefatura jefeRH = new Jefatura("Juan", 55000, 2006, 9, 25);
		jefeRH.estableceIncentivo(2570);

		Empleado[] misEmpleados = new Empleado[6];

		String[] miArray = new String[3];

		misEmpleados[0] = new Empleado("Paco Gomez", 850000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana Lopez", 950000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);
		misEmpleados[3] = new Empleado("Antonio Fernandez", 3000, 2000, 01, 01);
		misEmpleados[4] = jefeRH; // Polimorfismo en accion
		misEmpleados[5] = new Jefatura("Maria", 95000, 1999, 5, 26);
		Jefatura jefaFinanzas = (Jefatura) misEmpleados[5];
		jefaFinanzas.estableceIncentivo(55000);
		System.out.println(jefaFinanzas.tomarDecisiones("Dar mas dias de vacaciones a los empleados"));
		System.out.println(
				"El jefe " + jefaFinanzas.dameNombre() + " tiene un bonus de: " + jefaFinanzas.estableceBonus(500));

		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " + misEmpleados[3].estableceBonus(200));

		for (Empleado empleado : misEmpleados) {
			empleado.subeSueldo(5);
		}

		Arrays.sort(misEmpleados); // Metodo sort ordena un arreglo de objetos

		for (Empleado e : misEmpleados) { // for each
			System.out.println("Nombre " + e.dameNombre() + " Sueldo " + e.dameSueldo() + " Fecha de Alta: "
					+ e.dameFechaContrato());
		}

		/*
		 * Empleado empleado1 = new Empleado("Paco Gomez", 850000, 1990, 12, 17 );
		 * Empleado empleado2 = new Empleado("Ana Lopez", 950000, 1995, 06, 02 );
		 * Empleado empleado3 = new Empleado("Maria Martin", 105000, 2002, 03, 15 );
		 * 
		 * empleado1.subeSueldo(5); empleado2.subeSueldo(5); empleado3.subeSueldo(5);
		 * 
		 * System.out.println("Nombre : " + empleado1.dameNombre() + " Sueldo: " +
		 * empleado1.dameSueldo() + " Fecha de Alta: " + empleado1.dameFechaContrato());
		 * 
		 * System.out.println("Nombre : " + empleado2.dameNombre() + " Sueldo: " +
		 * empleado2.dameSueldo() + " Fecha de Alta: " + empleado2.dameFechaContrato());
		 * 
		 * System.out.println("Nombre : " + empleado3.dameNombre() + " Sueldo: " +
		 * empleado3.dameSueldo() + " Fecha de Alta: " + empleado3.dameFechaContrato());
		 */

		/*
		 * for(int indice = 0; indice<3; indice++) { misEmpleados[1].subeSueldo(5); }
		 */
		/*
		 * for(int indice = 0; indice<3; indice++) { System.out.println("Nombre " +
		 * misEmpleados[1].dameNombre() + " Sueldo " + misEmpleados[indice].dameSueldo()
		 * + " Fecha de Alta: " + misEmpleados[indice].dameFechaContrato()); }
		 */
	}

}
