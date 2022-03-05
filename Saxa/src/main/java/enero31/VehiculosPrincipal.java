package enero31;

public class VehiculosPrincipal {

	public static void main(String[] args) {
		Vehiculo[] vehiculo = new Vehiculo[4]; 
		
		vehiculo [0] = new Vehiculo ("AAAA ", "Carro", "2000");  
		vehiculo [1] = new TipoDeportivo ("BBBB ", "Ferrary", "2010", 8);  
		vehiculo [2] = new TipoFurgoneta ("CCCC ", "Combi", "2000", 10);  
		vehiculo [3] = new TipoTurismo ("CCCC ", "Tsuru", "2000", 4);  
		
		for(int indice = 0; indice < vehiculo.length; indice++) {
			System.out.println(vehiculo[indice].mostrarDatos());
		}
	}

}
