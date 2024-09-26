package unidad01;

import java.util.Scanner;

public class MenuFalso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**Mostrar el siguiente Menú
		 * 
		 * Menú. Elige una opción:
		 * 1.Comprimir archivo
		 * 2.Eliminar archivo
		 * 3.Copiar archivo
		 * 4.Cerrar programa
		 * Mostrará la opción elegida
		 * Mostrará error si la opción no es elegida
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("MENÚ. Elige una opción");
		System.out.println("1.Comprimir archivo");
		System.out.println("2.Eliminar archivo");
		System.out.println("3.Copiar archivo");
		System.out.println("4.Cerrar programa");
		int opcion = scan.nextInt();
		if (opcion == 0) {
			System.err.print("Error error, porfavor elige una opción");
		}
		if (opcion == 1) {
			System.out.print("Comprimiendo archivo...");
		} else if (opcion == 2) {
			System.out.println("Eliminando archivo...");
		} else if (opcion == 3){
			System.out.println("Copiando Archivo...");
		} else if (opcion == 4){
			System.out.println("Cerrando programa...");
		
		scan.close();

	}
	}
}
