package feb24Polimorfismo;

public abstract class Animal {
	protected String nombre;
	protected int edad;
	protected int tamano;

	public Animal(String nombre, int edad, int tamano) {
		this.nombre = nombre;
		this.edad = edad;
		this.tamano = tamano;
	}

	public abstract void realizarSonido(); 
}
