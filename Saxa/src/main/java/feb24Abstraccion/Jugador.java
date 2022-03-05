package feb24Abstraccion;

public abstract class Jugador {

	protected String nombre;
	protected int edad;

	public Jugador(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	// Creamos metodo Abstracto
	public abstract void jugar();
	
	public abstract String name();
	
	public String quienVaAGanar() {
		return "Yo voy a ganar";
	}

}
