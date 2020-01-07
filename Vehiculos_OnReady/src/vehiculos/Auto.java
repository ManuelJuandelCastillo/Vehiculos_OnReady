package vehiculos;

public class Auto extends Vehiculo{

	private int puertas;

	public Auto(String marca, String modelo, double precio, int puertas) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}
	
	public String getDatos() {
		return ("Marca: "+this.getMarca()+" // Modelo: "+this.getModelo()+" // Puertas: "+this.getPuertas()+" // Precio: $"+this.getPrecio());
	}
}
