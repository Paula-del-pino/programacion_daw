package unidad05.tareaextra;

public class Propietario {

	//Atributos
	private String nombreCompleto;
	private String dni;
	
	//Metodo Constructor
	public Propietario(String nombreCompleto) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.dni = dni;
	}

	//GETTERS & SETTERS
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
}
