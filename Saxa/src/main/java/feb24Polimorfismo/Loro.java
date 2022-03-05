package feb24Polimorfismo;

public class Loro extends Animal {

	public Loro(String nombre, int edad, int tamano) {
		super(nombre, edad, tamano);
	}

	@Override
	public void realizarSonido() {
		System.out.println("El loro " + nombre + " tiene " + edad + " años y mide " + tamano + " cm");
		System.out.println("El loro dice cri cri");
	}

}
