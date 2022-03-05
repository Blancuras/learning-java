package enero28;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Edad {

	public static void main(String[] args) {
		Calendar fechaNacimineto = new GregorianCalendar(1989,1,1); 
		Calendar fechaHoy = Calendar.getInstance(); //Toma la Fecha del dia
		int anioNacimiento = fechaNacimineto.get(Calendar.YEAR); 
		int anioHoy = fechaHoy.get(Calendar.YEAR);  
		int edad = anioHoy-anioNacimiento; 
		System.out.println("Edad = " + edad);

	}

}
