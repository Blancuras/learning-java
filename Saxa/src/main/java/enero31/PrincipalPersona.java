package enero31;

public class PrincipalPersona {

	public static void main(String[] args) {
		Persona personita = new Persona("Juan"); 
		personita.setDinero(10);
		System.out.println(personita);
//		System.out.println("Nombre = " + personita.getNombre() + " dinero " + personita.getDinero());
	}

}
