package feb17;

public class EjecucionPrincipal {

	public static void main(String[] args) {
		Constructor persona = new Constructor(14, 1.70f, "Christian");
		System.out.println("Persona " + persona);
		System.out.println("EL nombre es "+persona.getNombre());
		System.out.println("LA edad esss "+persona.getEdad() );
	}

}
