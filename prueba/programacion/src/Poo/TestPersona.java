package Poo;

import java.util.Scanner;

public class TestPersona {

	public static void main(String[] args) {
		Persona Persona1 = new Persona();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Persona1");
		Persona Persona2 = new Persona("Juan", 20 , 'H');
		System.out.println("Persona2");
		Persona Persona3 = new Persona("Amelia", 21 , 'M', 57f, 1.60f);
		System.out.println("Persona3");
		System.out.println("IMC: " + Persona3.calcularImc() );
		String dni = "44072384D";
		System.out.println("dni: " + dni + " es correcto? " + Persona.checkDni(dni) );
	}

}
