package unidad05.tienda;

public  class ProductoUnitario extends Producto {
	//Atributos
	 private int cantidad; 
	 private double precio; 
	 
	 //metodo constructor
	  public ProductoUnitario(String nombre, String categoria, int cantidad, double precio) {
		super(nombre, categoria);
		 this.cantidad=cantidad;
		 this.precio=precio;
	 }

	  //Getters & Setters
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	 
	 public double getImporteTotal(int producto) {
		 int total_producto = cantidad*producto;
		return total_producto;
		 
	 }

	@Override
	public double getImporteTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return null;
	}
	 
}
