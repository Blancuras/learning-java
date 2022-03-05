package feb17;

public class Constructor {
	private int edad; 
	private float altura; 
	private String nombre; 
	
	//Metodo Constructor 
	
	public Constructor(int edad, float altura, String nombre) {
		this.edad = edad; 
		this.altura = altura; 
		this.nombre = nombre;
		System.out.println("La edad es: " + edad + " años");
		System.out.println("La altura es: " + altura); 
		System.out.println("El nombre es: " + nombre);
	}
		
	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Constructor [edad=" + edad + ", altura=" + altura + ", " + (nombre != null ? "nombre=" + nombre : "")
				+ "]";
	}

	
}
