	
package unidad02;

import java.util.Scanner;

public class MayorNumeroWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Opción A. Indicamos el número de datos a evaluar
		Scanner scan = new Scanner(System.in);
		System.out.println("Este programa devuelve el mayor de todos los números introducidos");
		System.out.print("Introduce \"STOP\" cuando quieras parar de introducir números");
		int mayorNumero = Integer.MIN_VALUE;
		String dato = "";
		boolean salir = false;
		do {
			System.out.println("Introduce uno entero:");
			dato = scan.nextLine();
			if ("STOP" .equalsIgnoreCase(dato)) {
				salir = true;
			} else {
				int datoEntero = Integer.parseInt(dato);
				//asignación de valor a salir con operador ternario
				//mayorNumero = datoEntero > mayorNumero ? datoEntero : mayorNumero
				//asignación de valor a mayorNumero con una estructura de decisión
				if(datoEntero > mayorNumero) {
					mayorNumero = datoEntero;
				}
			}
			System.out.println("El mayor número introducido hasta el momento es " + mayorNumero);
		} while (!salir);
		scan.close();
		System.out.println("El mayor número introducido es el " + mayorNumero);
		
	}


	
}
