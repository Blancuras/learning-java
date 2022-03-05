package enero20Poo;

public class CalcularVelocidadLuz {

	public static void main(String[] args) {
		DatosMagicos datos = new DatosMagicos(); //POJO
		datos.setCateto(53.1);
		datos.setHipotenusa(87.3);
		datos.setObtuso(44.1);
		datos.setPitagoras(7.1);
		
		Cripto cripto = new Cripto();
		cripto.setPrecio(54);
		cripto.setPrecio(7);
		
		
		//MultiplicadorDeDatos.calcular(53.1, 87.3 ,44.1 , 7.1);
		double multiplicador = MultiplicadorDeDatos.calcular(datos, cripto);
		double sumador = 	  SumadorDeDatos.calcular(datos, cripto);
		double sumasYRestas = SumasyRestasDeDatos.calcular(datos, cripto);
		
		System.out.println(multiplicador);
		System.out.println(sumador);
		System.out.println(sumasYRestas);
	}
}
