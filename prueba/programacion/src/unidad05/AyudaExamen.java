package unidad05;

import java.util.Scanner;

public class AyudaExamen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un texto para saber si es pangrama: ");
		boolean pangrama = false;
		String textoUsu = scanner.nextLine();
		
		String RegexPattern = "^[a-zA-Z-Ññ]+$";
		if(textoUsu.matches(RegexPattern)) {
			textoUsu.equalsIgnoreCase(RegexPattern);
		}
	}

}
