package feb24Polimorfismo;

public class Perro extends Animal{

	public Perro(String nombre, int edad, int tamano) {
		super(nombre, edad, tamano);
	}

	@Override
	public void realizarSonido() {
		System.out.println("El perro " + nombre + " tiene " + edad + " años y mide " + tamano + " metros" );
		System.out.println("El perro dice guau guau");
	}
	
}
