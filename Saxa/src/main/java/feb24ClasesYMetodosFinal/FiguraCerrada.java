package feb24ClasesYMetodosFinal;

public class FiguraCerrada extends Figura{ 
	
	public FiguraCerrada(double tamano) {
		super(tamano); 
	}
	
	@Override
	public void dibujar() {
		System.out.println("Dibujando figura cerrada del tamaño " + tamano);
	} 
	
	@Override
	public void pintar() {
		System.out.println("Pintando figura cerrada de tamano " + tamano);
	}
}
