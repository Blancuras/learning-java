package enero21Poo2;

public class PrincipalCuentaBancaria {

	public static void main(String[] args) {
		CuentaBancaria cuentaBancaria = new CuentaBancaria();

		cuentaBancaria.mostrarDatos();
		cuentaBancaria.setAlias("miNuevoAlias");
//		cuentaBancaria.mostrarDatos();
		System.out.println(cuentaBancaria);

		
		  cuentaBancaria.mostrarDatos(); 
		  cuentaBancaria.setClaveBancaria("13253784844242738494");  
		  cuentaBancaria.setAlias("miCuenta"); 
		  cuentaBancaria.mostrarDatos();
		  System.out.println(cuentaBancaria);
		  
		  System.out.println(cuentaBancaria.getSaldo());
		  cuentaBancaria.depositar(200);
		  
		  System.out.println(cuentaBancaria.getSaldo());
		  cuentaBancaria.depositar(-50);// no se puede
		  
		  System.out.println(cuentaBancaria.getSaldo());
		  cuentaBancaria.extraer(180);
		  
		  System.out.println(cuentaBancaria.getSaldo());
		  cuentaBancaria.extraer(100);
		  
		  System.out.println(cuentaBancaria.getSaldo());
		  

	}

}
