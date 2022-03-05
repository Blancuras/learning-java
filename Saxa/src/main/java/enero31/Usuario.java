package enero31;

public class Usuario {
	private String name;
	private Direccion direccion;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Direccion getDireccion() {
		return direccion;
	}
	
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public static class Direccion{
		private String direccion;
		private String ultimaVisita;
		
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getUltimaVisita() {
			return ultimaVisita;
		}
		public void setUltimaVisita(String ultimaVisita) {
			this.ultimaVisita = ultimaVisita;
		}
	}
}
