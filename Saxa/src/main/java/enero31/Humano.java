package enero31;

public class Humano extends Animal{
	private String nombre;
	
	public Humano() {
		
	}
	public Humano(String nombre) {
		this.nombre = nombre;
	}
	public void comer() {
		System.out.println("Soy el ser supremo en la tierra y como en platos "); 
		
	} 
	public void correr() {
		System.out.println("Soy el ser supremo en la tierra y corro con tenis ");
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Humano [" + (nombre != null ? "nombre=" + nombre : "") + "]";
	}
	
	
}
