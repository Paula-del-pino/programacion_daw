package Poo;

public class Coche extends Vehiculo {

	private String color;
	private int alto;
	private int ancho;
	private float peso;
	
	public Coche(String color, int alto, int ancho, float peso) {
		this.color = color;
		this.peso = peso;
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public String getcolor() { 
	return this.color;
}

	public int getAlto() {
	return this.alto;
}

	public int getAncho() {
	return this.ancho;
}

	public float getPeso() {
	return this.peso;
}
	
	public void andar(double kilometros) {
		this.setKilometrosRecorridos(this.getKilometrosRecorridos() + kilometros);
}
	
	public void frena() {
	
}

	public void gira() {
	
}

}
