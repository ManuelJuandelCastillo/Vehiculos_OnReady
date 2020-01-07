package vehiculos;

public class Moto extends Vehiculo{
	
	private int cilindrada;

	public Moto(String marca, String modelo, double precio, int cilindrada) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}
	public String getDatos() {
		return ("Marca: "+this.getMarca()+" // Modelo: "+this.getModelo()+" // Cilindrada: "+this.getCilindrada()+"c // Precio: $"+this.getPrecio());
	}	
}
