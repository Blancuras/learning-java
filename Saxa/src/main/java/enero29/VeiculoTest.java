package enero29;

public class VeiculoTest {

	public static void main(String[] args) {
		Vehiculo vocho = new Vehiculo();
		vocho.setSku("dfdfdf");
		vocho.setMarca("MArca");
		vocho.setModelo("sdbfds");
		
		Vehiculo vocho2 = new Vehiculo("SKAU5d5fd"); //SKU valor
		Vehiculo vocho3 = new Vehiculo("SKAU5d5fd", "kdhfjkdf"); //Modelo y marca
		System.out.println(vocho);
		System.out.println(vocho2);
		System.out.println(vocho3);
	}
}
