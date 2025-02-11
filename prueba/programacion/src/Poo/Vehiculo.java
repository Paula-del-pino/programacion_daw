package Poo;

public class Vehiculo {
	private static Integer vehiculosCreados = 0;
	private static Double kilometrosTotales = 0d;
	private Double kilometrosRecorridos;
	
	public Vehiculo() {
		vehiculosCreados++;
		this.kilometrosRecorridos = (0d);
	}
	
	public Double getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}
	
	public void setKilometrosRecorridos(Double kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}
	
	 
}
