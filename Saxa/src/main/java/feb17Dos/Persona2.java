package feb17Dos;

public class Persona2 {

	public int edad = 27;
	public final String nombre = "Karla";
	public float altura = 1.60f;

	@Override
	public String toString() {
		return "Persona2 [edad=" + edad + ", " + (nombre != null ? "nombre=" + nombre + ", " : "") + "altura=" + altura
				+ "]";
	}

	public static void main(String[] args) {
		Persona persona = new Persona();
		String datos = persona.toString();
		System.out.println(datos);
	}

}
