package unidad02;

import java.util.Scanner;

public class MayorPrimeroFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
 * Escribe un programa que ordene tres números enteros introducidos por 
teclado
 */
		Scanner scan = new Scanner(System.in);
		// Petición al usuario de los datos de entrada y se guardan en variables
		System.out.println("Este programa devuelve el mayor de todos los números introducidos por teclado.");
		System.out.print("Introduce el número de datos para calcular el máximo número:");
		int numeroDeDatos = scan.nextInt();
		int mayorNumero = Integer.MIN_VALUE;
		// ejecutamos tantas veces como datos deba introducir el usuario
		for (int index = 0; index < numeroDeDatos; index++) {
			System.out.println("Introduce el dato número " + (index + 1));
			System.out.println("Recuerda que vas a introducir " + numeroDeDatos);
			int numActual = scan.nextInt();
			if (mayorNumero < numActual) {
				mayorNumero = numActual;
			}
			System.out.println("Te faltan " + (numeroDeDatos - index - 1) + " datos.");
		}
		System.out.println("El mayor número introducido es el " + mayorNumero);
	}

}
