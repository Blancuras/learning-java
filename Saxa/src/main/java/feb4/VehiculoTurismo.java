package feb4;

public class VehiculoTurismo extends VehiculoModerno {
	private int numPuertas;

	public VehiculoTurismo(int numPuertas, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.numPuertas = numPuertas;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public String mostrarDatos() {
		return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo " + modelo + "\nNumero de Puertas: "
				+ numPuertas;
	}

}
