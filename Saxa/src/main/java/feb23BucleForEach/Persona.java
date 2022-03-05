package feb23BucleForEach;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private int curp;

	public Persona(String nombre, String apellido, int edad, int curp) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.curp = curp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCurp() {
		return curp;
	}

	public void setCurp(int curp) {
		this.curp = curp;
	}

	public void mostrarDatos() {
		System.out.println("Nombre : " + nombre); 
		System.out.println("Apellido : " + apellido);
		System.out.println("Edad : " + edad);
		System.out.println("Curp : " + curp);
	}
}
