package feb24Polimorfismo;

public class Gato extends Animal {

	public Gato(String nombre, int edad, int tamano) {
		super(nombre, edad, tamano);
	}

	@Override
	public void realizarSonido() {
		System.out.println("El gato " + nombre + " tiene " + edad + " a�os y mide " + tamano + " cm");
		System.out.println("El gato dice miau miau");
	}

}
