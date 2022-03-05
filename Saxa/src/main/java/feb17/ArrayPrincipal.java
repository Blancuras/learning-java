package feb17;

import javax.swing.JOptionPane;

public class ArrayPrincipal {
	
	public static void main(String[] args) {
		int numElementos;
		numElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo"));
		
		
		ArrayConstructor arreglo = new ArrayConstructor(numElementos); 
		arreglo.imprimir(); 
	}

}
