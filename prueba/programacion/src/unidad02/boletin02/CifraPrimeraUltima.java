package unidad02.boletin02;

import java.util.Scanner;

/**
 * Devuelve según la opción:
 * cúal es al última cifra de un número entero introducido por teclado
 * cúal es al primera cifra de un número entero introducido por teclado
 */
public class CifraPrimeraUltima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		int numero = scan.nextInt();
		
		System.out.println("Elige una opción:");
		System.out.println("1. Primera cifra:");
		System.out.println("2. Última cifra:");
		boolean correcto = true;
		do {
			int opcion = scan.nextInt();
			switch (opcion) {
		case 1:
		// Ob             tine la primera cifra del numero
			int dividendo = numero;
			int primeraCifra = 0;
			while (dividendo != 0) {
				primeraCifra = dividendo;
				//dividendo = dividendo / 10;
				
			dividendo /= 10;	
			}
			System.out.println("La primera cifra del número " + numero + " es " + primeraCifra);
			break;
		case 2: 
		//Obtiene la última cifra del número
			int ultimaCifra = numero % 10;
			System.out.println("La última cifra del número " + numero + " es " + ultimaCifra);
			
			break;
		
		default:

		// no se ha introducido ni 1 ni 2
		correcto = false;
		System.out.println("No has elegido ninguna opción válidad!");
		break;
	}
		
		
				
			} while (!correcto);
	
	scan.close();
		

	}

}
