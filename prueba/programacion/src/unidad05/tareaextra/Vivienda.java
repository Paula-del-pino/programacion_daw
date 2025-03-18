package unidad05.tareaextra;

public abstract class Vivienda implements Hipotecable {
	
	//Atributos
	private String direccion;
	private Propietario propietario;
	private double metros_cuadrados;
	
	//Metodo constructor
	public Vivienda(String direccion, Propietario propietario, double metros_cuadrados) {
		super();
		this.direccion = direccion;
		this.propietario = propietario;
		this.metros_cuadrados = metros_cuadrados;
	}

	//GETTERS & SETTERS
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public double getMetros_cuadrados() {
		return metros_cuadrados;
	}

	public void setMetros_cuadrados(double metros_cuadrados) {
		this.metros_cuadrados = metros_cuadrados;
	}

}


