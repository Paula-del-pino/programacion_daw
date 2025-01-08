package unidad04;

import java.util.Arrays;
import java.util.Scanner;

public class Ej17 {

	static final char[] LETRAS = { 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V',
			'W', 'X', 'Y', 'Z' };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce la matrícula");
		String input = scanner.nextLine();
		String matricula = input.trim();

		// validamos la matrícula con regex
		String regexPattern = "[0-9]{4} *[B-DF-HJ-NP-TV-Z]{3}";
		if (matricula.matches(regexPattern)) {
			String numeroString = input.substring(0, 4);
			String letrasMatr = input.substring(matricula.length() - 3, matricula.length());
			int numero = Integer.parseInt(numeroString);
			if (numero == 9999) {
				numeroString = "0000";
				letrasMatr = calcularSiguientesLetras(letrasMatr);
				if (letrasMatr.length() > 7) {
					matricula = letrasMatr;
				} else {					
					matricula = numeroString + letrasMatr;
				}
			} else {
				numero++;
				numeroString = rellenarConCeros(numero);
				matricula = numeroString + letrasMatr;
			}
			System.out.println(matricula);
		} else {
			System.err.println("La matrícula introducida no es válida");
		}
	}

	private static String calcularSiguientesLetras(String letrasMatr) {
		String letrasSiguiente = letrasMatr;
		char letra1 = letrasMatr.charAt(0);
		char letra2 = letrasMatr.charAt(1);
		char letra3 = letrasMatr.charAt(2);
		int index = Arrays.binarySearch(LETRAS, letra3);
		if (index == 20) {
			letra3 = 'B';
			index = Arrays.binarySearch(LETRAS, letra2);
			if (index == 20) {
				letra2 = 'B';
				index = Arrays.binarySearch(LETRAS, letra1);
				if (index == 20) {
					letrasSiguiente = "No quedan más matrículas disponibles";
				} else {
					letra1 = LETRAS[index + 1];
					letrasSiguiente = String.valueOf(letra1) + String.valueOf(letra2) + String.valueOf(letra3);
				}
			} else {
				letra2 = LETRAS[index + 1];
				letrasSiguiente = String.valueOf(letra1) + String.valueOf(letra2) + String.valueOf(letra3);
			}
		} else {
			letra3 = LETRAS[index + 1];
			letrasSiguiente = String.valueOf(letra1) + String.valueOf(letra2) + String.valueOf(letra3);
		}
		return letrasSiguiente;
	}

	private static String rellenarConCeros(int numero) {
		String numero4Cifras = String.valueOf(numero);
		while (numero4Cifras.length() < 4) {
			numero4Cifras = "0" + numero4Cifras;
		}
// otra opción
//		if (numero4Cifras.length() == 3) {
//			numero4Cifras = "0" + numero4Cifras;
//		} else if (numero4Cifras.length() == 2) {
//			numero4Cifras = "00" + numero4Cifras;
//		} else if (numero4Cifras.length() == 1) {
//			numero4Cifras = "000" + numero4Cifras;
//		}

		return numero4Cifras;
	}

}