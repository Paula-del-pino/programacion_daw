package Poo;

import java.util.Random;

public class Persona {
	private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
	// Atributos
	 private String nombre;
	 private int edad;
	 private String dni;
	 private char sexo;
	 private float peso;
	 private float altura;
	 
	 //Constructor por defecto
	 public Persona() {
		 this.nombre = "";
		 this.edad = 0;
		 this.dni = this.generarDni();
		 this.sexo = 'N' ;
		 this.peso = 0f;
		 this.altura = 0f;
	 }
	 
	 // Constructor con nombre edad y sexo
	 public Persona (String nombre, int edad,char sexo ) {
		 this.nombre = nombre;
		 this.dni = generarDni();
		 this.edad = edad;
		 this.sexo = comprobarSexo(sexo);
		 this.altura = 0f;
		 this.peso = 0;
	 }
	 
	 public Persona(String nombre, int edad,char sexo, float peso,float altura) {
		 
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

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
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
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		Random random = new Random();
		int numero = random.nextInt(9999999) + 1 ;
		char letra = LETRAS.charAt(numero % 23);
		String dni = numero + String.valueOf(letra);
		while (dni.length() < 9) {
			dni = "0" + dni;
		}
		return dni;
	}
	
	public static boolean checkDni(String dni) {
		boolean dniCorrecto = false;
		//00000100D == 100D
		String dniPattern = "[0-9]{1,8}[" + LETRAS + LETRAS.toLowerCase() + "]"; //control + mayus + x y luego y para pasarlo a minus
		if(dni.matches(dniPattern)) {
			String numStr = dni.substring(0,8);
			Integer num = Integer.parseInt(numStr);
			Character letraCorrecta = LETRAS.charAt(num % 23);
			Character letra = dni.toUpperCase().charAt(8);
			if(letraCorrecta == letra) {
				dniCorrecto = true;
			}
		}
		return dniCorrecto;
	}
	
	//Devuelve true si la persona tiene 18 años o más
	public boolean esMayorDeEdad() {
		return this.edad >= 18;
	}

	public int calcularImc() {
		double imc = this.peso / (this.altura*this.altura);
		int pesoIdeal = 0;
		if(imc < 20) {
			pesoIdeal = -1;
		} else if (imc > 25) {
			pesoIdeal = 1;
		}
		return pesoIdeal;
	}
	
	
	
}
