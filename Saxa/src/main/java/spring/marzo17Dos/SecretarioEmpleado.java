package spring.marzo17Dos;

public class SecretarioEmpleado implements Empleados {

	@Override
	public String getTareas() {
		return "Gestionar la agenda de los Jefes";
	}

	@Override
	public String getInforme() {
		return "Informe generado por el secretario " + informeNuevo.getInforme();
	}

	private CreacionInformes informeNuevo;

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
}
