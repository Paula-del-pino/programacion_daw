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
		int opcion = -1; 
		do {
			System.out.println("~~~~~~~~~~~~~~| CALCULADORA |~~~~~~~~~~~~~~");
		System.out.println("1 - Suma");
		System.out.println("2 - Resta");
		System.out.println("3 - Multiplicación");
		System.out.println("4 – División");
		System.out.println("5 - Raíz cuadrada");
		System.out.println("6 – Potencia");
		System.out.println("0 - Salir del programa");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		if (scan.hasNext()) {
			opcion = scan.nextInt();
			switch (opcion) {
        	case 1: {
        		// Suma
        		System.out.print("Introduce el primer número: ");
        		int numero1 = scan.nextInt();
        		System.out.print("Introduce el segundo número: ");
        		int numero2 = scan.nextInt();
        		int resultado = numero1 + numero2;
        		System.out.print("La suma de " + numero1 + " y de " + numero2 + " da: " + resultado);
        		break;
        	} 
        	case 2: {
        		// Resta
        		System.out.print("Introduce el primer número: ");
        		int numero1 = scan.nextInt();
        		System.out.print("Introduce el segundo número: ");
        		int numero2 = scan.nextInt();
        		int resultado = numero1 - numero2;
        		System.out.print("La resta de " + numero1 + " y de " + numero2 + " da: " + resultado);
        		break;
        	} 
        	case 3: {
        		// Multiplicación
        		System.out.print("Introduce el primer número: ");
        		int numero1 = scan.nextInt();
        		System.out.print("Introduce el segundo número: ");
        		int numero2 = scan.nextInt();
        		int resultado = numero1 * numero2;
        		System.out.print(numero1 + " x " + numero2 + " = " + resultado);
        		break;
        	}
        	case 4: {
        		// División
        		System.out.print("Introduce el primer número: ");
        		int numero1 = scan.nextInt();
        		System.out.print("Introduce el segundo número: ");
        		int numero2 = scan.nextInt();
        		if (numero2 != 0) {
        		double resultado = (double) numero1 / numero2;
        		System.out.print(numero1 + " : " + numero2 + " = " + resultado);
        		 } else {
                     System.out.println("Error.No se puede dividir por cero.");
                 } break;
        	} 
        	case 5: {
        		// Raíz Cuadrada
        		System.out.print("Introduce un número: ");
        		double numRaiz = scan.nextDouble();
        		if (numRaiz >=0) {
        			System.out.println("Solución: " + Math.sqrt(numRaiz));
        		} else {
        			System.out.println("Error");
        		}
        		break;
        	} 
        	case 6: {
        		// Potencia
        		System.out.println("Introduce la base: ");
        		double base = scan.nextDouble();
        		System.out.println("Introduce el exponente: ");
        		double expo = scan.nextDouble();
        		System.out.println("Solución: " + Math.pow(base, expo));
        		break;
        	} case 0: {
        		// Salir del Programa
        		System.out.println("Pulsa cualquier tecla para salir: ");
        		scan.nextLine();
        		scan.nextLine();
        		System.out.println("Cerrando programa...");
        		break;
        	}
        		default: {
        			//Opción Incorrecta
        			System.out.println("Error. Selecciona una opción válida entre 0 y 6");
        			break;
        		 }
            }
        } else {
            System.out.println("Error. Por favor, introduce un número válido.");
            scan.next(); // Limpiar la entrada incorrecta
        }

		} while (opcion != 0);
		scan.close();
	}
}