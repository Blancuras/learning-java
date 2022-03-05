package feb4;

public class VehiculoDeportivo extends VehiculoModerno {
	private int cilindrada;

	public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public String mostrarDatos() {
		return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo " + modelo +
				"\nCilindrada: " + cilindrada;

	}
}
