package feb17;

public class Modificadores {
	private int edad; 	
	private String nombre; 
	
	public Modificadores(int edad, String nombre) {
		this.edad = edad; 
		this.nombre = nombre; 
	} 
	
	public void describir() {
		System.out.println("El alumno " + nombre + " tiene " + edad + " años ");
	}
	
}
