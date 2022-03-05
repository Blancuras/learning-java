package enero29;

public class Vehiculo {

	private String marca;
	private String modelo;
	private String sku;
	
	public Vehiculo() {
		
	}
	public Vehiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public Vehiculo(String sku) {
		this.sku = sku;
		this.modelo = "";
	}

	public void acelerar() {
		System.out.println("Tu poderoso" + this.marca + "  " + this.modelo + " esta acelerando");
	}
	
	public void acelerar(int eda) {
		System.out.println(eda+" Tu poderoso" + this.marca + "  " + this.modelo + " esta acelerando");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}
	@Override
	public String toString() {
		return "Vehiculo [" + (marca != null ? "marca=" + marca + ", " : "")
				+ (modelo != null ? "modelo=" + modelo + ", " : "") + (sku != null ? "sku=" + sku : "") + "]";
	} 
	
}
