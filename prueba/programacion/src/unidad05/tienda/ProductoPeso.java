package unidad05.tienda;

public abstract class ProductoPeso extends Producto implements IPrecio {
	
	

	//Atributos
	  private double peso; 
	  private double precioPorPeso;
	private int cantidad;
	private int precio;
	  
	 //Constructores
	public ProductoPeso(String nombre, String categoria, double peso, double precioPorPeso) {
		super(nombre, categoria);
		this.peso= peso;
		this.precioPorPeso = precioPorPeso;
	}

	//Getters & Setters
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecioPorPeso() {
		return precioPorPeso;
	}

	public void setPrecioPorPeso(double precioPorPeso) {
		this.precioPorPeso = precioPorPeso;
	}
	@Override
	public double getImporteTotal() {
		return cantidad * precio;
	}

	@Override
	public String imprimir() {
			StringBuilder sb = new StringBuilder();
			sb.append(this.getNombre()).append(" (");
			sb.append(this.cantidad).append(" un.) ");
			sb.append(this.precio).append("\t\t\t\t");
			double importeTotal = this.getImporteTotal();
			System.out.println(sb + "%.2f\n");
		return null;
	}
}
