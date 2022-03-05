package feb2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")); 
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")); 
		
		Operacion operacion = new Operacion(); 
		operacion.sumar(n1, n2); // Argumentos son para la invocacion de los metodos
		operacion.restar(n1, n2); 
		operacion.multiplicar(n1, n2);
		operacion.dividir(n1, n2);  
		
		Operacion operacion2 = new Operacion(); 
		operacion2.sumar(1, 1); // Argumentos son para la invocacion de los metodos
		operacion2.restar(1, 1); 
		operacion2.multiplicar(1, 1);
		operacion2.dividir(1, 1);  

		//staticos
		System.out.println( Operacion2.sumar(n1, n2));
		System.out.println( Operacion2.restar(n1, n2));
		System.out.println( Operacion2.multiplicar(n1, n2));
		System.out.println( Operacion2.dividir(n1, n2));
	
		operacion.mostrarResultados();
		
	}

}
