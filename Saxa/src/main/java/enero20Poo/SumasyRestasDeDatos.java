package enero20Poo;

public class SumasyRestasDeDatos {
	
	public static double calcular(DatosMagicos datosMagicos , Cripto cripto) {
		return datosMagicos.getCateto() + datosMagicos.getHipotenusa() 
		- datosMagicos.getObtuso() - datosMagicos.getPitagoras() + cripto.getPrecio();
	}
}
