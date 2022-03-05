package enero22Poo2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Comparable, Trabajadores { //interfaz
	private String nombre;
	private double sueldo;
	private Date altaContrato;

	public Empleado(String nom, double sueldo, int anio, int mes, int dia) { // Constructor
		this.nombre = nom; // this.nombre Attributo nom PArametro
		this.sueldo = sueldo;
		this.altaContrato = new GregorianCalendar(anio, mes - 1, dia).getTime();
	} 
	
	public double estableceBonus(double gratificacion) {
		return Trabajadores.bonusBase + gratificacion; 
	}

	public Empleado(String nom) { // Constructor
		this(nom, 30000, 2000, 1, 1);
	}

	public String dameNombre() { // getter
		return nombre;
	}

	public double dameSueldo() { // getter
		return sueldo;
	}

	public Date dameFechaContrato() { // getter
		return altaContrato;
	}

	public void subeSueldo(double porcentaje) { // setter
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	@Override
	public String toString() {
		return "Empleado [" + (nombre != null ? "nombre=" + nombre + ", " : "") + "sueldo=" + sueldo + ", "
				+ (altaContrato != null ? "altaContrato=" + altaContrato : "") + "]";
	}

	//ORDENAMOS LOS EMPLEADOS POR SUELDO
	@Override
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado = (Empleado) miObjeto;
		if (this.sueldo < otroEmpleado.sueldo) {
			return -1;
		}
		if (this.sueldo > otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
	}
}
