package unidad06.lista;

public class Producto { 
	  
	 private int codigo; 
	 private String nombre; 
	 private String tipo; 
	 private double precio; 
	 private int existencias;
	 
	 @Override
	 public String toString(){
		 String precioStr = String.format("%2.f" ,this.precio);
		 String stock = existencias > 0 ? "": "Sin stock";
		 return ""+this.codigo + " - " + nombre + ". Sección " + tipo + ". PVP -> " + precio
				 + ",existencias= " + existencias + "]";
	 }
	 public Producto( int codigo, String nombre, String tipo, double precio, int existencias) 
	 { 
	  this.codigo=codigo; 
	  this.nombre=nombre; 
	  this.tipo=tipo; 
	  this.precio=precio; 
	  this.existencias=existencias;  
	 } 
	     // GETTERS & SETTERS

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getExistencias() {
		return existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}
	 
	  
	} 