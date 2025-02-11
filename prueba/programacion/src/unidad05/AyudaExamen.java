package unidad05;

import java.util.Scanner;

public class AyudaExamen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un texto para saber si es pangrama: ");
		
		String textoUsu = scanner.nextLine();
		
		String RegexPattern = textoUsu.replaceAll("^[a-zA-ZñÑ ,\\.]+$", "").toLowerCase();
		
		System.out.println(RegexPattern);
		
	}

}
 