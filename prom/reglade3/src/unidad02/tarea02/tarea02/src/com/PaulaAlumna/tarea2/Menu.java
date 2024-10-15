package com.PaulaAlumna.tarea2;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Añadir el siguiente menú
		 * 1 - Suma
		 * 2 - Resta
		 * 3 - Multiplicación
		 * 4 – División
		 * 5 - Raíz cuadrada
		 * 6 – Potencia
		 * 0 - Salir del programa
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("CALCURADORA. Elige una opción: ");
		System.out.println("1 - Suma");
		System.out.println("2 - Resta");
		System.out.println("3 - Multiplicación");
		System.out.println("4 – División");
		System.out.println("5 - Raíz cuadrada");
		System.out.println("6 – Potencia");
		System.out.println("0 - Salir del programa");
		int opcion = scan.nextInt();
		if (opcion == 0) {
			System.out.print("Salir del programa");
		}
		if (opcion == 1) {
			System.out.print("Introduce el primer número");
			int numero1 = scan.nextInt();
			System.out.print("Introduce el segundo número");
			int numero2 = scan.nextInt();
			int resultado = numero1 + numero2;
			System.out.print("La suma de " + numero1 + " y de " + numero2 + " da: " + resultado);
		} else if (opcion == 2) {
			System.out.print("Introduce el primer número");
			int numero1 = scan.nextInt();
			System.out.print("Introduce el segundo número");
			int numero2 = scan.nextInt();
			int resultado = numero1 - numero2;
			System.out.print("La resta de " + numero1 + " y de " + numero2 + " da: " + resultado);
		} else if (opcion == 3){
			System.out.print("Introduce el primer número");
			int numero1 = scan.nextInt();
			System.out.print("Introduce el segundo número");
			int numero2 = scan.nextInt();
			int resultado = numero1 * numero2;
			System.out.print(numero1 + " x " + numero2 + " = " + resultado);
		} else if (opcion == 4){
			System.out.print("Introduce el primer número");
			int numero1 = scan.nextInt();
			System.out.print("Introduce el segundo número");
			int numero2 = scan.nextInt();
			int resultado = numero1 / numero2;
			System.out.print(numero1 + " : " + numero2 + " = " + resultado);
		} else if (opcion == 5) {
			System.out.println("Raíz cuadrada");
		} else if (opcion == 6) {
			System.out.println("Potencia");
		
		scan.close();
		}

	}

}
