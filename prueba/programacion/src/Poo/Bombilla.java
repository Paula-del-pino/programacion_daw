package Poo;

public class Bombilla {
	
	 private String marca;
	 private float potencia;
	 private float precio;
	 private String estado;
	 
	 public Bombilla(String string, float f, float g , String string2) {
		this.marca = "";
		this.potencia = 0f;
		this.precio = 0f;
		this.estado = null;
		}
		
	 public Bombilla(String marca, float potencia, float precio) throws Exception {
		 if (potencia < 0 || precio < 0) {
			 throw new Exception();
		 }
	 }
	
	 
	 /**
	  * 
	  * @return the marca
	  */
	 
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPotencia() {
		return this.potencia;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	public float getPrecio() {
		return this.precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getEstado() {
		return this.estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void encender() {
		
	}
	 
	 public String toString() {
		 StringBuilder sb = new StringBuilder();
		 sb.append("Bombilla:\n").append("marca: ").append(this.marca)
		 .append("\n").append("precio: ").append(this.precio).append(" €")
		 .append("\n").append("potencia: ").append(this.potencia).append("W")
		 .append("\n").append("estado: ").append(this.estado).append("\n-------------");
		 return sb.toString();
	 }
	 
	 public boolean equals(Bombilla otraBombilla) {
		 boolean iguales = false;
		 if(this.marca.equalsIgnoreCase(otraBombilla.getMarca())
				 && this.potencia == otraBombilla.getPotencia()){
			 return true;
		 }
		 return false;
	 }

}
