package unidad02.boletin02;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 21. Escribe un programa que lea una lista de diez números y determine cuántos 
		 * son positivos, y cuántos son negativos. 
		 */
		System.out.println("Vas a introducir 10 números y el programa devuelve cuántos son positivos y cuántos son negativos");
		Scanner scan = new Scanner(System.in);
		int positivos = 0;
		int negativos = 0;
		for (int numeros=10;numeros > 0;numeros--) {
			System.out.println("Escribe un número (Quedan " + numeros + ")");
			int numero= scan.nextInt();
			if (numero >= 0 ) {
				positivos++;
		} else {
			negativos++;
		}
		
			
	} scan.close();
	System.out.printf("Has itroducido %d números positivos y %d números negativos", positivos , negativos);
		 
	}

}
