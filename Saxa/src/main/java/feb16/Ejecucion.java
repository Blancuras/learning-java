package feb16;

public class Ejecucion {

	public static void main(String[] args) {

		// Creamos el objeto y la instancia

		Lavadora lavadora = new Lavadora();
		lavadora.setColor("rojo") ;
		lavadora.setModelo("Modelo avanzado");
		lavadora.setNumeroSerie(1234567); 
		lavadora.setPrecio(900.90f);

		

		System.out.println("La primera lavadora tiene las siguientes caracteristicas");
		System.out.println("Color: " + lavadora.getColor());
		System.out.println("Modelo: " + lavadora.getModelo());
		System.out.println("Numero de serie; " + lavadora.getNumeroSerie());
		System.out.println("Precio: " + lavadora.getPrecio());

		Lavadora lavadoraAutomatica = new Lavadora();
		 lavadoraAutomatica.setColor( "azul");
		 lavadoraAutomatica.setModelo("Lavadora modelo basico");
		 lavadoraAutomatica.setNumeroSerie( 1234989567);
		lavadoraAutomatica.setPrecio(989.90f);
		
		System.out.println("");

		System.out.println("La segunda lavadora tiene las siguientes caracteristicas");
		System.out.println("Color: " + lavadoraAutomatica.getColor());
		System.out.println("Modelo: " + lavadoraAutomatica.getModelo());
		System.out.println("Numero de serie; " + lavadoraAutomatica.getNumeroSerie());
		System.out.println("Precio: " +lavadoraAutomatica.getPrecio());
	}

}
