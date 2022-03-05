package enero31.camiones;

public class Autos  extends Gasolina{
	@Override
	public void llantas() {
		System.out.println("Yo soy un auto y me desplazo con 4 llantas ");
	}
	
	@Override
	public void cargarGasolina() {
		System.out.println("Auto crgando gasolina");
	}
}
