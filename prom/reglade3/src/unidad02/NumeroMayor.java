package unidad02;

import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
		//Opción A. Indicamos el número de datos a evaluar
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa devuelve el mayor detodos los números introducidos");
		System.out.print("Introduce el número de datos para calcular el máximo número");
		int numeroDeDatos = scan.nextInt();
		int mayorNumero = Integer.MIN_VALUE;
		//Ejecutamos tantas veces como datos deba introducir el usuario
		for (int index = 0; index <  numeroDeDatos; index++) {
			System.out.println("Introuduce el dato numero" + (index + 1));
			System.out.println("Recuerda que vas a introducir " + numeroDeDatos);
			int numActual = scan.nextInt();
			if (mayorNumero < numActual) {
				mayorNumero = numActual;
			}
			System.out.println("Te faltan " + (numeroDeDatos - index - 1) + "datos");
			
		}
		System.out.println("El mayor número introducido es el " + mayorNumero);
		//Opción B. Establecemos una intrucción de parada
		String numeroCadena = scan.nextLine();
		int numeroEntero = Integer.parseInt(numeroCadena);
		scan.close();
	}

}
