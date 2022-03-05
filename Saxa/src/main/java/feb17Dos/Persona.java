package feb17Dos;

public class Persona {
	
	private int edad = 26; 
	private final String nombre = "Teodora"; 
	
	public void saludar() {
		edad = 16;  
		System.out.println("Hola, mi nombre es " + nombre + " , mi es " + edad);
	}
}
