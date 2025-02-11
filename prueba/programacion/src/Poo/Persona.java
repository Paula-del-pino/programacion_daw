package Poo;

public class Persona {
	private static final String Charater = null;
	// Atributos
	 private String nombre;
	 private int edad;
	 private String dni;
	 private char sexo;
	 private double peso;
	 private double altura;
	 
	 //Constructor por defecto
	 public Persona() {
		 this.nombre = "";
		 this.edad = 0;
		 this.dni = this.generarDni();
		 this.sexo = 'N' ;
		 this.peso = 0d;
		 this.altura = 0d;
	 }
	 
	 // Constructor con nombre edad y sexo
	 public Persona (String nombre, int edad,char sexo ) {
		 this.nombre = nombre;
		 this.dni = generarDni();
		 this.edad = edad;
		 this.sexo = comprobarSexo(sexo);
		 this.altura = 0d;
		 this.peso = 0;
	 }

	 // Getter y Setter
	 
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Metodos de instancia
	private char comprobarSexo(char sexo) {
		char sexoFinal = 'N';
		sexo = Character.toUpperCase(sexo);
		if (sexo == 'H' || sexo == 'M') {
			
		}
		return sexoFinal;
	}
	
	private String generarDni() {
		// 8 numeros y 1 letra
		
		return null;
	}
}
