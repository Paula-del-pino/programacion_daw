package unidad05.tareaextra;

public class Apartamento extends Vivienda  {
	
	//Atributos
	private int piso;
	private char puerta;

	//Metodo constructor
	public Apartamento(String direccion, Propietario propietario, float metros_cuadrados, int piso, char puerta) {
		super(direccion, propietario, metros_cuadrados);
		this.setPiso(piso);
		this.puerta = puerta;
	}

	//GETTERS & SETTERS
	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}
	
	//Metodo de la interfaz
	@Override
	public void calcularCuota() {	
		double cuotaApt = getMetros_cuadrados() * 1.2;
		System.out.println("La cuota del apartamento es: " + cuotaApt );
	}


}
