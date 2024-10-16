package com.PaulaAlumna.tarea2;

import java.util.Scanner;

public class Act3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Pedir números positivos al usuario hasta que el usuario introduzca un 0. Al terminar, mostrará lo siguiente:
		 *-mayor número introducido
		 *-menor número introducido
		 *-suma de todos los números
		 *-media aritmética de todos los números
		 *El número 0 no contara como número introducido 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce números que sean positivos hasta llegar a 0");
		int numero;
		int numMayor = Integer.MAX_VALUE;
		int numMenor = Integer.MIN_VALUE;
		int suma = 0;
		int contador =0;
		while (true) {
			numero = scan.nextInt();
			
			if (numero ==0) {
				break;
			}
			if  (numero >0 ) {
				suma += numero;
				contador++;
				if (numero > numMayor) {
					numMayor = numero; 
				}
				if (numero < numMenor) {
					numMenor = numero;
				}
			
			} else {
				System.out.println("Introduce SOLO números positivos");
			}
		}
		if (contador > 0) {
			double media = (double) suma/contador;
			
			System.out.println("El número Mayor introducido es: " + numMayor);
			System.out.println("El número Menor introducido es: " + numMenor);
			System.out.println("Todos los números suman: " + suma);
			System.out.println("Media arimétrica de tods los números: " + media);
		} else {
			System.out.println("Error. No introdujo números positivos");
		}
		
		scan.close();
	}

}
