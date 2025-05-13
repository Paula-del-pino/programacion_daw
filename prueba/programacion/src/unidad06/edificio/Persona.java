package unidad06.edificio;

public class Persona implements Comparable<Persona>{

	//Atributos
	private String nombre;
	private String apellido;
	private String dni;
	
	public Persona(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public int compareTo(Persona o) {
		int compare = 0;
		compare = apellido.compareTo(o.apellido);
		if(compare == 0) {
			compare = nombre.compareTo(o.nombre);
		}
		return compare;
	}
}
