package enero18;

public class ManipulaCadenas {

	public static void main(String[] args) {
		String nombre = "Ba";
		System.out.println("Mi nombre es " + nombre);
		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
		System.out.println("La ultima letra es la " + nombre.charAt( nombre.length()-1 ));
	}

}
