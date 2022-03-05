package feb2;

public class Personaa {
	private final String nombre;  //Constante
	private int edad; 
	
	//Constructor
	public Personaa(String nombre, int edad) {
		this.nombre = nombre; 
		this.edad = edad; 
	} 
	
	public void mostrarDatos() {
		System.out.println("El nombre es: " + nombre); 
		System.out.println("La edad es: " + edad);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}  
	
}
