package feb24Interfaces;

public class MusicoEstudiante implements Musico, Estudiante{

	@Override
	public void hablar() {
		System.out.println("Estoy hablando");
	}

	@Override
	public void estudiar() {
			System.out.println("Estoy estudiando programacion");
	}

	@Override
	public void tocarMusica() {
		System.out.println("Estoy cantando y tocando instrumentos musicales");
	}

}
