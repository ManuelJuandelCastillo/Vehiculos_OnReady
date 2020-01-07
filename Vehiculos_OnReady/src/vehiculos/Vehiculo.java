package vehiculos;

public abstract class Vehiculo implements Comparable<Vehiculo>{
	private String marca;
	private String modelo;
	private double precio;
	
	public Vehiculo(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public double getPrecio() {
		return precio;
	}
	
	public String getDatos() {
		return ("Marca: "+this.getMarca()+" // Modelo: "+this.getModelo()+" // Precio: "+this.getPrecio());
	}

	@Override
	public int compareTo(Vehiculo v) {
		if (v.getPrecio()>precio) {
			return 1;
		}else if(v.getPrecio()>precio) {
			return 0;
		}else {
			return -1;
		}
	}
	
	
}
