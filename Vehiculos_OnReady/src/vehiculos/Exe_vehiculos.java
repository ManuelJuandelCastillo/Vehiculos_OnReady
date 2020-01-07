package vehiculos;

import java.util.*;

public class Exe_vehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
		
		listaVehiculos.add(new Auto("Peugeot", "206", 200000, 4));
		listaVehiculos.add(new Moto("Honda", "Titan", 60000, 125));
		listaVehiculos.add(new Auto("Peugeot", "208", 250000, 5));
		listaVehiculos.add(new Moto("Yamaha", "YBR", 80500.50, 160));
		
		for (Vehiculo v : listaVehiculos) {
			System.out.println(v.getDatos());
		}
		
		System.out.printf("\n==========================================\n\n");
		
		Collections.sort(listaVehiculos);
		
		System.out.println("Vehículo más caro: "+ listaVehiculos.get(0).getMarca()+" "+listaVehiculos.get(0).getModelo());
		System.out.println("Vehículo más barato: "+listaVehiculos.get(listaVehiculos.size()-1).getMarca()+" "+listaVehiculos.get(listaVehiculos.size()-1).getModelo());
		
		for (Vehiculo v : listaVehiculos) {
			if (v.getModelo().contains("Y")) {
				System.out.println("Vehículo que contiene en el modelo la letra 'Y': "+v.getMarca()+" "+v.getModelo()+" $"+v.getPrecio());
			}
		}
		
		System.out.printf("\n==========================================\n\n");
		
		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		for (Vehiculo v : listaVehiculos) {
			System.out.println(v.getMarca()+" "+v.getModelo());
		}
	}

}
