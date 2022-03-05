package feb17;

public class Registro {

	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setNombre("Beto");
		persona.setEdad(24);
		persona.setAltura(1.70);

		System.out.println("El nombre es: " + persona.getNombre());
		System.out.println("La edad de " + persona.getNombre() + " es " + persona.getEdad());
		System.out.println("La altura es: " + persona.getAltura());
	}
}
