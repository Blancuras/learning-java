package enero22Poo2;

public class Empleados { // Constructor
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente = 1;
	private static String pais = "MExico";
	//Empleado emp1 = new Empleado("Eliseo");//ID1 idSiguiente++
	//Empleado emp2 = new Empleado("Aileen");//Id2 idSiguiente++
	//Empleado emp2 = new Empleado("Aileen2");//Id3 idSiguiente++
	//emp1.getName()//Eliseo
	//emp2.getNAme()//Aileen
	//emp2.getPAis() //MExico
	
	
	public Empleados(String nom) {
		nombre = nom; // Instancias
		seccion = "Administracion";
		id = idSiguiente;
		idSiguiente++; //static
	}

	public void cambiaSeccion(String seccion) { // setter
		this.seccion = seccion;
	}

	public String devuelveDatos() { // getter
		return "El nombre es " + nombre + " la seccion es " + seccion + " y el Id=" + id;
	}

	public static String dameIdSiguiente() {
		return "El IdSiguiente es: " + idSiguiente;
	}

}