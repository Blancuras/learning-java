package enero29;

import javax.swing.JOptionPane;

public class NumeroMayor {

	public static void main(String[] args) {
			String texto = JOptionPane.showInputDialog("Ingresa numeros divididos con coma"); 
			String[] numerosEnTexto = texto.split(","); //1,2,3  == ["1","2", "3"]
			int cantidad = numerosEnTexto.length; 
			int numeros[] = new int [cantidad]; 
			for(int indice = 0; indice < cantidad; indice++) {
				numeros[indice]= Integer.parseInt(numerosEnTexto[indice]); 
			} 
			int mayor = 0; 
			//mucando el mayor entre todos 
			for(int numero: numeros) {
				if(numero > mayor) {
					mayor = numero; 
				} 
			}
			JOptionPane.showInputDialog(null, "Este es tu numero mayor = " + mayor);
	}

}
