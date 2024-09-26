package unidad01;

import java.util.Scanner;

public class Etapavital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** Introduciendo un año de nacimiento, el programa dirá si el 
		 * bebé: 0-2 años
		 * ninñ@: 3-11 años
		 * adolescente:12-18 años
		 * adulto: 19-65 años
		 * ancioano: +65 años
		 * mostrará errpr si la edad es menor de 0 años
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce tu año de Nacimiento:");
		String nombre = scan.nextLine();
		int anioNacimiento = scan.nextInt();
		int edad = 2024 - anioNacimiento;
		if (edad < 0) {
			System.err.print("No se puede introducir un año:");
		} else if (edad <= 2) {
			System.out.println("Eres un bebé");
		} else if (edad < 12){
			System.out.println("Eres un@ niñ@");
		} else if (edad < 18){
			System.out.println("Eres un adolescente");
		} else if (edad < 65){
			System.out.println("Eres un adulto");
		} else {
			System.out.println("Eres un@ ancian@");
		scan.close();
		}
	}
		
		

}
