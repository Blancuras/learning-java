package enero29;

public class Sobrecarga {

	public static void main(String[] args) {
		Vehiculo vehiculo1 = new Vehiculo("Vocho", "1990");
		vehiculo1.acelerar();
		vehiculo1.acelerar(55);
	}

}
