package feb24Abstraccion;

public class JugadorBasquet extends Jugador {

	public JugadorBasquet(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void jugar() {
		System.out.println("El jugador de basquet " + nombre + " tiene " + edad + " años ");
		System.out.println("Este jugador esta en el campo saltando con el balon ");
	}

	@Override
	public String name() {
		return "Basquet";
	}

}
