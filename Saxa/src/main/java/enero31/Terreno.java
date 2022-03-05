package enero31;

public abstract class Terreno {
	
	protected int numeroLados; 
	
	public Terreno(int numeroLados) {
		this.numeroLados = numeroLados; 
		
	} 
	
	@Override
	public String toString() {
		return "Terreno [numeroLados=" + numeroLados + "]";
	} 
	
	public abstract double area();
		

	public int getNumeroLados() {
		return numeroLados;
	}

	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}
	
}
