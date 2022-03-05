package enero28;

import javax.swing.JOptionPane;

public class CalcularPromedio {

	public static void main(String[] args) {
		String texto;
		float calificaciones[] = new float[4], suma = 0, promedio;
		int semestres = 0;
		do {
			texto = JOptionPane.showInputDialog("Ingresa la calificacion del alumno del semestre " + (semestres + 1));
			if (texto == null) {
				break;
			}
			calificaciones[semestres] = Float.parseFloat(texto);
			semestres++;
		} while (semestres < 4);
		
		for (float calificacion : calificaciones) {
			suma += calificacion;
		}
		promedio = suma / semestres;
		JOptionPane.showMessageDialog(null, promedio);
	}

}
