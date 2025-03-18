package unidad05.tareaextra;

public class Casa extends Vivienda {
	
	//Atributos
	private boolean piscina;
	private boolean jardin;

	//Metodo Constructor
	public Casa(String direccion, Propietario propietario, float metros_cuadrados, boolean piscina, boolean jardin) {
		super(direccion, propietario, metros_cuadrados);
		this.jardin = jardin;
		this.piscina = piscina;
	}

	//GETTERS & SETTERS
	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	public boolean isJardin() {
		return jardin;
	}

	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}

	// Metodo de la interfaz
	@Override
	public void calcularCuota() {
		double cuotaCasa = getMetros_cuadrados() * 1.5;
		if(piscina && jardin) {
			cuotaCasa += 45;
			System.out.println("La cuoa con piscina y jardín será: " + cuotaCasa);
		} else if (piscina || jardin){
			cuotaCasa += 30;
			System.out.println("La cuota de la Casa es: " + cuotaCasa);
		}
	}
}
