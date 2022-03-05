package enero22Poo2;

public class Jefatura extends Empleado implements Jefes{ // IMPLEMENTA LA INTERFAZ JEFES
	private double incentivo; 
	
	public Jefatura(String nom, double sueldo, int anio, int mes, int dia) {
		super(nom, sueldo, anio, mes, dia); 
	} 
	
	public String tomarDecisiones(String decision) { //METODO DE LA INTERFAZ
		return "Un miembro de la direccion ha tomado la direccion de: " + decision; 
	}
	
	public double estableceBonus(double gratificacion) {
		double prima = 2000; 
		return Trabajadores.bonusBase + gratificacion + prima; 
	}
	
	public void estableceIncentivo(double b) {
		incentivo = b; 
	} 
	
	public double dameSueldo() {
		double sueldoJefe = super.dameSueldo(); 
		return sueldoJefe + incentivo; 
	}
	
}
