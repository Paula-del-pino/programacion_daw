package unidad05.tienda;

public abstract class Producto implements IPrecio {
	//Atributos
	protected String nombre;
	protected String categoria;
	
	//Constructores
	
	public Producto(String nombre, String categoria) {
		this.nombre = nombre;
		this.categoria = categoria;
	}

	// Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
