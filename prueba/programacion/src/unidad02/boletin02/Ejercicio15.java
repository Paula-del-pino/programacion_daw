package unidad02.boletin02;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String ENDES = "Entornos de desarrollo";
		final String Lunes = "lunes";
		final String dia = "dia";
		final String correcto = "falso";
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un día para saber que materia tiene a primera hora: ");
		System.out.println("Lunes");
		System.out.println("Martes");
		System.out.println("Miércoles");
		System.out.println("Jueves");
		System.out.println("Viernes");
		System.out.println("Sábado");
		String input = teclado.nextLine().toLowerCase();
		String materia = "";
		boolean finde = false;
		boolean corecto = true;
		switch (dia) {
		case "Lunes":
			break;
		case "Martes":
			System.out.println("Eliminando archivo...");
			break;
		case "Miércoles":
			System.out.println("Copiando archivo...");
			break;
		case "Jueves":
			System.out.println("Hasta la próxima!");
			break;
		case "Viernes":
			System.out.println("Hasta la próxima!");
			break;
		case "Sábado":
			System.out.println("Hasta la próxima!");
			break;
		default:
		

	}
	}
}
