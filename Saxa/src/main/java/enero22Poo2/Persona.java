package enero22Poo2;

public abstract class Persona {
	private String nombre; 
	
	public Persona(String nom) {
		nombre = nom;
	}
	public Persona(String nom, int edad) {
		nombre = nom;
		System.out.println("edad "+edad);
	}
	public String dameNombre() {
		return nombre; 
	} 
	
	public abstract String dameDescripcion(); 
	
}
