package unidad03.Boletin;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Elige una opción:");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4 - Para salir.");
		int opcion = 0;

            opcion = scan.nextInt();

            // Ejecutar acciones según la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la Opción 1");
                    break;
                case 2:
                    System.out.println("Has seleccionado la Opción 2");
                    break;
                case 3:
                    System.out.println("Has seleccionado la Opción 3");
                    break;
                case 4:
                    System.out.println("Saliendo del menú...");
                    return; // Rompe el ciclo y termina el programa
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
		

	}


 public static void saltoDiez () {
	
		System.out.println("\n\n\n\n\n\n\n\n\n");
 	}
 }