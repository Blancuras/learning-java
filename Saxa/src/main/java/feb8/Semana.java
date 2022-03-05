package feb8;

import java.util.Hashtable;
import java.util.Map;

public class Semana {
	public static void main(String[] args) {
		Map<Integer, String> semana = new Hashtable<Integer, String>();  
		semana.put(22, "Lunes");  
		semana.put(42, "Martes"); 
		semana.put(12, "Miercoles"); 
		semana.put(44, "Jueves"); 
		semana.put(98, "Viernes"); 
		semana.put(12, "Sabado"); 
		semana.put(72, "Domingo"); 
		
		System.out.println(semana.get(22));
	}
}
